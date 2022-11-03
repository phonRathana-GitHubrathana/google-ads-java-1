// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/bidding.proto

package com.google.ads.googleads.v12.common;

public interface TargetImpressionShareOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.common.TargetImpressionShare)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The targeted location on the search results page.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation location = 1;</code>
   * @return The enum numeric value on the wire for location.
   */
  int getLocationValue();
  /**
   * <pre>
   * The targeted location on the search results page.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation location = 1;</code>
   * @return The location.
   */
  com.google.ads.googleads.v12.enums.TargetImpressionShareLocationEnum.TargetImpressionShareLocation getLocation();

  /**
   * <pre>
   * The chosen fraction of ads to be shown in the targeted location in micros.
   * For example, 1% equals 10,000.
   * </pre>
   *
   * <code>optional int64 location_fraction_micros = 4;</code>
   * @return Whether the locationFractionMicros field is set.
   */
  boolean hasLocationFractionMicros();
  /**
   * <pre>
   * The chosen fraction of ads to be shown in the targeted location in micros.
   * For example, 1% equals 10,000.
   * </pre>
   *
   * <code>optional int64 location_fraction_micros = 4;</code>
   * @return The locationFractionMicros.
   */
  long getLocationFractionMicros();

  /**
   * <pre>
   * The highest CPC bid the automated bidding system is permitted to specify.
   * This is a required field entered by the advertiser that sets the ceiling
   * and specified in local micros.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  boolean hasCpcBidCeilingMicros();
  /**
   * <pre>
   * The highest CPC bid the automated bidding system is permitted to specify.
   * This is a required field entered by the advertiser that sets the ceiling
   * and specified in local micros.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
   * @return The cpcBidCeilingMicros.
   */
  long getCpcBidCeilingMicros();
}
