// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/ad_group_ad_asset_combination_view.proto

package com.google.ads.googleads.v12.resources;

public final class AdGroupAdAssetCombinationViewProto {
  private AdGroupAdAssetCombinationViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_AdGroupAdAssetCombinationView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_AdGroupAdAssetCombinationView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nKgoogle/ads/googleads/v12/resources/ad_" +
      "group_ad_asset_combination_view.proto\022\"g" +
      "oogle.ads.googleads.v12.resources\0321googl" +
      "e/ads/googleads/v12/common/asset_usage.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\"\253\003\n\035AdGroupAdAs" +
      "setCombinationView\022U\n\rresource_name\030\001 \001(" +
      "\tB>\340A\003\372A8\n6googleads.googleapis.com/AdGr" +
      "oupAdAssetCombinationView\022G\n\rserved_asse" +
      "ts\030\002 \003(\0132+.google.ads.googleads.v12.comm" +
      "on.AssetUsageB\003\340A\003\022\031\n\007enabled\030\003 \001(\010B\003\340A\003" +
      "H\000\210\001\001:\302\001\352A\276\001\n6googleads.googleapis.com/A" +
      "dGroupAdAssetCombinationView\022\203\001customers" +
      "/{customer_id}/adGroupAdAssetCombination" +
      "Views/{ad_group_id}~{ad_id}~{asset_combi" +
      "nation_id_low}~{asset_combination_id_hig" +
      "h}B\n\n\010_enabledB\224\002\n&com.google.ads.google" +
      "ads.v12.resourcesB\"AdGroupAdAssetCombina" +
      "tionViewProtoP\001ZKgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v12/resourc" +
      "es;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAd" +
      "s.V12.Resources\312\002\"Google\\Ads\\GoogleAds\\V" +
      "12\\Resources\352\002&Google::Ads::GoogleAds::V" +
      "12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.common.AssetUsageProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_AdGroupAdAssetCombinationView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_AdGroupAdAssetCombinationView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_AdGroupAdAssetCombinationView_descriptor,
        new java.lang.String[] { "ResourceName", "ServedAssets", "Enabled", "Enabled", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.common.AssetUsageProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
