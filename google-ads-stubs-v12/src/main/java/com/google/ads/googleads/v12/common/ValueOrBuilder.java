// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/value.proto

package com.google.ads.googleads.v12.common;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.common.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A boolean.
   * </pre>
   *
   * <code>bool boolean_value = 1;</code>
   * @return Whether the booleanValue field is set.
   */
  boolean hasBooleanValue();
  /**
   * <pre>
   * A boolean.
   * </pre>
   *
   * <code>bool boolean_value = 1;</code>
   * @return The booleanValue.
   */
  boolean getBooleanValue();

  /**
   * <pre>
   * An int64.
   * </pre>
   *
   * <code>int64 int64_value = 2;</code>
   * @return Whether the int64Value field is set.
   */
  boolean hasInt64Value();
  /**
   * <pre>
   * An int64.
   * </pre>
   *
   * <code>int64 int64_value = 2;</code>
   * @return The int64Value.
   */
  long getInt64Value();

  /**
   * <pre>
   * A float.
   * </pre>
   *
   * <code>float float_value = 3;</code>
   * @return Whether the floatValue field is set.
   */
  boolean hasFloatValue();
  /**
   * <pre>
   * A float.
   * </pre>
   *
   * <code>float float_value = 3;</code>
   * @return The floatValue.
   */
  float getFloatValue();

  /**
   * <pre>
   * A double.
   * </pre>
   *
   * <code>double double_value = 4;</code>
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   * <pre>
   * A double.
   * </pre>
   *
   * <code>double double_value = 4;</code>
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   * <pre>
   * A string.
   * </pre>
   *
   * <code>string string_value = 5;</code>
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   * <pre>
   * A string.
   * </pre>
   *
   * <code>string string_value = 5;</code>
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   * <pre>
   * A string.
   * </pre>
   *
   * <code>string string_value = 5;</code>
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  public com.google.ads.googleads.v12.common.Value.ValueCase getValueCase();
}
