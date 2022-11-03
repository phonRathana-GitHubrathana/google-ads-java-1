// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/ad_group_feed.proto

package com.google.ads.googleads.v12.resources;

public final class AdGroupFeedProto {
  private AdGroupFeedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_AdGroupFeed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_AdGroupFeed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v12/resources/ad_" +
      "group_feed.proto\022\"google.ads.googleads.v" +
      "12.resources\0327google/ads/googleads/v12/c" +
      "ommon/matching_function.proto\0325google/ad" +
      "s/googleads/v12/enums/feed_link_status.p" +
      "roto\0325google/ads/googleads/v12/enums/pla" +
      "ceholder_type.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\"" +
      "\322\004\n\013AdGroupFeed\022C\n\rresource_name\030\001 \001(\tB," +
      "\340A\005\372A&\n$googleads.googleapis.com/AdGroup" +
      "Feed\0228\n\004feed\030\007 \001(\tB%\340A\005\372A\037\n\035googleads.go" +
      "ogleapis.com/FeedH\000\210\001\001\022?\n\010ad_group\030\010 \001(\t" +
      "B(\340A\005\372A\"\n googleads.googleapis.com/AdGro" +
      "upH\001\210\001\001\022^\n\021placeholder_types\030\004 \003(\0162C.goo" +
      "gle.ads.googleads.v12.enums.PlaceholderT" +
      "ypeEnum.PlaceholderType\022L\n\021matching_func" +
      "tion\030\005 \001(\01321.google.ads.googleads.v12.co" +
      "mmon.MatchingFunction\022V\n\006status\030\006 \001(\0162A." +
      "google.ads.googleads.v12.enums.FeedLinkS" +
      "tatusEnum.FeedLinkStatusB\003\340A\003:g\352Ad\n$goog" +
      "leads.googleapis.com/AdGroupFeed\022<custom" +
      "ers/{customer_id}/adGroupFeeds/{ad_group" +
      "_id}~{feed_id}B\007\n\005_feedB\013\n\t_ad_groupB\202\002\n" +
      "&com.google.ads.googleads.v12.resourcesB" +
      "\020AdGroupFeedProtoP\001ZKgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v12/res" +
      "ources;resources\242\002\003GAA\252\002\"Google.Ads.Goog" +
      "leAds.V12.Resources\312\002\"Google\\Ads\\GoogleA" +
      "ds\\V12\\Resources\352\002&Google::Ads::GoogleAd" +
      "s::V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.common.MatchingFunctionProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.FeedLinkStatusProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_AdGroupFeed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_AdGroupFeed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_AdGroupFeed_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "AdGroup", "PlaceholderTypes", "MatchingFunction", "Status", "Feed", "AdGroup", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.common.MatchingFunctionProto.getDescriptor();
    com.google.ads.googleads.v12.enums.FeedLinkStatusProto.getDescriptor();
    com.google.ads.googleads.v12.enums.PlaceholderTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
