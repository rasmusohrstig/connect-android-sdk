package com.telenor.connect;

import android.content.Context;
import android.net.Uri;

import com.squareup.okhttp.HttpUrl;
import com.telenor.connect.id.ConnectIdService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface SdkProfile {

    Context getContext();
    HttpUrl getApiUrl();
    String getClientId();
    String getClientSecret();
    boolean isConfidentialClient();
    String getRedirectUri();
    ConnectIdService getConnectIdService();
    String getExpectedIssuer(String actualIssuer);
    List<String> getExpectedAudiences(List<String> actualAudiences);
    Uri getAuthorizeUri(Map<String, String> parameters, List<String> locales);

    enum DoNext {proceed, cancel}
    DoNext onAuthorize(Map<String, String> parameters);
}
