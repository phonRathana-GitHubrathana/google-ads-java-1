// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/ad_group_asset_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * The result for the ad group asset mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.MutateAdGroupAssetResult}
 */
public final class MutateAdGroupAssetResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.MutateAdGroupAssetResult)
    MutateAdGroupAssetResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateAdGroupAssetResult.newBuilder() to construct.
  private MutateAdGroupAssetResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateAdGroupAssetResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateAdGroupAssetResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.AdGroupAssetServiceProto.internal_static_google_ads_googleads_v12_services_MutateAdGroupAssetResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.AdGroupAssetServiceProto.internal_static_google_ads_googleads_v12_services_MutateAdGroupAssetResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.MutateAdGroupAssetResult.class, com.google.ads.googleads.v12.services.MutateAdGroupAssetResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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

  public static final int AD_GROUP_ASSET_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v12.resources.AdGroupAsset adGroupAsset_;
  /**
   * <pre>
   * The mutated ad group asset with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.AdGroupAsset ad_group_asset = 2;</code>
   * @return Whether the adGroupAsset field is set.
   */
  @java.lang.Override
  public boolean hasAdGroupAsset() {
    return adGroupAsset_ != null;
  }
  /**
   * <pre>
   * The mutated ad group asset with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.AdGroupAsset ad_group_asset = 2;</code>
   * @return The adGroupAsset.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.resources.AdGroupAsset getAdGroupAsset() {
    return adGroupAsset_ == null ? com.google.ads.googleads.v12.resources.AdGroupAsset.getDefaultInstance() : adGroupAsset_;
  }
  /**
   * <pre>
   * The mutated ad group asset with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.AdGroupAsset ad_group_asset = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.resources.AdGroupAssetOrBuilder getAdGroupAssetOrBuilder() {
    return getAdGroupAsset();
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
    if (adGroupAsset_ != null) {
      output.writeMessage(2, getAdGroupAsset());
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
    if (adGroupAsset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAdGroupAsset());
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.MutateAdGroupAssetResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.MutateAdGroupAssetResult other = (com.google.ads.googleads.v12.services.MutateAdGroupAssetResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasAdGroupAsset() != other.hasAdGroupAsset()) return false;
    if (hasAdGroupAsset()) {
      if (!getAdGroupAsset()
          .equals(other.getAdGroupAsset())) return false;
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
    if (hasAdGroupAsset()) {
      hash = (37 * hash) + AD_GROUP_ASSET_FIELD_NUMBER;
      hash = (53 * hash) + getAdGroupAsset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.MutateAdGroupAssetResult prototype) {
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
   * The result for the ad group asset mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.MutateAdGroupAssetResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.MutateAdGroupAssetResult)
      com.google.ads.googleads.v12.services.MutateAdGroupAssetResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.AdGroupAssetServiceProto.internal_static_google_ads_googleads_v12_services_MutateAdGroupAssetResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.AdGroupAssetServiceProto.internal_static_google_ads_googleads_v12_services_MutateAdGroupAssetResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.MutateAdGroupAssetResult.class, com.google.ads.googleads.v12.services.MutateAdGroupAssetResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.MutateAdGroupAssetResult.newBuilder()
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

      if (adGroupAssetBuilder_ == null) {
        adGroupAsset_ = null;
      } else {
        adGroupAsset_ = null;
        adGroupAssetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.AdGroupAssetServiceProto.internal_static_google_ads_googleads_v12_services_MutateAdGroupAssetResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateAdGroupAssetResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.MutateAdGroupAssetResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateAdGroupAssetResult build() {
      com.google.ads.googleads.v12.services.MutateAdGroupAssetResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateAdGroupAssetResult buildPartial() {
      com.google.ads.googleads.v12.services.MutateAdGroupAssetResult result = new com.google.ads.googleads.v12.services.MutateAdGroupAssetResult(this);
      result.resourceName_ = resourceName_;
      if (adGroupAssetBuilder_ == null) {
        result.adGroupAsset_ = adGroupAsset_;
      } else {
        result.adGroupAsset_ = adGroupAssetBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.services.MutateAdGroupAssetResult) {
        return mergeFrom((com.google.ads.googleads.v12.services.MutateAdGroupAssetResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.MutateAdGroupAssetResult other) {
      if (other == com.google.ads.googleads.v12.services.MutateAdGroupAssetResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasAdGroupAsset()) {
        mergeAdGroupAsset(other.getAdGroupAsset());
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
              input.readMessage(
                  getAdGroupAssetFieldBuilder().getBuilder(),
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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

    private com.google.ads.googleads.v12.resources.AdGroupAsset adGroupAsset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.resources.AdGroupAsset, com.google.ads.googleads.v12.resources.AdGroupAsset.Builder, com.google.ads.googleads.v12.resources.AdGroupAssetOrBuilder> adGroupAssetBuilder_;
    /**
     * <pre>
     * The mutated ad group asset with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdGroupAsset ad_group_asset = 2;</code>
     * @return Whether the adGroupAsset field is set.
     */
    public boolean hasAdGroupAsset() {
      return adGroupAssetBuilder_ != null || adGroupAsset_ != null;
    }
    /**
     * <pre>
     * The mutated ad group asset with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdGroupAsset ad_group_asset = 2;</code>
     * @return The adGroupAsset.
     */
    public com.google.ads.googleads.v12.resources.AdGroupAsset getAdGroupAsset() {
      if (adGroupAssetBuilder_ == null) {
        return adGroupAsset_ == null ? com.google.ads.googleads.v12.resources.AdGroupAsset.getDefaultInstance() : adGroupAsset_;
      } else {
        return adGroupAssetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated ad group asset with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdGroupAsset ad_group_asset = 2;</code>
     */
    public Builder setAdGroupAsset(com.google.ads.googleads.v12.resources.AdGroupAsset value) {
      if (adGroupAssetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adGroupAsset_ = value;
        onChanged();
      } else {
        adGroupAssetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated ad group asset with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdGroupAsset ad_group_asset = 2;</code>
     */
    public Builder setAdGroupAsset(
        com.google.ads.googleads.v12.resources.AdGroupAsset.Builder builderForValue) {
      if (adGroupAssetBuilder_ == null) {
        adGroupAsset_ = builderForValue.build();
        onChanged();
      } else {
        adGroupAssetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated ad group asset with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdGroupAsset ad_group_asset = 2;</code>
     */
    public Builder mergeAdGroupAsset(com.google.ads.googleads.v12.resources.AdGroupAsset value) {
      if (adGroupAssetBuilder_ == null) {
        if (adGroupAsset_ != null) {
          adGroupAsset_ =
            com.google.ads.googleads.v12.resources.AdGroupAsset.newBuilder(adGroupAsset_).mergeFrom(value).buildPartial();
        } else {
          adGroupAsset_ = value;
        }
        onChanged();
      } else {
        adGroupAssetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated ad group asset with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdGroupAsset ad_group_asset = 2;</code>
     */
    public Builder clearAdGroupAsset() {
      if (adGroupAssetBuilder_ == null) {
        adGroupAsset_ = null;
        onChanged();
      } else {
        adGroupAsset_ = null;
        adGroupAssetBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated ad group asset with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdGroupAsset ad_group_asset = 2;</code>
     */
    public com.google.ads.googleads.v12.resources.AdGroupAsset.Builder getAdGroupAssetBuilder() {
      
      onChanged();
      return getAdGroupAssetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated ad group asset with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdGroupAsset ad_group_asset = 2;</code>
     */
    public com.google.ads.googleads.v12.resources.AdGroupAssetOrBuilder getAdGroupAssetOrBuilder() {
      if (adGroupAssetBuilder_ != null) {
        return adGroupAssetBuilder_.getMessageOrBuilder();
      } else {
        return adGroupAsset_ == null ?
            com.google.ads.googleads.v12.resources.AdGroupAsset.getDefaultInstance() : adGroupAsset_;
      }
    }
    /**
     * <pre>
     * The mutated ad group asset with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.resources.AdGroupAsset ad_group_asset = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.resources.AdGroupAsset, com.google.ads.googleads.v12.resources.AdGroupAsset.Builder, com.google.ads.googleads.v12.resources.AdGroupAssetOrBuilder> 
        getAdGroupAssetFieldBuilder() {
      if (adGroupAssetBuilder_ == null) {
        adGroupAssetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.resources.AdGroupAsset, com.google.ads.googleads.v12.resources.AdGroupAsset.Builder, com.google.ads.googleads.v12.resources.AdGroupAssetOrBuilder>(
                getAdGroupAsset(),
                getParentForChildren(),
                isClean());
        adGroupAsset_ = null;
      }
      return adGroupAssetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.MutateAdGroupAssetResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.MutateAdGroupAssetResult)
  private static final com.google.ads.googleads.v12.services.MutateAdGroupAssetResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.MutateAdGroupAssetResult();
  }

  public static com.google.ads.googleads.v12.services.MutateAdGroupAssetResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateAdGroupAssetResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateAdGroupAssetResult>() {
    @java.lang.Override
    public MutateAdGroupAssetResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateAdGroupAssetResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateAdGroupAssetResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.MutateAdGroupAssetResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

