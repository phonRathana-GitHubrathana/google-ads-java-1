// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/audience_insights_service.proto

package com.google.ads.googleads.v12.services;

public interface ListAudienceInsightsAttributesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.ListAudienceInsightsAttributesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The attributes matching the search query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.AudienceInsightsAttributeMetadata attributes = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v12.services.AudienceInsightsAttributeMetadata> 
      getAttributesList();
  /**
   * <pre>
   * The attributes matching the search query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.AudienceInsightsAttributeMetadata attributes = 1;</code>
   */
  com.google.ads.googleads.v12.services.AudienceInsightsAttributeMetadata getAttributes(int index);
  /**
   * <pre>
   * The attributes matching the search query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.AudienceInsightsAttributeMetadata attributes = 1;</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * The attributes matching the search query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.AudienceInsightsAttributeMetadata attributes = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v12.services.AudienceInsightsAttributeMetadataOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <pre>
   * The attributes matching the search query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.AudienceInsightsAttributeMetadata attributes = 1;</code>
   */
  com.google.ads.googleads.v12.services.AudienceInsightsAttributeMetadataOrBuilder getAttributesOrBuilder(
      int index);
}
