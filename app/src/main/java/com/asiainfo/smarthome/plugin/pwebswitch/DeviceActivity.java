package com.asiainfo.smarthome.plugin.pwebswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ryg.dynamicload.DLBasePluginActivity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class DeviceActivity extends DLBasePluginActivity {

    private String url = "http://61.148.212.68/link.php?ps=TinSWDc89346c519a3";
    private WebView myWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);
//		myWebView = (WebView)findViewById(R.id.webView1);
        myWebView = new WebView(that);
        setContentView(myWebView);
        myWebView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }

            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }
        });
        myWebView.loadUrl(url);
    }

}

