// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/managed_placement_view.proto

package com.google.ads.googleads.v12.resources;

public final class ManagedPlacementViewProto {
  private ManagedPlacementViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_ManagedPlacementView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_ManagedPlacementView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v12/resources/man" +
      "aged_placement_view.proto\022\"google.ads.go" +
      "ogleads.v12.resources\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\"\344\001\n\024ManagedPlacementView\022L\n\rresource_n" +
      "ame\030\001 \001(\tB5\340A\003\372A/\n-googleads.googleapis." +
      "com/ManagedPlacementView:~\352A{\n-googleads" +
      ".googleapis.com/ManagedPlacementView\022Jcu" +
      "stomers/{customer_id}/managedPlacementVi" +
      "ews/{ad_group_id}~{criterion_id}B\213\002\n&com" +
      ".google.ads.googleads.v12.resourcesB\031Man" +
      "agedPlacementViewProtoP\001ZKgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "2/resources;resources\242\002\003GAA\252\002\"Google.Ads" +
      ".GoogleAds.V12.Resources\312\002\"Google\\Ads\\Go" +
      "ogleAds\\V12\\Resources\352\002&Google::Ads::Goo" +
      "gleAds::V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_ManagedPlacementView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_ManagedPlacementView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_ManagedPlacementView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
