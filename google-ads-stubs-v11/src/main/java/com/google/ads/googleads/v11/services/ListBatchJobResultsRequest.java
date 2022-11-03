// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/batch_job_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * Request message for [BatchJobService.ListBatchJobResults][google.ads.googleads.v11.services.BatchJobService.ListBatchJobResults].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.ListBatchJobResultsRequest}
 */
public final class ListBatchJobResultsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.ListBatchJobResultsRequest)
    ListBatchJobResultsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListBatchJobResultsRequest.newBuilder() to construct.
  private ListBatchJobResultsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListBatchJobResultsRequest() {
    resourceName_ = "";
    pageToken_ = "";
    responseContentType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListBatchJobResultsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_ListBatchJobResultsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_ListBatchJobResultsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.ListBatchJobResultsRequest.class, com.google.ads.googleads.v11.services.ListBatchJobResultsRequest.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Required. The resource name of the batch job whose results are being listed.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the batch job whose results are being listed.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object pageToken_;
  /**
   * <pre>
   * Token of the page to retrieve. If not specified, the first
   * page of results will be returned. Use the value obtained from
   * `next_page_token` in the previous response in order to request
   * the next page of results.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token of the page to retrieve. If not specified, the first
   * page of results will be returned. Use the value obtained from
   * `next_page_token` in the previous response in order to request
   * the next page of results.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private int pageSize_;
  /**
   * <pre>
   * Number of elements to retrieve in a single page.
   * When a page request is too large, the server may decide to
   * further limit the number of returned resources.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 4;
  private int responseContentType_;
  /**
   * <pre>
   * The response content type setting. Determines whether the mutable resource
   * or just the resource name should be returned.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 4;</code>
   * @return The enum numeric value on the wire for responseContentType.
   */
  @java.lang.Override public int getResponseContentTypeValue() {
    return responseContentType_;
  }
  /**
   * <pre>
   * The response content type setting. Determines whether the mutable resource
   * or just the resource name should be returned.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 4;</code>
   * @return The responseContentType.
   */
  @java.lang.Override public com.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType getResponseContentType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType result = com.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType.valueOf(responseContentType_);
    return result == null ? com.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pageToken_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(3, pageSize_);
    }
    if (responseContentType_ != com.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType.UNSPECIFIED.getNumber()) {
      output.writeEnum(4, responseContentType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pageToken_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, pageSize_);
    }
    if (responseContentType_ != com.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, responseContentType_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.ListBatchJobResultsRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.ListBatchJobResultsRequest other = (com.google.ads.googleads.v11.services.ListBatchJobResultsRequest) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (!getPageToken()
        .equals(other.getPageToken())) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (responseContentType_ != other.responseContentType_) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + RESPONSE_CONTENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + responseContentType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.ListBatchJobResultsRequest prototype) {
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
   * Request message for [BatchJobService.ListBatchJobResults][google.ads.googleads.v11.services.BatchJobService.ListBatchJobResults].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.ListBatchJobResultsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.ListBatchJobResultsRequest)
      com.google.ads.googleads.v11.services.ListBatchJobResultsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_ListBatchJobResultsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_ListBatchJobResultsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.ListBatchJobResultsRequest.class, com.google.ads.googleads.v11.services.ListBatchJobResultsRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.ListBatchJobResultsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      resourceName_ = "";

      pageToken_ = "";

      pageSize_ = 0;

      responseContentType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.BatchJobServiceProto.internal_static_google_ads_googleads_v11_services_ListBatchJobResultsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.ListBatchJobResultsRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.ListBatchJobResultsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.ListBatchJobResultsRequest build() {
      com.google.ads.googleads.v11.services.ListBatchJobResultsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.ListBatchJobResultsRequest buildPartial() {
      com.google.ads.googleads.v11.services.ListBatchJobResultsRequest result = new com.google.ads.googleads.v11.services.ListBatchJobResultsRequest(this);
      result.resourceName_ = resourceName_;
      result.pageToken_ = pageToken_;
      result.pageSize_ = pageSize_;
      result.responseContentType_ = responseContentType_;
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
      if (other instanceof com.google.ads.googleads.v11.services.ListBatchJobResultsRequest) {
        return mergeFrom((com.google.ads.googleads.v11.services.ListBatchJobResultsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.ListBatchJobResultsRequest other) {
      if (other == com.google.ads.googleads.v11.services.ListBatchJobResultsRequest.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (other.responseContentType_ != 0) {
        setResponseContentTypeValue(other.getResponseContentTypeValue());
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
              resourceName_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              pageToken_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              pageSize_ = input.readInt32();

              break;
            } // case 24
            case 32: {
              responseContentType_ = input.readEnum();

              break;
            } // case 32
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Required. The resource name of the batch job whose results are being listed.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the batch job whose results are being listed.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the batch job whose results are being listed.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the batch job whose results are being listed.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the batch job whose results are being listed.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * Token of the page to retrieve. If not specified, the first
     * page of results will be returned. Use the value obtained from
     * `next_page_token` in the previous response in order to request
     * the next page of results.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token of the page to retrieve. If not specified, the first
     * page of results will be returned. Use the value obtained from
     * `next_page_token` in the previous response in order to request
     * the next page of results.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token of the page to retrieve. If not specified, the first
     * page of results will be returned. Use the value obtained from
     * `next_page_token` in the previous response in order to request
     * the next page of results.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token of the page to retrieve. If not specified, the first
     * page of results will be returned. Use the value obtained from
     * `next_page_token` in the previous response in order to request
     * the next page of results.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token of the page to retrieve. If not specified, the first
     * page of results will be returned. Use the value obtained from
     * `next_page_token` in the previous response in order to request
     * the next page of results.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * Number of elements to retrieve in a single page.
     * When a page request is too large, the server may decide to
     * further limit the number of returned resources.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * Number of elements to retrieve in a single page.
     * When a page request is too large, the server may decide to
     * further limit the number of returned resources.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of elements to retrieve in a single page.
     * When a page request is too large, the server may decide to
     * further limit the number of returned resources.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private int responseContentType_ = 0;
    /**
     * <pre>
     * The response content type setting. Determines whether the mutable resource
     * or just the resource name should be returned.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 4;</code>
     * @return The enum numeric value on the wire for responseContentType.
     */
    @java.lang.Override public int getResponseContentTypeValue() {
      return responseContentType_;
    }
    /**
     * <pre>
     * The response content type setting. Determines whether the mutable resource
     * or just the resource name should be returned.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 4;</code>
     * @param value The enum numeric value on the wire for responseContentType to set.
     * @return This builder for chaining.
     */
    public Builder setResponseContentTypeValue(int value) {
      
      responseContentType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The response content type setting. Determines whether the mutable resource
     * or just the resource name should be returned.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 4;</code>
     * @return The responseContentType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType getResponseContentType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType result = com.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType.valueOf(responseContentType_);
      return result == null ? com.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The response content type setting. Determines whether the mutable resource
     * or just the resource name should be returned.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 4;</code>
     * @param value The responseContentType to set.
     * @return This builder for chaining.
     */
    public Builder setResponseContentType(com.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      responseContentType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The response content type setting. Determines whether the mutable resource
     * or just the resource name should be returned.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType response_content_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseContentType() {
      
      responseContentType_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.ListBatchJobResultsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.ListBatchJobResultsRequest)
  private static final com.google.ads.googleads.v11.services.ListBatchJobResultsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.ListBatchJobResultsRequest();
  }

  public static com.google.ads.googleads.v11.services.ListBatchJobResultsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListBatchJobResultsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListBatchJobResultsRequest>() {
    @java.lang.Override
    public ListBatchJobResultsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListBatchJobResultsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListBatchJobResultsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.ListBatchJobResultsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

