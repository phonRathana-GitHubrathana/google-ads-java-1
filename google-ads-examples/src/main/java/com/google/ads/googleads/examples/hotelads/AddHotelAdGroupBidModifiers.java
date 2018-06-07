// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.hotelads;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.GoogleAdsException;
import com.google.ads.googleads.v0.common.HotelCheckInDayInfo;
import com.google.ads.googleads.v0.common.HotelLengthOfStayInfo;
import com.google.ads.googleads.v0.errors.GoogleAdsError;
import com.google.ads.googleads.v0.resources.AdGroupBidModifier;
import com.google.ads.googleads.v0.resources.AdGroupBidModifierName;
import com.google.ads.googleads.v0.resources.AdGroupName;
import com.google.ads.googleads.v0.services.AdGroupBidModifierOperation;
import com.google.ads.googleads.v0.services.AdGroupBidModifierServiceClient;
import com.google.ads.googleads.v0.services.MutateAdGroupBidModifierResult;
import com.google.ads.googleads.v0.services.MutateAdGroupBidModifiersResponse;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example shows how to add ad group bid modifiers to a hotel ad group.
 *
 * <p>Ad group bid modifiers based on hotel check-in day and hotel length of stay will be added.
 *
 * <p>For hotel check-in day, you need to specify the resource name, which includes the fixed
 * criterion ID of the check-in day you want to set. In addition, you don't call {@link
 * com.google.ads.googleads.v0.resources.AdGroupBidModifier.Builder#setAdGroup(StringValue)} to set
 * an ad group for this bid modifier type.
 *
 * <p>For hotel length of stay, you don't need to specify the resource name, but need to call {@link
 * com.google.ads.googleads.v0.resources.AdGroupBidModifier.Builder#setAdGroup(StringValue)} to set
 * an ad group instead.
 */
public class AddHotelAdGroupBidModifiers {

  private static class AddHotelAdGroupBidModifiersParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    /**
     * The criterion ID for the bid modifier. Defaults to 60, which represents Monday. See the table
     * of check-in days and criterion IDs at:
     * https://developers.google.com/google-ads/api/docs/hotel-ads/create-ad-group-bid-modifier#hotelcheckindayinfo
     */
    @Parameter(names = ArgumentNames.CRITERION_ID)
    private long criterionId = 60;
  }

  public static void main(String[] args) {
    AddHotelAdGroupBidModifiersParams params = new AddHotelAdGroupBidModifiersParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      // Optional: To use a different check-in day criterion ID from the default (Monday), uncomment
      // the line below and insert the desired criterion ID.
      // params.criterionId = Long.parseLong("INSERT_HOTEL_CHECK_IN_DAY_CRITERION_ID_HERE");
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new AddHotelAdGroupBidModifiers()
          .runExample(googleAdsClient, params.customerId, params.adGroupId, params.criterionId);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsErrors that indicate the underlying causes of the
      // GoogleAdsException.
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError);
      }
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupId the ID of the ad group.
   * @param checkInDayCriterionId the criterion ID of the hotel check-in day to set a bid modifier
   *     for
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long adGroupId,
      long checkInDayCriterionId) {
    List<AdGroupBidModifierOperation> operations = new ArrayList<>();

    // 1) Creates an ad group bid modifier based on the hotel check-in day.
    AdGroupBidModifier checkInDayAdGroupBidModifier =
        AdGroupBidModifier.newBuilder()
            // Sets the resource name to the ad group resource name joined with the criterion ID
            // whose value corresponds to the desired check-in day.
            .setResourceName(
                AdGroupBidModifierName.format(
                    Long.toString(customerId),
                    String.format("%d_%d", adGroupId, checkInDayCriterionId)))
            // Sets the bid modifier value to 150%.
            .setBidModifier(DoubleValue.of(1.5d))
            .setHotelCheckInDay(HotelCheckInDayInfo.newBuilder().build())
            .build();
    operations.add(
        AdGroupBidModifierOperation.newBuilder().setCreate(checkInDayAdGroupBidModifier).build());

    // 2) Creates an ad group bid modifier based on the hotel length of stay.
    AdGroupBidModifier lengthOfStayAdGroupBidModifier =
        AdGroupBidModifier.newBuilder()
            // Sets the ad group.
            .setAdGroup(
                StringValue.of(
                    AdGroupName.format(Long.toString(customerId), Long.toString(adGroupId))))
            // Creates the hotel length of stay info.
            .setHotelLengthOfStay(
                HotelLengthOfStayInfo.newBuilder()
                    .setMinNights(Int64Value.of(3L))
                    .setMaxNights(Int64Value.of(7L))
                    .build())
            // Sets the bid modifier value to 170%.
            .setBidModifier(DoubleValue.of(1.7d))
            .build();
    operations.add(
        AdGroupBidModifierOperation.newBuilder().setCreate(lengthOfStayAdGroupBidModifier).build());

    // Issues a mutate request to add the ad group bid modifiers.
    try (AdGroupBidModifierServiceClient adGroupBidModifierServiceClient =
        googleAdsClient.getAdGroupBidModifierServiceClient()) {
      MutateAdGroupBidModifiersResponse response =
          adGroupBidModifierServiceClient.mutateAdGroupBidModifiers(
              Long.toString(customerId), operations);

      // Print the resource names of the added ad group bid modifiers.
      System.out.printf("Added %d hotel ad group bid modifiers: %d%n", response.getResultsCount());
      for (MutateAdGroupBidModifierResult mutateAdGroupBidModifierResult :
          response.getResultsList()) {
        System.out.printf("  %s%n", mutateAdGroupBidModifierResult.getResourceName());
      }
    }
  }
}
