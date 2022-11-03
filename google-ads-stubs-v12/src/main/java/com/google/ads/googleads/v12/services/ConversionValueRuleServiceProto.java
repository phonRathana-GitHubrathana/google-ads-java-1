// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/conversion_value_rule_service.proto

package com.google.ads.googleads.v12.services;

public final class ConversionValueRuleServiceProto {
  private ConversionValueRuleServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateConversionValueRulesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateConversionValueRulesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_ConversionValueRuleOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_ConversionValueRuleOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateConversionValueRulesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateConversionValueRulesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateConversionValueRuleResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateConversionValueRuleResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v12/services/conv" +
      "ersion_value_rule_service.proto\022!google." +
      "ads.googleads.v12.services\032:google/ads/g" +
      "oogleads/v12/enums/response_content_type" +
      ".proto\032>google/ads/googleads/v12/resourc" +
      "es/conversion_value_rule.proto\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\032 google/protob" +
      "uf/field_mask.proto\032\027google/rpc/status.p" +
      "roto\"\263\002\n!MutateConversionValueRulesReque" +
      "st\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022X\n\noperatio" +
      "ns\030\002 \003(\0132?.google.ads.googleads.v12.serv" +
      "ices.ConversionValueRuleOperationB\003\340A\002\022\027" +
      "\n\017partial_failure\030\005 \001(\010\022\025\n\rvalidate_only" +
      "\030\003 \001(\010\022j\n\025response_content_type\030\004 \001(\0162K." +
      "google.ads.googleads.v12.enums.ResponseC" +
      "ontentTypeEnum.ResponseContentType\"\267\002\n\034C" +
      "onversionValueRuleOperation\022/\n\013update_ma" +
      "sk\030\004 \001(\0132\032.google.protobuf.FieldMask\022I\n\006" +
      "create\030\001 \001(\01327.google.ads.googleads.v12." +
      "resources.ConversionValueRuleH\000\022I\n\006updat" +
      "e\030\002 \001(\01327.google.ads.googleads.v12.resou" +
      "rces.ConversionValueRuleH\000\022C\n\006remove\030\003 \001" +
      "(\tB1\372A.\n,googleads.googleapis.com/Conver" +
      "sionValueRuleH\000B\013\n\toperation\"\254\001\n\"MutateC" +
      "onversionValueRulesResponse\022S\n\007results\030\002" +
      " \003(\0132B.google.ads.googleads.v12.services" +
      ".MutateConversionValueRuleResult\0221\n\025part" +
      "ial_failure_error\030\003 \001(\0132\022.google.rpc.Sta" +
      "tus\"\303\001\n\037MutateConversionValueRuleResult\022" +
      "H\n\rresource_name\030\001 \001(\tB1\372A.\n,googleads.g" +
      "oogleapis.com/ConversionValueRule\022V\n\025con" +
      "version_value_rule\030\002 \001(\01327.google.ads.go" +
      "ogleads.v12.resources.ConversionValueRul" +
      "e2\357\002\n\032ConversionValueRuleService\022\211\002\n\032Mut" +
      "ateConversionValueRules\022D.google.ads.goo" +
      "gleads.v12.services.MutateConversionValu" +
      "eRulesRequest\032E.google.ads.googleads.v12" +
      ".services.MutateConversionValueRulesResp" +
      "onse\"^\202\323\344\223\002?\":/v12/customers/{customer_i" +
      "d=*}/conversionValueRules:mutate:\001*\332A\026cu" +
      "stomer_id,operations\032E\312A\030googleads.googl" +
      "eapis.com\322A\'https://www.googleapis.com/a" +
      "uth/adwordsB\213\002\n%com.google.ads.googleads" +
      ".v12.servicesB\037ConversionValueRuleServic" +
      "eProtoP\001ZIgoogle.golang.org/genproto/goo" +
      "gleapis/ads/googleads/v12/services;servi" +
      "ces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V12.Ser" +
      "vices\312\002!Google\\Ads\\GoogleAds\\V12\\Service" +
      "s\352\002%Google::Ads::GoogleAds::V12::Service" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v12.resources.ConversionValueRuleProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_services_MutateConversionValueRulesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_services_MutateConversionValueRulesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateConversionValueRulesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v12_services_ConversionValueRuleOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_services_ConversionValueRuleOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_ConversionValueRuleOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v12_services_MutateConversionValueRulesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_services_MutateConversionValueRulesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateConversionValueRulesResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v12_services_MutateConversionValueRuleResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_services_MutateConversionValueRuleResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateConversionValueRuleResult_descriptor,
        new java.lang.String[] { "ResourceName", "ConversionValueRule", });
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
    com.google.ads.googleads.v12.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v12.resources.ConversionValueRuleProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
