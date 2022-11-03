// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/keyword_plan_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * A campaign forecast.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.KeywordPlanCampaignForecast}
 */
public final class KeywordPlanCampaignForecast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.KeywordPlanCampaignForecast)
    KeywordPlanCampaignForecastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanCampaignForecast.newBuilder() to construct.
  private KeywordPlanCampaignForecast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanCampaignForecast() {
    keywordPlanCampaign_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlanCampaignForecast();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignForecast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignForecast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast.class, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast.Builder.class);
  }

  private int bitField0_;
  public static final int KEYWORD_PLAN_CAMPAIGN_FIELD_NUMBER = 3;
  private volatile java.lang.Object keywordPlanCampaign_;
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 3;</code>
   * @return Whether the keywordPlanCampaign field is set.
   */
  @java.lang.Override
  public boolean hasKeywordPlanCampaign() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 3;</code>
   * @return The keywordPlanCampaign.
   */
  @java.lang.Override
  public java.lang.String getKeywordPlanCampaign() {
    java.lang.Object ref = keywordPlanCampaign_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keywordPlanCampaign_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the Keyword Plan campaign related to the forecast.
   * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
   * </pre>
   *
   * <code>optional string keyword_plan_campaign = 3;</code>
   * @return The bytes for keywordPlanCampaign.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeywordPlanCampaignBytes() {
    java.lang.Object ref = keywordPlanCampaign_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keywordPlanCampaign_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAMPAIGN_FORECAST_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v12.services.ForecastMetrics campaignForecast_;
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.ForecastMetrics campaign_forecast = 2;</code>
   * @return Whether the campaignForecast field is set.
   */
  @java.lang.Override
  public boolean hasCampaignForecast() {
    return campaignForecast_ != null;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.ForecastMetrics campaign_forecast = 2;</code>
   * @return The campaignForecast.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.ForecastMetrics getCampaignForecast() {
    return campaignForecast_ == null ? com.google.ads.googleads.v12.services.ForecastMetrics.getDefaultInstance() : campaignForecast_;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.services.ForecastMetrics campaign_forecast = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.ForecastMetricsOrBuilder getCampaignForecastOrBuilder() {
    return getCampaignForecast();
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
    if (campaignForecast_ != null) {
      output.writeMessage(2, getCampaignForecast());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, keywordPlanCampaign_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (campaignForecast_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCampaignForecast());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, keywordPlanCampaign_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast other = (com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast) obj;

    if (hasKeywordPlanCampaign() != other.hasKeywordPlanCampaign()) return false;
    if (hasKeywordPlanCampaign()) {
      if (!getKeywordPlanCampaign()
          .equals(other.getKeywordPlanCampaign())) return false;
    }
    if (hasCampaignForecast() != other.hasCampaignForecast()) return false;
    if (hasCampaignForecast()) {
      if (!getCampaignForecast()
          .equals(other.getCampaignForecast())) return false;
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
    if (hasKeywordPlanCampaign()) {
      hash = (37 * hash) + KEYWORD_PLAN_CAMPAIGN_FIELD_NUMBER;
      hash = (53 * hash) + getKeywordPlanCampaign().hashCode();
    }
    if (hasCampaignForecast()) {
      hash = (37 * hash) + CAMPAIGN_FORECAST_FIELD_NUMBER;
      hash = (53 * hash) + getCampaignForecast().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast prototype) {
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
   * A campaign forecast.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.KeywordPlanCampaignForecast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.KeywordPlanCampaignForecast)
      com.google.ads.googleads.v12.services.KeywordPlanCampaignForecastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignForecast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignForecast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast.class, com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      keywordPlanCampaign_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (campaignForecastBuilder_ == null) {
        campaignForecast_ = null;
      } else {
        campaignForecast_ = null;
        campaignForecastBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v12_services_KeywordPlanCampaignForecast_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast build() {
      com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast buildPartial() {
      com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast result = new com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.keywordPlanCampaign_ = keywordPlanCampaign_;
      if (campaignForecastBuilder_ == null) {
        result.campaignForecast_ = campaignForecast_;
      } else {
        result.campaignForecast_ = campaignForecastBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast) {
        return mergeFrom((com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast other) {
      if (other == com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast.getDefaultInstance()) return this;
      if (other.hasKeywordPlanCampaign()) {
        bitField0_ |= 0x00000001;
        keywordPlanCampaign_ = other.keywordPlanCampaign_;
        onChanged();
      }
      if (other.hasCampaignForecast()) {
        mergeCampaignForecast(other.getCampaignForecast());
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
            case 18: {
              input.readMessage(
                  getCampaignForecastFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              keywordPlanCampaign_ = input.readStringRequireUtf8();
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

    private java.lang.Object keywordPlanCampaign_ = "";
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @return Whether the keywordPlanCampaign field is set.
     */
    public boolean hasKeywordPlanCampaign() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @return The keywordPlanCampaign.
     */
    public java.lang.String getKeywordPlanCampaign() {
      java.lang.Object ref = keywordPlanCampaign_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keywordPlanCampaign_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @return The bytes for keywordPlanCampaign.
     */
    public com.google.protobuf.ByteString
        getKeywordPlanCampaignBytes() {
      java.lang.Object ref = keywordPlanCampaign_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keywordPlanCampaign_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @param value The keywordPlanCampaign to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordPlanCampaign(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      keywordPlanCampaign_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeywordPlanCampaign() {
      bitField0_ = (bitField0_ & ~0x00000001);
      keywordPlanCampaign_ = getDefaultInstance().getKeywordPlanCampaign();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the Keyword Plan campaign related to the forecast.
     * `customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}`
     * </pre>
     *
     * <code>optional string keyword_plan_campaign = 3;</code>
     * @param value The bytes for keywordPlanCampaign to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordPlanCampaignBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      keywordPlanCampaign_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v12.services.ForecastMetrics campaignForecast_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.services.ForecastMetrics, com.google.ads.googleads.v12.services.ForecastMetrics.Builder, com.google.ads.googleads.v12.services.ForecastMetricsOrBuilder> campaignForecastBuilder_;
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics campaign_forecast = 2;</code>
     * @return Whether the campaignForecast field is set.
     */
    public boolean hasCampaignForecast() {
      return campaignForecastBuilder_ != null || campaignForecast_ != null;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics campaign_forecast = 2;</code>
     * @return The campaignForecast.
     */
    public com.google.ads.googleads.v12.services.ForecastMetrics getCampaignForecast() {
      if (campaignForecastBuilder_ == null) {
        return campaignForecast_ == null ? com.google.ads.googleads.v12.services.ForecastMetrics.getDefaultInstance() : campaignForecast_;
      } else {
        return campaignForecastBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    public Builder setCampaignForecast(com.google.ads.googleads.v12.services.ForecastMetrics value) {
      if (campaignForecastBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        campaignForecast_ = value;
        onChanged();
      } else {
        campaignForecastBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    public Builder setCampaignForecast(
        com.google.ads.googleads.v12.services.ForecastMetrics.Builder builderForValue) {
      if (campaignForecastBuilder_ == null) {
        campaignForecast_ = builderForValue.build();
        onChanged();
      } else {
        campaignForecastBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    public Builder mergeCampaignForecast(com.google.ads.googleads.v12.services.ForecastMetrics value) {
      if (campaignForecastBuilder_ == null) {
        if (campaignForecast_ != null) {
          campaignForecast_ =
            com.google.ads.googleads.v12.services.ForecastMetrics.newBuilder(campaignForecast_).mergeFrom(value).buildPartial();
        } else {
          campaignForecast_ = value;
        }
        onChanged();
      } else {
        campaignForecastBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    public Builder clearCampaignForecast() {
      if (campaignForecastBuilder_ == null) {
        campaignForecast_ = null;
        onChanged();
      } else {
        campaignForecast_ = null;
        campaignForecastBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    public com.google.ads.googleads.v12.services.ForecastMetrics.Builder getCampaignForecastBuilder() {
      
      onChanged();
      return getCampaignForecastFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    public com.google.ads.googleads.v12.services.ForecastMetricsOrBuilder getCampaignForecastOrBuilder() {
      if (campaignForecastBuilder_ != null) {
        return campaignForecastBuilder_.getMessageOrBuilder();
      } else {
        return campaignForecast_ == null ?
            com.google.ads.googleads.v12.services.ForecastMetrics.getDefaultInstance() : campaignForecast_;
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.services.ForecastMetrics campaign_forecast = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.services.ForecastMetrics, com.google.ads.googleads.v12.services.ForecastMetrics.Builder, com.google.ads.googleads.v12.services.ForecastMetricsOrBuilder> 
        getCampaignForecastFieldBuilder() {
      if (campaignForecastBuilder_ == null) {
        campaignForecastBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.services.ForecastMetrics, com.google.ads.googleads.v12.services.ForecastMetrics.Builder, com.google.ads.googleads.v12.services.ForecastMetricsOrBuilder>(
                getCampaignForecast(),
                getParentForChildren(),
                isClean());
        campaignForecast_ = null;
      }
      return campaignForecastBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.KeywordPlanCampaignForecast)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.KeywordPlanCampaignForecast)
  private static final com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast();
  }

  public static com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanCampaignForecast>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanCampaignForecast>() {
    @java.lang.Override
    public KeywordPlanCampaignForecast parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeywordPlanCampaignForecast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanCampaignForecast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.KeywordPlanCampaignForecast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

