// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/keyword_plan_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * The forecast of the campaign for the week starting start_date.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.KeywordPlanWeeklyForecast}
 */
public final class KeywordPlanWeeklyForecast extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.KeywordPlanWeeklyForecast)
    KeywordPlanWeeklyForecastOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanWeeklyForecast.newBuilder() to construct.
  private KeywordPlanWeeklyForecast(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanWeeklyForecast() {
    startDate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlanWeeklyForecast();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanWeeklyForecast_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanWeeklyForecast_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast.class, com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast.Builder.class);
  }

  private int bitField0_;
  public static final int START_DATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object startDate_;
  /**
   * <pre>
   * The start date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string start_date = 1;</code>
   * @return Whether the startDate field is set.
   */
  @java.lang.Override
  public boolean hasStartDate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The start date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string start_date = 1;</code>
   * @return The startDate.
   */
  @java.lang.Override
  public java.lang.String getStartDate() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startDate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The start date, in yyyy-mm-dd format. This date is inclusive.
   * </pre>
   *
   * <code>optional string start_date = 1;</code>
   * @return The bytes for startDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartDateBytes() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORECAST_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v11.services.ForecastMetrics forecast_;
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign for the week.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
   * @return Whether the forecast field is set.
   */
  @java.lang.Override
  public boolean hasForecast() {
    return forecast_ != null;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign for the week.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
   * @return The forecast.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.ForecastMetrics getForecast() {
    return forecast_ == null ? com.google.ads.googleads.v11.services.ForecastMetrics.getDefaultInstance() : forecast_;
  }
  /**
   * <pre>
   * The forecast for the Keyword Plan campaign for the week.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.ForecastMetricsOrBuilder getForecastOrBuilder() {
    return getForecast();
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, startDate_);
    }
    if (forecast_ != null) {
      output.writeMessage(2, getForecast());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, startDate_);
    }
    if (forecast_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getForecast());
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast other = (com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast) obj;

    if (hasStartDate() != other.hasStartDate()) return false;
    if (hasStartDate()) {
      if (!getStartDate()
          .equals(other.getStartDate())) return false;
    }
    if (hasForecast() != other.hasForecast()) return false;
    if (hasForecast()) {
      if (!getForecast()
          .equals(other.getForecast())) return false;
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
    if (hasStartDate()) {
      hash = (37 * hash) + START_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getStartDate().hashCode();
    }
    if (hasForecast()) {
      hash = (37 * hash) + FORECAST_FIELD_NUMBER;
      hash = (53 * hash) + getForecast().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast prototype) {
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
   * The forecast of the campaign for the week starting start_date.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.KeywordPlanWeeklyForecast}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.KeywordPlanWeeklyForecast)
      com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecastOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanWeeklyForecast_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanWeeklyForecast_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast.class, com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      startDate_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (forecastBuilder_ == null) {
        forecast_ = null;
      } else {
        forecast_ = null;
        forecastBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanWeeklyForecast_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast build() {
      com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast buildPartial() {
      com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast result = new com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.startDate_ = startDate_;
      if (forecastBuilder_ == null) {
        result.forecast_ = forecast_;
      } else {
        result.forecast_ = forecastBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast) {
        return mergeFrom((com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast other) {
      if (other == com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast.getDefaultInstance()) return this;
      if (other.hasStartDate()) {
        bitField0_ |= 0x00000001;
        startDate_ = other.startDate_;
        onChanged();
      }
      if (other.hasForecast()) {
        mergeForecast(other.getForecast());
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
              startDate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getForecastFieldBuilder().getBuilder(),
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
    private int bitField0_;

    private java.lang.Object startDate_ = "";
    /**
     * <pre>
     * The start date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string start_date = 1;</code>
     * @return Whether the startDate field is set.
     */
    public boolean hasStartDate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The start date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string start_date = 1;</code>
     * @return The startDate.
     */
    public java.lang.String getStartDate() {
      java.lang.Object ref = startDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The start date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string start_date = 1;</code>
     * @return The bytes for startDate.
     */
    public com.google.protobuf.ByteString
        getStartDateBytes() {
      java.lang.Object ref = startDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The start date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string start_date = 1;</code>
     * @param value The startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      startDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The start date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string start_date = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartDate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startDate_ = getDefaultInstance().getStartDate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The start date, in yyyy-mm-dd format. This date is inclusive.
     * </pre>
     *
     * <code>optional string start_date = 1;</code>
     * @param value The bytes for startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      startDate_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v11.services.ForecastMetrics forecast_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.services.ForecastMetrics, com.google.ads.googleads.v11.services.ForecastMetrics.Builder, com.google.ads.googleads.v11.services.ForecastMetricsOrBuilder> forecastBuilder_;
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign for the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
     * @return Whether the forecast field is set.
     */
    public boolean hasForecast() {
      return forecastBuilder_ != null || forecast_ != null;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign for the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
     * @return The forecast.
     */
    public com.google.ads.googleads.v11.services.ForecastMetrics getForecast() {
      if (forecastBuilder_ == null) {
        return forecast_ == null ? com.google.ads.googleads.v11.services.ForecastMetrics.getDefaultInstance() : forecast_;
      } else {
        return forecastBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign for the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
     */
    public Builder setForecast(com.google.ads.googleads.v11.services.ForecastMetrics value) {
      if (forecastBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        forecast_ = value;
        onChanged();
      } else {
        forecastBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign for the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
     */
    public Builder setForecast(
        com.google.ads.googleads.v11.services.ForecastMetrics.Builder builderForValue) {
      if (forecastBuilder_ == null) {
        forecast_ = builderForValue.build();
        onChanged();
      } else {
        forecastBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign for the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
     */
    public Builder mergeForecast(com.google.ads.googleads.v11.services.ForecastMetrics value) {
      if (forecastBuilder_ == null) {
        if (forecast_ != null) {
          forecast_ =
            com.google.ads.googleads.v11.services.ForecastMetrics.newBuilder(forecast_).mergeFrom(value).buildPartial();
        } else {
          forecast_ = value;
        }
        onChanged();
      } else {
        forecastBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign for the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
     */
    public Builder clearForecast() {
      if (forecastBuilder_ == null) {
        forecast_ = null;
        onChanged();
      } else {
        forecast_ = null;
        forecastBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign for the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
     */
    public com.google.ads.googleads.v11.services.ForecastMetrics.Builder getForecastBuilder() {
      
      onChanged();
      return getForecastFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign for the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
     */
    public com.google.ads.googleads.v11.services.ForecastMetricsOrBuilder getForecastOrBuilder() {
      if (forecastBuilder_ != null) {
        return forecastBuilder_.getMessageOrBuilder();
      } else {
        return forecast_ == null ?
            com.google.ads.googleads.v11.services.ForecastMetrics.getDefaultInstance() : forecast_;
      }
    }
    /**
     * <pre>
     * The forecast for the Keyword Plan campaign for the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.services.ForecastMetrics forecast = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.services.ForecastMetrics, com.google.ads.googleads.v11.services.ForecastMetrics.Builder, com.google.ads.googleads.v11.services.ForecastMetricsOrBuilder> 
        getForecastFieldBuilder() {
      if (forecastBuilder_ == null) {
        forecastBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.services.ForecastMetrics, com.google.ads.googleads.v11.services.ForecastMetrics.Builder, com.google.ads.googleads.v11.services.ForecastMetricsOrBuilder>(
                getForecast(),
                getParentForChildren(),
                isClean());
        forecast_ = null;
      }
      return forecastBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.KeywordPlanWeeklyForecast)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.KeywordPlanWeeklyForecast)
  private static final com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast();
  }

  public static com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanWeeklyForecast>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanWeeklyForecast>() {
    @java.lang.Override
    public KeywordPlanWeeklyForecast parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeywordPlanWeeklyForecast> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanWeeklyForecast> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.KeywordPlanWeeklyForecast getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

