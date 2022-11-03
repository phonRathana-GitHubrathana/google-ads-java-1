// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/keyword_plan_common.proto

package com.google.ads.googleads.v10.common;

public interface MonthlySearchVolumeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.common.MonthlySearchVolume)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The year of the search volume (for example, 2020).
   * </pre>
   *
   * <code>optional int64 year = 4;</code>
   * @return Whether the year field is set.
   */
  boolean hasYear();
  /**
   * <pre>
   * The year of the search volume (for example, 2020).
   * </pre>
   *
   * <code>optional int64 year = 4;</code>
   * @return The year.
   */
  long getYear();

  /**
   * <pre>
   * The month of the search volume.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
   * @return The enum numeric value on the wire for month.
   */
  int getMonthValue();
  /**
   * <pre>
   * The month of the search volume.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
   * @return The month.
   */
  com.google.ads.googleads.v10.enums.MonthOfYearEnum.MonthOfYear getMonth();

  /**
   * <pre>
   * Approximate number of searches for the month.
   * A null value indicates the search volume is unavailable for
   * that month.
   * </pre>
   *
   * <code>optional int64 monthly_searches = 5;</code>
   * @return Whether the monthlySearches field is set.
   */
  boolean hasMonthlySearches();
  /**
   * <pre>
   * Approximate number of searches for the month.
   * A null value indicates the search volume is unavailable for
   * that month.
   * </pre>
   *
   * <code>optional int64 monthly_searches = 5;</code>
   * @return The monthlySearches.
   */
  long getMonthlySearches();
}
