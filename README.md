![License](https://img.shields.io/badge/license-Apache--2.0-blue.svg)
![progress](https://img.shields.io/badge/progress-developing-yellow.svg)
![contributions](https://img.shields.io/badge/contributions-welcome-green.svg)
<br>
![Unity Version](https://img.shields.io/badge/Unity%20Plugin-4.7.0-808080.svg)
![Android Version](https://img.shields.io/badge/Android%20SDK-4.6.4-808080.svg)
![iOS Version](https://img.shields.io/badge/iOS%20SDK-4.7.2-808080.svg)

# AdColony SDK Unity Plugin
- [Requirements](#requirements)
- [Overview](#overview)
- [Release Notes](#release-notes)
- [How to Build](#how-to-build)
- [Getting Started](#getting-started)
    - [Retrieve AdColony App and Zone Ids](#retrieve-adColony-app-and-zone-ids)
    - [Installation](#installation)
    - [Showing Ads](#showing-ads)
- [Gradle Integration](#gradle-integration)
- [GDPR](#gdpr)
- [Legal Requirements](#legal-requirements)
- [Contact Us](#contact-us)
- [License](#license)

# Requirements
- Mac OS *(feel free to add Windows support and make a pull request!)*
    - Case-insensitive file system, see Unity issues: [feedback.unity3d.com](https://feedback.unity3d.com/suggestions/editor-support-casesensitive-f), [forum.unity.com](https://forum.unity.com/threads/is-unity-ever-going-to-support-a-case-sensitive-filesystem.412139/)
- [Unity 5.x+](https://unity3d.com/get-unity/download)
- [Android SDK](https://developer.android.com/studio/#downloads)
- [Cocoapods](https://cocoapods.org/) >= 1.10 for iOS

# Overview
AdColony delivers zero-buffering, [full-screen Instant-Play™ HD video](https://www.adcolony.com/technology/instant-play/), [interactive Aurora™ Video](https://www.adcolony.com/technology/auroravideo), and Aurora™ Playable ads that can be displayed anywhere within your application. Our advertising SDK is trusted by the world’s top gaming and non-gaming publishers, delivering them the highest monetization opportunities from brand and performance advertisers. AdColony’s SDK can monetize a wide range of ad formats including in-stream/pre-roll, out-stream/interstitial and V4VC™, a secure system for rewarding users of your app with virtual currency upon the completion of video and playable ads.

# Release Notes
## v4.7.0.0 (2021/09/23)
* Updated to AdColony SDK 4.7.2 (iOS) and SDK 4.6.4 (Android).

## v4.6.0.0 (2021/05/13)
* Fixed ExternalDependencyManager problems and cleaned out warnings.
* Updated Android release process.
* Updated to AdColony SDK 4.6.1 (iOS) and SDK 4.5.0 (Android).

## v4.5.0.0 (2021/01/28)
* Updated to AdColony SDK 4.5.0 (iOS) and SDK 4.4.1 (Android).

## v4.4.1.0 (2020/10/15)
* Fixed banner ad on fail callback issue.
* Added support logAdImpression and logAppOpen PI events
* Updated to AdColony SDK 4.4.1 (iOS) and 4.3.0 (Android).

## v4.4.0.0 (2020/09/28)
* Updated to AdColony SDK 4.4.0(iOS).

## v4.3.2.0 (2020/09/16)
* Fixed build issue for unity v2019 and greater.
* Updated to AdColony SDK 4.2.4(Android).

## v4.3.1.0 (2020/08/27)
* Updated to AdColony SDK 4.3.1 (iOS) and 4.2.2 (Android).

## v4.2.0.0 (2020/07/17)
* Updated to AdColony SDK 4.2.0 (iOS) and 4.2.0 (Android).

## v4.1.5.0 (2020/05/28)
* Updated to AdColony SDK 4.1.5 (iOS) and 4.1.4 (Android).

## v4.1.3.0 (2020/02/13)
* Updated to AdColony SDK 4.1.3 (iOS) and 4.1.3 (Android).
* Added show and hide APIs for banner ad.
* Added destroy ad API for Interstitial ad.

## v4.1.2.0 (2019/10/24)
* Updated to AdColony SDK 4.1.2 (iOS).
* Fixed NPE crash issue in android plugin.

## v4.1.1 (2019/10/09)
* Updated to AdColony SDK 4.1.1 (iOS).

## v4.1.0 (2019/09/27)
* Updated to AdColony SDK 4.1.0 (iOS/Android).
* Added support for banners.

## v3.3.11 (2019/07/15)
* Updated to AdColony SDK 3.3.11 (Android)
* [Android] Fixed ConcurrentModificationException that was exposed with a server-side update.
* [Android] Fixed an issue related to partial downloads that potentially caused AdColony to become disabled.

## v3.3.10 (2019/06/12)
* Updated to AdColony SDK 3.3.8.1 (iOS) and 3.3.10 (Android)
* [iOS] Fixed a bug where click action for some of the ads was not working.
* [Android] Improved WebView behavior for duties previously handled by our shared object libraries.

## v3.3.9 (2019/03/20)
* Updated to AdColony SDK 3.3.9 (Android)
* [Android] Fixed NullPointerException that stopped ads from being served on Android Lollipop devices with the 3.3.7 and 3.3.8 SDKs.

## v3.3.8 (01/25/2019)
* Updated to AdColony SDK 3.3.7 (iOS) and 3.3.8 (Android)
* [iOS] Fixed a CPU watchdog transgression.
* [iOS] Fixed a memory leak that could cause UIView objects to stay in memory past their lifetime.
* [iOS] Added advanced logging for inconsistent view controller orientations.
* [iOS] Several other bug fixes and stability improvements.
* [Android] Handled RuntimeExceptions that can occur during WebView initialization if the device reports that it is missing the WebView package.

## v3.3.7 (12/06/2018)
* Updated to AdColony SDK 3.3.7 (Android)
* [Android] Significant stability improvements related to memory consumption.
* [Android] Reduced ad request response times.
* [Android] Removed shared object (.so) libraries, reducing the size of our SDK distribution by 94% in the process, as well as addressing issues [#25](https://github.com/AdColony/AdColony-Android-SDK-3/issues/25), [#33](https://github.com/AdColony/AdColony-Android-SDK-3/issues/33), and [#38](https://github.com/AdColony/AdColony-Android-SDK-3/issues/38).

## v3.3.6 (11/19/2018)
* Updated to AdColony SDK 3.3.6 (iOS/Android)
* Several bug fixes and stability improvements.
* [iOS] Added support for silencing audio with the Ringer/Silent switch. This is configurable on the clients.adcolony.com dashboard.
* [iOS] Audio session will not activate until an ad plays.
* [Android] Added additional configure() signatures that accept an Application context instead of Activity.
* [Android] Deprecated AdColonyAdViewActivity, AdColonyNativeAdView, and onAudioStarted/onAudioStopped() callbacks.
* [Android] Handle API level 28 changes for [default cleartext traffic behavior](https://developer.android.com/about/versions/pie/android-9.0-changes-28#framework-security-changes).

## v3.3.5 (7/18/2018)

* Officially open sourced Unity plugin
* Updated to AdColony SDK 3.3.5 (iOS/Android)
* Several bug fixes and stability improvements.
* [iOS] Removed requirement for the camera and calendar permissions. However, with these permissions enabled, you may be able to receive higher paying ads.
* [Android] Fixed RejectedExecutionException in issue [#37](https://github.com/AdColony/AdColony-Android-SDK-3/issues/37).
* [Android] Made Android SDK changes needed to fix the Unity OnConfigurationCompleted callback issue in [#35](https://github.com/AdColony/AdColony-Unity-SDK-3/issues/35).

## v3.3.4 (5/25/2018)

* Updated to AdColony SDK 3.3.4 (iOS/Android)
* [iOS] Fixed a bug where advertisement video's close button was not easily tappable because of the status bar overlapping.
* [iOS] Fixed a bug where unsafe access to the device's battery level was causing a crash mentioned in [iOS SDK issue #49](https://github.com/AdColony/AdColony-iOS-SDK-3/issues/49).
* [Android] Fixed new NullPointerException mentioned in [Android SDK issue #29](https://github.com/AdColony/AdColony-Android-SDK-3/issues/29#issuecomment-381380548).
* [Unity] Added a new API to pass user consent as required for compliance with the European Union's General Data Protection Regulation (GDPR). If you are collecting consent from your users, you can make use of this new API to inform AdColony and all downstream consumers of the consent. Please see our GDPR FAQ for more information and our GDPR wiki for implementation details.
* [Unity] Removed symbolic links from within native SDK
* [Unity] Fixed missing zone ID in some log statements
* [Unity] Fixed exception during OnRequestInterstitialFailed callback mentioned in [Unity Plugin issue #42](https://github.com/AdColony/AdColony-Unity-SDK-3/issues/42)
* [All] Several bug fixes and stability improvements.

See the full [release notes](https://github.com/AdColony/AdColony-Unity-SDK-3/blob/master/CHANGELOG.md) for more details.

# How to Build

To build the plugin, use the makefile from the Plugin folder:

```
cd Plugin
make
```

Included in this repository is a sample application you can use during your testing.

# Getting Started

## Retrieve AdColony App and Zone Ids

Log into [clients.adcolony.com](http://clients.adcolony.com/). If you have not already done so, create an app and needed zones on the website. To create new apps and video zones, locate the green buttons on the right-hand side of the Publisher section. Retrieve your **app ID** and your corresponding **zone IDs** from the AdColony website and make note of them for later use. Please reference the screenshots below on locations of the **app ID** and **zone IDs**.

<p align="center">
    <img src="images/portal_01.png" width="700" alt="Get app ID"/>
</p>

Click on the zone link at the bottom of the page to bring up the zone details.

<p align="center">
    <img src="images/portal_02.png" width="700" alt="Get zone ID"/>
</p>

In this case, the app id, `app4c2e4129ea7ce`, and zone id, `z4c2e422e48151` should be used to initialize the app and display ads within your project.

## Installation

1. In the Unity Editor, select "Assets"->"Import Package"->"Custom Package". Navigate to the location of the AdColony SDK Unity Plugin and select "AdColony.unitypackage".

    <p align="center">
        <img src="images/unity_import_01.png" width="700" alt="Import Package"/>
    </p>

2. Select "Import" to import all the assets into your project.

    <p align="center">
        <img src="images/unity_import_02.png" width="700" alt="Import Package"/>
    </p>

3. The AdColony SDK Unity Plugin includes Google's ExternalDependencyManager (EDM4U) (formerly Play Services Resolver / Jar Resolver) to automatically pull in necessary libraries. If there are conflicts with this, the `play-services-ads` and `adcolony-sdk` libraries are the only required. You can choose to ignore this ExternalDependencyManager installation by excluding `AdColony/Editor/ADCDependencies.xml`, `PlayServicesResolver` and `ExternalDependencyManager` files when importing `AdColony.unitypackage` and include the `play-services-ads` and `adcolony-sdk` in another way.

#### Upgrading from SDK 3.0.x:
In order to support thin/fat Android builds, we moved the native .so files from the `Plugins/Android/AdColony/libs` folder to the `Plugins/Android/libs` folder. Removing the `Plugins/Android/AdColony/libs` folder before importing is recommended.

#### Upgrading from SDK 2.x:
Please note that updating from our 2.x Unity Plugin is not a drag and drop update, but rather includes breaking API and process changes. In order to take advantage of the 3.x Unity Plugin, please remove the older plugin before installing.

## Showing Ads

The basics of using the AdColony SDK to serve ads to your users are:

#### Configure AdColony
The first step is to configure the AdColony SDK:

```csharp
    string[] zoneIds = new string[] { "zone_id_1", "zone_id_2" };
    AdColony.Ads.Configure(APP_ID, null, zoneIds);
```

You can configure the service more than once without any performance impact. If the service is already initialized with the same options and zones, the attempt will be ignored.

See the API documentation on how to use the `AppOptions`.

#### Showing Banner Ads
1. Register for callbacks

    After successful configuration of AdColony SDK, you need to register banner callbacks such as:

    * `OnAdViewLoaded` - Called when ad view has been loaded.
    * `OnAdViewFailedToLoad` - Called when ad view failed to load.

    For a complete listing of callbacks see `AdColony.cs`.

    ```cs
    AdColony.AdColonyAdView adView;

    AdColony.Ads.OnAdViewLoaded += (AdColony.AdColonyAdView ad) => {
        adView = ad;
    };

    AdColony.Ads.OnAdViewFailedToLoad += (AdColony.AdColonyAdView ad) => {
        Debug.Log("Banner ad failed to load");
    };
    ```

2. Request Banner Ad

    ```csharp
    AdColony.Ads.RequestAdView("zone_id_1", AdColony.AdSize.Banner, adOptions);
    ```

3. Additional APIs to show and hide Banner Ad

  ```csharp
  //Show the ad view.
  adView.ShowAdView();

  //Hide the ad view.
  adView.HideAdView();
  ```

4. Clean up Banner Ad: When AdColony.AdColonyAdView is no longer used, make sure to call DestroyAdView() method to avoid memory leaks. On the invocation of this method, the plugin will clean up memory occupied by this object:
    ```csharp
    adView.DestroyAdView();
    ```

#### Showing Interstitial Ads
1. Register for callbacks

    After successful configuration of AdColony SDK, you will also want to register for important service callbacks such as:

    * `OnRequestInterstitial` - Called when a requested ad is ready to be shown
    * `OnExpiring` - Called when an ad has expired (typically after 30-60 min), we suggest using this callback to request a new ad
    * `OnRewardGranted` - Called when user has completed a video from a rewarded video zone

    For a complete listing of callbacks see `AdColony.cs`.

    ```cs
    AdColony.InterstitialAd _ad = null;

    AdColony.Ads.OnRequestInterstitial += (AdColony.InterstitialAd ad) => {
        _ad = ad;
    };

    AdColony.Ads.OnExpiring += (AdColony.InterstitialAd ad) => {
        AdColony.Ads.RequestInterstitialAd(ad.ZoneId, null);
    };
    ```

2. Request an Interstitial Ad

    ```csharp
    AdColony.Ads.RequestInterstitialAd("zone_id_1", null);
    ```

3. Show the Interstitial Ad

    ```csharp
    if (_ad != null) {
        AdColony.Ads.ShowAd(_ad);
    }
    ```

4. Clean up Interstitial Ad: When AdColony.InterstitialAd is no longer used, make sure to call DestroyAd() method to avoid memory leaks. On the invocation of this method, the plugin will clean up memory occupied by this object.
    ```csharp
    interstitial.DestroyAd();
    ```

#### Showing Rewarded Interstitial Ads
Showing a rewarded video ad is very much like showing an interstital video ad. There are two subtle differences:
1. You can optionally show system alerts informing the user they are about to or have received an award using the ad options `ShowPrePopup` and `ShowPostPopup`.
    ```csharp
    AdColony.AdOptions adOptions = new AdColony.AdOptions();
    adOptions.ShowPrePopup = true;
    adOptions.ShowPostPopup = true;

    AdColony.Ads.RequestInterstitialAd("zone_id_1", adOptions);
    ```

2. If the ad comes from a zone set as rewarded from the developer portal, the `OnRewardGranted` event will be called after the user watches the ad. Within this callback is when the reward should then be granted to the user. If you have enabled server-to-server callbacks, this is when you should download new state from your server.
    ```csharp
    AdColony.Ads.OnRewardGranted += (string zoneId, bool success, string name, int amount) => {
        // Grant the reward to the user, or
        // request new state from the game server if using server-to-server callbacks
    };
    ```

To set your zone to a rewarded interstitial zone on the portal, select the following zone type:

<p align="center">
    <img src="images/v4vc-zone-config_01.png" width="700" alt="Get zone ID"/>
</p>

If using Proguard, add the following to your Proguard configuration:
```
# For communication with AdColony's WebView
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}

# Keep ADCNative class members unobfuscated
-keepclassmembers class com.adcolony.sdk.ADCNative** {
    *;
 }
```

Note: for more details on the AdColony Android setup, please refer to [AdColony Android Project Setup](https://github.com/AdColony/AdColony-Android-SDK-3/wiki/Project-Setup).

# GDPR

In compliance with the European Union's General Data Protection Regulation (GDPR), if you are collecting consent from your users, you can make use of APIs discussed below to inform AdColony and all downstream consumers of this information. Please see our [GDPR FAQ](https://www.adcolony.com/gdpr/) for more information.

### Passing Consent via AppOptions
In the Android SDK v4.2, we've modified the existing methods available to our AdColonyAppOptions API for additional support in GDPR compliance. We’ve also added support for version 2.0 of the IAB Transparency and Consent Framework (TCF).

We require the GDPR consent string to have a value of "1" or "0". A value of "1" implies the user has given consent to store and process personal information and a value of "0" means the user has declined consent.

#### Example Code
```csharp
AdColony.AppOptions appOptions = new AdColony.AppOptions();

// The value passed via setPrivacyFrameworkRequired() will determine the GDPR requirement of
// the user. If it's set to true, the user is subject to the GDPR laws.
appOptions.SetPrivacyFrameworkRequired(AdColony.AppOptions.GDPR, true);

// Your user's consent String. In this case, the user has given consent to store
// and process personal information. This value may be either O, 1, or an IAB consent string.
appOptions.SetPrivacyConsentString(AdColony.AppOptions.GDPR, "1");

AdColony.Ads.Configure(APP_ID, appOptions, ZONE_IDS);
```

# CCPA

This documentation is provided for compliance with the California Consumer Privacy Act (CCPA). In order to pass CCPA opt-outs from your users, you should make use of the APIs discussed below to inform AdColony and all downstream consumers of this information. Please see our [CCPA FAQ](https://www.adcolony.com/consumer-privacy/) for more information.

### Passing Consent via AppOptions
In the Android SDK v4.2, we added generic privacy methods to our AdColonyAppOptions API for additional support in CCPA compliance. To successfully pass us an opt-out signal, the publisher will need to provide AdColony a signal to indicate whether CCPA legislation is applicable to the user in addition to the actual consent value.

A value of "1" or "0"
A value of "1" implies the user has not opted-out to the sale of their data, as defined by the CCPA, and AdColony should continue with our standard processing of user information. A value of "0" means the user has opted-out to the sale of their data.

#### Example Code
```csharp
AdColony.AppOptions appOptions = new AdColony.AppOptions();

// The value passed via setPrivacyFrameworkRequired() will indicate to AdColony whether CCPA is applicable legislation for the user.
// If it's set to true, the user is subject to the CCPA. Note that IAB US Privacy String has information embedded into the string to
// indicate whether CCPA is applicable. In the event of conflicting signals between the IAB US Privacy String and setPrivacyFrameworkRequired(),
// we will interpret as CCPA being applicable.
appOptions.SetPrivacyFrameworkRequired(AdColony.AppOptions.CCPA, true);

// Your user's consent string.
// In this case, the user has not opted-out to the sale of their information.
appOptions.SetPrivacyConsentString(AdColony.AppOptions.CCPA, "1");

AdColony.Ads.Configure(APP_ID, appOptions, ZONE_IDS);
```

# COPPA

This documentation is provided for additional compliance with the Children’s Online Privacy Protection Act (COPPA). Publishers may designate all inventory within their applications as being child-directed or as COPPA-applicable though our UI. Publishers who have knowledge of specific individuals as being COPPA-applicable should make use of the API discussed below to inform AdColony and all downstream consumers of this information. Please see our privacy policy for more information regarding AdColony and COPPA.

### Passing Consent via AppOptions
In the Android SDK v4.2, we added generic privacy methods to our AdColonyAppOptions API to designate specific users as being COPPA-applicable.

#### Example Code
```csharp
AdColony.AppOptions appOptions = new AdColony.AppOptions();

// The value passed via setPrivacyFrameworkRequired() will determine whether COPPA is applicable for the user.
// If it's set to true, AdColony will behave with the understanding COPPA is applicable for the user.
appOptions.SetPrivacyFrameworkRequired(AdColony.AppOptions.COPPA, true);

AdColony.Ads.Configure(APP_ID, appOptions, ZONE_IDS);
```

# Supported Post Install Events (PIE)

AdColony is capable of receiving postbacks for post-install events for optimization purposes.

### Below are PIE API Details
```csharp
/// <summary>
/// Report a transaction/purchase event.
/// </summary>
/// Call this method to track any purchases made by the user.
/// <param name="itemID">Identifier of item purchased</param>
/// <param name="quantity">Quantity of items purchased</param>
/// <param name="price">Total price of the items purchased</param>
/// <param name="currencyCode">The real-world three-letter ISO 4217 (e.g. USD) currency code of the transaction</param>
/// <param name="store">The store the purchase was made through</param>
/// <param name="receipt">The receipt number</param>
/// <param name="description">Description of the purchased product. Max 512 characters.</param>
void LogTransactionWithID(string itemID, int quantity, double price, string currencyCode, string receipt, string store, string description);

/// <summary>
/// Report a credits_spent event.
/// </summary>
/// Invoke, for example, when a user applies credits to purchase in app merchandise.
/// You can also provide additional information about the transaction like the name, quantity, real-world value and currency code
/// <param name="name">The type of credits the user has spent</param>
/// <param name="quantity">The quantity of the credits spent</param>
/// <param name="value">The real-world value of the credits spent</param>
/// <param name="currencyCode">The real-world three-letter ISO 4217 (e.g. USD) currency code of the transaction.</param>
void LogCreditsSpentWithName(string name, int quantity, double value, string currencyCode);

/// <summary>
/// Report a payment_info_added event, when the user has added payment info for transactions.
/// </summary>
void LogPaymentInfoAdded();

/// <summary>
/// Report an achievement_unlocked event.
/// </summary>
/// Invoke when a user completes some goal, for example, ‘complete 200 deliveries’.
/// You can also add a description of the achievement
/// <param name="description">A string description of the in-app achievement. Max 512 characters.</param>
void LogAchievementUnlocked(string description);

/// <summary>
/// Report a level_achieved event.
/// </summary>
/// <param name="level">The new level reached by the user</param>
void LogLevelAchieved(int level);

/// <summary>
/// Report an app_rated event.
/// </summary>
/// Invoke when the user has rated the application.
void LogAppRated();

/// <summary>
/// Report an activated event.
/// </summary>
/// Invoke when the user activates their account within the app.
void LogActivated();

/// <summary>
/// Report a tutorial_completed event.
/// </summary>
/// Invoke when the user completes an introductory tutorial for the app.
void LogTutorialCompleted();

/// <summary>
/// Report a social_sharing event.
/// </summary>
/// Invoke, for example, when user shares an achievement on Facebook, Twitter, etc.. You can also
/// provide a description of the social sharing event and denote the network on which the event was shared.
/// It is recommended to use the provided ADCSocialSharingMethod* constants within PIEConstants.
/// <param name="network">Associated Social Network.</param>
/// <param name="description">Description of the social sharing event. Max 512 characters.</param>
void LogSocialSharingEventWithNetwork(string network, string description);

/// <summary>
/// Report a registration_completed event.
/// </summary>
/// Invoke when a user has finished the registration process within the app.
/// You can also denote the registration method used: Facebook, Google, etc.
/// It is recommended to use the provided ADCRegistrationMethod* constants within PIEConstants.
/// <param name="method">The registration method used</param>
/// <param name="description">Description describing the registration event. Passing a nil value is allowed. Should only pass this in if you are passing in ADCRegistrationMethodCustom for the method. Will be ignored otherwise. Max 512 characters</param>
void LogRegistrationCompletedWithMethod(string method, string description);

/// <summary>
/// Report a custom_event.
/// </summary>
/// Currently, publishers are allowed up to 5 custom event slots and are required
/// to keep track of what each corresponds to on their end.
/// It is recommended to use the provided ADCCustomEvent* constants within PIEConstants.
/// <param name="eventName">The custom event name</param>
/// <param name="description">The description of the custom event. Max 512 characters.</param>
void LogCustomEvent(string eventName, string description);

/// <summary>
/// Report an add_to_cart event.
/// </summary>
/// Invoke when the user adds an item to a shopping cart. You can also report the product
/// identifier for the item.
/// <param name="itemID">Identifier of item added to cart</param>
void LogAddToCartWithID(string itemID);

/// <summary>
/// Report an add_to_wishlist event.
/// </summary>
/// Invoke when the user adds an item to their wishlist. You can also report the product
/// identifier for the item.
/// <param name="itemID">Identifier of item added to cart</param>
void LogAddToWishlistWithID(string itemID);

/// <summary>
/// Report an checkout_initiated event
/// </summary>
/// Invoke when a user has begun the final checkout process.
void LogCheckoutInitiated();

/// <summary>
/// Report a content_view event.
/// </summary>
/// Invoke when the user viewed the contents of a purchasable product
/// <param name="contentId">Identifier of content viewed</param>
/// <param name="contentType">Type of content viewed</param>
void LogContentViewWithID(string contentID, string contentType);

/// <summary>
/// Report an invite event.
/// </summary>
/// Invoke when a user invites friends or family to install or otherwise re-engage in your app or service.
void LogInvite();

/// <summary>
/// Report a login event.
/// </summary>
/// Invoke whenever the user has successfully logged in to the app.
/// It is recommended to use the provided ADCLoginMethod* constants within PIEConstants.
/// <param name="method">The login method used.</param>
void LogLoginWithMethod(string method);

/// <summary>
/// Report a reservation event.
/// </summary>
void LogReservation();

/// <summary>
/// Report a search event.
/// </summary>
/// <param name="queryString">Search terms, keywords, or queries. As provided by the user.</param>
void LogSearchWithQuery(string queryString);

/// <summary>
/// Log an event.
/// </summary>
/// Provided to allow the construction and logging of events that do not have a predefined method within this class.
/// It is recommended to use the provided ADCEvent* constants within PIEConstants for the event name, build the appropriate data from constants if applicable.
/// <param name="name">Name of the event</param>
/// <param name="payload">Event data, including both required and optional meta information.</param>
void LogEvent(string name, Hashtable data);

/// <summary>
/// Log an event when an ad impression has occurred.
/// </summary>
void LogAdImpression();

/// <summary>
/// Log an event when the app has opened.
/// </summary>
void LogAppOpen();     

#### Example Code
```csharp
AdColony.Ads.GetEventTracker().LogAdImpression();
AdColony.Ads.GetEventTracker().LogAppOpen();
AdColony.Ads.GetEventTracker().LogAppRated();
```

# Legal Requirements
By downloading the AdColony SDK, you are granted a limited, non-commercial license to use and review the SDK solely for evaluation purposes.  If you wish to integrate the SDK into any commercial applications, you must register an account with AdColony and accept the terms and conditions on the AdColony website.

Note that U.S. based companies will need to complete the W-9 form and send it to us before publisher payments can be issued.

# Contact Us
For more information, please visit AdColony.com. For questions or assistance, please email us at support@adcolony.com.

# License
AdColony SDK Unity Plugin is available under the Apache 2.0 license. See the LICENSE file for more info.

<br>
<br>
<p align="center">
    Made with ❤️ in Seattle and Dallas
    <br>
    <img src="images/ac_logo_black.png" width="200" alt="AdColony Logo"/>
</p>
