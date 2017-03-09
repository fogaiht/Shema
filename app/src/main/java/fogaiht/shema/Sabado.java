package fogaiht.shema;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

/**
 * Created by thiago on 20/01/17.
 */
public class Sabado extends AppCompatActivity {

//    @Override
//    public void onBackPressed()
//    {
//        startActivity(new Intent(getBaseContext(), Cronograma.class));
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1);

        ImageButton iniciar = (ImageButton) findViewById(R.id.ac_day1);
        iniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), ACentro1.class));
            }
        });

        ImageButton iniciar1 = (ImageButton) findViewById(R.id.capela_day1);
        iniciar1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Capela1.class));
            }
        });
    }
}
