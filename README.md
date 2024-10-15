# gRPC Coffee Shop Example

## Overview

This project demonstrates a simple gRPC-based coffee shop application, which includes a Java server and a Python client. The application allows users to order coffee, track orders, and handle bulk orders using gRPC (Google Remote Procedure Call) and Protocol Buffers.

## What is gRPC?

gRPC is an open-source remote procedure call (RPC) framework developed by Google. It enables communication between client and server applications, allowing them to call methods remotely as if they were local. gRPC uses HTTP/2 for transport, which provides features like multiplexing, flow control, and header compression.

### Key Features of gRPC:

- **Language Agnostic:** Supports multiple programming languages, making it easy to integrate services written in different languages.
- **Streaming Support:** Offers various types of RPCs, including unary, server streaming, client streaming, and bidirectional streaming.
- **Built-in Authentication:** Provides mechanisms for securing communication between client and server.
- **Load Balancing and Failover:** Supports load balancing and failover for distributed systems.
![gRPC Service Methods](https://tailcall.run/assets/images/methods-35307e474e222e0f3266a391be1d2e8f.png)

## What are Protocol Buffers?

Protocol Buffers (protobuf) is a language-neutral, platform-neutral mechanism for serializing structured data. It allows you to define your data structure in a `.proto` file, which is then compiled into code for various languages using a tool called `protoc`.

### Advantages of Protocol Buffers:

- **Compact and Efficient:** Generates compact binary representations of data, which saves bandwidth and improves performance.
- **Schema Evolution:** Supports adding new fields or changing existing ones without breaking compatibility with older versions.
- **Strongly Typed:** Provides type safety by defining data structures explicitly.

## What is `protoc`?

`protoc` is the Protocol Buffer compiler that takes `.proto` files and generates code for various programming languages. It compiles the protocol buffer definitions into language-specific files (e.g., Java, Python, etc.) that can be used to build the client and server logic.

### How `protoc` Works:

1. **Define the Service and Messages:** Write the service and message definitions in a `.proto` file.
2. **Run `protoc`:** Use the `protoc` compiler to generate code in your desired language.
   - For Java, it generates Java classes for the service and message types.
   - For Python, it generates Python modules that can be imported into the client or server code.
3. **Use the Generated Code:** The generated code is then used to implement the server and client logic for gRPC communication.

![High-level architecture of gRPC](https://www.polarsparc.com/xhtml/images/grpc-01.png)
### Example of `protoc` Usage:

To generate Java and Python code from the `coffee_shop.proto` file:

```bash
# For Java (generates Java classes)
protoc --java_out=./server/src/main/java coffee_shop.proto

# For Python (generates Python modules)
protoc --python_out=./client coffee_shop.proto
