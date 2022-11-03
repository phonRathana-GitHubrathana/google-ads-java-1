// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/ad_group_criterion_service.proto

package com.google.ads.googleads.v12.services;

public final class AdGroupCriterionServiceProto {
  private AdGroupCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateAdGroupCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateAdGroupCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_AdGroupCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_AdGroupCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateAdGroupCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateAdGroupCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateAdGroupCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateAdGroupCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v12/services/ad_g" +
      "roup_criterion_service.proto\022!google.ads" +
      ".googleads.v12.services\032,google/ads/goog" +
      "leads/v12/common/policy.proto\032:google/ad" +
      "s/googleads/v12/enums/response_content_t" +
      "ype.proto\032;google/ads/googleads/v12/reso" +
      "urces/ad_group_criterion.proto\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\032 google/protob" +
      "uf/field_mask.proto\032\027google/rpc/status.p" +
      "roto\"\253\002\n\034MutateAdGroupCriteriaRequest\022\030\n" +
      "\013customer_id\030\001 \001(\tB\003\340A\002\022U\n\noperations\030\002 " +
      "\003(\0132<.google.ads.googleads.v12.services." +
      "AdGroupCriterionOperationB\003\340A\002\022\027\n\017partia" +
      "l_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j" +
      "\n\025response_content_type\030\005 \001(\0162K.google.a" +
      "ds.googleads.v12.enums.ResponseContentTy" +
      "peEnum.ResponseContentType\"\206\003\n\031AdGroupCr" +
      "iterionOperation\022/\n\013update_mask\030\004 \001(\0132\032." +
      "google.protobuf.FieldMask\022Y\n\034exempt_poli" +
      "cy_violation_keys\030\005 \003(\01323.google.ads.goo" +
      "gleads.v12.common.PolicyViolationKey\022F\n\006" +
      "create\030\001 \001(\01324.google.ads.googleads.v12." +
      "resources.AdGroupCriterionH\000\022F\n\006update\030\002" +
      " \001(\01324.google.ads.googleads.v12.resource" +
      "s.AdGroupCriterionH\000\022@\n\006remove\030\003 \001(\tB.\372A" +
      "+\n)googleads.googleapis.com/AdGroupCrite" +
      "rionH\000B\013\n\toperation\"\244\001\n\035MutateAdGroupCri" +
      "teriaResponse\0221\n\025partial_failure_error\030\003" +
      " \001(\0132\022.google.rpc.Status\022P\n\007results\030\002 \003(" +
      "\0132?.google.ads.googleads.v12.services.Mu" +
      "tateAdGroupCriterionResult\"\267\001\n\034MutateAdG" +
      "roupCriterionResult\022E\n\rresource_name\030\001 \001" +
      "(\tB.\372A+\n)googleads.googleapis.com/AdGrou" +
      "pCriterion\022P\n\022ad_group_criterion\030\002 \001(\01324" +
      ".google.ads.googleads.v12.resources.AdGr" +
      "oupCriterion2\330\002\n\027AdGroupCriterionService" +
      "\022\365\001\n\025MutateAdGroupCriteria\022?.google.ads." +
      "googleads.v12.services.MutateAdGroupCrit" +
      "eriaRequest\032@.google.ads.googleads.v12.s" +
      "ervices.MutateAdGroupCriteriaResponse\"Y\202" +
      "\323\344\223\002:\"5/v12/customers/{customer_id=*}/ad" +
      "GroupCriteria:mutate:\001*\332A\026customer_id,op" +
      "erations\032E\312A\030googleads.googleapis.com\322A\'" +
      "https://www.googleapis.com/auth/adwordsB" +
      "\210\002\n%com.google.ads.googleads.v12.service" +
      "sB\034AdGroupCriterionServiceProtoP\001ZIgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v12/services;services\242\002\003GAA\252\002!Goo" +
      "gle.Ads.GoogleAds.V12.Services\312\002!Google\\" +
      "Ads\\GoogleAds\\V12\\Services\352\002%Google::Ads" +
      "::GoogleAds::V12::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v12.resources.AdGroupCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_services_MutateAdGroupCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_services_MutateAdGroupCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateAdGroupCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v12_services_AdGroupCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_services_AdGroupCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_AdGroupCriterionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "ExemptPolicyViolationKeys", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v12_services_MutateAdGroupCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_services_MutateAdGroupCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateAdGroupCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v12_services_MutateAdGroupCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_services_MutateAdGroupCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateAdGroupCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCriterion", });
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
    com.google.ads.googleads.v12.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v12.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v12.resources.AdGroupCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
