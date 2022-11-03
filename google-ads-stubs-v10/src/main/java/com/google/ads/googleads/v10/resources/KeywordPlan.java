// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/keyword_plan.proto

package com.google.ads.googleads.v10.resources;

/**
 * <pre>
 * A Keyword Planner plan.
 * Max number of saved keyword plans: 10000.
 * It's possible to remove plans if limit is reached.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.resources.KeywordPlan}
 */
public final class KeywordPlan extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.resources.KeywordPlan)
    KeywordPlanOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordPlan.newBuilder() to construct.
  private KeywordPlan(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordPlan() {
    resourceName_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordPlan();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.resources.KeywordPlanProto.internal_static_google_ads_googleads_v10_resources_KeywordPlan_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.resources.KeywordPlanProto.internal_static_google_ads_googleads_v10_resources_KeywordPlan_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.resources.KeywordPlan.class, com.google.ads.googleads.v10.resources.KeywordPlan.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Immutable. The resource name of the Keyword Planner plan.
   * KeywordPlan resource names have the form:
   * `customers/{customer_id}/keywordPlans/{kp_plan_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
   * Immutable. The resource name of the Keyword Planner plan.
   * KeywordPlan resource names have the form:
   * `customers/{customer_id}/keywordPlans/{kp_plan_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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

  public static final int ID_FIELD_NUMBER = 5;
  private long id_;
  /**
   * <pre>
   * Output only. The ID of the keyword plan.
   * </pre>
   *
   * <code>optional int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. The ID of the keyword plan.
   * </pre>
   *
   * <code>optional int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 6;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of the keyword plan.
   * This field is required and should not be empty when creating new keyword
   * plans.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The name of the keyword plan.
   * This field is required and should not be empty when creating new keyword
   * plans.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the keyword plan.
   * This field is required and should not be empty when creating new keyword
   * plans.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORECAST_PERIOD_FIELD_NUMBER = 4;
  private com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecastPeriod_;
  /**
   * <pre>
   * The date period used for forecasting the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
   * @return Whether the forecastPeriod field is set.
   */
  @java.lang.Override
  public boolean hasForecastPeriod() {
    return forecastPeriod_ != null;
  }
  /**
   * <pre>
   * The date period used for forecasting the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
   * @return The forecastPeriod.
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod getForecastPeriod() {
    return forecastPeriod_ == null ? com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod.getDefaultInstance() : forecastPeriod_;
  }
  /**
   * <pre>
   * The date period used for forecasting the plan.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriodOrBuilder getForecastPeriodOrBuilder() {
    return getForecastPeriod();
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
    if (forecastPeriod_ != null) {
      output.writeMessage(4, getForecastPeriod());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(5, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, name_);
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
    if (forecastPeriod_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getForecastPeriod());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, name_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.resources.KeywordPlan)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.resources.KeywordPlan other = (com.google.ads.googleads.v10.resources.KeywordPlan) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (getId()
          != other.getId()) return false;
    }
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasForecastPeriod() != other.hasForecastPeriod()) return false;
    if (hasForecastPeriod()) {
      if (!getForecastPeriod()
          .equals(other.getForecastPeriod())) return false;
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasForecastPeriod()) {
      hash = (37 * hash) + FORECAST_PERIOD_FIELD_NUMBER;
      hash = (53 * hash) + getForecastPeriod().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.resources.KeywordPlan parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.KeywordPlan parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.KeywordPlan parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.KeywordPlan parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.KeywordPlan parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.KeywordPlan parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.KeywordPlan parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.KeywordPlan parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.KeywordPlan parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.KeywordPlan parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.KeywordPlan parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.KeywordPlan parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.resources.KeywordPlan prototype) {
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
   * A Keyword Planner plan.
   * Max number of saved keyword plans: 10000.
   * It's possible to remove plans if limit is reached.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.resources.KeywordPlan}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.resources.KeywordPlan)
      com.google.ads.googleads.v10.resources.KeywordPlanOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.resources.KeywordPlanProto.internal_static_google_ads_googleads_v10_resources_KeywordPlan_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.resources.KeywordPlanProto.internal_static_google_ads_googleads_v10_resources_KeywordPlan_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.resources.KeywordPlan.class, com.google.ads.googleads.v10.resources.KeywordPlan.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.resources.KeywordPlan.newBuilder()
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

      id_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      if (forecastPeriodBuilder_ == null) {
        forecastPeriod_ = null;
      } else {
        forecastPeriod_ = null;
        forecastPeriodBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.resources.KeywordPlanProto.internal_static_google_ads_googleads_v10_resources_KeywordPlan_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.KeywordPlan getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.resources.KeywordPlan.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.KeywordPlan build() {
      com.google.ads.googleads.v10.resources.KeywordPlan result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.KeywordPlan buildPartial() {
      com.google.ads.googleads.v10.resources.KeywordPlan result = new com.google.ads.googleads.v10.resources.KeywordPlan(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.resourceName_ = resourceName_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.name_ = name_;
      if (forecastPeriodBuilder_ == null) {
        result.forecastPeriod_ = forecastPeriod_;
      } else {
        result.forecastPeriod_ = forecastPeriodBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v10.resources.KeywordPlan) {
        return mergeFrom((com.google.ads.googleads.v10.resources.KeywordPlan)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.resources.KeywordPlan other) {
      if (other == com.google.ads.googleads.v10.resources.KeywordPlan.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasId()) {
        setId(other.getId());
      }
      if (other.hasName()) {
        bitField0_ |= 0x00000002;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasForecastPeriod()) {
        mergeForecastPeriod(other.getForecastPeriod());
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
            case 34: {
              input.readMessage(
                  getForecastPeriodFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 34
            case 40: {
              id_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 40
            case 50: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 50
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Immutable. The resource name of the Keyword Planner plan.
     * KeywordPlan resource names have the form:
     * `customers/{customer_id}/keywordPlans/{kp_plan_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The resource name of the Keyword Planner plan.
     * KeywordPlan resource names have the form:
     * `customers/{customer_id}/keywordPlans/{kp_plan_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The resource name of the Keyword Planner plan.
     * KeywordPlan resource names have the form:
     * `customers/{customer_id}/keywordPlans/{kp_plan_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The resource name of the Keyword Planner plan.
     * KeywordPlan resource names have the form:
     * `customers/{customer_id}/keywordPlans/{kp_plan_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The resource name of the Keyword Planner plan.
     * KeywordPlan resource names have the form:
     * `customers/{customer_id}/keywordPlans/{kp_plan_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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

    private long id_ ;
    /**
     * <pre>
     * Output only. The ID of the keyword plan.
     * </pre>
     *
     * <code>optional int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. The ID of the keyword plan.
     * </pre>
     *
     * <code>optional int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * Output only. The ID of the keyword plan.
     * </pre>
     *
     * <code>optional int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      bitField0_ |= 0x00000001;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The ID of the keyword plan.
     * </pre>
     *
     * <code>optional int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the keyword plan.
     * This field is required and should not be empty when creating new keyword
     * plans.
     * </pre>
     *
     * <code>optional string name = 6;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The name of the keyword plan.
     * This field is required and should not be empty when creating new keyword
     * plans.
     * </pre>
     *
     * <code>optional string name = 6;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the keyword plan.
     * This field is required and should not be empty when creating new keyword
     * plans.
     * </pre>
     *
     * <code>optional string name = 6;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the keyword plan.
     * This field is required and should not be empty when creating new keyword
     * plans.
     * </pre>
     *
     * <code>optional string name = 6;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the keyword plan.
     * This field is required and should not be empty when creating new keyword
     * plans.
     * </pre>
     *
     * <code>optional string name = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the keyword plan.
     * This field is required and should not be empty when creating new keyword
     * plans.
     * </pre>
     *
     * <code>optional string name = 6;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecastPeriod_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod, com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod.Builder, com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriodOrBuilder> forecastPeriodBuilder_;
    /**
     * <pre>
     * The date period used for forecasting the plan.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
     * @return Whether the forecastPeriod field is set.
     */
    public boolean hasForecastPeriod() {
      return forecastPeriodBuilder_ != null || forecastPeriod_ != null;
    }
    /**
     * <pre>
     * The date period used for forecasting the plan.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
     * @return The forecastPeriod.
     */
    public com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod getForecastPeriod() {
      if (forecastPeriodBuilder_ == null) {
        return forecastPeriod_ == null ? com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod.getDefaultInstance() : forecastPeriod_;
      } else {
        return forecastPeriodBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The date period used for forecasting the plan.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
     */
    public Builder setForecastPeriod(com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod value) {
      if (forecastPeriodBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        forecastPeriod_ = value;
        onChanged();
      } else {
        forecastPeriodBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The date period used for forecasting the plan.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
     */
    public Builder setForecastPeriod(
        com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod.Builder builderForValue) {
      if (forecastPeriodBuilder_ == null) {
        forecastPeriod_ = builderForValue.build();
        onChanged();
      } else {
        forecastPeriodBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The date period used for forecasting the plan.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
     */
    public Builder mergeForecastPeriod(com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod value) {
      if (forecastPeriodBuilder_ == null) {
        if (forecastPeriod_ != null) {
          forecastPeriod_ =
            com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod.newBuilder(forecastPeriod_).mergeFrom(value).buildPartial();
        } else {
          forecastPeriod_ = value;
        }
        onChanged();
      } else {
        forecastPeriodBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The date period used for forecasting the plan.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
     */
    public Builder clearForecastPeriod() {
      if (forecastPeriodBuilder_ == null) {
        forecastPeriod_ = null;
        onChanged();
      } else {
        forecastPeriod_ = null;
        forecastPeriodBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The date period used for forecasting the plan.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
     */
    public com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod.Builder getForecastPeriodBuilder() {
      
      onChanged();
      return getForecastPeriodFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The date period used for forecasting the plan.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
     */
    public com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriodOrBuilder getForecastPeriodOrBuilder() {
      if (forecastPeriodBuilder_ != null) {
        return forecastPeriodBuilder_.getMessageOrBuilder();
      } else {
        return forecastPeriod_ == null ?
            com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod.getDefaultInstance() : forecastPeriod_;
      }
    }
    /**
     * <pre>
     * The date period used for forecasting the plan.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod forecast_period = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod, com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod.Builder, com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriodOrBuilder> 
        getForecastPeriodFieldBuilder() {
      if (forecastPeriodBuilder_ == null) {
        forecastPeriodBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod, com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriod.Builder, com.google.ads.googleads.v10.resources.KeywordPlanForecastPeriodOrBuilder>(
                getForecastPeriod(),
                getParentForChildren(),
                isClean());
        forecastPeriod_ = null;
      }
      return forecastPeriodBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.resources.KeywordPlan)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.resources.KeywordPlan)
  private static final com.google.ads.googleads.v10.resources.KeywordPlan DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.resources.KeywordPlan();
  }

  public static com.google.ads.googleads.v10.resources.KeywordPlan getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordPlan>
      PARSER = new com.google.protobuf.AbstractParser<KeywordPlan>() {
    @java.lang.Override
    public KeywordPlan parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeywordPlan> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordPlan> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.resources.KeywordPlan getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

