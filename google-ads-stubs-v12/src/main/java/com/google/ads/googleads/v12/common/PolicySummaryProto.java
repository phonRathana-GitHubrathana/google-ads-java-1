// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/policy_summary.proto

package com.google.ads.googleads.v12.common;

public final class PolicySummaryProto {
  private PolicySummaryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_PolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_PolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v12/common/policy" +
      "_summary.proto\022\037google.ads.googleads.v12" +
      ".common\032,google/ads/googleads/v12/common" +
      "/policy.proto\032;google/ads/googleads/v12/" +
      "enums/policy_approval_status.proto\0329goog" +
      "le/ads/googleads/v12/enums/policy_review" +
      "_status.proto\"\252\002\n\rPolicySummary\022O\n\024polic" +
      "y_topic_entries\030\001 \003(\01321.google.ads.googl" +
      "eads.v12.common.PolicyTopicEntry\022`\n\rrevi" +
      "ew_status\030\002 \001(\0162I.google.ads.googleads.v" +
      "12.enums.PolicyReviewStatusEnum.PolicyRe" +
      "viewStatus\022f\n\017approval_status\030\003 \001(\0162M.go" +
      "ogle.ads.googleads.v12.enums.PolicyAppro" +
      "valStatusEnum.PolicyApprovalStatusB\362\001\n#c" +
      "om.google.ads.googleads.v12.commonB\022Poli" +
      "cySummaryProtoP\001ZEgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v12/common" +
      ";common\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V12" +
      ".Common\312\002\037Google\\Ads\\GoogleAds\\V12\\Commo" +
      "n\352\002#Google::Ads::GoogleAds::V12::Commonb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.PolicyReviewStatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_common_PolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_common_PolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_PolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.ads.googleads.v12.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v12.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v12.enums.PolicyReviewStatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
