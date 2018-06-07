// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/ad.proto

package com.google.ads.googleads.v0.common;

public final class AdProto {
  private AdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_Ad_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_Ad_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_TextAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_TextAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_ExpandedTextAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_ExpandedTextAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_ResponsiveDisplayAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_ResponsiveDisplayAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_CallOnlyAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_CallOnlyAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_ExpandedDynamicSearchAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_ExpandedDynamicSearchAdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_common_HotelAdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_common_HotelAdInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'google/ads/googleads/v0/common/ad.prot" +
      "o\022\036google.ads.googleads.v0.common\0325googl" +
      "e/ads/googleads/v0/common/custom_paramet" +
      "er.proto\032+google/ads/googleads/v0/enums/" +
      "ad_type.proto\032\036google/protobuf/wrappers." +
      "proto\"\312\007\n\002Ad\022\'\n\002id\030\001 \001(\0132\033.google.protob" +
      "uf.Int64Value\0220\n\nfinal_urls\030\002 \003(\0132\034.goog" +
      "le.protobuf.StringValue\0227\n\021final_mobile_" +
      "urls\030\020 \003(\0132\034.google.protobuf.StringValue" +
      "\022;\n\025tracking_url_template\030\014 \001(\0132\034.google" +
      ".protobuf.StringValue\022N\n\025url_custom_para" +
      "meters\030\n \003(\0132/.google.ads.googleads.v0.c" +
      "ommon.CustomParameter\0221\n\013display_url\030\004 \001" +
      "(\0132\034.google.protobuf.StringValue\022>\n\004type" +
      "\030\005 \001(\01620.google.ads.googleads.v0.enums.A" +
      "dTypeEnum.AdType\022=\n\007text_ad\030\006 \001(\0132*.goog" +
      "le.ads.googleads.v0.common.TextAdInfoH\000\022" +
      "N\n\020expanded_text_ad\030\007 \001(\01322.google.ads.g" +
      "oogleads.v0.common.ExpandedTextAdInfoH\000\022" +
      "P\n\021dynamic_search_ad\030\010 \001(\01323.google.ads." +
      "googleads.v0.common.DynamicSearchAdInfoH" +
      "\000\022X\n\025responsive_display_ad\030\t \001(\01327.googl" +
      "e.ads.googleads.v0.common.ResponsiveDisp" +
      "layAdInfoH\000\022F\n\014call_only_ad\030\r \001(\0132..goog" +
      "le.ads.googleads.v0.common.CallOnlyAdInf" +
      "oH\000\022a\n\032expanded_dynamic_search_ad\030\016 \001(\0132" +
      ";.google.ads.googleads.v0.common.Expande" +
      "dDynamicSearchAdInfoH\000\022?\n\010hotel_ad\030\017 \001(\013" +
      "2+.google.ads.googleads.v0.common.HotelA" +
      "dInfoH\000B\t\n\007ad_data\"\244\001\n\nTextAdInfo\022.\n\010hea" +
      "dline\030\001 \001(\0132\034.google.protobuf.StringValu" +
      "e\0222\n\014description1\030\002 \001(\0132\034.google.protobu" +
      "f.StringValue\0222\n\014description2\030\003 \001(\0132\034.go" +
      "ogle.protobuf.StringValue\"\215\002\n\022ExpandedTe" +
      "xtAdInfo\0224\n\016headline_part1\030\001 \001(\0132\034.googl" +
      "e.protobuf.StringValue\0224\n\016headline_part2" +
      "\030\002 \001(\0132\034.google.protobuf.StringValue\0221\n\013" +
      "description\030\003 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\022+\n\005path1\030\004 \001(\0132\034.google.protobuf" +
      ".StringValue\022+\n\005path2\030\005 \001(\0132\034.google.pro" +
      "tobuf.StringValue\"}\n\023DynamicSearchAdInfo" +
      "\0222\n\014description1\030\001 \001(\0132\034.google.protobuf" +
      ".StringValue\0222\n\014description2\030\002 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\"\354\001\n\027ResponsiveD" +
      "isplayAdInfo\0224\n\016short_headline\030\001 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\0223\n\rlong_headl" +
      "ine\030\002 \001(\0132\034.google.protobuf.StringValue\022" +
      "1\n\013description\030\003 \001(\0132\034.google.protobuf.S" +
      "tringValue\0223\n\rbusiness_name\030\004 \001(\0132\034.goog" +
      "le.protobuf.StringValue\"\311\003\n\016CallOnlyAdIn" +
      "fo\0222\n\014country_code\030\001 \001(\0132\034.google.protob" +
      "uf.StringValue\0222\n\014phone_number\030\002 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\0223\n\rbusiness_n" +
      "ame\030\003 \001(\0132\034.google.protobuf.StringValue\022" +
      "2\n\014description1\030\004 \001(\0132\034.google.protobuf." +
      "StringValue\0222\n\014description2\030\005 \001(\0132\034.goog" +
      "le.protobuf.StringValue\0220\n\014call_tracked\030" +
      "\006 \001(\0132\032.google.protobuf.BoolValue\022;\n\027dis" +
      "able_call_conversion\030\007 \001(\0132\032.google.prot" +
      "obuf.BoolValue\022C\n\035phone_number_verificat" +
      "ion_url\030\010 \001(\0132\034.google.protobuf.StringVa" +
      "lue\"P\n\033ExpandedDynamicSearchAdInfo\0221\n\013de" +
      "scription\030\001 \001(\0132\034.google.protobuf.String" +
      "Value\"\r\n\013HotelAdInfoB\275\001\n\"com.google.ads." +
      "googleads.v0.commonB\007AdProtoP\001ZDgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v0/common;common\242\002\003GAA\252\002\036Google.Ads." +
      "GoogleAds.V0.Common\312\002\036Google\\Ads\\GoogleA" +
      "ds\\V0\\Commonb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.AdTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_common_Ad_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_common_Ad_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_Ad_descriptor,
        new java.lang.String[] { "Id", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "DisplayUrl", "Type", "TextAd", "ExpandedTextAd", "DynamicSearchAd", "ResponsiveDisplayAd", "CallOnlyAd", "ExpandedDynamicSearchAd", "HotelAd", "AdData", });
    internal_static_google_ads_googleads_v0_common_TextAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_common_TextAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_TextAdInfo_descriptor,
        new java.lang.String[] { "Headline", "Description1", "Description2", });
    internal_static_google_ads_googleads_v0_common_ExpandedTextAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_common_ExpandedTextAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_ExpandedTextAdInfo_descriptor,
        new java.lang.String[] { "HeadlinePart1", "HeadlinePart2", "Description", "Path1", "Path2", });
    internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_descriptor,
        new java.lang.String[] { "Description1", "Description2", });
    internal_static_google_ads_googleads_v0_common_ResponsiveDisplayAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_common_ResponsiveDisplayAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_ResponsiveDisplayAdInfo_descriptor,
        new java.lang.String[] { "ShortHeadline", "LongHeadline", "Description", "BusinessName", });
    internal_static_google_ads_googleads_v0_common_CallOnlyAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v0_common_CallOnlyAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_CallOnlyAdInfo_descriptor,
        new java.lang.String[] { "CountryCode", "PhoneNumber", "BusinessName", "Description1", "Description2", "CallTracked", "DisableCallConversion", "PhoneNumberVerificationUrl", });
    internal_static_google_ads_googleads_v0_common_ExpandedDynamicSearchAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v0_common_ExpandedDynamicSearchAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_ExpandedDynamicSearchAdInfo_descriptor,
        new java.lang.String[] { "Description", });
    internal_static_google_ads_googleads_v0_common_HotelAdInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v0_common_HotelAdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_common_HotelAdInfo_descriptor,
        new java.lang.String[] { });
    com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v0.enums.AdTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
