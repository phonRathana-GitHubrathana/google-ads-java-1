// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/keyword_plan_common.proto

package com.google.ads.googleads.v12.common;

public interface KeywordConceptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.common.KeywordConcept)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The concept name for the keyword in the concept_group.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The concept name for the keyword in the concept_group.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The concept group of the concept details.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.ConceptGroup concept_group = 2;</code>
   * @return Whether the conceptGroup field is set.
   */
  boolean hasConceptGroup();
  /**
   * <pre>
   * The concept group of the concept details.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.ConceptGroup concept_group = 2;</code>
   * @return The conceptGroup.
   */
  com.google.ads.googleads.v12.common.ConceptGroup getConceptGroup();
  /**
   * <pre>
   * The concept group of the concept details.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.ConceptGroup concept_group = 2;</code>
   */
  com.google.ads.googleads.v12.common.ConceptGroupOrBuilder getConceptGroupOrBuilder();
}
