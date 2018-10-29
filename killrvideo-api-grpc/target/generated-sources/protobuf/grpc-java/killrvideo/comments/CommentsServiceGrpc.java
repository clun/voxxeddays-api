package killrvideo.comments;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Manages comments
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: comments/comments_service.proto")
public final class CommentsServiceGrpc {

  private CommentsServiceGrpc() {}

  public static final String SERVICE_NAME = "killrvideo.comments.CommentsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCommentOnVideoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest,
      killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse> METHOD_COMMENT_ON_VIDEO = getCommentOnVideoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest,
      killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse> getCommentOnVideoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest,
      killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse> getCommentOnVideoMethod() {
    return getCommentOnVideoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest,
      killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse> getCommentOnVideoMethodHelper() {
    io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest, killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse> getCommentOnVideoMethod;
    if ((getCommentOnVideoMethod = CommentsServiceGrpc.getCommentOnVideoMethod) == null) {
      synchronized (CommentsServiceGrpc.class) {
        if ((getCommentOnVideoMethod = CommentsServiceGrpc.getCommentOnVideoMethod) == null) {
          CommentsServiceGrpc.getCommentOnVideoMethod = getCommentOnVideoMethod = 
              io.grpc.MethodDescriptor.<killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest, killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "killrvideo.comments.CommentsService", "CommentOnVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommentsServiceMethodDescriptorSupplier("CommentOnVideo"))
                  .build();
          }
        }
     }
     return getCommentOnVideoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetUserCommentsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest,
      killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse> METHOD_GET_USER_COMMENTS = getGetUserCommentsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest,
      killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse> getGetUserCommentsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest,
      killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse> getGetUserCommentsMethod() {
    return getGetUserCommentsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest,
      killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse> getGetUserCommentsMethodHelper() {
    io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest, killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse> getGetUserCommentsMethod;
    if ((getGetUserCommentsMethod = CommentsServiceGrpc.getGetUserCommentsMethod) == null) {
      synchronized (CommentsServiceGrpc.class) {
        if ((getGetUserCommentsMethod = CommentsServiceGrpc.getGetUserCommentsMethod) == null) {
          CommentsServiceGrpc.getGetUserCommentsMethod = getGetUserCommentsMethod = 
              io.grpc.MethodDescriptor.<killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest, killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "killrvideo.comments.CommentsService", "GetUserComments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommentsServiceMethodDescriptorSupplier("GetUserComments"))
                  .build();
          }
        }
     }
     return getGetUserCommentsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetVideoCommentsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest,
      killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse> METHOD_GET_VIDEO_COMMENTS = getGetVideoCommentsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest,
      killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse> getGetVideoCommentsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest,
      killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse> getGetVideoCommentsMethod() {
    return getGetVideoCommentsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest,
      killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse> getGetVideoCommentsMethodHelper() {
    io.grpc.MethodDescriptor<killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest, killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse> getGetVideoCommentsMethod;
    if ((getGetVideoCommentsMethod = CommentsServiceGrpc.getGetVideoCommentsMethod) == null) {
      synchronized (CommentsServiceGrpc.class) {
        if ((getGetVideoCommentsMethod = CommentsServiceGrpc.getGetVideoCommentsMethod) == null) {
          CommentsServiceGrpc.getGetVideoCommentsMethod = getGetVideoCommentsMethod = 
              io.grpc.MethodDescriptor.<killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest, killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "killrvideo.comments.CommentsService", "GetVideoComments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommentsServiceMethodDescriptorSupplier("GetVideoComments"))
                  .build();
          }
        }
     }
     return getGetVideoCommentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommentsServiceStub newStub(io.grpc.Channel channel) {
    return new CommentsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommentsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommentsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommentsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommentsServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Manages comments
   * </pre>
   */
  public static abstract class CommentsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Add a new comment to a video
     * </pre>
     */
    public void commentOnVideo(killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest request,
        io.grpc.stub.StreamObserver<killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCommentOnVideoMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Get comments made by a user
     * </pre>
     */
    public void getUserComments(killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest request,
        io.grpc.stub.StreamObserver<killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserCommentsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Get comments made on a video
     * </pre>
     */
    public void getVideoComments(killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest request,
        io.grpc.stub.StreamObserver<killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVideoCommentsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCommentOnVideoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest,
                killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse>(
                  this, METHODID_COMMENT_ON_VIDEO)))
          .addMethod(
            getGetUserCommentsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest,
                killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse>(
                  this, METHODID_GET_USER_COMMENTS)))
          .addMethod(
            getGetVideoCommentsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest,
                killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse>(
                  this, METHODID_GET_VIDEO_COMMENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Manages comments
   * </pre>
   */
  public static final class CommentsServiceStub extends io.grpc.stub.AbstractStub<CommentsServiceStub> {
    private CommentsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommentsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommentsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add a new comment to a video
     * </pre>
     */
    public void commentOnVideo(killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest request,
        io.grpc.stub.StreamObserver<killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommentOnVideoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get comments made by a user
     * </pre>
     */
    public void getUserComments(killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest request,
        io.grpc.stub.StreamObserver<killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserCommentsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get comments made on a video
     * </pre>
     */
    public void getVideoComments(killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest request,
        io.grpc.stub.StreamObserver<killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVideoCommentsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Manages comments
   * </pre>
   */
  public static final class CommentsServiceBlockingStub extends io.grpc.stub.AbstractStub<CommentsServiceBlockingStub> {
    private CommentsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommentsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommentsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add a new comment to a video
     * </pre>
     */
    public killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse commentOnVideo(killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest request) {
      return blockingUnaryCall(
          getChannel(), getCommentOnVideoMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get comments made by a user
     * </pre>
     */
    public killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse getUserComments(killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserCommentsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get comments made on a video
     * </pre>
     */
    public killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse getVideoComments(killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVideoCommentsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Manages comments
   * </pre>
   */
  public static final class CommentsServiceFutureStub extends io.grpc.stub.AbstractStub<CommentsServiceFutureStub> {
    private CommentsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommentsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommentsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add a new comment to a video
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse> commentOnVideo(
        killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCommentOnVideoMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get comments made by a user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse> getUserComments(
        killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserCommentsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get comments made on a video
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse> getVideoComments(
        killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVideoCommentsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMMENT_ON_VIDEO = 0;
  private static final int METHODID_GET_USER_COMMENTS = 1;
  private static final int METHODID_GET_VIDEO_COMMENTS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommentsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommentsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COMMENT_ON_VIDEO:
          serviceImpl.commentOnVideo((killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoRequest) request,
              (io.grpc.stub.StreamObserver<killrvideo.comments.CommentsServiceOuterClass.CommentOnVideoResponse>) responseObserver);
          break;
        case METHODID_GET_USER_COMMENTS:
          serviceImpl.getUserComments((killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsRequest) request,
              (io.grpc.stub.StreamObserver<killrvideo.comments.CommentsServiceOuterClass.GetUserCommentsResponse>) responseObserver);
          break;
        case METHODID_GET_VIDEO_COMMENTS:
          serviceImpl.getVideoComments((killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsRequest) request,
              (io.grpc.stub.StreamObserver<killrvideo.comments.CommentsServiceOuterClass.GetVideoCommentsResponse>) responseObserver);
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

  private static abstract class CommentsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommentsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return killrvideo.comments.CommentsServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommentsService");
    }
  }

  private static final class CommentsServiceFileDescriptorSupplier
      extends CommentsServiceBaseDescriptorSupplier {
    CommentsServiceFileDescriptorSupplier() {}
  }

  private static final class CommentsServiceMethodDescriptorSupplier
      extends CommentsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommentsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommentsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommentsServiceFileDescriptorSupplier())
              .addMethod(getCommentOnVideoMethodHelper())
              .addMethod(getGetUserCommentsMethodHelper())
              .addMethod(getGetVideoCommentsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
