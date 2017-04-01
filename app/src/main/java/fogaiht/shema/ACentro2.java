package fogaiht.shema;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by thiag on 20/01/2017.
 */
public class ACentro2 extends AppCompatActivity {

    ListView listView;

//    @Override
//    public void onBackPressed()
//    {
//        startActivity(new Intent(getBaseContext(), Domingo.class));
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_ac);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list_day);

        // Defined Array values to show in ListView
        String[] values = new String[]{
                "\n10:00\n\nPregação Família\n\nAlex Soares (Com. Vida Missão)\n",
                "11:20\n\nIntervalo\n",
                "11:30\n\nPregação Família\n\nAndré Fontoura (Com. Vida Missão)\n",
                "12:30\n\nIntervalo\n",
                "13:00\n\nPregação\n\nDiácono Fábio Mendes\nAcompanha: Missão Sacra Luz\n",
                "14:00\n\nIntervalo\n",
                "14:10\n\nPregação\n\nCristina (Com. Luz da Vida)\nAcompanha: Missão Sacra Luz\n",
                "15:10\n\nIntervalo\n",
                "15:20\n\nShow\nComunidade Brisa Leve\n",
                "16:20\n\nIntervalo\n",
                "16:30\n\nPregação de Encerramento\nAlex Soares\n",
                "17:30\n\nENCERRAMENTO\n\nBenção do Santíssimo" +
                        "\nDiácono Geraldo e Com. Vida Missão"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position == 0) {
//                    startActivity(new Intent(getBaseContext(), ACentro2.class));
//                } else if (position == 1) {
//                    startActivity(new Intent(getBaseContext(), ACentro2.class));
//                } else if (position == 2) {
//                    startActivity(new Intent(getBaseContext(), Domingo.class));
//                } else if (position == 3) {
//                    startActivity(new Intent(getBaseContext(), ACentro2.class));
//                } else if (position == 4) {
//                    startActivity(new Intent(getBaseContext(), Domingo.class));
//                } else if (position == 5) {
//                    startActivity(new Intent(getBaseContext(), ACentro2.class));
//                } else if (position == 6) {
//                    startActivity(new Intent(getBaseContext(), ACentro2.class));
//                } else if (position == 7) {
//                    startActivity(new Intent(getBaseContext(), Domingo.class));
//                } else if (position == 8) {
//                    startActivity(new Intent(getBaseContext(), ACentro2.class));
//                } else if (position == 9) {
//                    startActivity(new Intent(getBaseContext(), Domingo.class));
//                } else if (position == 10) {
//                    startActivity(new Intent(getBaseContext(), ACentro2.class));
//                } else if (position == 11) {
//                    startActivity(new Intent(getBaseContext(), Domingo.class));
//                } else if (position == 12) {
//                    startActivity(new Intent(getBaseContext(), ACentro2.class));
//                } else if (position == 13) {
//                    startActivity(new Intent(getBaseContext(), Domingo.class));
//                } else if (position == 14) {
//                    startActivity(new Intent(getBaseContext(), Domingo.class));
//                }
//            }
//        });
    }
}