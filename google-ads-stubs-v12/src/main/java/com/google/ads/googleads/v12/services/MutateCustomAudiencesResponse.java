// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/custom_audience_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * Response message for custom audience mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.MutateCustomAudiencesResponse}
 */
public final class MutateCustomAudiencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.MutateCustomAudiencesResponse)
    MutateCustomAudiencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCustomAudiencesResponse.newBuilder() to construct.
  private MutateCustomAudiencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCustomAudiencesResponse() {
    results_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCustomAudiencesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.CustomAudienceServiceProto.internal_static_google_ads_googleads_v12_services_MutateCustomAudiencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.CustomAudienceServiceProto.internal_static_google_ads_googleads_v12_services_MutateCustomAudiencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse.class, com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v12.services.MutateCustomAudienceResult> results_;
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v12.services.MutateCustomAudienceResult> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v12.services.MutateCustomAudienceResultOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
   */
  @java.lang.Override
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.MutateCustomAudienceResult getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.services.MutateCustomAudienceResultOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
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
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(1, results_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, results_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse other = (com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse) obj;

    if (!getResultsList()
        .equals(other.getResultsList())) return false;
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
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse prototype) {
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
   * Response message for custom audience mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.MutateCustomAudiencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.MutateCustomAudiencesResponse)
      com.google.ads.googleads.v12.services.MutateCustomAudiencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.CustomAudienceServiceProto.internal_static_google_ads_googleads_v12_services_MutateCustomAudiencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.CustomAudienceServiceProto.internal_static_google_ads_googleads_v12_services_MutateCustomAudiencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse.class, com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
      } else {
        results_ = null;
        resultsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.CustomAudienceServiceProto.internal_static_google_ads_googleads_v12_services_MutateCustomAudiencesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse build() {
      com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse buildPartial() {
      com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse result = new com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse(this);
      int from_bitField0_ = bitField0_;
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse) {
        return mergeFrom((com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse other) {
      if (other == com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse.getDefaultInstance()) return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultsFieldBuilder() : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
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
              com.google.ads.googleads.v12.services.MutateCustomAudienceResult m =
                  input.readMessage(
                      com.google.ads.googleads.v12.services.MutateCustomAudienceResult.parser(),
                      extensionRegistry);
              if (resultsBuilder_ == null) {
                ensureResultsIsMutable();
                results_.add(m);
              } else {
                resultsBuilder_.addMessage(m);
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

    private java.util.List<com.google.ads.googleads.v12.services.MutateCustomAudienceResult> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ = new java.util.ArrayList<com.google.ads.googleads.v12.services.MutateCustomAudienceResult>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v12.services.MutateCustomAudienceResult, com.google.ads.googleads.v12.services.MutateCustomAudienceResult.Builder, com.google.ads.googleads.v12.services.MutateCustomAudienceResultOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v12.services.MutateCustomAudienceResult> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public com.google.ads.googleads.v12.services.MutateCustomAudienceResult getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public Builder setResults(
        int index, com.google.ads.googleads.v12.services.MutateCustomAudienceResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public Builder setResults(
        int index, com.google.ads.googleads.v12.services.MutateCustomAudienceResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public Builder addResults(com.google.ads.googleads.v12.services.MutateCustomAudienceResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public Builder addResults(
        int index, com.google.ads.googleads.v12.services.MutateCustomAudienceResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public Builder addResults(
        com.google.ads.googleads.v12.services.MutateCustomAudienceResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public Builder addResults(
        int index, com.google.ads.googleads.v12.services.MutateCustomAudienceResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.google.ads.googleads.v12.services.MutateCustomAudienceResult> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public com.google.ads.googleads.v12.services.MutateCustomAudienceResult.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public com.google.ads.googleads.v12.services.MutateCustomAudienceResultOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v12.services.MutateCustomAudienceResultOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public com.google.ads.googleads.v12.services.MutateCustomAudienceResult.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          com.google.ads.googleads.v12.services.MutateCustomAudienceResult.getDefaultInstance());
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public com.google.ads.googleads.v12.services.MutateCustomAudienceResult.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v12.services.MutateCustomAudienceResult.getDefaultInstance());
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v12.services.MutateCustomAudienceResult results = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v12.services.MutateCustomAudienceResult.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v12.services.MutateCustomAudienceResult, com.google.ads.googleads.v12.services.MutateCustomAudienceResult.Builder, com.google.ads.googleads.v12.services.MutateCustomAudienceResultOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v12.services.MutateCustomAudienceResult, com.google.ads.googleads.v12.services.MutateCustomAudienceResult.Builder, com.google.ads.googleads.v12.services.MutateCustomAudienceResultOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.MutateCustomAudiencesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.MutateCustomAudiencesResponse)
  private static final com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse();
  }

  public static com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCustomAudiencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<MutateCustomAudiencesResponse>() {
    @java.lang.Override
    public MutateCustomAudiencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateCustomAudiencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCustomAudiencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.MutateCustomAudiencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

