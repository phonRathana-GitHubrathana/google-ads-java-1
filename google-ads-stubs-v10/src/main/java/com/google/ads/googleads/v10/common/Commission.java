// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/bidding.proto

package com.google.ads.googleads.v10.common;

/**
 * <pre>
 * Commission is an automatic bidding strategy in which the advertiser pays a
 * certain portion of the conversion value.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.common.Commission}
 */
public final class Commission extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.common.Commission)
    CommissionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Commission.newBuilder() to construct.
  private Commission(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Commission() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Commission();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.common.BiddingProto.internal_static_google_ads_googleads_v10_common_Commission_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.common.BiddingProto.internal_static_google_ads_googleads_v10_common_Commission_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.common.Commission.class, com.google.ads.googleads.v10.common.Commission.Builder.class);
  }

  private int bitField0_;
  public static final int COMMISSION_RATE_MICROS_FIELD_NUMBER = 2;
  private long commissionRateMicros_;
  /**
   * <pre>
   * Commission rate defines the portion of the conversion value that the
   * advertiser will be billed. A commission rate of x should be passed into
   * this field as (x * 1,000,000). For example, 106,000 represents a commission
   * rate of 0.106 (10.6%).
   * </pre>
   *
   * <code>optional int64 commission_rate_micros = 2;</code>
   * @return Whether the commissionRateMicros field is set.
   */
  @java.lang.Override
  public boolean hasCommissionRateMicros() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Commission rate defines the portion of the conversion value that the
   * advertiser will be billed. A commission rate of x should be passed into
   * this field as (x * 1,000,000). For example, 106,000 represents a commission
   * rate of 0.106 (10.6%).
   * </pre>
   *
   * <code>optional int64 commission_rate_micros = 2;</code>
   * @return The commissionRateMicros.
   */
  @java.lang.Override
  public long getCommissionRateMicros() {
    return commissionRateMicros_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(2, commissionRateMicros_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, commissionRateMicros_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.common.Commission)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.common.Commission other = (com.google.ads.googleads.v10.common.Commission) obj;

    if (hasCommissionRateMicros() != other.hasCommissionRateMicros()) return false;
    if (hasCommissionRateMicros()) {
      if (getCommissionRateMicros()
          != other.getCommissionRateMicros()) return false;
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
    if (hasCommissionRateMicros()) {
      hash = (37 * hash) + COMMISSION_RATE_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCommissionRateMicros());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.common.Commission parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.Commission parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.Commission parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.Commission parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.Commission parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.Commission parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.Commission parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.Commission parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.Commission parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.Commission parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.Commission parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.Commission parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.common.Commission prototype) {
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
   * Commission is an automatic bidding strategy in which the advertiser pays a
   * certain portion of the conversion value.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.common.Commission}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.common.Commission)
      com.google.ads.googleads.v10.common.CommissionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.common.BiddingProto.internal_static_google_ads_googleads_v10_common_Commission_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.common.BiddingProto.internal_static_google_ads_googleads_v10_common_Commission_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.common.Commission.class, com.google.ads.googleads.v10.common.Commission.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.common.Commission.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      commissionRateMicros_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.common.BiddingProto.internal_static_google_ads_googleads_v10_common_Commission_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.Commission getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.common.Commission.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.Commission build() {
      com.google.ads.googleads.v10.common.Commission result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.Commission buildPartial() {
      com.google.ads.googleads.v10.common.Commission result = new com.google.ads.googleads.v10.common.Commission(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.commissionRateMicros_ = commissionRateMicros_;
        to_bitField0_ |= 0x00000001;
      }
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
      if (other instanceof com.google.ads.googleads.v10.common.Commission) {
        return mergeFrom((com.google.ads.googleads.v10.common.Commission)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.common.Commission other) {
      if (other == com.google.ads.googleads.v10.common.Commission.getDefaultInstance()) return this;
      if (other.hasCommissionRateMicros()) {
        setCommissionRateMicros(other.getCommissionRateMicros());
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
            case 16: {
              commissionRateMicros_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
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

    private long commissionRateMicros_ ;
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>optional int64 commission_rate_micros = 2;</code>
     * @return Whether the commissionRateMicros field is set.
     */
    @java.lang.Override
    public boolean hasCommissionRateMicros() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>optional int64 commission_rate_micros = 2;</code>
     * @return The commissionRateMicros.
     */
    @java.lang.Override
    public long getCommissionRateMicros() {
      return commissionRateMicros_;
    }
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>optional int64 commission_rate_micros = 2;</code>
     * @param value The commissionRateMicros to set.
     * @return This builder for chaining.
     */
    public Builder setCommissionRateMicros(long value) {
      bitField0_ |= 0x00000001;
      commissionRateMicros_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Commission rate defines the portion of the conversion value that the
     * advertiser will be billed. A commission rate of x should be passed into
     * this field as (x * 1,000,000). For example, 106,000 represents a commission
     * rate of 0.106 (10.6%).
     * </pre>
     *
     * <code>optional int64 commission_rate_micros = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommissionRateMicros() {
      bitField0_ = (bitField0_ & ~0x00000001);
      commissionRateMicros_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.common.Commission)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.common.Commission)
  private static final com.google.ads.googleads.v10.common.Commission DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.common.Commission();
  }

  public static com.google.ads.googleads.v10.common.Commission getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Commission>
      PARSER = new com.google.protobuf.AbstractParser<Commission>() {
    @java.lang.Override
    public Commission parsePartialFrom(
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

  public static com.google.protobuf.Parser<Commission> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Commission> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.common.Commission getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

