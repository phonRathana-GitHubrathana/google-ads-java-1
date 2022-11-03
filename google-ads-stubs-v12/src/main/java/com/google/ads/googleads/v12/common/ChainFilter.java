// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/asset_set_types.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * One chain level filter on location in a feed item set.
 * The filtering logic among all the fields is AND.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.ChainFilter}
 */
public final class ChainFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.ChainFilter)
    ChainFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChainFilter.newBuilder() to construct.
  private ChainFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChainFilter() {
    locationAttributes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChainFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_ChainFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_ChainFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.ChainFilter.class, com.google.ads.googleads.v12.common.ChainFilter.Builder.class);
  }

  public static final int CHAIN_ID_FIELD_NUMBER = 1;
  private long chainId_;
  /**
   * <pre>
   * Required. Used to filter chain locations by chain id. Only chain locations that
   * belong to the specified chain will be in the asset set.
   * </pre>
   *
   * <code>int64 chain_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The chainId.
   */
  @java.lang.Override
  public long getChainId() {
    return chainId_;
  }

  public static final int LOCATION_ATTRIBUTES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList locationAttributes_;
  /**
   * <pre>
   * Used to filter chain locations by location attributes.
   * Only chain locations that belong to all of the specified attribute(s) will
   * be in the asset set. If this field is empty, it means no filtering on this
   * field.
   * </pre>
   *
   * <code>repeated string location_attributes = 2;</code>
   * @return A list containing the locationAttributes.
   */
  public com.google.protobuf.ProtocolStringList
      getLocationAttributesList() {
    return locationAttributes_;
  }
  /**
   * <pre>
   * Used to filter chain locations by location attributes.
   * Only chain locations that belong to all of the specified attribute(s) will
   * be in the asset set. If this field is empty, it means no filtering on this
   * field.
   * </pre>
   *
   * <code>repeated string location_attributes = 2;</code>
   * @return The count of locationAttributes.
   */
  public int getLocationAttributesCount() {
    return locationAttributes_.size();
  }
  /**
   * <pre>
   * Used to filter chain locations by location attributes.
   * Only chain locations that belong to all of the specified attribute(s) will
   * be in the asset set. If this field is empty, it means no filtering on this
   * field.
   * </pre>
   *
   * <code>repeated string location_attributes = 2;</code>
   * @param index The index of the element to return.
   * @return The locationAttributes at the given index.
   */
  public java.lang.String getLocationAttributes(int index) {
    return locationAttributes_.get(index);
  }
  /**
   * <pre>
   * Used to filter chain locations by location attributes.
   * Only chain locations that belong to all of the specified attribute(s) will
   * be in the asset set. If this field is empty, it means no filtering on this
   * field.
   * </pre>
   *
   * <code>repeated string location_attributes = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the locationAttributes at the given index.
   */
  public com.google.protobuf.ByteString
      getLocationAttributesBytes(int index) {
    return locationAttributes_.getByteString(index);
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
    if (chainId_ != 0L) {
      output.writeInt64(1, chainId_);
    }
    for (int i = 0; i < locationAttributes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, locationAttributes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (chainId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, chainId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < locationAttributes_.size(); i++) {
        dataSize += computeStringSizeNoTag(locationAttributes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLocationAttributesList().size();
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.ChainFilter)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.ChainFilter other = (com.google.ads.googleads.v12.common.ChainFilter) obj;

    if (getChainId()
        != other.getChainId()) return false;
    if (!getLocationAttributesList()
        .equals(other.getLocationAttributesList())) return false;
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
    hash = (37 * hash) + CHAIN_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getChainId());
    if (getLocationAttributesCount() > 0) {
      hash = (37 * hash) + LOCATION_ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getLocationAttributesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.ChainFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.ChainFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ChainFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.ChainFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ChainFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.ChainFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ChainFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.ChainFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ChainFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.ChainFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.ChainFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.ChainFilter parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.ChainFilter prototype) {
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
   * One chain level filter on location in a feed item set.
   * The filtering logic among all the fields is AND.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.ChainFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.ChainFilter)
      com.google.ads.googleads.v12.common.ChainFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_ChainFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_ChainFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.ChainFilter.class, com.google.ads.googleads.v12.common.ChainFilter.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.ChainFilter.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      chainId_ = 0L;

      locationAttributes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.AssetSetTypesProto.internal_static_google_ads_googleads_v12_common_ChainFilter_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.ChainFilter getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.ChainFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.ChainFilter build() {
      com.google.ads.googleads.v12.common.ChainFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.ChainFilter buildPartial() {
      com.google.ads.googleads.v12.common.ChainFilter result = new com.google.ads.googleads.v12.common.ChainFilter(this);
      int from_bitField0_ = bitField0_;
      result.chainId_ = chainId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        locationAttributes_ = locationAttributes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.locationAttributes_ = locationAttributes_;
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
      if (other instanceof com.google.ads.googleads.v12.common.ChainFilter) {
        return mergeFrom((com.google.ads.googleads.v12.common.ChainFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.ChainFilter other) {
      if (other == com.google.ads.googleads.v12.common.ChainFilter.getDefaultInstance()) return this;
      if (other.getChainId() != 0L) {
        setChainId(other.getChainId());
      }
      if (!other.locationAttributes_.isEmpty()) {
        if (locationAttributes_.isEmpty()) {
          locationAttributes_ = other.locationAttributes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLocationAttributesIsMutable();
          locationAttributes_.addAll(other.locationAttributes_);
        }
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
            case 8: {
              chainId_ = input.readInt64();

              break;
            } // case 8
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureLocationAttributesIsMutable();
              locationAttributes_.add(s);
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
    private int bitField0_;

    private long chainId_ ;
    /**
     * <pre>
     * Required. Used to filter chain locations by chain id. Only chain locations that
     * belong to the specified chain will be in the asset set.
     * </pre>
     *
     * <code>int64 chain_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The chainId.
     */
    @java.lang.Override
    public long getChainId() {
      return chainId_;
    }
    /**
     * <pre>
     * Required. Used to filter chain locations by chain id. Only chain locations that
     * belong to the specified chain will be in the asset set.
     * </pre>
     *
     * <code>int64 chain_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The chainId to set.
     * @return This builder for chaining.
     */
    public Builder setChainId(long value) {
      
      chainId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Used to filter chain locations by chain id. Only chain locations that
     * belong to the specified chain will be in the asset set.
     * </pre>
     *
     * <code>int64 chain_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearChainId() {
      
      chainId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList locationAttributes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureLocationAttributesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        locationAttributes_ = new com.google.protobuf.LazyStringArrayList(locationAttributes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Used to filter chain locations by location attributes.
     * Only chain locations that belong to all of the specified attribute(s) will
     * be in the asset set. If this field is empty, it means no filtering on this
     * field.
     * </pre>
     *
     * <code>repeated string location_attributes = 2;</code>
     * @return A list containing the locationAttributes.
     */
    public com.google.protobuf.ProtocolStringList
        getLocationAttributesList() {
      return locationAttributes_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Used to filter chain locations by location attributes.
     * Only chain locations that belong to all of the specified attribute(s) will
     * be in the asset set. If this field is empty, it means no filtering on this
     * field.
     * </pre>
     *
     * <code>repeated string location_attributes = 2;</code>
     * @return The count of locationAttributes.
     */
    public int getLocationAttributesCount() {
      return locationAttributes_.size();
    }
    /**
     * <pre>
     * Used to filter chain locations by location attributes.
     * Only chain locations that belong to all of the specified attribute(s) will
     * be in the asset set. If this field is empty, it means no filtering on this
     * field.
     * </pre>
     *
     * <code>repeated string location_attributes = 2;</code>
     * @param index The index of the element to return.
     * @return The locationAttributes at the given index.
     */
    public java.lang.String getLocationAttributes(int index) {
      return locationAttributes_.get(index);
    }
    /**
     * <pre>
     * Used to filter chain locations by location attributes.
     * Only chain locations that belong to all of the specified attribute(s) will
     * be in the asset set. If this field is empty, it means no filtering on this
     * field.
     * </pre>
     *
     * <code>repeated string location_attributes = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the locationAttributes at the given index.
     */
    public com.google.protobuf.ByteString
        getLocationAttributesBytes(int index) {
      return locationAttributes_.getByteString(index);
    }
    /**
     * <pre>
     * Used to filter chain locations by location attributes.
     * Only chain locations that belong to all of the specified attribute(s) will
     * be in the asset set. If this field is empty, it means no filtering on this
     * field.
     * </pre>
     *
     * <code>repeated string location_attributes = 2;</code>
     * @param index The index to set the value at.
     * @param value The locationAttributes to set.
     * @return This builder for chaining.
     */
    public Builder setLocationAttributes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLocationAttributesIsMutable();
      locationAttributes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by location attributes.
     * Only chain locations that belong to all of the specified attribute(s) will
     * be in the asset set. If this field is empty, it means no filtering on this
     * field.
     * </pre>
     *
     * <code>repeated string location_attributes = 2;</code>
     * @param value The locationAttributes to add.
     * @return This builder for chaining.
     */
    public Builder addLocationAttributes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLocationAttributesIsMutable();
      locationAttributes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by location attributes.
     * Only chain locations that belong to all of the specified attribute(s) will
     * be in the asset set. If this field is empty, it means no filtering on this
     * field.
     * </pre>
     *
     * <code>repeated string location_attributes = 2;</code>
     * @param values The locationAttributes to add.
     * @return This builder for chaining.
     */
    public Builder addAllLocationAttributes(
        java.lang.Iterable<java.lang.String> values) {
      ensureLocationAttributesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, locationAttributes_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by location attributes.
     * Only chain locations that belong to all of the specified attribute(s) will
     * be in the asset set. If this field is empty, it means no filtering on this
     * field.
     * </pre>
     *
     * <code>repeated string location_attributes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocationAttributes() {
      locationAttributes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Used to filter chain locations by location attributes.
     * Only chain locations that belong to all of the specified attribute(s) will
     * be in the asset set. If this field is empty, it means no filtering on this
     * field.
     * </pre>
     *
     * <code>repeated string location_attributes = 2;</code>
     * @param value The bytes of the locationAttributes to add.
     * @return This builder for chaining.
     */
    public Builder addLocationAttributesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureLocationAttributesIsMutable();
      locationAttributes_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.ChainFilter)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.ChainFilter)
  private static final com.google.ads.googleads.v12.common.ChainFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.ChainFilter();
  }

  public static com.google.ads.googleads.v12.common.ChainFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChainFilter>
      PARSER = new com.google.protobuf.AbstractParser<ChainFilter>() {
    @java.lang.Override
    public ChainFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChainFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChainFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.ChainFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

