// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/errors/feed_item_target_error.proto

package com.google.ads.googleads.v12.errors;

/**
 * <pre>
 * Container for enum describing possible feed item target errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.errors.FeedItemTargetErrorEnum}
 */
public final class FeedItemTargetErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.errors.FeedItemTargetErrorEnum)
    FeedItemTargetErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedItemTargetErrorEnum.newBuilder() to construct.
  private FeedItemTargetErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedItemTargetErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeedItemTargetErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.errors.FeedItemTargetErrorProto.internal_static_google_ads_googleads_v12_errors_FeedItemTargetErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.errors.FeedItemTargetErrorProto.internal_static_google_ads_googleads_v12_errors_FeedItemTargetErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum.class, com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible feed item target errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v12.errors.FeedItemTargetErrorEnum.FeedItemTargetError}
   */
  public enum FeedItemTargetError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * On CREATE, the FeedItemTarget must have a populated field in the oneof
     * target.
     * </pre>
     *
     * <code>MUST_SET_TARGET_ONEOF_ON_CREATE = 2;</code>
     */
    MUST_SET_TARGET_ONEOF_ON_CREATE(2),
    /**
     * <pre>
     * The specified feed item target already exists, so it cannot be added.
     * </pre>
     *
     * <code>FEED_ITEM_TARGET_ALREADY_EXISTS = 3;</code>
     */
    FEED_ITEM_TARGET_ALREADY_EXISTS(3),
    /**
     * <pre>
     * The schedules for a given feed item cannot overlap.
     * </pre>
     *
     * <code>FEED_ITEM_SCHEDULES_CANNOT_OVERLAP = 4;</code>
     */
    FEED_ITEM_SCHEDULES_CANNOT_OVERLAP(4),
    /**
     * <pre>
     * Too many targets of a given type were added for a single feed item.
     * </pre>
     *
     * <code>TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE = 5;</code>
     */
    TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE(5),
    /**
     * <pre>
     * Too many AdSchedules are enabled for the feed item for the given day.
     * </pre>
     *
     * <code>TOO_MANY_SCHEDULES_PER_DAY = 6;</code>
     */
    TOO_MANY_SCHEDULES_PER_DAY(6),
    /**
     * <pre>
     * A feed item may either have an enabled campaign target or an enabled ad
     * group target.
     * </pre>
     *
     * <code>CANNOT_HAVE_ENABLED_CAMPAIGN_AND_ENABLED_AD_GROUP_TARGETS = 7;</code>
     */
    CANNOT_HAVE_ENABLED_CAMPAIGN_AND_ENABLED_AD_GROUP_TARGETS(7),
    /**
     * <pre>
     * Duplicate ad schedules aren't allowed.
     * </pre>
     *
     * <code>DUPLICATE_AD_SCHEDULE = 8;</code>
     */
    DUPLICATE_AD_SCHEDULE(8),
    /**
     * <pre>
     * Duplicate keywords aren't allowed.
     * </pre>
     *
     * <code>DUPLICATE_KEYWORD = 9;</code>
     */
    DUPLICATE_KEYWORD(9),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * On CREATE, the FeedItemTarget must have a populated field in the oneof
     * target.
     * </pre>
     *
     * <code>MUST_SET_TARGET_ONEOF_ON_CREATE = 2;</code>
     */
    public static final int MUST_SET_TARGET_ONEOF_ON_CREATE_VALUE = 2;
    /**
     * <pre>
     * The specified feed item target already exists, so it cannot be added.
     * </pre>
     *
     * <code>FEED_ITEM_TARGET_ALREADY_EXISTS = 3;</code>
     */
    public static final int FEED_ITEM_TARGET_ALREADY_EXISTS_VALUE = 3;
    /**
     * <pre>
     * The schedules for a given feed item cannot overlap.
     * </pre>
     *
     * <code>FEED_ITEM_SCHEDULES_CANNOT_OVERLAP = 4;</code>
     */
    public static final int FEED_ITEM_SCHEDULES_CANNOT_OVERLAP_VALUE = 4;
    /**
     * <pre>
     * Too many targets of a given type were added for a single feed item.
     * </pre>
     *
     * <code>TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE = 5;</code>
     */
    public static final int TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE_VALUE = 5;
    /**
     * <pre>
     * Too many AdSchedules are enabled for the feed item for the given day.
     * </pre>
     *
     * <code>TOO_MANY_SCHEDULES_PER_DAY = 6;</code>
     */
    public static final int TOO_MANY_SCHEDULES_PER_DAY_VALUE = 6;
    /**
     * <pre>
     * A feed item may either have an enabled campaign target or an enabled ad
     * group target.
     * </pre>
     *
     * <code>CANNOT_HAVE_ENABLED_CAMPAIGN_AND_ENABLED_AD_GROUP_TARGETS = 7;</code>
     */
    public static final int CANNOT_HAVE_ENABLED_CAMPAIGN_AND_ENABLED_AD_GROUP_TARGETS_VALUE = 7;
    /**
     * <pre>
     * Duplicate ad schedules aren't allowed.
     * </pre>
     *
     * <code>DUPLICATE_AD_SCHEDULE = 8;</code>
     */
    public static final int DUPLICATE_AD_SCHEDULE_VALUE = 8;
    /**
     * <pre>
     * Duplicate keywords aren't allowed.
     * </pre>
     *
     * <code>DUPLICATE_KEYWORD = 9;</code>
     */
    public static final int DUPLICATE_KEYWORD_VALUE = 9;


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
    public static FeedItemTargetError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FeedItemTargetError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return MUST_SET_TARGET_ONEOF_ON_CREATE;
        case 3: return FEED_ITEM_TARGET_ALREADY_EXISTS;
        case 4: return FEED_ITEM_SCHEDULES_CANNOT_OVERLAP;
        case 5: return TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE;
        case 6: return TOO_MANY_SCHEDULES_PER_DAY;
        case 7: return CANNOT_HAVE_ENABLED_CAMPAIGN_AND_ENABLED_AD_GROUP_TARGETS;
        case 8: return DUPLICATE_AD_SCHEDULE;
        case 9: return DUPLICATE_KEYWORD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FeedItemTargetError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FeedItemTargetError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FeedItemTargetError>() {
            public FeedItemTargetError findValueByNumber(int number) {
              return FeedItemTargetError.forNumber(number);
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
      return com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final FeedItemTargetError[] VALUES = values();

    public static FeedItemTargetError valueOf(
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

    private FeedItemTargetError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v12.errors.FeedItemTargetErrorEnum.FeedItemTargetError)
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
    if (!(obj instanceof com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum other = (com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum) obj;

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

  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum prototype) {
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
   * Container for enum describing possible feed item target errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.errors.FeedItemTargetErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.errors.FeedItemTargetErrorEnum)
      com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.errors.FeedItemTargetErrorProto.internal_static_google_ads_googleads_v12_errors_FeedItemTargetErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.errors.FeedItemTargetErrorProto.internal_static_google_ads_googleads_v12_errors_FeedItemTargetErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum.class, com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v12.errors.FeedItemTargetErrorProto.internal_static_google_ads_googleads_v12_errors_FeedItemTargetErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum build() {
      com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum buildPartial() {
      com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum result = new com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum other) {
      if (other == com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.errors.FeedItemTargetErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.errors.FeedItemTargetErrorEnum)
  private static final com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum();
  }

  public static com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedItemTargetErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<FeedItemTargetErrorEnum>() {
    @java.lang.Override
    public FeedItemTargetErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeedItemTargetErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedItemTargetErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.errors.FeedItemTargetErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

