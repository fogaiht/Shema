package fogaiht.shema;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton iniciar = (ImageButton) findViewById(R.id.mapa);
        iniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Mapa.class));
            }
        });

        ImageButton iniciar1 = (ImageButton) findViewById(R.id.site);
        iniciar1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Faq.class));
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

    }
}
