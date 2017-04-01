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
                "\n14:00\n\nMissa de Abertura\n\nPe. João Evangelista" +
                "\nMinistério de Música Sagrada Face\n\n\nClique para abrir o folheto\n",
                "15:40\n\nIntervalo\n",
                "15:50\n\nPregação\n\nCristina (Com. Luz da Vida)\nAcompanha: Ministério Dias de Paz\n",
                "16:40\n\nIntervalo\n",
                "16:50\n\nPregação\n\nLuciano Salles\nAcompanha: Ministério Dias de Paz\n",
                "17:50\n\nIntervalo\n",
                "18:00\n\nTeatro\n\nComunidade Brisa Leve\n",
                "18:40\n\nIntervalo\n",
                "18:50\n\nSanto Terço\n",
                "19:50\n\nIntervalo\n\nApresentação Shemá Kids\n",
                "20:15\n\nShow\n\nAlex Soares\n",
                "21:30\n\nAdoração\n\nFernandinho (Com. Cenáculo) " +
                        "e Diácono Fábio Mendes",
                "23:30\n\nEncerramento"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

//         ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(getBaseContext(), Folheto.class));
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
                }
            }
        });
    }

}