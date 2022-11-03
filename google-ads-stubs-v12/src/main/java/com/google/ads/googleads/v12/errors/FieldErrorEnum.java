// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/errors/field_error.proto

package com.google.ads.googleads.v12.errors;

/**
 * <pre>
 * Container for enum describing possible field errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.errors.FieldErrorEnum}
 */
public final class FieldErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.errors.FieldErrorEnum)
    FieldErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FieldErrorEnum.newBuilder() to construct.
  private FieldErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FieldErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FieldErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.errors.FieldErrorProto.internal_static_google_ads_googleads_v12_errors_FieldErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.errors.FieldErrorProto.internal_static_google_ads_googleads_v12_errors_FieldErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.errors.FieldErrorEnum.class, com.google.ads.googleads.v12.errors.FieldErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible field errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v12.errors.FieldErrorEnum.FieldError}
   */
  public enum FieldError
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
     * The required field was not present.
     * </pre>
     *
     * <code>REQUIRED = 2;</code>
     */
    REQUIRED(2),
    /**
     * <pre>
     * The field attempted to be mutated is immutable.
     * </pre>
     *
     * <code>IMMUTABLE_FIELD = 3;</code>
     */
    IMMUTABLE_FIELD(3),
    /**
     * <pre>
     * The field's value is invalid.
     * </pre>
     *
     * <code>INVALID_VALUE = 4;</code>
     */
    INVALID_VALUE(4),
    /**
     * <pre>
     * The field cannot be set.
     * </pre>
     *
     * <code>VALUE_MUST_BE_UNSET = 5;</code>
     */
    VALUE_MUST_BE_UNSET(5),
    /**
     * <pre>
     * The required repeated field was empty.
     * </pre>
     *
     * <code>REQUIRED_NONEMPTY_LIST = 6;</code>
     */
    REQUIRED_NONEMPTY_LIST(6),
    /**
     * <pre>
     * The field cannot be cleared.
     * </pre>
     *
     * <code>FIELD_CANNOT_BE_CLEARED = 7;</code>
     */
    FIELD_CANNOT_BE_CLEARED(7),
    /**
     * <pre>
     * The field's value is on a deny-list for this field.
     * </pre>
     *
     * <code>BLOCKED_VALUE = 9;</code>
     */
    BLOCKED_VALUE(9),
    /**
     * <pre>
     * The field's value cannot be modified, except for clearing.
     * </pre>
     *
     * <code>FIELD_CAN_ONLY_BE_CLEARED = 10;</code>
     */
    FIELD_CAN_ONLY_BE_CLEARED(10),
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
     * The required field was not present.
     * </pre>
     *
     * <code>REQUIRED = 2;</code>
     */
    public static final int REQUIRED_VALUE = 2;
    /**
     * <pre>
     * The field attempted to be mutated is immutable.
     * </pre>
     *
     * <code>IMMUTABLE_FIELD = 3;</code>
     */
    public static final int IMMUTABLE_FIELD_VALUE = 3;
    /**
     * <pre>
     * The field's value is invalid.
     * </pre>
     *
     * <code>INVALID_VALUE = 4;</code>
     */
    public static final int INVALID_VALUE_VALUE = 4;
    /**
     * <pre>
     * The field cannot be set.
     * </pre>
     *
     * <code>VALUE_MUST_BE_UNSET = 5;</code>
     */
    public static final int VALUE_MUST_BE_UNSET_VALUE = 5;
    /**
     * <pre>
     * The required repeated field was empty.
     * </pre>
     *
     * <code>REQUIRED_NONEMPTY_LIST = 6;</code>
     */
    public static final int REQUIRED_NONEMPTY_LIST_VALUE = 6;
    /**
     * <pre>
     * The field cannot be cleared.
     * </pre>
     *
     * <code>FIELD_CANNOT_BE_CLEARED = 7;</code>
     */
    public static final int FIELD_CANNOT_BE_CLEARED_VALUE = 7;
    /**
     * <pre>
     * The field's value is on a deny-list for this field.
     * </pre>
     *
     * <code>BLOCKED_VALUE = 9;</code>
     */
    public static final int BLOCKED_VALUE_VALUE = 9;
    /**
     * <pre>
     * The field's value cannot be modified, except for clearing.
     * </pre>
     *
     * <code>FIELD_CAN_ONLY_BE_CLEARED = 10;</code>
     */
    public static final int FIELD_CAN_ONLY_BE_CLEARED_VALUE = 10;


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
    public static FieldError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FieldError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return REQUIRED;
        case 3: return IMMUTABLE_FIELD;
        case 4: return INVALID_VALUE;
        case 5: return VALUE_MUST_BE_UNSET;
        case 6: return REQUIRED_NONEMPTY_LIST;
        case 7: return FIELD_CANNOT_BE_CLEARED;
        case 9: return BLOCKED_VALUE;
        case 10: return FIELD_CAN_ONLY_BE_CLEARED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FieldError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FieldError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FieldError>() {
            public FieldError findValueByNumber(int number) {
              return FieldError.forNumber(number);
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
      return com.google.ads.googleads.v12.errors.FieldErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final FieldError[] VALUES = values();

    public static FieldError valueOf(
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

    private FieldError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v12.errors.FieldErrorEnum.FieldError)
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
    if (!(obj instanceof com.google.ads.googleads.v12.errors.FieldErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.errors.FieldErrorEnum other = (com.google.ads.googleads.v12.errors.FieldErrorEnum) obj;

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

  public static com.google.ads.googleads.v12.errors.FieldErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.FieldErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.FieldErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.FieldErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.FieldErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.FieldErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.FieldErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.FieldErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.FieldErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.FieldErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.FieldErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.FieldErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.errors.FieldErrorEnum prototype) {
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
   * Container for enum describing possible field errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.errors.FieldErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.errors.FieldErrorEnum)
      com.google.ads.googleads.v12.errors.FieldErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.errors.FieldErrorProto.internal_static_google_ads_googleads_v12_errors_FieldErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.errors.FieldErrorProto.internal_static_google_ads_googleads_v12_errors_FieldErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.errors.FieldErrorEnum.class, com.google.ads.googleads.v12.errors.FieldErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.errors.FieldErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v12.errors.FieldErrorProto.internal_static_google_ads_googleads_v12_errors_FieldErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.FieldErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.errors.FieldErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.FieldErrorEnum build() {
      com.google.ads.googleads.v12.errors.FieldErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.FieldErrorEnum buildPartial() {
      com.google.ads.googleads.v12.errors.FieldErrorEnum result = new com.google.ads.googleads.v12.errors.FieldErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v12.errors.FieldErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v12.errors.FieldErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.errors.FieldErrorEnum other) {
      if (other == com.google.ads.googleads.v12.errors.FieldErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.errors.FieldErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.errors.FieldErrorEnum)
  private static final com.google.ads.googleads.v12.errors.FieldErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.errors.FieldErrorEnum();
  }

  public static com.google.ads.googleads.v12.errors.FieldErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FieldErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<FieldErrorEnum>() {
    @java.lang.Override
    public FieldErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<FieldErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FieldErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.errors.FieldErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

