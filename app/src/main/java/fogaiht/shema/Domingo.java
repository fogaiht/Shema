package fogaiht.shema;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by thiag on 20/01/2017.
 */
public class Domingo extends AppCompatActivity {

    @Override
    public void onBackPressed()
    {
        startActivity(new Intent(getBaseContext(), Cronograma.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);

        ImageButton iniciar = (ImageButton) findViewById(R.id.ac_day2);
        iniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), ACentro2.class));
            }
        });

        ImageButton iniciar1 = (ImageButton) findViewById(R.id.capela_day2);
        iniciar1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Capela2.class));
            }
        });
    }
}
