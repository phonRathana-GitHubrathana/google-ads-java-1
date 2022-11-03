// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/conversion_upload_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * A custom variable.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.CustomVariable}
 */
public final class CustomVariable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.CustomVariable)
    CustomVariableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomVariable.newBuilder() to construct.
  private CustomVariable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomVariable() {
    conversionCustomVariable_ = "";
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomVariable();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v10_services_CustomVariable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v10_services_CustomVariable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.CustomVariable.class, com.google.ads.googleads.v10.services.CustomVariable.Builder.class);
  }

  public static final int CONVERSION_CUSTOM_VARIABLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object conversionCustomVariable_;
  /**
   * <pre>
   * Resource name of the custom variable associated with this conversion.
   * Note: Although this resource name consists of a customer id and a
   * conversion custom variable id, validation will ignore the customer id and
   * use the conversion custom variable id as the sole identifier of the
   * conversion custom variable.
   * </pre>
   *
   * <code>string conversion_custom_variable = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The conversionCustomVariable.
   */
  @java.lang.Override
  public java.lang.String getConversionCustomVariable() {
    java.lang.Object ref = conversionCustomVariable_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      conversionCustomVariable_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource name of the custom variable associated with this conversion.
   * Note: Although this resource name consists of a customer id and a
   * conversion custom variable id, validation will ignore the customer id and
   * use the conversion custom variable id as the sole identifier of the
   * conversion custom variable.
   * </pre>
   *
   * <code>string conversion_custom_variable = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for conversionCustomVariable.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConversionCustomVariableBytes() {
    java.lang.Object ref = conversionCustomVariable_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      conversionCustomVariable_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private volatile java.lang.Object value_;
  /**
   * <pre>
   * The value string of this custom variable.
   * The value of the custom variable should not contain private customer data,
   * such as email addresses or phone numbers.
   * </pre>
   *
   * <code>string value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The value string of this custom variable.
   * The value of the custom variable should not contain private customer data,
   * such as email addresses or phone numbers.
   * </pre>
   *
   * <code>string value = 2;</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversionCustomVariable_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, conversionCustomVariable_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversionCustomVariable_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, conversionCustomVariable_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.services.CustomVariable)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.CustomVariable other = (com.google.ads.googleads.v10.services.CustomVariable) obj;

    if (!getConversionCustomVariable()
        .equals(other.getConversionCustomVariable())) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
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
    hash = (37 * hash) + CONVERSION_CUSTOM_VARIABLE_FIELD_NUMBER;
    hash = (53 * hash) + getConversionCustomVariable().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.CustomVariable parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.CustomVariable parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.CustomVariable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.CustomVariable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.CustomVariable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.CustomVariable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.CustomVariable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.CustomVariable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.CustomVariable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.CustomVariable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.CustomVariable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.CustomVariable parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.CustomVariable prototype) {
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
   * A custom variable.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.CustomVariable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.CustomVariable)
      com.google.ads.googleads.v10.services.CustomVariableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v10_services_CustomVariable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v10_services_CustomVariable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.CustomVariable.class, com.google.ads.googleads.v10.services.CustomVariable.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.CustomVariable.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      conversionCustomVariable_ = "";

      value_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v10_services_CustomVariable_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.CustomVariable getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.CustomVariable.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.CustomVariable build() {
      com.google.ads.googleads.v10.services.CustomVariable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.CustomVariable buildPartial() {
      com.google.ads.googleads.v10.services.CustomVariable result = new com.google.ads.googleads.v10.services.CustomVariable(this);
      result.conversionCustomVariable_ = conversionCustomVariable_;
      result.value_ = value_;
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
      if (other instanceof com.google.ads.googleads.v10.services.CustomVariable) {
        return mergeFrom((com.google.ads.googleads.v10.services.CustomVariable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.CustomVariable other) {
      if (other == com.google.ads.googleads.v10.services.CustomVariable.getDefaultInstance()) return this;
      if (!other.getConversionCustomVariable().isEmpty()) {
        conversionCustomVariable_ = other.conversionCustomVariable_;
        onChanged();
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        onChanged();
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
              conversionCustomVariable_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              value_ = input.readStringRequireUtf8();

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

    private java.lang.Object conversionCustomVariable_ = "";
    /**
     * <pre>
     * Resource name of the custom variable associated with this conversion.
     * Note: Although this resource name consists of a customer id and a
     * conversion custom variable id, validation will ignore the customer id and
     * use the conversion custom variable id as the sole identifier of the
     * conversion custom variable.
     * </pre>
     *
     * <code>string conversion_custom_variable = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The conversionCustomVariable.
     */
    public java.lang.String getConversionCustomVariable() {
      java.lang.Object ref = conversionCustomVariable_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        conversionCustomVariable_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource name of the custom variable associated with this conversion.
     * Note: Although this resource name consists of a customer id and a
     * conversion custom variable id, validation will ignore the customer id and
     * use the conversion custom variable id as the sole identifier of the
     * conversion custom variable.
     * </pre>
     *
     * <code>string conversion_custom_variable = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for conversionCustomVariable.
     */
    public com.google.protobuf.ByteString
        getConversionCustomVariableBytes() {
      java.lang.Object ref = conversionCustomVariable_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        conversionCustomVariable_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource name of the custom variable associated with this conversion.
     * Note: Although this resource name consists of a customer id and a
     * conversion custom variable id, validation will ignore the customer id and
     * use the conversion custom variable id as the sole identifier of the
     * conversion custom variable.
     * </pre>
     *
     * <code>string conversion_custom_variable = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The conversionCustomVariable to set.
     * @return This builder for chaining.
     */
    public Builder setConversionCustomVariable(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      conversionCustomVariable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of the custom variable associated with this conversion.
     * Note: Although this resource name consists of a customer id and a
     * conversion custom variable id, validation will ignore the customer id and
     * use the conversion custom variable id as the sole identifier of the
     * conversion custom variable.
     * </pre>
     *
     * <code>string conversion_custom_variable = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearConversionCustomVariable() {
      
      conversionCustomVariable_ = getDefaultInstance().getConversionCustomVariable();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of the custom variable associated with this conversion.
     * Note: Although this resource name consists of a customer id and a
     * conversion custom variable id, validation will ignore the customer id and
     * use the conversion custom variable id as the sole identifier of the
     * conversion custom variable.
     * </pre>
     *
     * <code>string conversion_custom_variable = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for conversionCustomVariable to set.
     * @return This builder for chaining.
     */
    public Builder setConversionCustomVariableBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      conversionCustomVariable_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <pre>
     * The value string of this custom variable.
     * The value of the custom variable should not contain private customer data,
     * such as email addresses or phone numbers.
     * </pre>
     *
     * <code>string value = 2;</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The value string of this custom variable.
     * The value of the custom variable should not contain private customer data,
     * such as email addresses or phone numbers.
     * </pre>
     *
     * <code>string value = 2;</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The value string of this custom variable.
     * The value of the custom variable should not contain private customer data,
     * such as email addresses or phone numbers.
     * </pre>
     *
     * <code>string value = 2;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value string of this custom variable.
     * The value of the custom variable should not contain private customer data,
     * such as email addresses or phone numbers.
     * </pre>
     *
     * <code>string value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value string of this custom variable.
     * The value of the custom variable should not contain private customer data,
     * such as email addresses or phone numbers.
     * </pre>
     *
     * <code>string value = 2;</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      value_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.CustomVariable)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.CustomVariable)
  private static final com.google.ads.googleads.v10.services.CustomVariable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.CustomVariable();
  }

  public static com.google.ads.googleads.v10.services.CustomVariable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomVariable>
      PARSER = new com.google.protobuf.AbstractParser<CustomVariable>() {
    @java.lang.Override
    public CustomVariable parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomVariable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomVariable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.CustomVariable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

