// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/enums/campaign_draft_status.proto

package com.google.ads.googleads.v10.enums;

/**
 * <pre>
 * Container for enum describing possible statuses of a campaign draft.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.enums.CampaignDraftStatusEnum}
 */
public final class CampaignDraftStatusEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.enums.CampaignDraftStatusEnum)
    CampaignDraftStatusEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignDraftStatusEnum.newBuilder() to construct.
  private CampaignDraftStatusEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignDraftStatusEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampaignDraftStatusEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.enums.CampaignDraftStatusProto.internal_static_google_ads_googleads_v10_enums_CampaignDraftStatusEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.enums.CampaignDraftStatusProto.internal_static_google_ads_googleads_v10_enums_CampaignDraftStatusEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum.class, com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible statuses of a campaign draft.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v10.enums.CampaignDraftStatusEnum.CampaignDraftStatus}
   */
  public enum CampaignDraftStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The status has not been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Initial state of the draft, the advertiser can start adding changes with
     * no effect on serving.
     * </pre>
     *
     * <code>PROPOSED = 2;</code>
     */
    PROPOSED(2),
    /**
     * <pre>
     * The campaign draft is removed.
     * </pre>
     *
     * <code>REMOVED = 3;</code>
     */
    REMOVED(3),
    /**
     * <pre>
     * Advertiser requested to promote draft's changes back into the original
     * campaign. Advertiser can poll the long running operation returned by
     * the promote action to see the status of the promotion.
     * </pre>
     *
     * <code>PROMOTING = 5;</code>
     */
    PROMOTING(5),
    /**
     * <pre>
     * The process to merge changes in the draft back to the original campaign
     * has completed successfully.
     * </pre>
     *
     * <code>PROMOTED = 4;</code>
     */
    PROMOTED(4),
    /**
     * <pre>
     * The promotion failed after it was partially applied. Promote cannot be
     * attempted again safely, so the issue must be corrected in the original
     * campaign.
     * </pre>
     *
     * <code>PROMOTE_FAILED = 6;</code>
     */
    PROMOTE_FAILED(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The status has not been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Initial state of the draft, the advertiser can start adding changes with
     * no effect on serving.
     * </pre>
     *
     * <code>PROPOSED = 2;</code>
     */
    public static final int PROPOSED_VALUE = 2;
    /**
     * <pre>
     * The campaign draft is removed.
     * </pre>
     *
     * <code>REMOVED = 3;</code>
     */
    public static final int REMOVED_VALUE = 3;
    /**
     * <pre>
     * Advertiser requested to promote draft's changes back into the original
     * campaign. Advertiser can poll the long running operation returned by
     * the promote action to see the status of the promotion.
     * </pre>
     *
     * <code>PROMOTING = 5;</code>
     */
    public static final int PROMOTING_VALUE = 5;
    /**
     * <pre>
     * The process to merge changes in the draft back to the original campaign
     * has completed successfully.
     * </pre>
     *
     * <code>PROMOTED = 4;</code>
     */
    public static final int PROMOTED_VALUE = 4;
    /**
     * <pre>
     * The promotion failed after it was partially applied. Promote cannot be
     * attempted again safely, so the issue must be corrected in the original
     * campaign.
     * </pre>
     *
     * <code>PROMOTE_FAILED = 6;</code>
     */
    public static final int PROMOTE_FAILED_VALUE = 6;


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
    public static CampaignDraftStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CampaignDraftStatus forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return PROPOSED;
        case 3: return REMOVED;
        case 5: return PROMOTING;
        case 4: return PROMOTED;
        case 6: return PROMOTE_FAILED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CampaignDraftStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CampaignDraftStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CampaignDraftStatus>() {
            public CampaignDraftStatus findValueByNumber(int number) {
              return CampaignDraftStatus.forNumber(number);
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
      return com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CampaignDraftStatus[] VALUES = values();

    public static CampaignDraftStatus valueOf(
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

    private CampaignDraftStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v10.enums.CampaignDraftStatusEnum.CampaignDraftStatus)
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
    if (!(obj instanceof com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum other = (com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum) obj;

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

  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum prototype) {
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
   * Container for enum describing possible statuses of a campaign draft.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.enums.CampaignDraftStatusEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.enums.CampaignDraftStatusEnum)
      com.google.ads.googleads.v10.enums.CampaignDraftStatusEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.enums.CampaignDraftStatusProto.internal_static_google_ads_googleads_v10_enums_CampaignDraftStatusEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.enums.CampaignDraftStatusProto.internal_static_google_ads_googleads_v10_enums_CampaignDraftStatusEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum.class, com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum.newBuilder()
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
      return com.google.ads.googleads.v10.enums.CampaignDraftStatusProto.internal_static_google_ads_googleads_v10_enums_CampaignDraftStatusEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum build() {
      com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum buildPartial() {
      com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum result = new com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum(this);
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
      if (other instanceof com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum) {
        return mergeFrom((com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum other) {
      if (other == com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.enums.CampaignDraftStatusEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.enums.CampaignDraftStatusEnum)
  private static final com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum();
  }

  public static com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignDraftStatusEnum>
      PARSER = new com.google.protobuf.AbstractParser<CampaignDraftStatusEnum>() {
    @java.lang.Override
    public CampaignDraftStatusEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampaignDraftStatusEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignDraftStatusEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.enums.CampaignDraftStatusEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

