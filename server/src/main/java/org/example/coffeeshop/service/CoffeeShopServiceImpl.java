package org.example.coffeeshop.service;

import io.grpc.stub.StreamObserver;
import org.example.coffeeshop.CoffeeShopProto.CoffeeRequest;
import org.example.coffeeshop.CoffeeShopProto.CoffeeResponse;
import org.example.coffeeshop.CoffeeShopProto.CoffeeStatus;
import org.example.coffeeshop.CoffeeShopProto.OrderSummary;
import org.example.coffeeshop.CoffeeShopServiceGrpc;

import java.util.concurrent.TimeUnit;

public class CoffeeShopServiceImpl extends CoffeeShopServiceGrpc.CoffeeShopServiceImplBase {

    // Unary RPC
    @Override
    public void orderCoffee(CoffeeRequest request, StreamObserver<CoffeeResponse> responseObserver) {
        double price = calculatePrice(request.getCoffeeType());
        CoffeeResponse response = CoffeeResponse.newBuilder()
                .setMessage("Order received: " + request.getName() + " ordered a " + request.getCoffeeType())
                .setPrice(price)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Server Streaming RPC
    @Override
    public void trackOrder(CoffeeRequest request, StreamObserver<CoffeeStatus> responseObserver) {
        String[] statuses = {"Order received", "Order brewing", "Order ready for pickup"};

        for (String status : statuses) {
            CoffeeStatus coffeeStatus = CoffeeStatus.newBuilder().setStatus(status).build();
            responseObserver.onNext(coffeeStatus);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        responseObserver.onCompleted();
    }

    // Client Streaming RPC
    @Override
    public StreamObserver<CoffeeRequest> bulkOrder(StreamObserver<OrderSummary> responseObserver) {
        return new StreamObserver<>() {
            int totalOrders = 0;
            double totalPrice = 0;

            @Override
            public void onNext(CoffeeRequest request) {
                totalOrders++;
                totalPrice += calculatePrice(request.getCoffeeType());
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                OrderSummary summary = OrderSummary.newBuilder()
                        .setTotalOrders(totalOrders)
                        .setTotalPrice(totalPrice)
                        .build();
                responseObserver.onNext(summary);
                responseObserver.onCompleted();
            }
        };
    }

    // Bidirectional Streaming RPC
    @Override
    public StreamObserver<CoffeeRequest> coffeeChat(StreamObserver<CoffeeResponse> responseObserver) {
        return new StreamObserver<>() {
            @Override
            public void onNext(CoffeeRequest request) {
                double price = calculatePrice(request.getCoffeeType());
                CoffeeResponse response = CoffeeResponse.newBuilder()
                        .setMessage("Order for " + request.getCoffeeType() + " confirmed!")
                        .setPrice(price)
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    private double calculatePrice(String coffeeType) {
        switch (coffeeType.toLowerCase()) {
            case "espresso":
                return 3.0;
            case "latte":
                return 4.0;
            case "cappuccino":
                return 4.5;
            case "americano":
                return 2.5;
            case "mocha":
                return 4.0;
            case "macchiato":
                return 3.5;
            case "flat white":
                return 4.0;
            case "affogato":
                return 5.0;
            case "cold brew":
                return 3.0;
            case "irish coffee":
                return 5.5;
            default:
                return 2.5;
        }
    }

}
