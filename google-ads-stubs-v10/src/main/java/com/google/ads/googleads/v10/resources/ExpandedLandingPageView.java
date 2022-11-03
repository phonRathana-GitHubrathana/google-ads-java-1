// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/expanded_landing_page_view.proto

package com.google.ads.googleads.v10.resources;

/**
 * <pre>
 * A landing page view with metrics aggregated at the expanded final URL
 * level.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.resources.ExpandedLandingPageView}
 */
public final class ExpandedLandingPageView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.resources.ExpandedLandingPageView)
    ExpandedLandingPageViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExpandedLandingPageView.newBuilder() to construct.
  private ExpandedLandingPageView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExpandedLandingPageView() {
    resourceName_ = "";
    expandedFinalUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExpandedLandingPageView();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.resources.ExpandedLandingPageViewProto.internal_static_google_ads_googleads_v10_resources_ExpandedLandingPageView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.resources.ExpandedLandingPageViewProto.internal_static_google_ads_googleads_v10_resources_ExpandedLandingPageView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.resources.ExpandedLandingPageView.class, com.google.ads.googleads.v10.resources.ExpandedLandingPageView.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Output only. The resource name of the expanded landing page view.
   * Expanded landing page view resource names have the form:
   * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
   * Output only. The resource name of the expanded landing page view.
   * Expanded landing page view resource names have the form:
   * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

  public static final int EXPANDED_FINAL_URL_FIELD_NUMBER = 3;
  private volatile java.lang.Object expandedFinalUrl_;
  /**
   * <pre>
   * Output only. The final URL that clicks are directed to.
   * </pre>
   *
   * <code>optional string expanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the expandedFinalUrl field is set.
   */
  @java.lang.Override
  public boolean hasExpandedFinalUrl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. The final URL that clicks are directed to.
   * </pre>
   *
   * <code>optional string expanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The expandedFinalUrl.
   */
  @java.lang.Override
  public java.lang.String getExpandedFinalUrl() {
    java.lang.Object ref = expandedFinalUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expandedFinalUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The final URL that clicks are directed to.
   * </pre>
   *
   * <code>optional string expanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for expandedFinalUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExpandedFinalUrlBytes() {
    java.lang.Object ref = expandedFinalUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      expandedFinalUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, expandedFinalUrl_);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, expandedFinalUrl_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.resources.ExpandedLandingPageView)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.resources.ExpandedLandingPageView other = (com.google.ads.googleads.v10.resources.ExpandedLandingPageView) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasExpandedFinalUrl() != other.hasExpandedFinalUrl()) return false;
    if (hasExpandedFinalUrl()) {
      if (!getExpandedFinalUrl()
          .equals(other.getExpandedFinalUrl())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasExpandedFinalUrl()) {
      hash = (37 * hash) + EXPANDED_FINAL_URL_FIELD_NUMBER;
      hash = (53 * hash) + getExpandedFinalUrl().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.resources.ExpandedLandingPageView prototype) {
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
   * A landing page view with metrics aggregated at the expanded final URL
   * level.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.resources.ExpandedLandingPageView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.resources.ExpandedLandingPageView)
      com.google.ads.googleads.v10.resources.ExpandedLandingPageViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.resources.ExpandedLandingPageViewProto.internal_static_google_ads_googleads_v10_resources_ExpandedLandingPageView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.resources.ExpandedLandingPageViewProto.internal_static_google_ads_googleads_v10_resources_ExpandedLandingPageView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.resources.ExpandedLandingPageView.class, com.google.ads.googleads.v10.resources.ExpandedLandingPageView.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.resources.ExpandedLandingPageView.newBuilder()
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

      expandedFinalUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.resources.ExpandedLandingPageViewProto.internal_static_google_ads_googleads_v10_resources_ExpandedLandingPageView_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.ExpandedLandingPageView getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.resources.ExpandedLandingPageView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.ExpandedLandingPageView build() {
      com.google.ads.googleads.v10.resources.ExpandedLandingPageView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.ExpandedLandingPageView buildPartial() {
      com.google.ads.googleads.v10.resources.ExpandedLandingPageView result = new com.google.ads.googleads.v10.resources.ExpandedLandingPageView(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.resourceName_ = resourceName_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.expandedFinalUrl_ = expandedFinalUrl_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v10.resources.ExpandedLandingPageView) {
        return mergeFrom((com.google.ads.googleads.v10.resources.ExpandedLandingPageView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.resources.ExpandedLandingPageView other) {
      if (other == com.google.ads.googleads.v10.resources.ExpandedLandingPageView.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasExpandedFinalUrl()) {
        bitField0_ |= 0x00000001;
        expandedFinalUrl_ = other.expandedFinalUrl_;
        onChanged();
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
            case 26: {
              expandedFinalUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
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
    private int bitField0_;

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Output only. The resource name of the expanded landing page view.
     * Expanded landing page view resource names have the form:
     * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the expanded landing page view.
     * Expanded landing page view resource names have the form:
     * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the expanded landing page view.
     * Expanded landing page view resource names have the form:
     * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the expanded landing page view.
     * Expanded landing page view resource names have the form:
     * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the expanded landing page view.
     * Expanded landing page view resource names have the form:
     * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

    private java.lang.Object expandedFinalUrl_ = "";
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>optional string expanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the expandedFinalUrl field is set.
     */
    public boolean hasExpandedFinalUrl() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>optional string expanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The expandedFinalUrl.
     */
    public java.lang.String getExpandedFinalUrl() {
      java.lang.Object ref = expandedFinalUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expandedFinalUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>optional string expanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for expandedFinalUrl.
     */
    public com.google.protobuf.ByteString
        getExpandedFinalUrlBytes() {
      java.lang.Object ref = expandedFinalUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expandedFinalUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>optional string expanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The expandedFinalUrl to set.
     * @return This builder for chaining.
     */
    public Builder setExpandedFinalUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      expandedFinalUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>optional string expanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearExpandedFinalUrl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      expandedFinalUrl_ = getDefaultInstance().getExpandedFinalUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>optional string expanded_final_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for expandedFinalUrl to set.
     * @return This builder for chaining.
     */
    public Builder setExpandedFinalUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      expandedFinalUrl_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.resources.ExpandedLandingPageView)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.resources.ExpandedLandingPageView)
  private static final com.google.ads.googleads.v10.resources.ExpandedLandingPageView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.resources.ExpandedLandingPageView();
  }

  public static com.google.ads.googleads.v10.resources.ExpandedLandingPageView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExpandedLandingPageView>
      PARSER = new com.google.protobuf.AbstractParser<ExpandedLandingPageView>() {
    @java.lang.Override
    public ExpandedLandingPageView parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExpandedLandingPageView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExpandedLandingPageView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.resources.ExpandedLandingPageView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

