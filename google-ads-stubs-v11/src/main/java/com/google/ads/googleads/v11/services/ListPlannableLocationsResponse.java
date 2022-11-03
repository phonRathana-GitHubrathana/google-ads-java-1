// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/services/reach_plan_service.proto

package com.google.ads.googleads.v11.services;

/**
 * <pre>
 * The list of plannable locations.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.services.ListPlannableLocationsResponse}
 */
public final class ListPlannableLocationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.services.ListPlannableLocationsResponse)
    ListPlannableLocationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPlannableLocationsResponse.newBuilder() to construct.
  private ListPlannableLocationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPlannableLocationsResponse() {
    plannableLocations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPlannableLocationsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v11_services_ListPlannableLocationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v11_services_ListPlannableLocationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.services.ListPlannableLocationsResponse.class, com.google.ads.googleads.v11.services.ListPlannableLocationsResponse.Builder.class);
  }

  public static final int PLANNABLE_LOCATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v11.services.PlannableLocation> plannableLocations_;
  /**
   * <pre>
   * The list of locations available for planning.
   * See
   * https://developers.google.com/google-ads/api/reference/data/geotargets
   * for sample locations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v11.services.PlannableLocation> getPlannableLocationsList() {
    return plannableLocations_;
  }
  /**
   * <pre>
   * The list of locations available for planning.
   * See
   * https://developers.google.com/google-ads/api/reference/data/geotargets
   * for sample locations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v11.services.PlannableLocationOrBuilder> 
      getPlannableLocationsOrBuilderList() {
    return plannableLocations_;
  }
  /**
   * <pre>
   * The list of locations available for planning.
   * See
   * https://developers.google.com/google-ads/api/reference/data/geotargets
   * for sample locations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
   */
  @java.lang.Override
  public int getPlannableLocationsCount() {
    return plannableLocations_.size();
  }
  /**
   * <pre>
   * The list of locations available for planning.
   * See
   * https://developers.google.com/google-ads/api/reference/data/geotargets
   * for sample locations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.PlannableLocation getPlannableLocations(int index) {
    return plannableLocations_.get(index);
  }
  /**
   * <pre>
   * The list of locations available for planning.
   * See
   * https://developers.google.com/google-ads/api/reference/data/geotargets
   * for sample locations.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.services.PlannableLocationOrBuilder getPlannableLocationsOrBuilder(
      int index) {
    return plannableLocations_.get(index);
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
    for (int i = 0; i < plannableLocations_.size(); i++) {
      output.writeMessage(1, plannableLocations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < plannableLocations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, plannableLocations_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v11.services.ListPlannableLocationsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.services.ListPlannableLocationsResponse other = (com.google.ads.googleads.v11.services.ListPlannableLocationsResponse) obj;

    if (!getPlannableLocationsList()
        .equals(other.getPlannableLocationsList())) return false;
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
    if (getPlannableLocationsCount() > 0) {
      hash = (37 * hash) + PLANNABLE_LOCATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPlannableLocationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.services.ListPlannableLocationsResponse prototype) {
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
   * The list of plannable locations.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.services.ListPlannableLocationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.services.ListPlannableLocationsResponse)
      com.google.ads.googleads.v11.services.ListPlannableLocationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v11_services_ListPlannableLocationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v11_services_ListPlannableLocationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.services.ListPlannableLocationsResponse.class, com.google.ads.googleads.v11.services.ListPlannableLocationsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.services.ListPlannableLocationsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (plannableLocationsBuilder_ == null) {
        plannableLocations_ = java.util.Collections.emptyList();
      } else {
        plannableLocations_ = null;
        plannableLocationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v11_services_ListPlannableLocationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.ListPlannableLocationsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.services.ListPlannableLocationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.ListPlannableLocationsResponse build() {
      com.google.ads.googleads.v11.services.ListPlannableLocationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.services.ListPlannableLocationsResponse buildPartial() {
      com.google.ads.googleads.v11.services.ListPlannableLocationsResponse result = new com.google.ads.googleads.v11.services.ListPlannableLocationsResponse(this);
      int from_bitField0_ = bitField0_;
      if (plannableLocationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          plannableLocations_ = java.util.Collections.unmodifiableList(plannableLocations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.plannableLocations_ = plannableLocations_;
      } else {
        result.plannableLocations_ = plannableLocationsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v11.services.ListPlannableLocationsResponse) {
        return mergeFrom((com.google.ads.googleads.v11.services.ListPlannableLocationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.services.ListPlannableLocationsResponse other) {
      if (other == com.google.ads.googleads.v11.services.ListPlannableLocationsResponse.getDefaultInstance()) return this;
      if (plannableLocationsBuilder_ == null) {
        if (!other.plannableLocations_.isEmpty()) {
          if (plannableLocations_.isEmpty()) {
            plannableLocations_ = other.plannableLocations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePlannableLocationsIsMutable();
            plannableLocations_.addAll(other.plannableLocations_);
          }
          onChanged();
        }
      } else {
        if (!other.plannableLocations_.isEmpty()) {
          if (plannableLocationsBuilder_.isEmpty()) {
            plannableLocationsBuilder_.dispose();
            plannableLocationsBuilder_ = null;
            plannableLocations_ = other.plannableLocations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            plannableLocationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPlannableLocationsFieldBuilder() : null;
          } else {
            plannableLocationsBuilder_.addAllMessages(other.plannableLocations_);
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
              com.google.ads.googleads.v11.services.PlannableLocation m =
                  input.readMessage(
                      com.google.ads.googleads.v11.services.PlannableLocation.parser(),
                      extensionRegistry);
              if (plannableLocationsBuilder_ == null) {
                ensurePlannableLocationsIsMutable();
                plannableLocations_.add(m);
              } else {
                plannableLocationsBuilder_.addMessage(m);
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

    private java.util.List<com.google.ads.googleads.v11.services.PlannableLocation> plannableLocations_ =
      java.util.Collections.emptyList();
    private void ensurePlannableLocationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        plannableLocations_ = new java.util.ArrayList<com.google.ads.googleads.v11.services.PlannableLocation>(plannableLocations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v11.services.PlannableLocation, com.google.ads.googleads.v11.services.PlannableLocation.Builder, com.google.ads.googleads.v11.services.PlannableLocationOrBuilder> plannableLocationsBuilder_;

    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v11.services.PlannableLocation> getPlannableLocationsList() {
      if (plannableLocationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(plannableLocations_);
      } else {
        return plannableLocationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public int getPlannableLocationsCount() {
      if (plannableLocationsBuilder_ == null) {
        return plannableLocations_.size();
      } else {
        return plannableLocationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public com.google.ads.googleads.v11.services.PlannableLocation getPlannableLocations(int index) {
      if (plannableLocationsBuilder_ == null) {
        return plannableLocations_.get(index);
      } else {
        return plannableLocationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public Builder setPlannableLocations(
        int index, com.google.ads.googleads.v11.services.PlannableLocation value) {
      if (plannableLocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlannableLocationsIsMutable();
        plannableLocations_.set(index, value);
        onChanged();
      } else {
        plannableLocationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public Builder setPlannableLocations(
        int index, com.google.ads.googleads.v11.services.PlannableLocation.Builder builderForValue) {
      if (plannableLocationsBuilder_ == null) {
        ensurePlannableLocationsIsMutable();
        plannableLocations_.set(index, builderForValue.build());
        onChanged();
      } else {
        plannableLocationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public Builder addPlannableLocations(com.google.ads.googleads.v11.services.PlannableLocation value) {
      if (plannableLocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlannableLocationsIsMutable();
        plannableLocations_.add(value);
        onChanged();
      } else {
        plannableLocationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public Builder addPlannableLocations(
        int index, com.google.ads.googleads.v11.services.PlannableLocation value) {
      if (plannableLocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlannableLocationsIsMutable();
        plannableLocations_.add(index, value);
        onChanged();
      } else {
        plannableLocationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public Builder addPlannableLocations(
        com.google.ads.googleads.v11.services.PlannableLocation.Builder builderForValue) {
      if (plannableLocationsBuilder_ == null) {
        ensurePlannableLocationsIsMutable();
        plannableLocations_.add(builderForValue.build());
        onChanged();
      } else {
        plannableLocationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public Builder addPlannableLocations(
        int index, com.google.ads.googleads.v11.services.PlannableLocation.Builder builderForValue) {
      if (plannableLocationsBuilder_ == null) {
        ensurePlannableLocationsIsMutable();
        plannableLocations_.add(index, builderForValue.build());
        onChanged();
      } else {
        plannableLocationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public Builder addAllPlannableLocations(
        java.lang.Iterable<? extends com.google.ads.googleads.v11.services.PlannableLocation> values) {
      if (plannableLocationsBuilder_ == null) {
        ensurePlannableLocationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, plannableLocations_);
        onChanged();
      } else {
        plannableLocationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public Builder clearPlannableLocations() {
      if (plannableLocationsBuilder_ == null) {
        plannableLocations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        plannableLocationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public Builder removePlannableLocations(int index) {
      if (plannableLocationsBuilder_ == null) {
        ensurePlannableLocationsIsMutable();
        plannableLocations_.remove(index);
        onChanged();
      } else {
        plannableLocationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public com.google.ads.googleads.v11.services.PlannableLocation.Builder getPlannableLocationsBuilder(
        int index) {
      return getPlannableLocationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public com.google.ads.googleads.v11.services.PlannableLocationOrBuilder getPlannableLocationsOrBuilder(
        int index) {
      if (plannableLocationsBuilder_ == null) {
        return plannableLocations_.get(index);  } else {
        return plannableLocationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v11.services.PlannableLocationOrBuilder> 
         getPlannableLocationsOrBuilderList() {
      if (plannableLocationsBuilder_ != null) {
        return plannableLocationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(plannableLocations_);
      }
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public com.google.ads.googleads.v11.services.PlannableLocation.Builder addPlannableLocationsBuilder() {
      return getPlannableLocationsFieldBuilder().addBuilder(
          com.google.ads.googleads.v11.services.PlannableLocation.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public com.google.ads.googleads.v11.services.PlannableLocation.Builder addPlannableLocationsBuilder(
        int index) {
      return getPlannableLocationsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v11.services.PlannableLocation.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of locations available for planning.
     * See
     * https://developers.google.com/google-ads/api/reference/data/geotargets
     * for sample locations.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v11.services.PlannableLocation plannable_locations = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v11.services.PlannableLocation.Builder> 
         getPlannableLocationsBuilderList() {
      return getPlannableLocationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v11.services.PlannableLocation, com.google.ads.googleads.v11.services.PlannableLocation.Builder, com.google.ads.googleads.v11.services.PlannableLocationOrBuilder> 
        getPlannableLocationsFieldBuilder() {
      if (plannableLocationsBuilder_ == null) {
        plannableLocationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v11.services.PlannableLocation, com.google.ads.googleads.v11.services.PlannableLocation.Builder, com.google.ads.googleads.v11.services.PlannableLocationOrBuilder>(
                plannableLocations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        plannableLocations_ = null;
      }
      return plannableLocationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.services.ListPlannableLocationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.services.ListPlannableLocationsResponse)
  private static final com.google.ads.googleads.v11.services.ListPlannableLocationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.services.ListPlannableLocationsResponse();
  }

  public static com.google.ads.googleads.v11.services.ListPlannableLocationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPlannableLocationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPlannableLocationsResponse>() {
    @java.lang.Override
    public ListPlannableLocationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPlannableLocationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPlannableLocationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.services.ListPlannableLocationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

