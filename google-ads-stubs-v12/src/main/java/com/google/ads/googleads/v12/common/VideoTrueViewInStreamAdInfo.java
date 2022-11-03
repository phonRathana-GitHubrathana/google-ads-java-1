// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/ad_type_infos.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * Representation of video TrueView in-stream ad format (ad shown during video
 * playback, often at beginning, which displays a skip button a few seconds into
 * the video).
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo}
 */
public final class VideoTrueViewInStreamAdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo)
    VideoTrueViewInStreamAdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoTrueViewInStreamAdInfo.newBuilder() to construct.
  private VideoTrueViewInStreamAdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoTrueViewInStreamAdInfo() {
    actionButtonLabel_ = "";
    actionHeadline_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VideoTrueViewInStreamAdInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_VideoTrueViewInStreamAdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_VideoTrueViewInStreamAdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo.class, com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo.Builder.class);
  }

  public static final int ACTION_BUTTON_LABEL_FIELD_NUMBER = 4;
  private volatile java.lang.Object actionButtonLabel_;
  /**
   * <pre>
   * Label on the CTA (call-to-action) button taking the user to the video ad's
   * final URL.
   * Required for TrueView for action campaigns, optional otherwise.
   * </pre>
   *
   * <code>string action_button_label = 4;</code>
   * @return The actionButtonLabel.
   */
  @java.lang.Override
  public java.lang.String getActionButtonLabel() {
    java.lang.Object ref = actionButtonLabel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      actionButtonLabel_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Label on the CTA (call-to-action) button taking the user to the video ad's
   * final URL.
   * Required for TrueView for action campaigns, optional otherwise.
   * </pre>
   *
   * <code>string action_button_label = 4;</code>
   * @return The bytes for actionButtonLabel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActionButtonLabelBytes() {
    java.lang.Object ref = actionButtonLabel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      actionButtonLabel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_HEADLINE_FIELD_NUMBER = 5;
  private volatile java.lang.Object actionHeadline_;
  /**
   * <pre>
   * Additional text displayed with the CTA (call-to-action) button to give
   * context and encourage clicking on the button.
   * </pre>
   *
   * <code>string action_headline = 5;</code>
   * @return The actionHeadline.
   */
  @java.lang.Override
  public java.lang.String getActionHeadline() {
    java.lang.Object ref = actionHeadline_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      actionHeadline_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Additional text displayed with the CTA (call-to-action) button to give
   * context and encourage clicking on the button.
   * </pre>
   *
   * <code>string action_headline = 5;</code>
   * @return The bytes for actionHeadline.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getActionHeadlineBytes() {
    java.lang.Object ref = actionHeadline_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      actionHeadline_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPANION_BANNER_FIELD_NUMBER = 7;
  private com.google.ads.googleads.v12.common.AdImageAsset companionBanner_;
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.AdImageAsset companion_banner = 7;</code>
   * @return Whether the companionBanner field is set.
   */
  @java.lang.Override
  public boolean hasCompanionBanner() {
    return companionBanner_ != null;
  }
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.AdImageAsset companion_banner = 7;</code>
   * @return The companionBanner.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.common.AdImageAsset getCompanionBanner() {
    return companionBanner_ == null ? com.google.ads.googleads.v12.common.AdImageAsset.getDefaultInstance() : companionBanner_;
  }
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.AdImageAsset companion_banner = 7;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.common.AdImageAssetOrBuilder getCompanionBannerOrBuilder() {
    return getCompanionBanner();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionButtonLabel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, actionButtonLabel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionHeadline_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, actionHeadline_);
    }
    if (companionBanner_ != null) {
      output.writeMessage(7, getCompanionBanner());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionButtonLabel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, actionButtonLabel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionHeadline_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, actionHeadline_);
    }
    if (companionBanner_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getCompanionBanner());
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo other = (com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo) obj;

    if (!getActionButtonLabel()
        .equals(other.getActionButtonLabel())) return false;
    if (!getActionHeadline()
        .equals(other.getActionHeadline())) return false;
    if (hasCompanionBanner() != other.hasCompanionBanner()) return false;
    if (hasCompanionBanner()) {
      if (!getCompanionBanner()
          .equals(other.getCompanionBanner())) return false;
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
    hash = (37 * hash) + ACTION_BUTTON_LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getActionButtonLabel().hashCode();
    hash = (37 * hash) + ACTION_HEADLINE_FIELD_NUMBER;
    hash = (53 * hash) + getActionHeadline().hashCode();
    if (hasCompanionBanner()) {
      hash = (37 * hash) + COMPANION_BANNER_FIELD_NUMBER;
      hash = (53 * hash) + getCompanionBanner().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo prototype) {
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
   * Representation of video TrueView in-stream ad format (ad shown during video
   * playback, often at beginning, which displays a skip button a few seconds into
   * the video).
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo)
      com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_VideoTrueViewInStreamAdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_VideoTrueViewInStreamAdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo.class, com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      actionButtonLabel_ = "";

      actionHeadline_ = "";

      if (companionBannerBuilder_ == null) {
        companionBanner_ = null;
      } else {
        companionBanner_ = null;
        companionBannerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_VideoTrueViewInStreamAdInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo build() {
      com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo buildPartial() {
      com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo result = new com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo(this);
      result.actionButtonLabel_ = actionButtonLabel_;
      result.actionHeadline_ = actionHeadline_;
      if (companionBannerBuilder_ == null) {
        result.companionBanner_ = companionBanner_;
      } else {
        result.companionBanner_ = companionBannerBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo) {
        return mergeFrom((com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo other) {
      if (other == com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo.getDefaultInstance()) return this;
      if (!other.getActionButtonLabel().isEmpty()) {
        actionButtonLabel_ = other.actionButtonLabel_;
        onChanged();
      }
      if (!other.getActionHeadline().isEmpty()) {
        actionHeadline_ = other.actionHeadline_;
        onChanged();
      }
      if (other.hasCompanionBanner()) {
        mergeCompanionBanner(other.getCompanionBanner());
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
            case 34: {
              actionButtonLabel_ = input.readStringRequireUtf8();

              break;
            } // case 34
            case 42: {
              actionHeadline_ = input.readStringRequireUtf8();

              break;
            } // case 42
            case 58: {
              input.readMessage(
                  getCompanionBannerFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 58
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

    private java.lang.Object actionButtonLabel_ = "";
    /**
     * <pre>
     * Label on the CTA (call-to-action) button taking the user to the video ad's
     * final URL.
     * Required for TrueView for action campaigns, optional otherwise.
     * </pre>
     *
     * <code>string action_button_label = 4;</code>
     * @return The actionButtonLabel.
     */
    public java.lang.String getActionButtonLabel() {
      java.lang.Object ref = actionButtonLabel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actionButtonLabel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Label on the CTA (call-to-action) button taking the user to the video ad's
     * final URL.
     * Required for TrueView for action campaigns, optional otherwise.
     * </pre>
     *
     * <code>string action_button_label = 4;</code>
     * @return The bytes for actionButtonLabel.
     */
    public com.google.protobuf.ByteString
        getActionButtonLabelBytes() {
      java.lang.Object ref = actionButtonLabel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actionButtonLabel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Label on the CTA (call-to-action) button taking the user to the video ad's
     * final URL.
     * Required for TrueView for action campaigns, optional otherwise.
     * </pre>
     *
     * <code>string action_button_label = 4;</code>
     * @param value The actionButtonLabel to set.
     * @return This builder for chaining.
     */
    public Builder setActionButtonLabel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      actionButtonLabel_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Label on the CTA (call-to-action) button taking the user to the video ad's
     * final URL.
     * Required for TrueView for action campaigns, optional otherwise.
     * </pre>
     *
     * <code>string action_button_label = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearActionButtonLabel() {
      
      actionButtonLabel_ = getDefaultInstance().getActionButtonLabel();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Label on the CTA (call-to-action) button taking the user to the video ad's
     * final URL.
     * Required for TrueView for action campaigns, optional otherwise.
     * </pre>
     *
     * <code>string action_button_label = 4;</code>
     * @param value The bytes for actionButtonLabel to set.
     * @return This builder for chaining.
     */
    public Builder setActionButtonLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      actionButtonLabel_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object actionHeadline_ = "";
    /**
     * <pre>
     * Additional text displayed with the CTA (call-to-action) button to give
     * context and encourage clicking on the button.
     * </pre>
     *
     * <code>string action_headline = 5;</code>
     * @return The actionHeadline.
     */
    public java.lang.String getActionHeadline() {
      java.lang.Object ref = actionHeadline_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actionHeadline_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Additional text displayed with the CTA (call-to-action) button to give
     * context and encourage clicking on the button.
     * </pre>
     *
     * <code>string action_headline = 5;</code>
     * @return The bytes for actionHeadline.
     */
    public com.google.protobuf.ByteString
        getActionHeadlineBytes() {
      java.lang.Object ref = actionHeadline_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actionHeadline_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Additional text displayed with the CTA (call-to-action) button to give
     * context and encourage clicking on the button.
     * </pre>
     *
     * <code>string action_headline = 5;</code>
     * @param value The actionHeadline to set.
     * @return This builder for chaining.
     */
    public Builder setActionHeadline(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      actionHeadline_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional text displayed with the CTA (call-to-action) button to give
     * context and encourage clicking on the button.
     * </pre>
     *
     * <code>string action_headline = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearActionHeadline() {
      
      actionHeadline_ = getDefaultInstance().getActionHeadline();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional text displayed with the CTA (call-to-action) button to give
     * context and encourage clicking on the button.
     * </pre>
     *
     * <code>string action_headline = 5;</code>
     * @param value The bytes for actionHeadline to set.
     * @return This builder for chaining.
     */
    public Builder setActionHeadlineBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      actionHeadline_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v12.common.AdImageAsset companionBanner_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.common.AdImageAsset, com.google.ads.googleads.v12.common.AdImageAsset.Builder, com.google.ads.googleads.v12.common.AdImageAssetOrBuilder> companionBannerBuilder_;
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdImageAsset companion_banner = 7;</code>
     * @return Whether the companionBanner field is set.
     */
    public boolean hasCompanionBanner() {
      return companionBannerBuilder_ != null || companionBanner_ != null;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdImageAsset companion_banner = 7;</code>
     * @return The companionBanner.
     */
    public com.google.ads.googleads.v12.common.AdImageAsset getCompanionBanner() {
      if (companionBannerBuilder_ == null) {
        return companionBanner_ == null ? com.google.ads.googleads.v12.common.AdImageAsset.getDefaultInstance() : companionBanner_;
      } else {
        return companionBannerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdImageAsset companion_banner = 7;</code>
     */
    public Builder setCompanionBanner(com.google.ads.googleads.v12.common.AdImageAsset value) {
      if (companionBannerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        companionBanner_ = value;
        onChanged();
      } else {
        companionBannerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdImageAsset companion_banner = 7;</code>
     */
    public Builder setCompanionBanner(
        com.google.ads.googleads.v12.common.AdImageAsset.Builder builderForValue) {
      if (companionBannerBuilder_ == null) {
        companionBanner_ = builderForValue.build();
        onChanged();
      } else {
        companionBannerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdImageAsset companion_banner = 7;</code>
     */
    public Builder mergeCompanionBanner(com.google.ads.googleads.v12.common.AdImageAsset value) {
      if (companionBannerBuilder_ == null) {
        if (companionBanner_ != null) {
          companionBanner_ =
            com.google.ads.googleads.v12.common.AdImageAsset.newBuilder(companionBanner_).mergeFrom(value).buildPartial();
        } else {
          companionBanner_ = value;
        }
        onChanged();
      } else {
        companionBannerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdImageAsset companion_banner = 7;</code>
     */
    public Builder clearCompanionBanner() {
      if (companionBannerBuilder_ == null) {
        companionBanner_ = null;
        onChanged();
      } else {
        companionBanner_ = null;
        companionBannerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdImageAsset companion_banner = 7;</code>
     */
    public com.google.ads.googleads.v12.common.AdImageAsset.Builder getCompanionBannerBuilder() {
      
      onChanged();
      return getCompanionBannerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdImageAsset companion_banner = 7;</code>
     */
    public com.google.ads.googleads.v12.common.AdImageAssetOrBuilder getCompanionBannerOrBuilder() {
      if (companionBannerBuilder_ != null) {
        return companionBannerBuilder_.getMessageOrBuilder();
      } else {
        return companionBanner_ == null ?
            com.google.ads.googleads.v12.common.AdImageAsset.getDefaultInstance() : companionBanner_;
      }
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.AdImageAsset companion_banner = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.common.AdImageAsset, com.google.ads.googleads.v12.common.AdImageAsset.Builder, com.google.ads.googleads.v12.common.AdImageAssetOrBuilder> 
        getCompanionBannerFieldBuilder() {
      if (companionBannerBuilder_ == null) {
        companionBannerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.common.AdImageAsset, com.google.ads.googleads.v12.common.AdImageAsset.Builder, com.google.ads.googleads.v12.common.AdImageAssetOrBuilder>(
                getCompanionBanner(),
                getParentForChildren(),
                isClean());
        companionBanner_ = null;
      }
      return companionBannerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo)
  private static final com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo();
  }

  public static com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoTrueViewInStreamAdInfo>
      PARSER = new com.google.protobuf.AbstractParser<VideoTrueViewInStreamAdInfo>() {
    @java.lang.Override
    public VideoTrueViewInStreamAdInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoTrueViewInStreamAdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoTrueViewInStreamAdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.VideoTrueViewInStreamAdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

