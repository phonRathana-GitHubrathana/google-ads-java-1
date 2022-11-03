// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/conversion_custom_variable_service.proto

package com.google.ads.googleads.v12.services;

public final class ConversionCustomVariableServiceProto {
  private ConversionCustomVariableServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariablesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariablesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_ConversionCustomVariableOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_ConversionCustomVariableOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariablesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariablesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariableResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariableResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJgoogle/ads/googleads/v12/services/conv" +
      "ersion_custom_variable_service.proto\022!go" +
      "ogle.ads.googleads.v12.services\032:google/" +
      "ads/googleads/v12/enums/response_content" +
      "_type.proto\032Cgoogle/ads/googleads/v12/re" +
      "sources/conversion_custom_variable.proto" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032 goo" +
      "gle/protobuf/field_mask.proto\032\027google/rp" +
      "c/status.proto\"\275\002\n&MutateConversionCusto" +
      "mVariablesRequest\022\030\n\013customer_id\030\001 \001(\tB\003" +
      "\340A\002\022]\n\noperations\030\002 \003(\0132D.google.ads.goo" +
      "gleads.v12.services.ConversionCustomVari" +
      "ableOperationB\003\340A\002\022\027\n\017partial_failure\030\003 " +
      "\001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025response_c" +
      "ontent_type\030\005 \001(\0162K.google.ads.googleads" +
      ".v12.enums.ResponseContentTypeEnum.Respo" +
      "nseContentType\"\201\002\n!ConversionCustomVaria" +
      "bleOperation\022/\n\013update_mask\030\003 \001(\0132\032.goog" +
      "le.protobuf.FieldMask\022N\n\006create\030\001 \001(\0132<." +
      "google.ads.googleads.v12.resources.Conve" +
      "rsionCustomVariableH\000\022N\n\006update\030\002 \001(\0132<." +
      "google.ads.googleads.v12.resources.Conve" +
      "rsionCustomVariableH\000B\013\n\toperation\"\266\001\n\'M" +
      "utateConversionCustomVariablesResponse\0221" +
      "\n\025partial_failure_error\030\001 \001(\0132\022.google.r" +
      "pc.Status\022X\n\007results\030\002 \003(\0132G.google.ads." +
      "googleads.v12.services.MutateConversionC" +
      "ustomVariableResult\"\327\001\n$MutateConversion" +
      "CustomVariableResult\022M\n\rresource_name\030\001 " +
      "\001(\tB6\372A3\n1googleads.googleapis.com/Conve" +
      "rsionCustomVariable\022`\n\032conversion_custom" +
      "_variable\030\002 \001(\0132<.google.ads.googleads.v" +
      "12.resources.ConversionCustomVariable2\210\003" +
      "\n\037ConversionCustomVariableService\022\235\002\n\037Mu" +
      "tateConversionCustomVariables\022I.google.a" +
      "ds.googleads.v12.services.MutateConversi" +
      "onCustomVariablesRequest\032J.google.ads.go" +
      "ogleads.v12.services.MutateConversionCus" +
      "tomVariablesResponse\"c\202\323\344\223\002D\"?/v12/custo" +
      "mers/{customer_id=*}/conversionCustomVar" +
      "iables:mutate:\001*\332A\026customer_id,operation" +
      "s\032E\312A\030googleads.googleapis.com\322A\'https:/" +
      "/www.googleapis.com/auth/adwordsB\220\002\n%com" +
      ".google.ads.googleads.v12.servicesB$Conv" +
      "ersionCustomVariableServiceProtoP\001ZIgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v12/services;services\242\002\003GAA\252\002!Go" +
      "ogle.Ads.GoogleAds.V12.Services\312\002!Google" +
      "\\Ads\\GoogleAds\\V12\\Services\352\002%Google::Ad" +
      "s::GoogleAds::V12::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v12.resources.ConversionCustomVariableProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariablesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariablesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariablesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v12_services_ConversionCustomVariableOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_services_ConversionCustomVariableOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_ConversionCustomVariableOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariablesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariablesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariablesResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariableResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariableResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_MutateConversionCustomVariableResult_descriptor,
        new java.lang.String[] { "ResourceName", "ConversionCustomVariable", });
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
    com.google.ads.googleads.v12.resources.ConversionCustomVariableProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
