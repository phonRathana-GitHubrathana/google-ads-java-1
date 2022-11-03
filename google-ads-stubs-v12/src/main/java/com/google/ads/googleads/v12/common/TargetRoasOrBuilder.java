// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/bidding.proto

package com.google.ads.googleads.v12.common;

public interface TargetRoasOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.common.TargetRoas)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The chosen revenue (based on conversion data) per unit of spend.
   * Value must be between 0.01 and 1000.0, inclusive.
   * </pre>
   *
   * <code>optional double target_roas = 4;</code>
   * @return Whether the targetRoas field is set.
   */
  boolean hasTargetRoas();
  /**
   * <pre>
   * Required. The chosen revenue (based on conversion data) per unit of spend.
   * Value must be between 0.01 and 1000.0, inclusive.
   * </pre>
   *
   * <code>optional double target_roas = 4;</code>
   * @return The targetRoas.
   */
  double getTargetRoas();

  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * This should only be set for portfolio bid strategies.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  boolean hasCpcBidCeilingMicros();
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * This should only be set for portfolio bid strategies.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
   * @return The cpcBidCeilingMicros.
   */
  long getCpcBidCeilingMicros();

  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * This should only be set for portfolio bid strategies.
   * </pre>
   *
   * <code>optional int64 cpc_bid_floor_micros = 6;</code>
   * @return Whether the cpcBidFloorMicros field is set.
   */
  boolean hasCpcBidFloorMicros();
  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * This should only be set for portfolio bid strategies.
   * </pre>
   *
   * <code>optional int64 cpc_bid_floor_micros = 6;</code>
   * @return The cpcBidFloorMicros.
   */
  long getCpcBidFloorMicros();
}
