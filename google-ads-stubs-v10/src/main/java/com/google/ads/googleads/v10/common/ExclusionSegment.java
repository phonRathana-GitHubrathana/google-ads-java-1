// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/audiences.proto

package com.google.ads.googleads.v10.common;

/**
 * <pre>
 * An audience segment to be excluded from an audience.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.common.ExclusionSegment}
 */
public final class ExclusionSegment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.common.ExclusionSegment)
    ExclusionSegmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExclusionSegment.newBuilder() to construct.
  private ExclusionSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExclusionSegment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExclusionSegment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.common.AudiencesProto.internal_static_google_ads_googleads_v10_common_ExclusionSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.common.AudiencesProto.internal_static_google_ads_googleads_v10_common_ExclusionSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.common.ExclusionSegment.class, com.google.ads.googleads.v10.common.ExclusionSegment.Builder.class);
  }

  private int segmentCase_ = 0;
  private java.lang.Object segment_;
  public enum SegmentCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    USER_LIST(1),
    SEGMENT_NOT_SET(0);
    private final int value;
    private SegmentCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SegmentCase valueOf(int value) {
      return forNumber(value);
    }

    public static SegmentCase forNumber(int value) {
      switch (value) {
        case 1: return USER_LIST;
        case 0: return SEGMENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SegmentCase
  getSegmentCase() {
    return SegmentCase.forNumber(
        segmentCase_);
  }

  public static final int USER_LIST_FIELD_NUMBER = 1;
  /**
   * <pre>
   * User list segment to be excluded.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.UserListSegment user_list = 1;</code>
   * @return Whether the userList field is set.
   */
  @java.lang.Override
  public boolean hasUserList() {
    return segmentCase_ == 1;
  }
  /**
   * <pre>
   * User list segment to be excluded.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.UserListSegment user_list = 1;</code>
   * @return The userList.
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.common.UserListSegment getUserList() {
    if (segmentCase_ == 1) {
       return (com.google.ads.googleads.v10.common.UserListSegment) segment_;
    }
    return com.google.ads.googleads.v10.common.UserListSegment.getDefaultInstance();
  }
  /**
   * <pre>
   * User list segment to be excluded.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.UserListSegment user_list = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.common.UserListSegmentOrBuilder getUserListOrBuilder() {
    if (segmentCase_ == 1) {
       return (com.google.ads.googleads.v10.common.UserListSegment) segment_;
    }
    return com.google.ads.googleads.v10.common.UserListSegment.getDefaultInstance();
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
    if (segmentCase_ == 1) {
      output.writeMessage(1, (com.google.ads.googleads.v10.common.UserListSegment) segment_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (segmentCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.ads.googleads.v10.common.UserListSegment) segment_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.common.ExclusionSegment)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.common.ExclusionSegment other = (com.google.ads.googleads.v10.common.ExclusionSegment) obj;

    if (!getSegmentCase().equals(other.getSegmentCase())) return false;
    switch (segmentCase_) {
      case 1:
        if (!getUserList()
            .equals(other.getUserList())) return false;
        break;
      case 0:
      default:
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
    switch (segmentCase_) {
      case 1:
        hash = (37 * hash) + USER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getUserList().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.common.ExclusionSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.ExclusionSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.ExclusionSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.ExclusionSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.ExclusionSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.ExclusionSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.ExclusionSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.ExclusionSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.ExclusionSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.ExclusionSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.ExclusionSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.ExclusionSegment parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.common.ExclusionSegment prototype) {
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
   * An audience segment to be excluded from an audience.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.common.ExclusionSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.common.ExclusionSegment)
      com.google.ads.googleads.v10.common.ExclusionSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.common.AudiencesProto.internal_static_google_ads_googleads_v10_common_ExclusionSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.common.AudiencesProto.internal_static_google_ads_googleads_v10_common_ExclusionSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.common.ExclusionSegment.class, com.google.ads.googleads.v10.common.ExclusionSegment.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.common.ExclusionSegment.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userListBuilder_ != null) {
        userListBuilder_.clear();
      }
      segmentCase_ = 0;
      segment_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.common.AudiencesProto.internal_static_google_ads_googleads_v10_common_ExclusionSegment_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.ExclusionSegment getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.common.ExclusionSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.ExclusionSegment build() {
      com.google.ads.googleads.v10.common.ExclusionSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.ExclusionSegment buildPartial() {
      com.google.ads.googleads.v10.common.ExclusionSegment result = new com.google.ads.googleads.v10.common.ExclusionSegment(this);
      if (segmentCase_ == 1) {
        if (userListBuilder_ == null) {
          result.segment_ = segment_;
        } else {
          result.segment_ = userListBuilder_.build();
        }
      }
      result.segmentCase_ = segmentCase_;
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
      if (other instanceof com.google.ads.googleads.v10.common.ExclusionSegment) {
        return mergeFrom((com.google.ads.googleads.v10.common.ExclusionSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.common.ExclusionSegment other) {
      if (other == com.google.ads.googleads.v10.common.ExclusionSegment.getDefaultInstance()) return this;
      switch (other.getSegmentCase()) {
        case USER_LIST: {
          mergeUserList(other.getUserList());
          break;
        }
        case SEGMENT_NOT_SET: {
          break;
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
              input.readMessage(
                  getUserListFieldBuilder().getBuilder(),
                  extensionRegistry);
              segmentCase_ = 1;
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
    private int segmentCase_ = 0;
    private java.lang.Object segment_;
    public SegmentCase
        getSegmentCase() {
      return SegmentCase.forNumber(
          segmentCase_);
    }

    public Builder clearSegment() {
      segmentCase_ = 0;
      segment_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.common.UserListSegment, com.google.ads.googleads.v10.common.UserListSegment.Builder, com.google.ads.googleads.v10.common.UserListSegmentOrBuilder> userListBuilder_;
    /**
     * <pre>
     * User list segment to be excluded.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.UserListSegment user_list = 1;</code>
     * @return Whether the userList field is set.
     */
    @java.lang.Override
    public boolean hasUserList() {
      return segmentCase_ == 1;
    }
    /**
     * <pre>
     * User list segment to be excluded.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.UserListSegment user_list = 1;</code>
     * @return The userList.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.common.UserListSegment getUserList() {
      if (userListBuilder_ == null) {
        if (segmentCase_ == 1) {
          return (com.google.ads.googleads.v10.common.UserListSegment) segment_;
        }
        return com.google.ads.googleads.v10.common.UserListSegment.getDefaultInstance();
      } else {
        if (segmentCase_ == 1) {
          return userListBuilder_.getMessage();
        }
        return com.google.ads.googleads.v10.common.UserListSegment.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * User list segment to be excluded.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.UserListSegment user_list = 1;</code>
     */
    public Builder setUserList(com.google.ads.googleads.v10.common.UserListSegment value) {
      if (userListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        segment_ = value;
        onChanged();
      } else {
        userListBuilder_.setMessage(value);
      }
      segmentCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * User list segment to be excluded.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.UserListSegment user_list = 1;</code>
     */
    public Builder setUserList(
        com.google.ads.googleads.v10.common.UserListSegment.Builder builderForValue) {
      if (userListBuilder_ == null) {
        segment_ = builderForValue.build();
        onChanged();
      } else {
        userListBuilder_.setMessage(builderForValue.build());
      }
      segmentCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * User list segment to be excluded.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.UserListSegment user_list = 1;</code>
     */
    public Builder mergeUserList(com.google.ads.googleads.v10.common.UserListSegment value) {
      if (userListBuilder_ == null) {
        if (segmentCase_ == 1 &&
            segment_ != com.google.ads.googleads.v10.common.UserListSegment.getDefaultInstance()) {
          segment_ = com.google.ads.googleads.v10.common.UserListSegment.newBuilder((com.google.ads.googleads.v10.common.UserListSegment) segment_)
              .mergeFrom(value).buildPartial();
        } else {
          segment_ = value;
        }
        onChanged();
      } else {
        if (segmentCase_ == 1) {
          userListBuilder_.mergeFrom(value);
        } else {
          userListBuilder_.setMessage(value);
        }
      }
      segmentCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * User list segment to be excluded.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.UserListSegment user_list = 1;</code>
     */
    public Builder clearUserList() {
      if (userListBuilder_ == null) {
        if (segmentCase_ == 1) {
          segmentCase_ = 0;
          segment_ = null;
          onChanged();
        }
      } else {
        if (segmentCase_ == 1) {
          segmentCase_ = 0;
          segment_ = null;
        }
        userListBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * User list segment to be excluded.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.UserListSegment user_list = 1;</code>
     */
    public com.google.ads.googleads.v10.common.UserListSegment.Builder getUserListBuilder() {
      return getUserListFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * User list segment to be excluded.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.UserListSegment user_list = 1;</code>
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.common.UserListSegmentOrBuilder getUserListOrBuilder() {
      if ((segmentCase_ == 1) && (userListBuilder_ != null)) {
        return userListBuilder_.getMessageOrBuilder();
      } else {
        if (segmentCase_ == 1) {
          return (com.google.ads.googleads.v10.common.UserListSegment) segment_;
        }
        return com.google.ads.googleads.v10.common.UserListSegment.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * User list segment to be excluded.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.UserListSegment user_list = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.common.UserListSegment, com.google.ads.googleads.v10.common.UserListSegment.Builder, com.google.ads.googleads.v10.common.UserListSegmentOrBuilder> 
        getUserListFieldBuilder() {
      if (userListBuilder_ == null) {
        if (!(segmentCase_ == 1)) {
          segment_ = com.google.ads.googleads.v10.common.UserListSegment.getDefaultInstance();
        }
        userListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v10.common.UserListSegment, com.google.ads.googleads.v10.common.UserListSegment.Builder, com.google.ads.googleads.v10.common.UserListSegmentOrBuilder>(
                (com.google.ads.googleads.v10.common.UserListSegment) segment_,
                getParentForChildren(),
                isClean());
        segment_ = null;
      }
      segmentCase_ = 1;
      onChanged();;
      return userListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.common.ExclusionSegment)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.common.ExclusionSegment)
  private static final com.google.ads.googleads.v10.common.ExclusionSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.common.ExclusionSegment();
  }

  public static com.google.ads.googleads.v10.common.ExclusionSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExclusionSegment>
      PARSER = new com.google.protobuf.AbstractParser<ExclusionSegment>() {
    @java.lang.Override
    public ExclusionSegment parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExclusionSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExclusionSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.common.ExclusionSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

