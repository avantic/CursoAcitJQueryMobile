package net.avantic.cursoAcit;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class App extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        WebView webView = (WebView)findViewById(R.id.appView);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        
        webView.loadUrl("file:///android_asset/www/index.html");
    }
}