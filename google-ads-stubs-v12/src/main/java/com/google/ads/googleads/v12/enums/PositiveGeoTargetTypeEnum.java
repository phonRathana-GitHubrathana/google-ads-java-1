// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/enums/positive_geo_target_type.proto

package com.google.ads.googleads.v12.enums;

/**
 * <pre>
 * Container for enum describing possible positive geo target types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum}
 */
public final class PositiveGeoTargetTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum)
    PositiveGeoTargetTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PositiveGeoTargetTypeEnum.newBuilder() to construct.
  private PositiveGeoTargetTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PositiveGeoTargetTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PositiveGeoTargetTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeProto.internal_static_google_ads_googleads_v12_enums_PositiveGeoTargetTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeProto.internal_static_google_ads_googleads_v12_enums_PositiveGeoTargetTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum.class, com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The possible positive geo target types.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum.PositiveGeoTargetType}
   */
  public enum PositiveGeoTargetType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Specifies that an ad is triggered if the user is in,
     * or shows interest in, advertiser's targeted locations.
     * </pre>
     *
     * <code>PRESENCE_OR_INTEREST = 5;</code>
     */
    PRESENCE_OR_INTEREST(5),
    /**
     * <pre>
     * Specifies that an ad is triggered if the user
     * searches for advertiser's targeted locations.
     * This can only be used with Search and standard
     * Shopping campaigns.
     * </pre>
     *
     * <code>SEARCH_INTEREST = 6;</code>
     */
    SEARCH_INTEREST(6),
    /**
     * <pre>
     * Specifies that an ad is triggered if the user is in
     * or regularly in advertiser's targeted locations.
     * </pre>
     *
     * <code>PRESENCE = 7;</code>
     */
    PRESENCE(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Specifies that an ad is triggered if the user is in,
     * or shows interest in, advertiser's targeted locations.
     * </pre>
     *
     * <code>PRESENCE_OR_INTEREST = 5;</code>
     */
    public static final int PRESENCE_OR_INTEREST_VALUE = 5;
    /**
     * <pre>
     * Specifies that an ad is triggered if the user
     * searches for advertiser's targeted locations.
     * This can only be used with Search and standard
     * Shopping campaigns.
     * </pre>
     *
     * <code>SEARCH_INTEREST = 6;</code>
     */
    public static final int SEARCH_INTEREST_VALUE = 6;
    /**
     * <pre>
     * Specifies that an ad is triggered if the user is in
     * or regularly in advertiser's targeted locations.
     * </pre>
     *
     * <code>PRESENCE = 7;</code>
     */
    public static final int PRESENCE_VALUE = 7;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PositiveGeoTargetType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PositiveGeoTargetType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 5: return PRESENCE_OR_INTEREST;
        case 6: return SEARCH_INTEREST;
        case 7: return PRESENCE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PositiveGeoTargetType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PositiveGeoTargetType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PositiveGeoTargetType>() {
            public PositiveGeoTargetType findValueByNumber(int number) {
              return PositiveGeoTargetType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final PositiveGeoTargetType[] VALUES = values();

    public static PositiveGeoTargetType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PositiveGeoTargetType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum.PositiveGeoTargetType)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum other = (com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum prototype) {
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
   * Container for enum describing possible positive geo target types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum)
      com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeProto.internal_static_google_ads_googleads_v12_enums_PositiveGeoTargetTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeProto.internal_static_google_ads_googleads_v12_enums_PositiveGeoTargetTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum.class, com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeProto.internal_static_google_ads_googleads_v12_enums_PositiveGeoTargetTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum build() {
      com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum buildPartial() {
      com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum result = new com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum other) {
      if (other == com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum)
  private static final com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum();
  }

  public static com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PositiveGeoTargetTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<PositiveGeoTargetTypeEnum>() {
    @java.lang.Override
    public PositiveGeoTargetTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<PositiveGeoTargetTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PositiveGeoTargetTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.enums.PositiveGeoTargetTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

