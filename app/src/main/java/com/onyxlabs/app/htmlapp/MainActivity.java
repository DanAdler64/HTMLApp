package com.onyxlabs.app.htmlapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.onyxlabs.app.htmlapp.R;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends ActionBarActivity
{
    /**CONSTANTS**/

    private static final String TAG = MainActivity.class.getCanonicalName();

    /**MEMBERS**/

    private WebView mWebView;

    private ProgressBar mLoading;


protected void onCreate(Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    Fabric.with(this, new Crashlytics());

    setContentView(R.layout.activity_main);

    mWebView = (WebView)findViewById(R.id.wvPortal);

    mLoading = (ProgressBar) findViewById(R.id.pbLoading);

    mWebView.loadUrl("file:///android_asset/www/index.html");

    WebSettings mWebSettings = mWebView.getSettings();

    // Misc. settings
    mWebSettings.setJavaScriptEnabled(true);
    mWebSettings.setAppCacheEnabled(true);
    mWebSettings.setLoadsImagesAutomatically(true);
    mWebSettings.setBuiltInZoomControls(false);



}

}