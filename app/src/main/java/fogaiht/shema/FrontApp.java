package fogaiht.shema;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

/**
 * Created by thiag on 24/09/2016.
 */

public class FrontApp extends AppCompatActivity{
    private static int TEMPO_SPLASH = 1500;
    protected void onCreate(Bundle savedInstanceState) {
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontapp);
//
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent i = new Intent(FrontApp.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, TEMPO_SPLASH);
    }
}
