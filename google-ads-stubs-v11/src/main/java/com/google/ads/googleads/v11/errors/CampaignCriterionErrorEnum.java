// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/errors/campaign_criterion_error.proto

package com.google.ads.googleads.v11.errors;

/**
 * <pre>
 * Container for enum describing possible campaign criterion errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.errors.CampaignCriterionErrorEnum}
 */
public final class CampaignCriterionErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.errors.CampaignCriterionErrorEnum)
    CampaignCriterionErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignCriterionErrorEnum.newBuilder() to construct.
  private CampaignCriterionErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignCriterionErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampaignCriterionErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.errors.CampaignCriterionErrorProto.internal_static_google_ads_googleads_v11_errors_CampaignCriterionErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.errors.CampaignCriterionErrorProto.internal_static_google_ads_googleads_v11_errors_CampaignCriterionErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum.class, com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible campaign criterion errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v11.errors.CampaignCriterionErrorEnum.CampaignCriterionError}
   */
  public enum CampaignCriterionError
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
     * Concrete type of criterion (keyword v.s. placement) is required for
     * CREATE and UPDATE operations.
     * </pre>
     *
     * <code>CONCRETE_TYPE_REQUIRED = 2;</code>
     */
    CONCRETE_TYPE_REQUIRED(2),
    /**
     * <pre>
     * Invalid placement URL.
     * </pre>
     *
     * <code>INVALID_PLACEMENT_URL = 3;</code>
     */
    INVALID_PLACEMENT_URL(3),
    /**
     * <pre>
     * Criteria type can not be excluded for the campaign by the customer. like
     * AOL account type cannot target site type criteria
     * </pre>
     *
     * <code>CANNOT_EXCLUDE_CRITERIA_TYPE = 4;</code>
     */
    CANNOT_EXCLUDE_CRITERIA_TYPE(4),
    /**
     * <pre>
     * Cannot set the campaign criterion status for this criteria type.
     * </pre>
     *
     * <code>CANNOT_SET_STATUS_FOR_CRITERIA_TYPE = 5;</code>
     */
    CANNOT_SET_STATUS_FOR_CRITERIA_TYPE(5),
    /**
     * <pre>
     * Cannot set the campaign criterion status for an excluded criteria.
     * </pre>
     *
     * <code>CANNOT_SET_STATUS_FOR_EXCLUDED_CRITERIA = 6;</code>
     */
    CANNOT_SET_STATUS_FOR_EXCLUDED_CRITERIA(6),
    /**
     * <pre>
     * Cannot target and exclude the same criterion.
     * </pre>
     *
     * <code>CANNOT_TARGET_AND_EXCLUDE = 7;</code>
     */
    CANNOT_TARGET_AND_EXCLUDE(7),
    /**
     * <pre>
     * The mutate contained too many operations.
     * </pre>
     *
     * <code>TOO_MANY_OPERATIONS = 8;</code>
     */
    TOO_MANY_OPERATIONS(8),
    /**
     * <pre>
     * This operator cannot be applied to a criterion of this type.
     * </pre>
     *
     * <code>OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE = 9;</code>
     */
    OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE(9),
    /**
     * <pre>
     * The Shopping campaign sales country is not supported for
     * ProductSalesChannel targeting.
     * </pre>
     *
     * <code>SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL = 10;</code>
     */
    SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL(10),
    /**
     * <pre>
     * The existing field can't be updated with CREATE operation. It can be
     * updated with UPDATE operation only.
     * </pre>
     *
     * <code>CANNOT_ADD_EXISTING_FIELD = 11;</code>
     */
    CANNOT_ADD_EXISTING_FIELD(11),
    /**
     * <pre>
     * Negative criteria are immutable, so updates are not allowed.
     * </pre>
     *
     * <code>CANNOT_UPDATE_NEGATIVE_CRITERION = 12;</code>
     */
    CANNOT_UPDATE_NEGATIVE_CRITERION(12),
    /**
     * <pre>
     * Only free form names are allowed for negative Smart campaign keyword
     * theme.
     * </pre>
     *
     * <code>CANNOT_SET_NEGATIVE_KEYWORD_THEME_CONSTANT_CRITERION = 13;</code>
     */
    CANNOT_SET_NEGATIVE_KEYWORD_THEME_CONSTANT_CRITERION(13),
    /**
     * <pre>
     * Invalid Smart campaign keyword theme constant criterion.
     * </pre>
     *
     * <code>INVALID_KEYWORD_THEME_CONSTANT = 14;</code>
     */
    INVALID_KEYWORD_THEME_CONSTANT(14),
    /**
     * <pre>
     * A Smart campaign keyword theme constant or free-form Smart campaign
     * keyword theme is required.
     * </pre>
     *
     * <code>MISSING_KEYWORD_THEME_CONSTANT_OR_FREE_FORM_KEYWORD_THEME = 15;</code>
     */
    MISSING_KEYWORD_THEME_CONSTANT_OR_FREE_FORM_KEYWORD_THEME(15),
    /**
     * <pre>
     * A Smart campaign may not target proximity and location criteria
     * simultaneously.
     * </pre>
     *
     * <code>CANNOT_TARGET_BOTH_PROXIMITY_AND_LOCATION_CRITERIA_FOR_SMART_CAMPAIGN = 16;</code>
     */
    CANNOT_TARGET_BOTH_PROXIMITY_AND_LOCATION_CRITERIA_FOR_SMART_CAMPAIGN(16),
    /**
     * <pre>
     * A Smart campaign may not target multiple proximity criteria.
     * </pre>
     *
     * <code>CANNOT_TARGET_MULTIPLE_PROXIMITY_CRITERIA_FOR_SMART_CAMPAIGN = 17;</code>
     */
    CANNOT_TARGET_MULTIPLE_PROXIMITY_CRITERIA_FOR_SMART_CAMPAIGN(17),
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
     * Concrete type of criterion (keyword v.s. placement) is required for
     * CREATE and UPDATE operations.
     * </pre>
     *
     * <code>CONCRETE_TYPE_REQUIRED = 2;</code>
     */
    public static final int CONCRETE_TYPE_REQUIRED_VALUE = 2;
    /**
     * <pre>
     * Invalid placement URL.
     * </pre>
     *
     * <code>INVALID_PLACEMENT_URL = 3;</code>
     */
    public static final int INVALID_PLACEMENT_URL_VALUE = 3;
    /**
     * <pre>
     * Criteria type can not be excluded for the campaign by the customer. like
     * AOL account type cannot target site type criteria
     * </pre>
     *
     * <code>CANNOT_EXCLUDE_CRITERIA_TYPE = 4;</code>
     */
    public static final int CANNOT_EXCLUDE_CRITERIA_TYPE_VALUE = 4;
    /**
     * <pre>
     * Cannot set the campaign criterion status for this criteria type.
     * </pre>
     *
     * <code>CANNOT_SET_STATUS_FOR_CRITERIA_TYPE = 5;</code>
     */
    public static final int CANNOT_SET_STATUS_FOR_CRITERIA_TYPE_VALUE = 5;
    /**
     * <pre>
     * Cannot set the campaign criterion status for an excluded criteria.
     * </pre>
     *
     * <code>CANNOT_SET_STATUS_FOR_EXCLUDED_CRITERIA = 6;</code>
     */
    public static final int CANNOT_SET_STATUS_FOR_EXCLUDED_CRITERIA_VALUE = 6;
    /**
     * <pre>
     * Cannot target and exclude the same criterion.
     * </pre>
     *
     * <code>CANNOT_TARGET_AND_EXCLUDE = 7;</code>
     */
    public static final int CANNOT_TARGET_AND_EXCLUDE_VALUE = 7;
    /**
     * <pre>
     * The mutate contained too many operations.
     * </pre>
     *
     * <code>TOO_MANY_OPERATIONS = 8;</code>
     */
    public static final int TOO_MANY_OPERATIONS_VALUE = 8;
    /**
     * <pre>
     * This operator cannot be applied to a criterion of this type.
     * </pre>
     *
     * <code>OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE = 9;</code>
     */
    public static final int OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE_VALUE = 9;
    /**
     * <pre>
     * The Shopping campaign sales country is not supported for
     * ProductSalesChannel targeting.
     * </pre>
     *
     * <code>SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL = 10;</code>
     */
    public static final int SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL_VALUE = 10;
    /**
     * <pre>
     * The existing field can't be updated with CREATE operation. It can be
     * updated with UPDATE operation only.
     * </pre>
     *
     * <code>CANNOT_ADD_EXISTING_FIELD = 11;</code>
     */
    public static final int CANNOT_ADD_EXISTING_FIELD_VALUE = 11;
    /**
     * <pre>
     * Negative criteria are immutable, so updates are not allowed.
     * </pre>
     *
     * <code>CANNOT_UPDATE_NEGATIVE_CRITERION = 12;</code>
     */
    public static final int CANNOT_UPDATE_NEGATIVE_CRITERION_VALUE = 12;
    /**
     * <pre>
     * Only free form names are allowed for negative Smart campaign keyword
     * theme.
     * </pre>
     *
     * <code>CANNOT_SET_NEGATIVE_KEYWORD_THEME_CONSTANT_CRITERION = 13;</code>
     */
    public static final int CANNOT_SET_NEGATIVE_KEYWORD_THEME_CONSTANT_CRITERION_VALUE = 13;
    /**
     * <pre>
     * Invalid Smart campaign keyword theme constant criterion.
     * </pre>
     *
     * <code>INVALID_KEYWORD_THEME_CONSTANT = 14;</code>
     */
    public static final int INVALID_KEYWORD_THEME_CONSTANT_VALUE = 14;
    /**
     * <pre>
     * A Smart campaign keyword theme constant or free-form Smart campaign
     * keyword theme is required.
     * </pre>
     *
     * <code>MISSING_KEYWORD_THEME_CONSTANT_OR_FREE_FORM_KEYWORD_THEME = 15;</code>
     */
    public static final int MISSING_KEYWORD_THEME_CONSTANT_OR_FREE_FORM_KEYWORD_THEME_VALUE = 15;
    /**
     * <pre>
     * A Smart campaign may not target proximity and location criteria
     * simultaneously.
     * </pre>
     *
     * <code>CANNOT_TARGET_BOTH_PROXIMITY_AND_LOCATION_CRITERIA_FOR_SMART_CAMPAIGN = 16;</code>
     */
    public static final int CANNOT_TARGET_BOTH_PROXIMITY_AND_LOCATION_CRITERIA_FOR_SMART_CAMPAIGN_VALUE = 16;
    /**
     * <pre>
     * A Smart campaign may not target multiple proximity criteria.
     * </pre>
     *
     * <code>CANNOT_TARGET_MULTIPLE_PROXIMITY_CRITERIA_FOR_SMART_CAMPAIGN = 17;</code>
     */
    public static final int CANNOT_TARGET_MULTIPLE_PROXIMITY_CRITERIA_FOR_SMART_CAMPAIGN_VALUE = 17;


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
    public static CampaignCriterionError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CampaignCriterionError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CONCRETE_TYPE_REQUIRED;
        case 3: return INVALID_PLACEMENT_URL;
        case 4: return CANNOT_EXCLUDE_CRITERIA_TYPE;
        case 5: return CANNOT_SET_STATUS_FOR_CRITERIA_TYPE;
        case 6: return CANNOT_SET_STATUS_FOR_EXCLUDED_CRITERIA;
        case 7: return CANNOT_TARGET_AND_EXCLUDE;
        case 8: return TOO_MANY_OPERATIONS;
        case 9: return OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE;
        case 10: return SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL;
        case 11: return CANNOT_ADD_EXISTING_FIELD;
        case 12: return CANNOT_UPDATE_NEGATIVE_CRITERION;
        case 13: return CANNOT_SET_NEGATIVE_KEYWORD_THEME_CONSTANT_CRITERION;
        case 14: return INVALID_KEYWORD_THEME_CONSTANT;
        case 15: return MISSING_KEYWORD_THEME_CONSTANT_OR_FREE_FORM_KEYWORD_THEME;
        case 16: return CANNOT_TARGET_BOTH_PROXIMITY_AND_LOCATION_CRITERIA_FOR_SMART_CAMPAIGN;
        case 17: return CANNOT_TARGET_MULTIPLE_PROXIMITY_CRITERIA_FOR_SMART_CAMPAIGN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CampaignCriterionError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CampaignCriterionError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CampaignCriterionError>() {
            public CampaignCriterionError findValueByNumber(int number) {
              return CampaignCriterionError.forNumber(number);
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
      return com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CampaignCriterionError[] VALUES = values();

    public static CampaignCriterionError valueOf(
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

    private CampaignCriterionError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v11.errors.CampaignCriterionErrorEnum.CampaignCriterionError)
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
    if (!(obj instanceof com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum other = (com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum) obj;

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

  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum prototype) {
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
   * Container for enum describing possible campaign criterion errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.errors.CampaignCriterionErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.errors.CampaignCriterionErrorEnum)
      com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.errors.CampaignCriterionErrorProto.internal_static_google_ads_googleads_v11_errors_CampaignCriterionErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.errors.CampaignCriterionErrorProto.internal_static_google_ads_googleads_v11_errors_CampaignCriterionErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum.class, com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v11.errors.CampaignCriterionErrorProto.internal_static_google_ads_googleads_v11_errors_CampaignCriterionErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum build() {
      com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum buildPartial() {
      com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum result = new com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum other) {
      if (other == com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.errors.CampaignCriterionErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.errors.CampaignCriterionErrorEnum)
  private static final com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum();
  }

  public static com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignCriterionErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<CampaignCriterionErrorEnum>() {
    @java.lang.Override
    public CampaignCriterionErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampaignCriterionErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignCriterionErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.errors.CampaignCriterionErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

