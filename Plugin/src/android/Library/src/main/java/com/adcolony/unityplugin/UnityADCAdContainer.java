package com.adcolony.unityplugin;

import android.util.Log;

import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyZone;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UnityADCAdContainer extends AdColonyInterstitialListener {
    public String id = UUID.randomUUID().toString();
    public UnityADCAdsInterstitial ad = null;

    UnityADCAdContainer() {
    }

    protected void finalize() {
    }

    public void onRequestFilled(AdColonyInterstitial ad) {
        this.ad = new UnityADCAdsInterstitial(ad, id);
        UnityADCAds.sendUnityMessage("_OnRequestInterstitial", this.ad.toJson());
    }

    public void onRequestNotFilled(AdColonyZone zone) {
        UnityADCAds.sendUnityMessage("_OnRequestInterstitialFailed",
                UnityADCUtils.zoneToJson(zone));
    }

    public void onOpened(AdColonyInterstitial ad) {
        if (this.ad == null) {
            Log.e("UnityADCAds", "onOpened called without request handled");
            return;
        }
        String json = this.ad.toJson();
        UnityADCAds.sendUnityMessage("_OnOpened", json);
    }

    public void onClosed(AdColonyInterstitial ad) {
        if (this.ad == null) {
            Log.e("UnityADCAds", "onClosed called without request handled");
            return;
        }
        String json = this.ad.toJson();
        UnityADCAds.sendUnityMessage("_OnClosed", json);
    }

    public void onAudioStopped(AdColonyInterstitial ad) {
        String json = this.ad.toJson();
        UnityADCAds.sendUnityMessage("_OnAudioStopped", json);
    }

    public void onAudioStarted(AdColonyInterstitial ad) {
        String json = this.ad.toJson();
        UnityADCAds.sendUnityMessage("_OnAudioStarted", json);
    }

    public void onLeftApplication(AdColonyInterstitial ad) {
        if (this.ad == null) {
            Log.e("UnityADCAds", "onLeftApplication called without request handled");
            return;
        }
        String json = this.ad.toJson();
        UnityADCAds.sendUnityMessage("_OnLeftApplication", json);
    }

    public void onClicked(AdColonyInterstitial ad) {
        if (this.ad == null) {
            Log.e("UnityADCAds", "onClicked called without request handled");
            return;
        }
        String json = this.ad.toJson();
        UnityADCAds.sendUnityMessage("_OnClicked", json);
    }

    public void onIAPEvent(AdColonyInterstitial ad, String productId, int engagementType) {
        Map<String, Object> data = new HashMap<>();
        if (this.ad != null) {
            data.put("ad", ad);
            data.put("engagement", engagementType);
            data.put("iap_product_id", productId);
        }
        UnityADCAds.sendUnityMessage("_OnIAPOpportunity", UnityADCUtils.toJson(data));
    }

    public void onExpiring(AdColonyInterstitial ad) {
        if (this.ad == null) {
            Log.e("UnityADCAds", "onExpiring called without request handled");
            return;
        }
        UnityADCAds.sendUnityMessage("_OnExpiring", this.ad.toJson());
    }
}
