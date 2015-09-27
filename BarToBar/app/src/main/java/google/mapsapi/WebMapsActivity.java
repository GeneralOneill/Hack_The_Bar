package google.mapsapi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class WebMapsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_maps);
        WebView currentView = new WebView(this);
        setContentView(currentView);
        currentView.loadUrl("http://www.bar-to-bar.appspot.com/");

    }


}
