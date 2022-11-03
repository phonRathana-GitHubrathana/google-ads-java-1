// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/conversion_upload_service.proto

package com.google.ads.googleads.v12.services;

public interface ClickConversionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.ClickConversionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Google Click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>optional string gclid = 4;</code>
   * @return Whether the gclid field is set.
   */
  boolean hasGclid();
  /**
   * <pre>
   * The Google Click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>optional string gclid = 4;</code>
   * @return The gclid.
   */
  java.lang.String getGclid();
  /**
   * <pre>
   * The Google Click ID (gclid) associated with this conversion.
   * </pre>
   *
   * <code>optional string gclid = 4;</code>
   * @return The bytes for gclid.
   */
  com.google.protobuf.ByteString
      getGclidBytes();

  /**
   * <pre>
   * The click identifier for clicks associated with app conversions and
   * originating from iOS devices starting with iOS14.
   * </pre>
   *
   * <code>string gbraid = 8;</code>
   * @return The gbraid.
   */
  java.lang.String getGbraid();
  /**
   * <pre>
   * The click identifier for clicks associated with app conversions and
   * originating from iOS devices starting with iOS14.
   * </pre>
   *
   * <code>string gbraid = 8;</code>
   * @return The bytes for gbraid.
   */
  com.google.protobuf.ByteString
      getGbraidBytes();

  /**
   * <pre>
   * The click identifier for clicks associated with web conversions and
   * originating from iOS devices starting with iOS14.
   * </pre>
   *
   * <code>string wbraid = 9;</code>
   * @return The wbraid.
   */
  java.lang.String getWbraid();
  /**
   * <pre>
   * The click identifier for clicks associated with web conversions and
   * originating from iOS devices starting with iOS14.
   * </pre>
   *
   * <code>string wbraid = 9;</code>
   * @return The bytes for wbraid.
   */
  com.google.protobuf.ByteString
      getWbraidBytes();

  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>optional string conversion_action = 5;</code>
   * @return Whether the conversionAction field is set.
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>optional string conversion_action = 5;</code>
   * @return The conversionAction.
   */
  java.lang.String getConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>optional string conversion_action = 5;</code>
   * @return The bytes for conversionAction.
   */
  com.google.protobuf.ByteString
      getConversionActionBytes();

  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string conversion_date_time = 6;</code>
   * @return Whether the conversionDateTime field is set.
   */
  boolean hasConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string conversion_date_time = 6;</code>
   * @return The conversionDateTime.
   */
  java.lang.String getConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string conversion_date_time = 6;</code>
   * @return The bytes for conversionDateTime.
   */
  com.google.protobuf.ByteString
      getConversionDateTimeBytes();

  /**
   * <pre>
   * The user identifiers associated with this conversion. Only hashed_email and
   * hashed_phone_number are supported for conversion uploads. The maximum
   * number of user identifiers for each conversion is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.UserIdentifier user_identifiers = 7;</code>
   */
  java.util.List<com.google.ads.googleads.v12.common.UserIdentifier> 
      getUserIdentifiersList();
  /**
   * <pre>
   * The user identifiers associated with this conversion. Only hashed_email and
   * hashed_phone_number are supported for conversion uploads. The maximum
   * number of user identifiers for each conversion is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.UserIdentifier user_identifiers = 7;</code>
   */
  com.google.ads.googleads.v12.common.UserIdentifier getUserIdentifiers(int index);
  /**
   * <pre>
   * The user identifiers associated with this conversion. Only hashed_email and
   * hashed_phone_number are supported for conversion uploads. The maximum
   * number of user identifiers for each conversion is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.UserIdentifier user_identifiers = 7;</code>
   */
  int getUserIdentifiersCount();
  /**
   * <pre>
   * The user identifiers associated with this conversion. Only hashed_email and
   * hashed_phone_number are supported for conversion uploads. The maximum
   * number of user identifiers for each conversion is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.UserIdentifier user_identifiers = 7;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v12.common.UserIdentifierOrBuilder> 
      getUserIdentifiersOrBuilderList();
  /**
   * <pre>
   * The user identifiers associated with this conversion. Only hashed_email and
   * hashed_phone_number are supported for conversion uploads. The maximum
   * number of user identifiers for each conversion is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.UserIdentifier user_identifiers = 7;</code>
   */
  com.google.ads.googleads.v12.common.UserIdentifierOrBuilder getUserIdentifiersOrBuilder(
      int index);
}
