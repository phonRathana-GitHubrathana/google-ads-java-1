// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/hotel_group_view.proto

package com.google.ads.googleads.v12.resources;

public final class HotelGroupViewProto {
  private HotelGroupViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_HotelGroupView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_HotelGroupView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v12/resources/hot" +
      "el_group_view.proto\022\"google.ads.googlead" +
      "s.v12.resources\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\"\314\001\n\016" +
      "HotelGroupView\022F\n\rresource_name\030\001 \001(\tB/\340" +
      "A\003\372A)\n\'googleads.googleapis.com/HotelGro" +
      "upView:r\352Ao\n\'googleads.googleapis.com/Ho" +
      "telGroupView\022Dcustomers/{customer_id}/ho" +
      "telGroupViews/{ad_group_id}~{criterion_i" +
      "d}B\205\002\n&com.google.ads.googleads.v12.reso" +
      "urcesB\023HotelGroupViewProtoP\001ZKgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v12/resources;resources\242\002\003GAA\252\002\"Google" +
      ".Ads.GoogleAds.V12.Resources\312\002\"Google\\Ad" +
      "s\\GoogleAds\\V12\\Resources\352\002&Google::Ads:" +
      ":GoogleAds::V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_HotelGroupView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_HotelGroupView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_HotelGroupView_descriptor,
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
