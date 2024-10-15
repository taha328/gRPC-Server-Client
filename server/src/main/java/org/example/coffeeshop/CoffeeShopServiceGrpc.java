package org.example.coffeeshop;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.0)",
    comments = "Source: coffee_shop.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CoffeeShopServiceGrpc {

  private CoffeeShopServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "CoffeeShopService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest,
      org.example.coffeeshop.CoffeeShopProto.CoffeeResponse> getOrderCoffeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OrderCoffee",
      requestType = org.example.coffeeshop.CoffeeShopProto.CoffeeRequest.class,
      responseType = org.example.coffeeshop.CoffeeShopProto.CoffeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest,
      org.example.coffeeshop.CoffeeShopProto.CoffeeResponse> getOrderCoffeeMethod() {
    io.grpc.MethodDescriptor<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest, org.example.coffeeshop.CoffeeShopProto.CoffeeResponse> getOrderCoffeeMethod;
    if ((getOrderCoffeeMethod = CoffeeShopServiceGrpc.getOrderCoffeeMethod) == null) {
      synchronized (CoffeeShopServiceGrpc.class) {
        if ((getOrderCoffeeMethod = CoffeeShopServiceGrpc.getOrderCoffeeMethod) == null) {
          CoffeeShopServiceGrpc.getOrderCoffeeMethod = getOrderCoffeeMethod =
              io.grpc.MethodDescriptor.<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest, org.example.coffeeshop.CoffeeShopProto.CoffeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OrderCoffee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.coffeeshop.CoffeeShopProto.CoffeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.coffeeshop.CoffeeShopProto.CoffeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoffeeShopServiceMethodDescriptorSupplier("OrderCoffee"))
              .build();
        }
      }
    }
    return getOrderCoffeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest,
      org.example.coffeeshop.CoffeeShopProto.CoffeeStatus> getTrackOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrackOrder",
      requestType = org.example.coffeeshop.CoffeeShopProto.CoffeeRequest.class,
      responseType = org.example.coffeeshop.CoffeeShopProto.CoffeeStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest,
      org.example.coffeeshop.CoffeeShopProto.CoffeeStatus> getTrackOrderMethod() {
    io.grpc.MethodDescriptor<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest, org.example.coffeeshop.CoffeeShopProto.CoffeeStatus> getTrackOrderMethod;
    if ((getTrackOrderMethod = CoffeeShopServiceGrpc.getTrackOrderMethod) == null) {
      synchronized (CoffeeShopServiceGrpc.class) {
        if ((getTrackOrderMethod = CoffeeShopServiceGrpc.getTrackOrderMethod) == null) {
          CoffeeShopServiceGrpc.getTrackOrderMethod = getTrackOrderMethod =
              io.grpc.MethodDescriptor.<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest, org.example.coffeeshop.CoffeeShopProto.CoffeeStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrackOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.coffeeshop.CoffeeShopProto.CoffeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.coffeeshop.CoffeeShopProto.CoffeeStatus.getDefaultInstance()))
              .setSchemaDescriptor(new CoffeeShopServiceMethodDescriptorSupplier("TrackOrder"))
              .build();
        }
      }
    }
    return getTrackOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest,
      org.example.coffeeshop.CoffeeShopProto.OrderSummary> getBulkOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkOrder",
      requestType = org.example.coffeeshop.CoffeeShopProto.CoffeeRequest.class,
      responseType = org.example.coffeeshop.CoffeeShopProto.OrderSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest,
      org.example.coffeeshop.CoffeeShopProto.OrderSummary> getBulkOrderMethod() {
    io.grpc.MethodDescriptor<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest, org.example.coffeeshop.CoffeeShopProto.OrderSummary> getBulkOrderMethod;
    if ((getBulkOrderMethod = CoffeeShopServiceGrpc.getBulkOrderMethod) == null) {
      synchronized (CoffeeShopServiceGrpc.class) {
        if ((getBulkOrderMethod = CoffeeShopServiceGrpc.getBulkOrderMethod) == null) {
          CoffeeShopServiceGrpc.getBulkOrderMethod = getBulkOrderMethod =
              io.grpc.MethodDescriptor.<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest, org.example.coffeeshop.CoffeeShopProto.OrderSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BulkOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.coffeeshop.CoffeeShopProto.CoffeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.coffeeshop.CoffeeShopProto.OrderSummary.getDefaultInstance()))
              .setSchemaDescriptor(new CoffeeShopServiceMethodDescriptorSupplier("BulkOrder"))
              .build();
        }
      }
    }
    return getBulkOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest,
      org.example.coffeeshop.CoffeeShopProto.CoffeeResponse> getCoffeeChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CoffeeChat",
      requestType = org.example.coffeeshop.CoffeeShopProto.CoffeeRequest.class,
      responseType = org.example.coffeeshop.CoffeeShopProto.CoffeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest,
      org.example.coffeeshop.CoffeeShopProto.CoffeeResponse> getCoffeeChatMethod() {
    io.grpc.MethodDescriptor<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest, org.example.coffeeshop.CoffeeShopProto.CoffeeResponse> getCoffeeChatMethod;
    if ((getCoffeeChatMethod = CoffeeShopServiceGrpc.getCoffeeChatMethod) == null) {
      synchronized (CoffeeShopServiceGrpc.class) {
        if ((getCoffeeChatMethod = CoffeeShopServiceGrpc.getCoffeeChatMethod) == null) {
          CoffeeShopServiceGrpc.getCoffeeChatMethod = getCoffeeChatMethod =
              io.grpc.MethodDescriptor.<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest, org.example.coffeeshop.CoffeeShopProto.CoffeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CoffeeChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.coffeeshop.CoffeeShopProto.CoffeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.coffeeshop.CoffeeShopProto.CoffeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CoffeeShopServiceMethodDescriptorSupplier("CoffeeChat"))
              .build();
        }
      }
    }
    return getCoffeeChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoffeeShopServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoffeeShopServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoffeeShopServiceStub>() {
        @java.lang.Override
        public CoffeeShopServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoffeeShopServiceStub(channel, callOptions);
        }
      };
    return CoffeeShopServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoffeeShopServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoffeeShopServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoffeeShopServiceBlockingStub>() {
        @java.lang.Override
        public CoffeeShopServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoffeeShopServiceBlockingStub(channel, callOptions);
        }
      };
    return CoffeeShopServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoffeeShopServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoffeeShopServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoffeeShopServiceFutureStub>() {
        @java.lang.Override
        public CoffeeShopServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoffeeShopServiceFutureStub(channel, callOptions);
        }
      };
    return CoffeeShopServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    default void orderCoffee(org.example.coffeeshop.CoffeeShopProto.CoffeeRequest request,
        io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderCoffeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming RPC
     * </pre>
     */
    default void trackOrder(org.example.coffeeshop.CoffeeShopProto.CoffeeRequest request,
        io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrackOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest> bulkOrder(
        io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.OrderSummary> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBulkOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest> coffeeChat(
        io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCoffeeChatMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CoffeeShopService.
   */
  public static abstract class CoffeeShopServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CoffeeShopServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CoffeeShopService.
   */
  public static final class CoffeeShopServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CoffeeShopServiceStub> {
    private CoffeeShopServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoffeeShopServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoffeeShopServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void orderCoffee(org.example.coffeeshop.CoffeeShopProto.CoffeeRequest request,
        io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrderCoffeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming RPC
     * </pre>
     */
    public void trackOrder(org.example.coffeeshop.CoffeeShopProto.CoffeeRequest request,
        io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getTrackOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest> bulkOrder(
        io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.OrderSummary> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getBulkOrderMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeRequest> coffeeChat(
        io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCoffeeChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CoffeeShopService.
   */
  public static final class CoffeeShopServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CoffeeShopServiceBlockingStub> {
    private CoffeeShopServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoffeeShopServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoffeeShopServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public org.example.coffeeshop.CoffeeShopProto.CoffeeResponse orderCoffee(org.example.coffeeshop.CoffeeShopProto.CoffeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrderCoffeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming RPC
     * </pre>
     */
    public java.util.Iterator<org.example.coffeeshop.CoffeeShopProto.CoffeeStatus> trackOrder(
        org.example.coffeeshop.CoffeeShopProto.CoffeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getTrackOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CoffeeShopService.
   */
  public static final class CoffeeShopServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CoffeeShopServiceFutureStub> {
    private CoffeeShopServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoffeeShopServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoffeeShopServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.coffeeshop.CoffeeShopProto.CoffeeResponse> orderCoffee(
        org.example.coffeeshop.CoffeeShopProto.CoffeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrderCoffeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ORDER_COFFEE = 0;
  private static final int METHODID_TRACK_ORDER = 1;
  private static final int METHODID_BULK_ORDER = 2;
  private static final int METHODID_COFFEE_CHAT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ORDER_COFFEE:
          serviceImpl.orderCoffee((org.example.coffeeshop.CoffeeShopProto.CoffeeRequest) request,
              (io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeResponse>) responseObserver);
          break;
        case METHODID_TRACK_ORDER:
          serviceImpl.trackOrder((org.example.coffeeshop.CoffeeShopProto.CoffeeRequest) request,
              (io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeStatus>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BULK_ORDER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bulkOrder(
              (io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.OrderSummary>) responseObserver);
        case METHODID_COFFEE_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.coffeeChat(
              (io.grpc.stub.StreamObserver<org.example.coffeeshop.CoffeeShopProto.CoffeeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getOrderCoffeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.coffeeshop.CoffeeShopProto.CoffeeRequest,
              org.example.coffeeshop.CoffeeShopProto.CoffeeResponse>(
                service, METHODID_ORDER_COFFEE)))
        .addMethod(
          getTrackOrderMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.example.coffeeshop.CoffeeShopProto.CoffeeRequest,
              org.example.coffeeshop.CoffeeShopProto.CoffeeStatus>(
                service, METHODID_TRACK_ORDER)))
        .addMethod(
          getBulkOrderMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              org.example.coffeeshop.CoffeeShopProto.CoffeeRequest,
              org.example.coffeeshop.CoffeeShopProto.OrderSummary>(
                service, METHODID_BULK_ORDER)))
        .addMethod(
          getCoffeeChatMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.example.coffeeshop.CoffeeShopProto.CoffeeRequest,
              org.example.coffeeshop.CoffeeShopProto.CoffeeResponse>(
                service, METHODID_COFFEE_CHAT)))
        .build();
  }

  private static abstract class CoffeeShopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CoffeeShopServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.coffeeshop.CoffeeShopProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CoffeeShopService");
    }
  }

  private static final class CoffeeShopServiceFileDescriptorSupplier
      extends CoffeeShopServiceBaseDescriptorSupplier {
    CoffeeShopServiceFileDescriptorSupplier() {}
  }

  private static final class CoffeeShopServiceMethodDescriptorSupplier
      extends CoffeeShopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CoffeeShopServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CoffeeShopServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CoffeeShopServiceFileDescriptorSupplier())
              .addMethod(getOrderCoffeeMethod())
              .addMethod(getTrackOrderMethod())
              .addMethod(getBulkOrderMethod())
              .addMethod(getCoffeeChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
