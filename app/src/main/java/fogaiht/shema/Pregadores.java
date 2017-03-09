package fogaiht.shema;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by thiago on 20/01/17.
 */
public class Pregadores extends AppCompatActivity {

//    @Override
//    public void onBackPressed() {
//        startActivity(new Intent(getBaseContext(), MainActivity.class));
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregadores);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}