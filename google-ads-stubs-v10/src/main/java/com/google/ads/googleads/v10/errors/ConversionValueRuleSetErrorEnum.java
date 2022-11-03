// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/conversion_value_rule_set_error.proto

package com.google.ads.googleads.v10.errors;

/**
 * <pre>
 * Container for enum describing possible conversion value rule set errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum}
 */
public final class ConversionValueRuleSetErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum)
    ConversionValueRuleSetErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionValueRuleSetErrorEnum.newBuilder() to construct.
  private ConversionValueRuleSetErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionValueRuleSetErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversionValueRuleSetErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorProto.internal_static_google_ads_googleads_v10_errors_ConversionValueRuleSetErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorProto.internal_static_google_ads_googleads_v10_errors_ConversionValueRuleSetErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum.class, com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible conversion value rule set errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum.ConversionValueRuleSetError}
   */
  public enum ConversionValueRuleSetError
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
     * Two value rules in this value rule set contain conflicting conditions.
     * </pre>
     *
     * <code>CONFLICTING_VALUE_RULE_CONDITIONS = 2;</code>
     */
    CONFLICTING_VALUE_RULE_CONDITIONS(2),
    /**
     * <pre>
     * This value rule set includes a value rule that cannot be found, has been
     * permanently removed or belongs to a different customer.
     * </pre>
     *
     * <code>INVALID_VALUE_RULE = 3;</code>
     */
    INVALID_VALUE_RULE(3),
    /**
     * <pre>
     * An error that's thrown when a mutate operation is trying to
     * replace/remove some existing elements in the dimensions field. In other
     * words, ADD op is always fine and UPDATE op is fine if it's only appending
     * new elements into dimensions list.
     * </pre>
     *
     * <code>DIMENSIONS_UPDATE_ONLY_ALLOW_APPEND = 4;</code>
     */
    DIMENSIONS_UPDATE_ONLY_ALLOW_APPEND(4),
    /**
     * <pre>
     * An error that's thrown when a mutate is adding new value rule(s) into a
     * value rule set and the added value rule(s) include conditions that are
     * not specified in the dimensions of the value rule set.
     * </pre>
     *
     * <code>CONDITION_TYPE_NOT_ALLOWED = 5;</code>
     */
    CONDITION_TYPE_NOT_ALLOWED(5),
    /**
     * <pre>
     * The dimensions field contains duplicate elements.
     * </pre>
     *
     * <code>DUPLICATE_DIMENSIONS = 6;</code>
     */
    DUPLICATE_DIMENSIONS(6),
    /**
     * <pre>
     * This value rule set is attached to an invalid campaign id. Either a
     * campaign with this campaign id doesn't exist or it belongs to a different
     * customer.
     * </pre>
     *
     * <code>INVALID_CAMPAIGN_ID = 7;</code>
     */
    INVALID_CAMPAIGN_ID(7),
    /**
     * <pre>
     * When a mutate request tries to pause a value rule set, the enabled
     * value rules in this set must be paused in the same command, or this error
     * will be thrown.
     * </pre>
     *
     * <code>CANNOT_PAUSE_UNLESS_ALL_VALUE_RULES_ARE_PAUSED = 8;</code>
     */
    CANNOT_PAUSE_UNLESS_ALL_VALUE_RULES_ARE_PAUSED(8),
    /**
     * <pre>
     * When a mutate request tries to pause all the value rules in a value rule
     * set, the value rule set must be paused, or this error will be thrown.
     * </pre>
     *
     * <code>SHOULD_PAUSE_WHEN_ALL_VALUE_RULES_ARE_PAUSED = 9;</code>
     */
    SHOULD_PAUSE_WHEN_ALL_VALUE_RULES_ARE_PAUSED(9),
    /**
     * <pre>
     * This value rule set is attached to a campaign that does not support value
     * rules. Currently, campaign level value rule sets can only be created on
     * Search, or Display campaigns.
     * </pre>
     *
     * <code>VALUE_RULES_NOT_SUPPORTED_FOR_CAMPAIGN_TYPE = 10;</code>
     */
    VALUE_RULES_NOT_SUPPORTED_FOR_CAMPAIGN_TYPE(10),
    /**
     * <pre>
     * To add a value rule set that applies on Store Visits/Store Sales
     * conversion action categories, the customer must have valid Store Visits/
     * Store Sales conversion actions.
     * </pre>
     *
     * <code>INELIGIBLE_CONVERSION_ACTION_CATEGORIES = 11;</code>
     */
    INELIGIBLE_CONVERSION_ACTION_CATEGORIES(11),
    /**
     * <pre>
     * If NO_CONDITION is used as a dimension of a value rule set, it must be
     * the only dimension.
     * </pre>
     *
     * <code>DIMENSION_NO_CONDITION_USED_WITH_OTHER_DIMENSIONS = 12;</code>
     */
    DIMENSION_NO_CONDITION_USED_WITH_OTHER_DIMENSIONS(12),
    /**
     * <pre>
     * Dimension NO_CONDITION can only be used by Store Visits/Store Sales value
     * rule set.
     * </pre>
     *
     * <code>DIMENSION_NO_CONDITION_NOT_ALLOWED = 13;</code>
     */
    DIMENSION_NO_CONDITION_NOT_ALLOWED(13),
    /**
     * <pre>
     * Value rule sets defined on the specified conversion action categories are
     * not supported. The list of conversion action categories must be an empty
     * list, only STORE_VISIT, or only STORE_SALE.
     * </pre>
     *
     * <code>UNSUPPORTED_CONVERSION_ACTION_CATEGORIES = 14;</code>
     */
    UNSUPPORTED_CONVERSION_ACTION_CATEGORIES(14),
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
     * Two value rules in this value rule set contain conflicting conditions.
     * </pre>
     *
     * <code>CONFLICTING_VALUE_RULE_CONDITIONS = 2;</code>
     */
    public static final int CONFLICTING_VALUE_RULE_CONDITIONS_VALUE = 2;
    /**
     * <pre>
     * This value rule set includes a value rule that cannot be found, has been
     * permanently removed or belongs to a different customer.
     * </pre>
     *
     * <code>INVALID_VALUE_RULE = 3;</code>
     */
    public static final int INVALID_VALUE_RULE_VALUE = 3;
    /**
     * <pre>
     * An error that's thrown when a mutate operation is trying to
     * replace/remove some existing elements in the dimensions field. In other
     * words, ADD op is always fine and UPDATE op is fine if it's only appending
     * new elements into dimensions list.
     * </pre>
     *
     * <code>DIMENSIONS_UPDATE_ONLY_ALLOW_APPEND = 4;</code>
     */
    public static final int DIMENSIONS_UPDATE_ONLY_ALLOW_APPEND_VALUE = 4;
    /**
     * <pre>
     * An error that's thrown when a mutate is adding new value rule(s) into a
     * value rule set and the added value rule(s) include conditions that are
     * not specified in the dimensions of the value rule set.
     * </pre>
     *
     * <code>CONDITION_TYPE_NOT_ALLOWED = 5;</code>
     */
    public static final int CONDITION_TYPE_NOT_ALLOWED_VALUE = 5;
    /**
     * <pre>
     * The dimensions field contains duplicate elements.
     * </pre>
     *
     * <code>DUPLICATE_DIMENSIONS = 6;</code>
     */
    public static final int DUPLICATE_DIMENSIONS_VALUE = 6;
    /**
     * <pre>
     * This value rule set is attached to an invalid campaign id. Either a
     * campaign with this campaign id doesn't exist or it belongs to a different
     * customer.
     * </pre>
     *
     * <code>INVALID_CAMPAIGN_ID = 7;</code>
     */
    public static final int INVALID_CAMPAIGN_ID_VALUE = 7;
    /**
     * <pre>
     * When a mutate request tries to pause a value rule set, the enabled
     * value rules in this set must be paused in the same command, or this error
     * will be thrown.
     * </pre>
     *
     * <code>CANNOT_PAUSE_UNLESS_ALL_VALUE_RULES_ARE_PAUSED = 8;</code>
     */
    public static final int CANNOT_PAUSE_UNLESS_ALL_VALUE_RULES_ARE_PAUSED_VALUE = 8;
    /**
     * <pre>
     * When a mutate request tries to pause all the value rules in a value rule
     * set, the value rule set must be paused, or this error will be thrown.
     * </pre>
     *
     * <code>SHOULD_PAUSE_WHEN_ALL_VALUE_RULES_ARE_PAUSED = 9;</code>
     */
    public static final int SHOULD_PAUSE_WHEN_ALL_VALUE_RULES_ARE_PAUSED_VALUE = 9;
    /**
     * <pre>
     * This value rule set is attached to a campaign that does not support value
     * rules. Currently, campaign level value rule sets can only be created on
     * Search, or Display campaigns.
     * </pre>
     *
     * <code>VALUE_RULES_NOT_SUPPORTED_FOR_CAMPAIGN_TYPE = 10;</code>
     */
    public static final int VALUE_RULES_NOT_SUPPORTED_FOR_CAMPAIGN_TYPE_VALUE = 10;
    /**
     * <pre>
     * To add a value rule set that applies on Store Visits/Store Sales
     * conversion action categories, the customer must have valid Store Visits/
     * Store Sales conversion actions.
     * </pre>
     *
     * <code>INELIGIBLE_CONVERSION_ACTION_CATEGORIES = 11;</code>
     */
    public static final int INELIGIBLE_CONVERSION_ACTION_CATEGORIES_VALUE = 11;
    /**
     * <pre>
     * If NO_CONDITION is used as a dimension of a value rule set, it must be
     * the only dimension.
     * </pre>
     *
     * <code>DIMENSION_NO_CONDITION_USED_WITH_OTHER_DIMENSIONS = 12;</code>
     */
    public static final int DIMENSION_NO_CONDITION_USED_WITH_OTHER_DIMENSIONS_VALUE = 12;
    /**
     * <pre>
     * Dimension NO_CONDITION can only be used by Store Visits/Store Sales value
     * rule set.
     * </pre>
     *
     * <code>DIMENSION_NO_CONDITION_NOT_ALLOWED = 13;</code>
     */
    public static final int DIMENSION_NO_CONDITION_NOT_ALLOWED_VALUE = 13;
    /**
     * <pre>
     * Value rule sets defined on the specified conversion action categories are
     * not supported. The list of conversion action categories must be an empty
     * list, only STORE_VISIT, or only STORE_SALE.
     * </pre>
     *
     * <code>UNSUPPORTED_CONVERSION_ACTION_CATEGORIES = 14;</code>
     */
    public static final int UNSUPPORTED_CONVERSION_ACTION_CATEGORIES_VALUE = 14;


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
    public static ConversionValueRuleSetError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConversionValueRuleSetError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CONFLICTING_VALUE_RULE_CONDITIONS;
        case 3: return INVALID_VALUE_RULE;
        case 4: return DIMENSIONS_UPDATE_ONLY_ALLOW_APPEND;
        case 5: return CONDITION_TYPE_NOT_ALLOWED;
        case 6: return DUPLICATE_DIMENSIONS;
        case 7: return INVALID_CAMPAIGN_ID;
        case 8: return CANNOT_PAUSE_UNLESS_ALL_VALUE_RULES_ARE_PAUSED;
        case 9: return SHOULD_PAUSE_WHEN_ALL_VALUE_RULES_ARE_PAUSED;
        case 10: return VALUE_RULES_NOT_SUPPORTED_FOR_CAMPAIGN_TYPE;
        case 11: return INELIGIBLE_CONVERSION_ACTION_CATEGORIES;
        case 12: return DIMENSION_NO_CONDITION_USED_WITH_OTHER_DIMENSIONS;
        case 13: return DIMENSION_NO_CONDITION_NOT_ALLOWED;
        case 14: return UNSUPPORTED_CONVERSION_ACTION_CATEGORIES;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConversionValueRuleSetError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConversionValueRuleSetError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConversionValueRuleSetError>() {
            public ConversionValueRuleSetError findValueByNumber(int number) {
              return ConversionValueRuleSetError.forNumber(number);
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
      return com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConversionValueRuleSetError[] VALUES = values();

    public static ConversionValueRuleSetError valueOf(
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

    private ConversionValueRuleSetError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum.ConversionValueRuleSetError)
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
    if (!(obj instanceof com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum other = (com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum) obj;

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

  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum prototype) {
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
   * Container for enum describing possible conversion value rule set errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum)
      com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorProto.internal_static_google_ads_googleads_v10_errors_ConversionValueRuleSetErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorProto.internal_static_google_ads_googleads_v10_errors_ConversionValueRuleSetErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum.class, com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorProto.internal_static_google_ads_googleads_v10_errors_ConversionValueRuleSetErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum build() {
      com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum buildPartial() {
      com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum result = new com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum other) {
      if (other == com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum)
  private static final com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum();
  }

  public static com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionValueRuleSetErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<ConversionValueRuleSetErrorEnum>() {
    @java.lang.Override
    public ConversionValueRuleSetErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConversionValueRuleSetErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionValueRuleSetErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.errors.ConversionValueRuleSetErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

