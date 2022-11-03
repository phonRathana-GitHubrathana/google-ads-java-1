// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/account_link_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * Response message for account link mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.MutateAccountLinkResponse}
 */
public final class MutateAccountLinkResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.MutateAccountLinkResponse)
    MutateAccountLinkResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateAccountLinkResponse.newBuilder() to construct.
  private MutateAccountLinkResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateAccountLinkResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateAccountLinkResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.services.AccountLinkServiceProto.internal_static_google_ads_googleads_v11_services_MutateAccountLinkResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.AccountLinkServiceProto.internal_static_google_ads_googleads_v11_services_MutateAccountLinkResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.MutateAccountLinkResponse.class, com.google.ads.googleads.v11.services.MutateAccountLinkResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v11.services.MutateAccountLinkResult result_;
  /**
   * <pre>
   * Result for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.MutateAccountLinkResult result = 1;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <pre>
   * Result for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.MutateAccountLinkResult result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.MutateAccountLinkResult getResult() {
    return result_ == null ? com.google.ads.googleads.v11.services.MutateAccountLinkResult.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * Result for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.MutateAccountLinkResult result = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.MutateAccountLinkResultOrBuilder getResultOrBuilder() {
    return getResult();
  }

  public static final int PARTIAL_FAILURE_ERROR_FIELD_NUMBER = 2;
  private com.google.rpc.Status partialFailureError_;
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   * @return Whether the partialFailureError field is set.
   */
  @java.lang.Override
  public boolean hasPartialFailureError() {
    return partialFailureError_ != null;
  }
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   * @return The partialFailureError.
   */
  @java.lang.Override
  public com.google.rpc.Status getPartialFailureError() {
    return partialFailureError_ == null ? com.google.rpc.Status.getDefaultInstance() : partialFailureError_;
  }
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder() {
    return getPartialFailureError();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (result_ != null) {
      output.writeMessage(1, getResult());
    }
    if (partialFailureError_ != null) {
      output.writeMessage(2, getPartialFailureError());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResult());
    }
    if (partialFailureError_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPartialFailureError());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v11.services.MutateAccountLinkResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.MutateAccountLinkResponse other = (com.google.ads.googleads.v11.services.MutateAccountLinkResponse) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
    if (hasPartialFailureError() != other.hasPartialFailureError()) return false;
    if (hasPartialFailureError()) {
      if (!getPartialFailureError()
          .equals(other.getPartialFailureError())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    if (hasPartialFailureError()) {
      hash = (37 * hash) + PARTIAL_FAILURE_ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getPartialFailureError().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v11.services.MutateAccountLinkResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response message for account link mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.MutateAccountLinkResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.MutateAccountLinkResponse)
      com.google.ads.googleads.v11.services.MutateAccountLinkResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.AccountLinkServiceProto.internal_static_google_ads_googleads_v11_services_MutateAccountLinkResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.AccountLinkServiceProto.internal_static_google_ads_googleads_v11_services_MutateAccountLinkResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.MutateAccountLinkResponse.class, com.google.ads.googleads.v11.services.MutateAccountLinkResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.MutateAccountLinkResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      if (partialFailureErrorBuilder_ == null) {
        partialFailureError_ = null;
      } else {
        partialFailureError_ = null;
        partialFailureErrorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.AccountLinkServiceProto.internal_static_google_ads_googleads_v11_services_MutateAccountLinkResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.MutateAccountLinkResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.MutateAccountLinkResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.MutateAccountLinkResponse build() {
      com.google.ads.googleads.v11.services.MutateAccountLinkResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.MutateAccountLinkResponse buildPartial() {
      com.google.ads.googleads.v11.services.MutateAccountLinkResponse result = new com.google.ads.googleads.v11.services.MutateAccountLinkResponse(this);
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
      if (partialFailureErrorBuilder_ == null) {
        result.partialFailureError_ = partialFailureError_;
      } else {
        result.partialFailureError_ = partialFailureErrorBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v11.services.MutateAccountLinkResponse) {
        return mergeFrom((com.google.ads.googleads.v11.services.MutateAccountLinkResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.MutateAccountLinkResponse other) {
      if (other == com.google.ads.googleads.v11.services.MutateAccountLinkResponse.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      if (other.hasPartialFailureError()) {
        mergePartialFailureError(other.getPartialFailureError());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getResultFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPartialFailureErrorFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.ads.googleads.v11.services.MutateAccountLinkResult result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.services.MutateAccountLinkResult, com.google.ads.googleads.v11.services.MutateAccountLinkResult.Builder, com.google.ads.googleads.v11.services.MutateAccountLinkResultOrBuilder> resultBuilder_;
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateAccountLinkResult result = 1;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateAccountLinkResult result = 1;</code>
     * @return The result.
     */
    public com.google.ads.googleads.v11.services.MutateAccountLinkResult getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.google.ads.googleads.v11.services.MutateAccountLinkResult.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateAccountLinkResult result = 1;</code>
     */
    public Builder setResult(com.google.ads.googleads.v11.services.MutateAccountLinkResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateAccountLinkResult result = 1;</code>
     */
    public Builder setResult(
        com.google.ads.googleads.v11.services.MutateAccountLinkResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateAccountLinkResult result = 1;</code>
     */
    public Builder mergeResult(com.google.ads.googleads.v11.services.MutateAccountLinkResult value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            com.google.ads.googleads.v11.services.MutateAccountLinkResult.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateAccountLinkResult result = 1;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateAccountLinkResult result = 1;</code>
     */
    public com.google.ads.googleads.v11.services.MutateAccountLinkResult.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateAccountLinkResult result = 1;</code>
     */
    public com.google.ads.googleads.v11.services.MutateAccountLinkResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.google.ads.googleads.v11.services.MutateAccountLinkResult.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * Result for the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.MutateAccountLinkResult result = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.services.MutateAccountLinkResult, com.google.ads.googleads.v11.services.MutateAccountLinkResult.Builder, com.google.ads.googleads.v11.services.MutateAccountLinkResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.services.MutateAccountLinkResult, com.google.ads.googleads.v11.services.MutateAccountLinkResult.Builder, com.google.ads.googleads.v11.services.MutateAccountLinkResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
    }

    private com.google.rpc.Status partialFailureError_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> partialFailureErrorBuilder_;
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     * @return Whether the partialFailureError field is set.
     */
    public boolean hasPartialFailureError() {
      return partialFailureErrorBuilder_ != null || partialFailureError_ != null;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     * @return The partialFailureError.
     */
    public com.google.rpc.Status getPartialFailureError() {
      if (partialFailureErrorBuilder_ == null) {
        return partialFailureError_ == null ? com.google.rpc.Status.getDefaultInstance() : partialFailureError_;
      } else {
        return partialFailureErrorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    public Builder setPartialFailureError(com.google.rpc.Status value) {
      if (partialFailureErrorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partialFailureError_ = value;
        onChanged();
      } else {
        partialFailureErrorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    public Builder setPartialFailureError(
        com.google.rpc.Status.Builder builderForValue) {
      if (partialFailureErrorBuilder_ == null) {
        partialFailureError_ = builderForValue.build();
        onChanged();
      } else {
        partialFailureErrorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    public Builder mergePartialFailureError(com.google.rpc.Status value) {
      if (partialFailureErrorBuilder_ == null) {
        if (partialFailureError_ != null) {
          partialFailureError_ =
            com.google.rpc.Status.newBuilder(partialFailureError_).mergeFrom(value).buildPartial();
        } else {
          partialFailureError_ = value;
        }
        onChanged();
      } else {
        partialFailureErrorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    public Builder clearPartialFailureError() {
      if (partialFailureErrorBuilder_ == null) {
        partialFailureError_ = null;
        onChanged();
      } else {
        partialFailureError_ = null;
        partialFailureErrorBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    public com.google.rpc.Status.Builder getPartialFailureErrorBuilder() {
      
      onChanged();
      return getPartialFailureErrorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    public com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder() {
      if (partialFailureErrorBuilder_ != null) {
        return partialFailureErrorBuilder_.getMessageOrBuilder();
      } else {
        return partialFailureError_ == null ?
            com.google.rpc.Status.getDefaultInstance() : partialFailureError_;
      }
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getPartialFailureErrorFieldBuilder() {
      if (partialFailureErrorBuilder_ == null) {
        partialFailureErrorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getPartialFailureError(),
                getParentForChildren(),
                isClean());
        partialFailureError_ = null;
      }
      return partialFailureErrorBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.MutateAccountLinkResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.MutateAccountLinkResponse)
  private static final com.google.ads.googleads.v11.services.MutateAccountLinkResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.MutateAccountLinkResponse();
  }

  public static com.google.ads.googleads.v11.services.MutateAccountLinkResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateAccountLinkResponse>
      PARSER = new com.google.protobuf.AbstractParser<MutateAccountLinkResponse>() {
    @java.lang.Override
    public MutateAccountLinkResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MutateAccountLinkResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateAccountLinkResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.MutateAccountLinkResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

