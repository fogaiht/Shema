package fogaiht.shema;

import android.app.Activity;
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
public class ACentro1 extends AppCompatActivity {

    ListView listView;

//    @Override
//    public void onBackPressed()
//    {
//        startActivity(new Intent(getBaseContext(), Sabado.class));
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_ac);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list_day);

        // Defined Array values to show in ListView
        String[] values = new String[]{
                "\n14:00\nMissa de Abertura\nPe. João Evangelista" +
                "\nMinistério de Música Sagrada Face\n",
                "\n15:40\nIntervalo\n",
                "\n15:50\nPregação\nCristina (Com. Luz da Vida)\n\nAcompanha: Ministério Dias de Paz\n",
                "\n16:40\nIntervalo\n",
                "\n16:50\nPregação\nLuciano Salles\n\nAcompanha: Ministério Dias de Paz\n",
                "\n17:50\nIntervalo\n",
                "\n18:00\nTeatro\nComunidade Brisa Leve\n",
                "\n18:40\nIntervalo\n",
                "\n18:50\nShow\nJoão Victor Mariano\n",
                "\n19:50\nIntervalo\nApresentação Shemá Kids\n",
                "\n20:15\nShow\nAlex Soares\n",
                "\n21:30\nAdoração\nFernandinho (Com. Cenáculo) " +
                        "juntamente com Diácono Fábio Mendes",
                "\n23:30\nEncerramento"
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
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                } else if (position == 1) {
//                    startActivity(new Intent(getBaseContext(), ACentro1.class));
//                } else if (position == 2) {
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                } else if (position == 3) {
//                    startActivity(new Intent(getBaseContext(), ACentro1.class));
//                } else if (position == 4) {
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                } else if (position == 5) {
//                    startActivity(new Intent(getBaseContext(), ACentro1.class));
//                } else if (position == 6) {
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                } else if (position == 7) {
//                    startActivity(new Intent(getBaseContext(), ACentro1.class));
//                } else if (position == 8) {
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                } else if (position == 9) {
//                    startActivity(new Intent(getBaseContext(), ACentro1.class));
//                } else if (position == 10) {
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                } else if (position == 11) {
//                    startActivity(new Intent(getBaseContext(), ACentro1.class));
//                } else if (position == 12) {
//                    startActivity(new Intent(getBaseContext(), ACentro1.class));
//                } else if (position == 13) {
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                } else if (position == 14) {
//                    startActivity(new Intent(getBaseContext(), ACentro1.class));
//                }
//            }
//        });
    }

}