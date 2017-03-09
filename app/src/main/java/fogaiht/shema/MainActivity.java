package fogaiht.shema;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean backPressedToExitOnce = false;
    private Toast toast = null;

    @Override
    public void onBackPressed() {
        if (backPressedToExitOnce) {
            super.onBackPressed();
            return;
        }

        this.backPressedToExitOnce = true;
        Toast.makeText(this, "Pressione de novo para sair", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                backPressedToExitOnce=false;
            }
        }, 2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_scroll);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton iniciar = (ImageButton) findViewById(R.id.mapa);
        iniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Mapa.class));
            }
        });

        ImageButton iniciar1 = (ImageButton) findViewById(R.id.site);
        iniciar1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String site = "https://www.shemadeuschama.com/";
                Uri uri = Uri.parse(site); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageButton iniciar2 = (ImageButton) findViewById(R.id.historia);
        iniciar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), History.class));
            }
        });

        ImageButton iniciar3 = (ImageButton) findViewById(R.id.events);
        iniciar3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Cronograma.class));
            }
        });

        ImageButton iniciar4 = (ImageButton) findViewById(R.id.pregad);
        iniciar4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Pregadores.class));
            }
        });

        ImageButton iniciar5 = (ImageButton) findViewById(R.id.advert);
        iniciar5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String site = "https://www.shemadeuschama.com/patrocinadores";
                Uri uri = Uri.parse(site); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

//        ImageButton iniciar6 = (ImageButton) findViewById(R.id.alimento);
//        iniciar6.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                startActivity(new Intent(getBaseContext(), Praca.class));
//            }
//        });
    }
}
