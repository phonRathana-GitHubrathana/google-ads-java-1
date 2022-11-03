// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/segments.proto

package com.google.ads.googleads.v12.common;

public interface AssetInteractionTargetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.common.AssetInteractionTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The asset resource name.
   * </pre>
   *
   * <code>string asset = 1;</code>
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   * <pre>
   * The asset resource name.
   * </pre>
   *
   * <code>string asset = 1;</code>
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString
      getAssetBytes();

  /**
   * <pre>
   * Only used with CustomerAsset, CampaignAsset and AdGroupAsset metrics.
   * Indicates whether the interaction metrics occurred on the asset itself or a
   * different asset or ad unit.
   * </pre>
   *
   * <code>bool interaction_on_this_asset = 2;</code>
   * @return The interactionOnThisAsset.
   */
  boolean getInteractionOnThisAsset();
}
