// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/customizer_attribute.proto

package com.google.ads.googleads.v10.resources;

/**
 * <pre>
 * A customizer attribute.
 * Use CustomerCustomizer, CampaignCustomizer, AdGroupCustomizer, or
 * AdGroupCriterionCustomizer to associate a customizer attribute and
 * set its value at the customer, campaign, ad group, or ad group criterion
 * level, respectively.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.resources.CustomizerAttribute}
 */
public final class CustomizerAttribute extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.resources.CustomizerAttribute)
    CustomizerAttributeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomizerAttribute.newBuilder() to construct.
  private CustomizerAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomizerAttribute() {
    resourceName_ = "";
    name_ = "";
    type_ = 0;
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomizerAttribute();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.resources.CustomizerAttributeProto.internal_static_google_ads_googleads_v10_resources_CustomizerAttribute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.resources.CustomizerAttributeProto.internal_static_google_ads_googleads_v10_resources_CustomizerAttribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.resources.CustomizerAttribute.class, com.google.ads.googleads.v10.resources.CustomizerAttribute.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Immutable. The resource name of the customizer attribute.
   * Customizer Attribute resource names have the form:
   * `customers/{customer_id}/customizerAttributes/{customizer_attribute_id}`
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
   * Immutable. The resource name of the customizer attribute.
   * Customizer Attribute resource names have the form:
   * `customers/{customer_id}/customizerAttributes/{customizer_attribute_id}`
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

  public static final int ID_FIELD_NUMBER = 2;
  private long id_;
  /**
   * <pre>
   * Output only. The ID of the customizer attribute.
   * </pre>
   *
   * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. Immutable. Name of the customizer attribute. Required. It must have a minimum length
   * of 1 and maximum length of 40. Name of an enabled customizer attribute must
   * be unique (case insensitive).
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
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
   * Required. Immutable. Name of the customizer attribute. Required. It must have a minimum length
   * of 1 and maximum length of 40. Name of an enabled customizer attribute must
   * be unique (case insensitive).
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
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

  public static final int TYPE_FIELD_NUMBER = 4;
  private int type_;
  /**
   * <pre>
   * Immutable. The type of the customizer attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Immutable. The type of the customizer attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The type.
   */
  @java.lang.Override public com.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType getType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType result = com.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType.valueOf(type_);
    return result == null ? com.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType.UNRECOGNIZED : result;
  }

  public static final int STATUS_FIELD_NUMBER = 5;
  private int status_;
  /**
   * <pre>
   * Output only. The status of the customizer attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * Output only. The status of the customizer attribute.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  @java.lang.Override public com.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus getStatus() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus result = com.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus.valueOf(status_);
    return result == null ? com.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus.UNRECOGNIZED : result;
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
    if (id_ != 0L) {
      output.writeInt64(2, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (type_ != com.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType.UNSPECIFIED.getNumber()) {
      output.writeEnum(4, type_);
    }
    if (status_ != com.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus.UNSPECIFIED.getNumber()) {
      output.writeEnum(5, status_);
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
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (type_ != com.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, type_);
    }
    if (status_ != com.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, status_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.resources.CustomizerAttribute)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.resources.CustomizerAttribute other = (com.google.ads.googleads.v10.resources.CustomizerAttribute) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (getId()
        != other.getId()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (type_ != other.type_) return false;
    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.resources.CustomizerAttribute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.CustomizerAttribute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.CustomizerAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.CustomizerAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.CustomizerAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.CustomizerAttribute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.CustomizerAttribute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.CustomizerAttribute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.CustomizerAttribute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.CustomizerAttribute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.CustomizerAttribute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.CustomizerAttribute parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.resources.CustomizerAttribute prototype) {
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
   * A customizer attribute.
   * Use CustomerCustomizer, CampaignCustomizer, AdGroupCustomizer, or
   * AdGroupCriterionCustomizer to associate a customizer attribute and
   * set its value at the customer, campaign, ad group, or ad group criterion
   * level, respectively.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.resources.CustomizerAttribute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.resources.CustomizerAttribute)
      com.google.ads.googleads.v10.resources.CustomizerAttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.resources.CustomizerAttributeProto.internal_static_google_ads_googleads_v10_resources_CustomizerAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.resources.CustomizerAttributeProto.internal_static_google_ads_googleads_v10_resources_CustomizerAttribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.resources.CustomizerAttribute.class, com.google.ads.googleads.v10.resources.CustomizerAttribute.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.resources.CustomizerAttribute.newBuilder()
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

      name_ = "";

      type_ = 0;

      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.resources.CustomizerAttributeProto.internal_static_google_ads_googleads_v10_resources_CustomizerAttribute_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.CustomizerAttribute getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.resources.CustomizerAttribute.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.CustomizerAttribute build() {
      com.google.ads.googleads.v10.resources.CustomizerAttribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.CustomizerAttribute buildPartial() {
      com.google.ads.googleads.v10.resources.CustomizerAttribute result = new com.google.ads.googleads.v10.resources.CustomizerAttribute(this);
      result.resourceName_ = resourceName_;
      result.id_ = id_;
      result.name_ = name_;
      result.type_ = type_;
      result.status_ = status_;
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
      if (other instanceof com.google.ads.googleads.v10.resources.CustomizerAttribute) {
        return mergeFrom((com.google.ads.googleads.v10.resources.CustomizerAttribute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.resources.CustomizerAttribute other) {
      if (other == com.google.ads.googleads.v10.resources.CustomizerAttribute.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
            case 16: {
              id_ = input.readInt64();

              break;
            } // case 16
            case 26: {
              name_ = input.readStringRequireUtf8();

              break;
            } // case 26
            case 32: {
              type_ = input.readEnum();

              break;
            } // case 32
            case 40: {
              status_ = input.readEnum();

              break;
            } // case 40
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Immutable. The resource name of the customizer attribute.
     * Customizer Attribute resource names have the form:
     * `customers/{customer_id}/customizerAttributes/{customizer_attribute_id}`
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
     * Immutable. The resource name of the customizer attribute.
     * Customizer Attribute resource names have the form:
     * `customers/{customer_id}/customizerAttributes/{customizer_attribute_id}`
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
     * Immutable. The resource name of the customizer attribute.
     * Customizer Attribute resource names have the form:
     * `customers/{customer_id}/customizerAttributes/{customizer_attribute_id}`
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
     * Immutable. The resource name of the customizer attribute.
     * Customizer Attribute resource names have the form:
     * `customers/{customer_id}/customizerAttributes/{customizer_attribute_id}`
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
     * Immutable. The resource name of the customizer attribute.
     * Customizer Attribute resource names have the form:
     * `customers/{customer_id}/customizerAttributes/{customizer_attribute_id}`
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
     * Output only. The ID of the customizer attribute.
     * </pre>
     *
     * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * Output only. The ID of the customizer attribute.
     * </pre>
     *
     * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The ID of the customizer attribute.
     * </pre>
     *
     * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. Immutable. Name of the customizer attribute. Required. It must have a minimum length
     * of 1 and maximum length of 40. Name of an enabled customizer attribute must
     * be unique (case insensitive).
     * </pre>
     *
     * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
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
     * Required. Immutable. Name of the customizer attribute. Required. It must have a minimum length
     * of 1 and maximum length of 40. Name of an enabled customizer attribute must
     * be unique (case insensitive).
     * </pre>
     *
     * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
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
     * Required. Immutable. Name of the customizer attribute. Required. It must have a minimum length
     * of 1 and maximum length of 40. Name of an enabled customizer attribute must
     * be unique (case insensitive).
     * </pre>
     *
     * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Immutable. Name of the customizer attribute. Required. It must have a minimum length
     * of 1 and maximum length of 40. Name of an enabled customizer attribute must
     * be unique (case insensitive).
     * </pre>
     *
     * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Immutable. Name of the customizer attribute. Required. It must have a minimum length
     * of 1 and maximum length of 40. Name of an enabled customizer attribute must
     * be unique (case insensitive).
     * </pre>
     *
     * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Immutable. The type of the customizer attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Immutable. The type of the customizer attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The type of the customizer attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType getType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType result = com.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType.valueOf(type_);
      return result == null ? com.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Immutable. The type of the customizer attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The type of the customizer attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Output only. The status of the customizer attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Output only. The status of the customizer attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The status of the customizer attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The status.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus getStatus() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus result = com.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus.valueOf(status_);
      return result == null ? com.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. The status of the customizer attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The status of the customizer attribute.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.CustomizerAttributeStatusEnum.CustomizerAttributeStatus status = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.resources.CustomizerAttribute)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.resources.CustomizerAttribute)
  private static final com.google.ads.googleads.v10.resources.CustomizerAttribute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.resources.CustomizerAttribute();
  }

  public static com.google.ads.googleads.v10.resources.CustomizerAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomizerAttribute>
      PARSER = new com.google.protobuf.AbstractParser<CustomizerAttribute>() {
    @java.lang.Override
    public CustomizerAttribute parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomizerAttribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomizerAttribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.resources.CustomizerAttribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

