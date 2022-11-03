// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/keyword_plan_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * The max cpc bid forecast curve.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve}
 */
public final class KeywordPlanMaxCpcBidForecastCurve extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve)
    KeywordPlanMaxCpcBidForecastCurveOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlanMaxCpcBidForecastCurve.newBuilder() to construct.
  private KeywordPlanMaxCpcBidForecastCurve(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlanMaxCpcBidForecastCurve() {
    maxCpcBidForecasts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlanMaxCpcBidForecastCurve();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanMaxCpcBidForecastCurve_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanMaxCpcBidForecastCurve_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.class, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.Builder.class);
  }

  public static final int MAX_CPC_BID_FORECASTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast> maxCpcBidForecasts_;
  /**
   * <pre>
   * The forecasts for the Keyword Plan campaign at different max CPC bids.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast> getMaxCpcBidForecastsList() {
    return maxCpcBidForecasts_;
  }
  /**
   * <pre>
   * The forecasts for the Keyword Plan campaign at different max CPC bids.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastOrBuilder> 
      getMaxCpcBidForecastsOrBuilderList() {
    return maxCpcBidForecasts_;
  }
  /**
   * <pre>
   * The forecasts for the Keyword Plan campaign at different max CPC bids.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
   */
  @java.lang.Override
  public int getMaxCpcBidForecastsCount() {
    return maxCpcBidForecasts_.size();
  }
  /**
   * <pre>
   * The forecasts for the Keyword Plan campaign at different max CPC bids.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast getMaxCpcBidForecasts(int index) {
    return maxCpcBidForecasts_.get(index);
  }
  /**
   * <pre>
   * The forecasts for the Keyword Plan campaign at different max CPC bids.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastOrBuilder getMaxCpcBidForecastsOrBuilder(
      int index) {
    return maxCpcBidForecasts_.get(index);
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
    for (int i = 0; i < maxCpcBidForecasts_.size(); i++) {
      output.writeMessage(1, maxCpcBidForecasts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < maxCpcBidForecasts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, maxCpcBidForecasts_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve other = (com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve) obj;

    if (!getMaxCpcBidForecastsList()
        .equals(other.getMaxCpcBidForecastsList())) return false;
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
    if (getMaxCpcBidForecastsCount() > 0) {
      hash = (37 * hash) + MAX_CPC_BID_FORECASTS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxCpcBidForecastsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve prototype) {
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
   * The max cpc bid forecast curve.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve)
      com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanMaxCpcBidForecastCurve_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanMaxCpcBidForecastCurve_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.class, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (maxCpcBidForecastsBuilder_ == null) {
        maxCpcBidForecasts_ = java.util.Collections.emptyList();
      } else {
        maxCpcBidForecasts_ = null;
        maxCpcBidForecastsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v11_services_KeywordPlanMaxCpcBidForecastCurve_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve build() {
      com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve buildPartial() {
      com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve result = new com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve(this);
      int from_bitField0_ = bitField0_;
      if (maxCpcBidForecastsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          maxCpcBidForecasts_ = java.util.Collections.unmodifiableList(maxCpcBidForecasts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.maxCpcBidForecasts_ = maxCpcBidForecasts_;
      } else {
        result.maxCpcBidForecasts_ = maxCpcBidForecastsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve) {
        return mergeFrom((com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve other) {
      if (other == com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve.getDefaultInstance()) return this;
      if (maxCpcBidForecastsBuilder_ == null) {
        if (!other.maxCpcBidForecasts_.isEmpty()) {
          if (maxCpcBidForecasts_.isEmpty()) {
            maxCpcBidForecasts_ = other.maxCpcBidForecasts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMaxCpcBidForecastsIsMutable();
            maxCpcBidForecasts_.addAll(other.maxCpcBidForecasts_);
          }
          onChanged();
        }
      } else {
        if (!other.maxCpcBidForecasts_.isEmpty()) {
          if (maxCpcBidForecastsBuilder_.isEmpty()) {
            maxCpcBidForecastsBuilder_.dispose();
            maxCpcBidForecastsBuilder_ = null;
            maxCpcBidForecasts_ = other.maxCpcBidForecasts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            maxCpcBidForecastsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMaxCpcBidForecastsFieldBuilder() : null;
          } else {
            maxCpcBidForecastsBuilder_.addAllMessages(other.maxCpcBidForecasts_);
          }
        }
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
              com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast m =
                  input.readMessage(
                      com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.parser(),
                      extensionRegistry);
              if (maxCpcBidForecastsBuilder_ == null) {
                ensureMaxCpcBidForecastsIsMutable();
                maxCpcBidForecasts_.add(m);
              } else {
                maxCpcBidForecastsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast> maxCpcBidForecasts_ =
      java.util.Collections.emptyList();
    private void ensureMaxCpcBidForecastsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        maxCpcBidForecasts_ = new java.util.ArrayList<com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast>(maxCpcBidForecasts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.Builder, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastOrBuilder> maxCpcBidForecastsBuilder_;

    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast> getMaxCpcBidForecastsList() {
      if (maxCpcBidForecastsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(maxCpcBidForecasts_);
      } else {
        return maxCpcBidForecastsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public int getMaxCpcBidForecastsCount() {
      if (maxCpcBidForecastsBuilder_ == null) {
        return maxCpcBidForecasts_.size();
      } else {
        return maxCpcBidForecastsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast getMaxCpcBidForecasts(int index) {
      if (maxCpcBidForecastsBuilder_ == null) {
        return maxCpcBidForecasts_.get(index);
      } else {
        return maxCpcBidForecastsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public Builder setMaxCpcBidForecasts(
        int index, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast value) {
      if (maxCpcBidForecastsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMaxCpcBidForecastsIsMutable();
        maxCpcBidForecasts_.set(index, value);
        onChanged();
      } else {
        maxCpcBidForecastsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public Builder setMaxCpcBidForecasts(
        int index, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.Builder builderForValue) {
      if (maxCpcBidForecastsBuilder_ == null) {
        ensureMaxCpcBidForecastsIsMutable();
        maxCpcBidForecasts_.set(index, builderForValue.build());
        onChanged();
      } else {
        maxCpcBidForecastsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public Builder addMaxCpcBidForecasts(com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast value) {
      if (maxCpcBidForecastsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMaxCpcBidForecastsIsMutable();
        maxCpcBidForecasts_.add(value);
        onChanged();
      } else {
        maxCpcBidForecastsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public Builder addMaxCpcBidForecasts(
        int index, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast value) {
      if (maxCpcBidForecastsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMaxCpcBidForecastsIsMutable();
        maxCpcBidForecasts_.add(index, value);
        onChanged();
      } else {
        maxCpcBidForecastsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public Builder addMaxCpcBidForecasts(
        com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.Builder builderForValue) {
      if (maxCpcBidForecastsBuilder_ == null) {
        ensureMaxCpcBidForecastsIsMutable();
        maxCpcBidForecasts_.add(builderForValue.build());
        onChanged();
      } else {
        maxCpcBidForecastsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public Builder addMaxCpcBidForecasts(
        int index, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.Builder builderForValue) {
      if (maxCpcBidForecastsBuilder_ == null) {
        ensureMaxCpcBidForecastsIsMutable();
        maxCpcBidForecasts_.add(index, builderForValue.build());
        onChanged();
      } else {
        maxCpcBidForecastsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public Builder addAllMaxCpcBidForecasts(
        java.lang.Iterable<? extends com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast> values) {
      if (maxCpcBidForecastsBuilder_ == null) {
        ensureMaxCpcBidForecastsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, maxCpcBidForecasts_);
        onChanged();
      } else {
        maxCpcBidForecastsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public Builder clearMaxCpcBidForecasts() {
      if (maxCpcBidForecastsBuilder_ == null) {
        maxCpcBidForecasts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        maxCpcBidForecastsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public Builder removeMaxCpcBidForecasts(int index) {
      if (maxCpcBidForecastsBuilder_ == null) {
        ensureMaxCpcBidForecastsIsMutable();
        maxCpcBidForecasts_.remove(index);
        onChanged();
      } else {
        maxCpcBidForecastsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.Builder getMaxCpcBidForecastsBuilder(
        int index) {
      return getMaxCpcBidForecastsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastOrBuilder getMaxCpcBidForecastsOrBuilder(
        int index) {
      if (maxCpcBidForecastsBuilder_ == null) {
        return maxCpcBidForecasts_.get(index);  } else {
        return maxCpcBidForecastsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastOrBuilder> 
         getMaxCpcBidForecastsOrBuilderList() {
      if (maxCpcBidForecastsBuilder_ != null) {
        return maxCpcBidForecastsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(maxCpcBidForecasts_);
      }
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.Builder addMaxCpcBidForecastsBuilder() {
      return getMaxCpcBidForecastsFieldBuilder().addBuilder(
          com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.getDefaultInstance());
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.Builder addMaxCpcBidForecastsBuilder(
        int index) {
      return getMaxCpcBidForecastsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.getDefaultInstance());
    }
    /**
     * <pre>
     * The forecasts for the Keyword Plan campaign at different max CPC bids.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast max_cpc_bid_forecasts = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.Builder> 
         getMaxCpcBidForecastsBuilderList() {
      return getMaxCpcBidForecastsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.Builder, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastOrBuilder> 
        getMaxCpcBidForecastsFieldBuilder() {
      if (maxCpcBidForecastsBuilder_ == null) {
        maxCpcBidForecastsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecast.Builder, com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastOrBuilder>(
                maxCpcBidForecasts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        maxCpcBidForecasts_ = null;
      }
      return maxCpcBidForecastsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve)
  private static final com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve();
  }

  public static com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlanMaxCpcBidForecastCurve>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlanMaxCpcBidForecastCurve>() {
    @java.lang.Override
    public KeywordPlanMaxCpcBidForecastCurve parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeywordPlanMaxCpcBidForecastCurve> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlanMaxCpcBidForecastCurve> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.KeywordPlanMaxCpcBidForecastCurve getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

