// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/lead_form_submission_data.proto

package com.google.ads.googleads.v10.resources;

/**
 * <pre>
 * Fields in the submitted lead form.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.resources.LeadFormSubmissionField}
 */
public final class LeadFormSubmissionField extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.resources.LeadFormSubmissionField)
    LeadFormSubmissionFieldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LeadFormSubmissionField.newBuilder() to construct.
  private LeadFormSubmissionField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeadFormSubmissionField() {
    fieldType_ = 0;
    fieldValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LeadFormSubmissionField();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.resources.LeadFormSubmissionDataProto.internal_static_google_ads_googleads_v10_resources_LeadFormSubmissionField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.resources.LeadFormSubmissionDataProto.internal_static_google_ads_googleads_v10_resources_LeadFormSubmissionField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.resources.LeadFormSubmissionField.class, com.google.ads.googleads.v10.resources.LeadFormSubmissionField.Builder.class);
  }

  public static final int FIELD_TYPE_FIELD_NUMBER = 1;
  private int fieldType_;
  /**
   * <pre>
   * Output only. Field type for lead form fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for fieldType.
   */
  @java.lang.Override public int getFieldTypeValue() {
    return fieldType_;
  }
  /**
   * <pre>
   * Output only. Field type for lead form fields.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fieldType.
   */
  @java.lang.Override public com.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType getFieldType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType result = com.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType.valueOf(fieldType_);
    return result == null ? com.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType.UNRECOGNIZED : result;
  }

  public static final int FIELD_VALUE_FIELD_NUMBER = 2;
  private volatile java.lang.Object fieldValue_;
  /**
   * <pre>
   * Output only. Field value for lead form fields.
   * </pre>
   *
   * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fieldValue.
   */
  @java.lang.Override
  public java.lang.String getFieldValue() {
    java.lang.Object ref = fieldValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldValue_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Field value for lead form fields.
   * </pre>
   *
   * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for fieldValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldValueBytes() {
    java.lang.Object ref = fieldValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldValue_ = b;
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
    if (fieldType_ != com.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, fieldType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fieldValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fieldType_ != com.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, fieldType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fieldValue_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.resources.LeadFormSubmissionField)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.resources.LeadFormSubmissionField other = (com.google.ads.googleads.v10.resources.LeadFormSubmissionField) obj;

    if (fieldType_ != other.fieldType_) return false;
    if (!getFieldValue()
        .equals(other.getFieldValue())) return false;
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
    hash = (37 * hash) + FIELD_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + fieldType_;
    hash = (37 * hash) + FIELD_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getFieldValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.resources.LeadFormSubmissionField prototype) {
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
   * Fields in the submitted lead form.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.resources.LeadFormSubmissionField}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.resources.LeadFormSubmissionField)
      com.google.ads.googleads.v10.resources.LeadFormSubmissionFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.resources.LeadFormSubmissionDataProto.internal_static_google_ads_googleads_v10_resources_LeadFormSubmissionField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.resources.LeadFormSubmissionDataProto.internal_static_google_ads_googleads_v10_resources_LeadFormSubmissionField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.resources.LeadFormSubmissionField.class, com.google.ads.googleads.v10.resources.LeadFormSubmissionField.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.resources.LeadFormSubmissionField.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      fieldType_ = 0;

      fieldValue_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.resources.LeadFormSubmissionDataProto.internal_static_google_ads_googleads_v10_resources_LeadFormSubmissionField_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.LeadFormSubmissionField getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.resources.LeadFormSubmissionField.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.LeadFormSubmissionField build() {
      com.google.ads.googleads.v10.resources.LeadFormSubmissionField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.LeadFormSubmissionField buildPartial() {
      com.google.ads.googleads.v10.resources.LeadFormSubmissionField result = new com.google.ads.googleads.v10.resources.LeadFormSubmissionField(this);
      result.fieldType_ = fieldType_;
      result.fieldValue_ = fieldValue_;
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
      if (other instanceof com.google.ads.googleads.v10.resources.LeadFormSubmissionField) {
        return mergeFrom((com.google.ads.googleads.v10.resources.LeadFormSubmissionField)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.resources.LeadFormSubmissionField other) {
      if (other == com.google.ads.googleads.v10.resources.LeadFormSubmissionField.getDefaultInstance()) return this;
      if (other.fieldType_ != 0) {
        setFieldTypeValue(other.getFieldTypeValue());
      }
      if (!other.getFieldValue().isEmpty()) {
        fieldValue_ = other.fieldValue_;
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
            case 8: {
              fieldType_ = input.readEnum();

              break;
            } // case 8
            case 18: {
              fieldValue_ = input.readStringRequireUtf8();

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

    private int fieldType_ = 0;
    /**
     * <pre>
     * Output only. Field type for lead form fields.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for fieldType.
     */
    @java.lang.Override public int getFieldTypeValue() {
      return fieldType_;
    }
    /**
     * <pre>
     * Output only. Field type for lead form fields.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for fieldType to set.
     * @return This builder for chaining.
     */
    public Builder setFieldTypeValue(int value) {
      
      fieldType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Field type for lead form fields.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The fieldType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType getFieldType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType result = com.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType.valueOf(fieldType_);
      return result == null ? com.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. Field type for lead form fields.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The fieldType to set.
     * @return This builder for chaining.
     */
    public Builder setFieldType(com.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      fieldType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Field type for lead form fields.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldType() {
      
      fieldType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fieldValue_ = "";
    /**
     * <pre>
     * Output only. Field value for lead form fields.
     * </pre>
     *
     * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The fieldValue.
     */
    public java.lang.String getFieldValue() {
      java.lang.Object ref = fieldValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Field value for lead form fields.
     * </pre>
     *
     * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for fieldValue.
     */
    public com.google.protobuf.ByteString
        getFieldValueBytes() {
      java.lang.Object ref = fieldValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Field value for lead form fields.
     * </pre>
     *
     * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The fieldValue to set.
     * @return This builder for chaining.
     */
    public Builder setFieldValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fieldValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Field value for lead form fields.
     * </pre>
     *
     * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldValue() {
      
      fieldValue_ = getDefaultInstance().getFieldValue();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Field value for lead form fields.
     * </pre>
     *
     * <code>string field_value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for fieldValue to set.
     * @return This builder for chaining.
     */
    public Builder setFieldValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fieldValue_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.resources.LeadFormSubmissionField)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.resources.LeadFormSubmissionField)
  private static final com.google.ads.googleads.v10.resources.LeadFormSubmissionField DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.resources.LeadFormSubmissionField();
  }

  public static com.google.ads.googleads.v10.resources.LeadFormSubmissionField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeadFormSubmissionField>
      PARSER = new com.google.protobuf.AbstractParser<LeadFormSubmissionField>() {
    @java.lang.Override
    public LeadFormSubmissionField parsePartialFrom(
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

  public static com.google.protobuf.Parser<LeadFormSubmissionField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeadFormSubmissionField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.resources.LeadFormSubmissionField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

