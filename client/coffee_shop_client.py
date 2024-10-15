import grpc
import coffee_shop_pb2
import coffee_shop_pb2_grpc

# Unary RPC
def order_coffee(stub):
    name = input("Enter your name: ")
    coffee_type = input("Enter coffee type (e.g., latte, espresso): ")
    request = coffee_shop_pb2.CoffeeRequest(name=name, coffee_type=coffee_type)
    response = stub.OrderCoffee(request)
    print(f"Unary RPC: {response.message}, Price: ${response.price}\n")

# Server Streaming RPC
def track_order(stub):
    name = input("Enter your name to track order: ")
    coffee_type = input("Enter the coffee type you ordered: ")
    request = coffee_shop_pb2.CoffeeRequest(name=name, coffee_type=coffee_type)
    status_stream = stub.TrackOrder(request)
    print("Server Streaming RPC: Order progress:")
    for status in status_stream:
        print(f" - {status.status}")
    print()  # Extra newline for better readability

# Client Streaming RPC
def bulk_order(stub):
    name = input("Enter your name for bulk order: ")
    num_orders = int(input("How many different coffee types do you want to order? "))
    requests = []

    for i in range(num_orders):
        coffee_type = input(f"Enter coffee type #{i + 1} (e.g., latte, espresso): ")
        requests.append(coffee_shop_pb2.CoffeeRequest(name=name, coffee_type=coffee_type))

    response = stub.BulkOrder(iter(requests))
    print(f"Client Streaming RPC: Total orders: {response.total_orders}, Total price: ${response.total_price}\n")

# Bidirectional Streaming RPC
def coffee_chat(stub):
    requests = []
    print("Enter your coffee orders for chat. Type 'exit' when done.")

    while True:
        name = input("Enter your name (or type 'exit' to finish): ")
        if name.lower() == 'exit':
            break
        coffee_type = input("Enter coffee type: ")
        requests.append(coffee_shop_pb2.CoffeeRequest(name=name, coffee_type=coffee_type))

    responses = stub.CoffeeChat(iter(requests))
    print("Bidirectional Streaming RPC Responses:")
    for response in responses:
        print(f" - {response.message}, Price: ${response.price}")
    print()  # Extra newline for better readability

def run():
    channel = grpc.insecure_channel('localhost:50051')
    stub = coffee_shop_pb2_grpc.CoffeeShopServiceStub(channel)

    order_coffee(stub)          # Unary
    track_order(stub)           # Server Streaming
    bulk_order(stub)            # Client Streaming
    coffee_chat(stub)           # Bidirectional Streaming

if __name__ == '__main__':
    run()
