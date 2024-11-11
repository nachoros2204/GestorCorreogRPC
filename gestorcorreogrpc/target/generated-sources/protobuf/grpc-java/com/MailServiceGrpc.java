package com;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: gestorcorreogrpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MailServiceGrpc {

  private MailServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.MailService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.Gestorcorreogrpc.MandarMailRequest,
      com.Gestorcorreogrpc.MandarMailResponse> getMandarMailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MandarMail",
      requestType = com.Gestorcorreogrpc.MandarMailRequest.class,
      responseType = com.Gestorcorreogrpc.MandarMailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.Gestorcorreogrpc.MandarMailRequest,
      com.Gestorcorreogrpc.MandarMailResponse> getMandarMailMethod() {
    io.grpc.MethodDescriptor<com.Gestorcorreogrpc.MandarMailRequest, com.Gestorcorreogrpc.MandarMailResponse> getMandarMailMethod;
    if ((getMandarMailMethod = MailServiceGrpc.getMandarMailMethod) == null) {
      synchronized (MailServiceGrpc.class) {
        if ((getMandarMailMethod = MailServiceGrpc.getMandarMailMethod) == null) {
          MailServiceGrpc.getMandarMailMethod = getMandarMailMethod =
              io.grpc.MethodDescriptor.<com.Gestorcorreogrpc.MandarMailRequest, com.Gestorcorreogrpc.MandarMailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MandarMail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Gestorcorreogrpc.MandarMailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Gestorcorreogrpc.MandarMailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MailServiceMethodDescriptorSupplier("MandarMail"))
              .build();
        }
      }
    }
    return getMandarMailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MailServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MailServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MailServiceStub>() {
        @java.lang.Override
        public MailServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MailServiceStub(channel, callOptions);
        }
      };
    return MailServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MailServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MailServiceBlockingStub>() {
        @java.lang.Override
        public MailServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MailServiceBlockingStub(channel, callOptions);
        }
      };
    return MailServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MailServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MailServiceFutureStub>() {
        @java.lang.Override
        public MailServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MailServiceFutureStub(channel, callOptions);
        }
      };
    return MailServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Servicio para mandar un correo a un grupo de usuarios
     * </pre>
     */
    default void mandarMail(com.Gestorcorreogrpc.MandarMailRequest request,
        io.grpc.stub.StreamObserver<com.Gestorcorreogrpc.MandarMailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMandarMailMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MailService.
   */
  public static abstract class MailServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MailServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MailService.
   */
  public static final class MailServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MailServiceStub> {
    private MailServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MailServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Servicio para mandar un correo a un grupo de usuarios
     * </pre>
     */
    public void mandarMail(com.Gestorcorreogrpc.MandarMailRequest request,
        io.grpc.stub.StreamObserver<com.Gestorcorreogrpc.MandarMailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMandarMailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MailService.
   */
  public static final class MailServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MailServiceBlockingStub> {
    private MailServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MailServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Servicio para mandar un correo a un grupo de usuarios
     * </pre>
     */
    public com.Gestorcorreogrpc.MandarMailResponse mandarMail(com.Gestorcorreogrpc.MandarMailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMandarMailMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MailService.
   */
  public static final class MailServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MailServiceFutureStub> {
    private MailServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MailServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Servicio para mandar un correo a un grupo de usuarios
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.Gestorcorreogrpc.MandarMailResponse> mandarMail(
        com.Gestorcorreogrpc.MandarMailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMandarMailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MANDAR_MAIL = 0;

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
        case METHODID_MANDAR_MAIL:
          serviceImpl.mandarMail((com.Gestorcorreogrpc.MandarMailRequest) request,
              (io.grpc.stub.StreamObserver<com.Gestorcorreogrpc.MandarMailResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMandarMailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.Gestorcorreogrpc.MandarMailRequest,
              com.Gestorcorreogrpc.MandarMailResponse>(
                service, METHODID_MANDAR_MAIL)))
        .build();
  }

  private static abstract class MailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.Gestorcorreogrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MailService");
    }
  }

  private static final class MailServiceFileDescriptorSupplier
      extends MailServiceBaseDescriptorSupplier {
    MailServiceFileDescriptorSupplier() {}
  }

  private static final class MailServiceMethodDescriptorSupplier
      extends MailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MailServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MailServiceFileDescriptorSupplier())
              .addMethod(getMandarMailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
