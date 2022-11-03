// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/keyword_plan_ad_group_keyword_service.proto

package com.google.ads.googleads.v12.services;

public final class KeywordPlanAdGroupKeywordServiceProto {
  private KeywordPlanAdGroupKeywordServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_KeywordPlanAdGroupKeywordOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_KeywordPlanAdGroupKeywordOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nMgoogle/ads/googleads/v12/services/keyw" +
      "ord_plan_ad_group_keyword_service.proto\022" +
      "!google.ads.googleads.v12.services\032Fgoog" +
      "le/ads/googleads/v12/resources/keyword_p" +
      "lan_ad_group_keyword.proto\032\034google/api/a" +
      "nnotations.proto\032\027google/api/client.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032 google/protobuf/f" +
      "ield_mask.proto\032\027google/rpc/status.proto" +
      "\"\323\001\n\'MutateKeywordPlanAdGroupKeywordsReq" +
      "uest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022^\n\noperat" +
      "ions\030\002 \003(\0132E.google.ads.googleads.v12.se" +
      "rvices.KeywordPlanAdGroupKeywordOperatio" +
      "nB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalid" +
      "ate_only\030\004 \001(\010\"\317\002\n\"KeywordPlanAdGroupKey" +
      "wordOperation\022/\n\013update_mask\030\004 \001(\0132\032.goo" +
      "gle.protobuf.FieldMask\022O\n\006create\030\001 \001(\0132=" +
      ".google.ads.googleads.v12.resources.Keyw" +
      "ordPlanAdGroupKeywordH\000\022O\n\006update\030\002 \001(\0132" +
      "=.google.ads.googleads.v12.resources.Key" +
      "wordPlanAdGroupKeywordH\000\022I\n\006remove\030\003 \001(\t" +
      "B7\372A4\n2googleads.googleapis.com/KeywordP" +
      "lanAdGroupKeywordH\000B\013\n\toperation\"\270\001\n(Mut" +
      "ateKeywordPlanAdGroupKeywordsResponse\0221\n" +
      "\025partial_failure_error\030\003 \001(\0132\022.google.rp" +
      "c.Status\022Y\n\007results\030\002 \003(\0132H.google.ads.g" +
      "oogleads.v12.services.MutateKeywordPlanA" +
      "dGroupKeywordResult\"w\n%MutateKeywordPlan" +
      "AdGroupKeywordResult\022N\n\rresource_name\030\001 " +
      "\001(\tB7\372A4\n2googleads.googleapis.com/Keywo" +
      "rdPlanAdGroupKeyword2\215\003\n KeywordPlanAdGr" +
      "oupKeywordService\022\241\002\n MutateKeywordPlanA" +
      "dGroupKeywords\022J.google.ads.googleads.v1" +
      "2.services.MutateKeywordPlanAdGroupKeywo" +
      "rdsRequest\032K.google.ads.googleads.v12.se" +
      "rvices.MutateKeywordPlanAdGroupKeywordsR" +
      "esponse\"d\202\323\344\223\002E\"@/v12/customers/{custome" +
      "r_id=*}/keywordPlanAdGroupKeywords:mutat" +
      "e:\001*\332A\026customer_id,operations\032E\312A\030google" +
      "ads.googleapis.com\322A\'https://www.googlea" +
      "pis.com/auth/adwordsB\221\002\n%com.google.ads." +
      "googleads.v12.servicesB%KeywordPlanAdGro" +
      "upKeywordServiceProtoP\001ZIgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v12" +
      "/services;services\242\002\003GAA\252\002!Google.Ads.Go" +
      "ogleAds.V12.Services\312\002!Google\\Ads\\Google" +
      "Ads\\V12\\Services\352\002%Google::Ads::GoogleAd" +
      "s::V12::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.resources.KeywordPlanAdGroupKeywordProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v12_services_KeywordPlanAdGroupKeywordOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_services_KeywordPlanAdGroupKeywordOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_KeywordPlanAdGroupKeywordOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateKeywordPlanAdGroupKeywordResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.resources.KeywordPlanAdGroupKeywordProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
