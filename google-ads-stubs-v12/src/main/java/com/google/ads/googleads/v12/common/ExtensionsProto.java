// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/extensions.proto

package com.google.ads.googleads.v12.common;

public final class ExtensionsProto {
  private ExtensionsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_AppFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_AppFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_CallFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_CallFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_CalloutFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_CalloutFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_LocationFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_LocationFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_AffiliateLocationFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_AffiliateLocationFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_TextMessageFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_TextMessageFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_PriceFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_PriceFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_PriceOffer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_PriceOffer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_PromotionFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_PromotionFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_StructuredSnippetFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_StructuredSnippetFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_SitelinkFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_SitelinkFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_HotelCalloutFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_HotelCalloutFeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_common_ImageFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_common_ImageFeedItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v12/common/extens" +
      "ions.proto\022\037google.ads.googleads.v12.com" +
      "mon\0326google/ads/googleads/v12/common/cus" +
      "tom_parameter.proto\0321google/ads/googlead" +
      "s/v12/common/feed_common.proto\032.google/a" +
      "ds/googleads/v12/enums/app_store.proto\032D" +
      "google/ads/googleads/v12/enums/call_conv" +
      "ersion_reporting_state.proto\032Dgoogle/ads" +
      "/googleads/v12/enums/price_extension_pri" +
      "ce_qualifier.proto\032?google/ads/googleads" +
      "/v12/enums/price_extension_price_unit.pr" +
      "oto\0329google/ads/googleads/v12/enums/pric" +
      "e_extension_type.proto\032Jgoogle/ads/googl" +
      "eads/v12/enums/promotion_extension_disco" +
      "unt_modifier.proto\032Agoogle/ads/googleads" +
      "/v12/enums/promotion_extension_occasion." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\"\217\003\n\013AppFeedIte" +
      "m\022\026\n\tlink_text\030\t \001(\tH\000\210\001\001\022\023\n\006app_id\030\n \001(" +
      "\tH\001\210\001\001\022H\n\tapp_store\030\003 \001(\01625.google.ads.g" +
      "oogleads.v12.enums.AppStoreEnum.AppStore" +
      "\022\022\n\nfinal_urls\030\013 \003(\t\022\031\n\021final_mobile_url" +
      "s\030\014 \003(\t\022\"\n\025tracking_url_template\030\r \001(\tH\002" +
      "\210\001\001\022O\n\025url_custom_parameters\030\007 \003(\01320.goo" +
      "gle.ads.googleads.v12.common.CustomParam" +
      "eter\022\035\n\020final_url_suffix\030\016 \001(\tH\003\210\001\001B\014\n\n_" +
      "link_textB\t\n\007_app_idB\030\n\026_tracking_url_te" +
      "mplateB\023\n\021_final_url_suffix\"\303\003\n\014CallFeed" +
      "Item\022\031\n\014phone_number\030\007 \001(\tH\000\210\001\001\022\031\n\014count" +
      "ry_code\030\010 \001(\tH\001\210\001\001\022\"\n\025call_tracking_enab" +
      "led\030\t \001(\010H\002\210\001\001\022#\n\026call_conversion_action" +
      "\030\n \001(\tH\003\210\001\001\022.\n!call_conversion_tracking_" +
      "disabled\030\013 \001(\010H\004\210\001\001\022\206\001\n\037call_conversion_" +
      "reporting_state\030\006 \001(\0162].google.ads.googl" +
      "eads.v12.enums.CallConversionReportingSt" +
      "ateEnum.CallConversionReportingStateB\017\n\r" +
      "_phone_numberB\017\n\r_country_codeB\030\n\026_call_" +
      "tracking_enabledB\031\n\027_call_conversion_act" +
      "ionB$\n\"_call_conversion_tracking_disable" +
      "d\"=\n\017CalloutFeedItem\022\031\n\014callout_text\030\002 \001" +
      "(\tH\000\210\001\001B\017\n\r_callout_text\"\342\002\n\020LocationFee" +
      "dItem\022\032\n\rbusiness_name\030\t \001(\tH\000\210\001\001\022\033\n\016add" +
      "ress_line_1\030\n \001(\tH\001\210\001\001\022\033\n\016address_line_2" +
      "\030\013 \001(\tH\002\210\001\001\022\021\n\004city\030\014 \001(\tH\003\210\001\001\022\025\n\010provin" +
      "ce\030\r \001(\tH\004\210\001\001\022\030\n\013postal_code\030\016 \001(\tH\005\210\001\001\022" +
      "\031\n\014country_code\030\017 \001(\tH\006\210\001\001\022\031\n\014phone_numb" +
      "er\030\020 \001(\tH\007\210\001\001B\020\n\016_business_nameB\021\n\017_addr" +
      "ess_line_1B\021\n\017_address_line_2B\007\n\005_cityB\013" +
      "\n\t_provinceB\016\n\014_postal_codeB\017\n\r_country_" +
      "codeB\017\n\r_phone_number\"\267\003\n\031AffiliateLocat" +
      "ionFeedItem\022\032\n\rbusiness_name\030\013 \001(\tH\000\210\001\001\022" +
      "\033\n\016address_line_1\030\014 \001(\tH\001\210\001\001\022\033\n\016address_" +
      "line_2\030\r \001(\tH\002\210\001\001\022\021\n\004city\030\016 \001(\tH\003\210\001\001\022\025\n\010" +
      "province\030\017 \001(\tH\004\210\001\001\022\030\n\013postal_code\030\020 \001(\t" +
      "H\005\210\001\001\022\031\n\014country_code\030\021 \001(\tH\006\210\001\001\022\031\n\014phon" +
      "e_number\030\022 \001(\tH\007\210\001\001\022\025\n\010chain_id\030\023 \001(\003H\010\210" +
      "\001\001\022\027\n\nchain_name\030\024 \001(\tH\t\210\001\001B\020\n\016_business" +
      "_nameB\021\n\017_address_line_1B\021\n\017_address_lin" +
      "e_2B\007\n\005_cityB\013\n\t_provinceB\016\n\014_postal_cod" +
      "eB\017\n\r_country_codeB\017\n\r_phone_numberB\013\n\t_" +
      "chain_idB\r\n\013_chain_name\"\347\001\n\023TextMessageF" +
      "eedItem\022\032\n\rbusiness_name\030\006 \001(\tH\000\210\001\001\022\031\n\014c" +
      "ountry_code\030\007 \001(\tH\001\210\001\001\022\031\n\014phone_number\030\010" +
      " \001(\tH\002\210\001\001\022\021\n\004text\030\t \001(\tH\003\210\001\001\022\033\n\016extensio" +
      "n_text\030\n \001(\tH\004\210\001\001B\020\n\016_business_nameB\017\n\r_" +
      "country_codeB\017\n\r_phone_numberB\007\n\005_textB\021" +
      "\n\017_extension_text\"\306\003\n\rPriceFeedItem\022W\n\004t" +
      "ype\030\001 \001(\0162I.google.ads.googleads.v12.enu" +
      "ms.PriceExtensionTypeEnum.PriceExtension" +
      "Type\022v\n\017price_qualifier\030\002 \001(\0162].google.a" +
      "ds.googleads.v12.enums.PriceExtensionPri" +
      "ceQualifierEnum.PriceExtensionPriceQuali" +
      "fier\022\"\n\025tracking_url_template\030\007 \001(\tH\000\210\001\001" +
      "\022\032\n\rlanguage_code\030\010 \001(\tH\001\210\001\001\022D\n\017price_of" +
      "ferings\030\005 \003(\0132+.google.ads.googleads.v12" +
      ".common.PriceOffer\022\035\n\020final_url_suffix\030\t" +
      " \001(\tH\002\210\001\001B\030\n\026_tracking_url_templateB\020\n\016_" +
      "language_codeB\023\n\021_final_url_suffix\"\237\002\n\nP" +
      "riceOffer\022\023\n\006header\030\007 \001(\tH\000\210\001\001\022\030\n\013descri" +
      "ption\030\010 \001(\tH\001\210\001\001\0225\n\005price\030\003 \001(\0132&.google" +
      ".ads.googleads.v12.common.Money\022a\n\004unit\030" +
      "\004 \001(\0162S.google.ads.googleads.v12.enums.P" +
      "riceExtensionPriceUnitEnum.PriceExtensio" +
      "nPriceUnit\022\022\n\nfinal_urls\030\t \003(\t\022\031\n\021final_" +
      "mobile_urls\030\n \003(\tB\t\n\007_headerB\016\n\014_descrip" +
      "tion\"\260\007\n\021PromotionFeedItem\022\035\n\020promotion_" +
      "target\030\020 \001(\tH\002\210\001\001\022\204\001\n\021discount_modifier\030" +
      "\002 \001(\0162i.google.ads.googleads.v12.enums.P" +
      "romotionExtensionDiscountModifierEnum.Pr" +
      "omotionExtensionDiscountModifier\022!\n\024prom" +
      "otion_start_date\030\023 \001(\tH\003\210\001\001\022\037\n\022promotion" +
      "_end_date\030\024 \001(\tH\004\210\001\001\022k\n\010occasion\030\t \001(\0162Y" +
      ".google.ads.googleads.v12.enums.Promotio" +
      "nExtensionOccasionEnum.PromotionExtensio" +
      "nOccasion\022\022\n\nfinal_urls\030\025 \003(\t\022\031\n\021final_m" +
      "obile_urls\030\026 \003(\t\022\"\n\025tracking_url_templat" +
      "e\030\027 \001(\tH\005\210\001\001\022O\n\025url_custom_parameters\030\r " +
      "\003(\01320.google.ads.googleads.v12.common.Cu" +
      "stomParameter\022\035\n\020final_url_suffix\030\030 \001(\tH" +
      "\006\210\001\001\022\032\n\rlanguage_code\030\031 \001(\tH\007\210\001\001\022\025\n\013perc" +
      "ent_off\030\021 \001(\003H\000\022B\n\020money_amount_off\030\004 \001(" +
      "\0132&.google.ads.googleads.v12.common.Mone" +
      "yH\000\022\030\n\016promotion_code\030\022 \001(\tH\001\022D\n\022orders_" +
      "over_amount\030\006 \001(\0132&.google.ads.googleads" +
      ".v12.common.MoneyH\001B\017\n\rdiscount_typeB\023\n\021" +
      "promotion_triggerB\023\n\021_promotion_targetB\027" +
      "\n\025_promotion_start_dateB\025\n\023_promotion_en" +
      "d_dateB\030\n\026_tracking_url_templateB\023\n\021_fin" +
      "al_url_suffixB\020\n\016_language_code\"K\n\031Struc" +
      "turedSnippetFeedItem\022\023\n\006header\030\003 \001(\tH\000\210\001" +
      "\001\022\016\n\006values\030\004 \003(\tB\t\n\007_header\"\346\002\n\020Sitelin" +
      "kFeedItem\022\026\n\tlink_text\030\t \001(\tH\000\210\001\001\022\022\n\005lin" +
      "e1\030\n \001(\tH\001\210\001\001\022\022\n\005line2\030\013 \001(\tH\002\210\001\001\022\022\n\nfin" +
      "al_urls\030\014 \003(\t\022\031\n\021final_mobile_urls\030\r \003(\t" +
      "\022\"\n\025tracking_url_template\030\016 \001(\tH\003\210\001\001\022O\n\025" +
      "url_custom_parameters\030\007 \003(\01320.google.ads" +
      ".googleads.v12.common.CustomParameter\022\035\n" +
      "\020final_url_suffix\030\017 \001(\tH\004\210\001\001B\014\n\n_link_te" +
      "xtB\010\n\006_line1B\010\n\006_line2B\030\n\026_tracking_url_" +
      "templateB\023\n\021_final_url_suffix\"`\n\024HotelCa" +
      "lloutFeedItem\022\021\n\004text\030\003 \001(\tH\000\210\001\001\022\032\n\rlang" +
      "uage_code\030\004 \001(\tH\001\210\001\001B\007\n\005_textB\020\n\016_langua" +
      "ge_code\"L\n\rImageFeedItem\022;\n\013image_asset\030" +
      "\001 \001(\tB&\340A\002\372A \n\036googleads.googleapis.com/" +
      "AssetB\357\001\n#com.google.ads.googleads.v12.c" +
      "ommonB\017ExtensionsProtoP\001ZEgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "2/common;common\242\002\003GAA\252\002\037Google.Ads.Googl" +
      "eAds.V12.Common\312\002\037Google\\Ads\\GoogleAds\\V" +
      "12\\Common\352\002#Google::Ads::GoogleAds::V12:" +
      ":Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v12.common.FeedCommonProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.AppStoreProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.CallConversionReportingStateProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.PriceExtensionPriceQualifierProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.PriceExtensionPriceUnitProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.PriceExtensionTypeProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.PromotionExtensionDiscountModifierProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.PromotionExtensionOccasionProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_common_AppFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_common_AppFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_AppFeedItem_descriptor,
        new java.lang.String[] { "LinkText", "AppId", "AppStore", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", "LinkText", "AppId", "TrackingUrlTemplate", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v12_common_CallFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_common_CallFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_CallFeedItem_descriptor,
        new java.lang.String[] { "PhoneNumber", "CountryCode", "CallTrackingEnabled", "CallConversionAction", "CallConversionTrackingDisabled", "CallConversionReportingState", "PhoneNumber", "CountryCode", "CallTrackingEnabled", "CallConversionAction", "CallConversionTrackingDisabled", });
    internal_static_google_ads_googleads_v12_common_CalloutFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_common_CalloutFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_CalloutFeedItem_descriptor,
        new java.lang.String[] { "CalloutText", "CalloutText", });
    internal_static_google_ads_googleads_v12_common_LocationFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v12_common_LocationFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_LocationFeedItem_descriptor,
        new java.lang.String[] { "BusinessName", "AddressLine1", "AddressLine2", "City", "Province", "PostalCode", "CountryCode", "PhoneNumber", "BusinessName", "AddressLine1", "AddressLine2", "City", "Province", "PostalCode", "CountryCode", "PhoneNumber", });
    internal_static_google_ads_googleads_v12_common_AffiliateLocationFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v12_common_AffiliateLocationFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_AffiliateLocationFeedItem_descriptor,
        new java.lang.String[] { "BusinessName", "AddressLine1", "AddressLine2", "City", "Province", "PostalCode", "CountryCode", "PhoneNumber", "ChainId", "ChainName", "BusinessName", "AddressLine1", "AddressLine2", "City", "Province", "PostalCode", "CountryCode", "PhoneNumber", "ChainId", "ChainName", });
    internal_static_google_ads_googleads_v12_common_TextMessageFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v12_common_TextMessageFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_TextMessageFeedItem_descriptor,
        new java.lang.String[] { "BusinessName", "CountryCode", "PhoneNumber", "Text", "ExtensionText", "BusinessName", "CountryCode", "PhoneNumber", "Text", "ExtensionText", });
    internal_static_google_ads_googleads_v12_common_PriceFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v12_common_PriceFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_PriceFeedItem_descriptor,
        new java.lang.String[] { "Type", "PriceQualifier", "TrackingUrlTemplate", "LanguageCode", "PriceOfferings", "FinalUrlSuffix", "TrackingUrlTemplate", "LanguageCode", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v12_common_PriceOffer_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v12_common_PriceOffer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_PriceOffer_descriptor,
        new java.lang.String[] { "Header", "Description", "Price", "Unit", "FinalUrls", "FinalMobileUrls", "Header", "Description", });
    internal_static_google_ads_googleads_v12_common_PromotionFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v12_common_PromotionFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_PromotionFeedItem_descriptor,
        new java.lang.String[] { "PromotionTarget", "DiscountModifier", "PromotionStartDate", "PromotionEndDate", "Occasion", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", "LanguageCode", "PercentOff", "MoneyAmountOff", "PromotionCode", "OrdersOverAmount", "DiscountType", "PromotionTrigger", "PromotionTarget", "PromotionStartDate", "PromotionEndDate", "TrackingUrlTemplate", "FinalUrlSuffix", "LanguageCode", });
    internal_static_google_ads_googleads_v12_common_StructuredSnippetFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v12_common_StructuredSnippetFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_StructuredSnippetFeedItem_descriptor,
        new java.lang.String[] { "Header", "Values", "Header", });
    internal_static_google_ads_googleads_v12_common_SitelinkFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v12_common_SitelinkFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_SitelinkFeedItem_descriptor,
        new java.lang.String[] { "LinkText", "Line1", "Line2", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", "LinkText", "Line1", "Line2", "TrackingUrlTemplate", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v12_common_HotelCalloutFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_ads_googleads_v12_common_HotelCalloutFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_HotelCalloutFeedItem_descriptor,
        new java.lang.String[] { "Text", "LanguageCode", "Text", "LanguageCode", });
    internal_static_google_ads_googleads_v12_common_ImageFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_ads_googleads_v12_common_ImageFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_common_ImageFeedItem_descriptor,
        new java.lang.String[] { "ImageAsset", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v12.common.FeedCommonProto.getDescriptor();
    com.google.ads.googleads.v12.enums.AppStoreProto.getDescriptor();
    com.google.ads.googleads.v12.enums.CallConversionReportingStateProto.getDescriptor();
    com.google.ads.googleads.v12.enums.PriceExtensionPriceQualifierProto.getDescriptor();
    com.google.ads.googleads.v12.enums.PriceExtensionPriceUnitProto.getDescriptor();
    com.google.ads.googleads.v12.enums.PriceExtensionTypeProto.getDescriptor();
    com.google.ads.googleads.v12.enums.PromotionExtensionDiscountModifierProto.getDescriptor();
    com.google.ads.googleads.v12.enums.PromotionExtensionOccasionProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
