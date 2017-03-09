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
public class Capela2 extends AppCompatActivity {

    ListView listView;

    @Override
    public void onBackPressed()
    {
        startActivity(new Intent(getBaseContext(), Domingo.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_capela);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list_day);

        // Defined Array values to show in ListView
        String[] values = new String[]{"\n08:00\nMissa Pe. João Evangelista e " +
                "Ministério de Música Amar-te Mais\n",
                "\n09:50\nAdoração Contemplativa com a Equipe de Intercessão\n",
                "\n12:30\nEquipe Conduz!\n",
                "\n12:40\nTestemunho/Condução:" +
                        " Rodrigo Santana e Banda\n",
                "\n13:40\nEquipe conduz (Troca de Músicos)\n",
                "\n13:50\nAdoração: Missão Ruah\n",
                "\n14:50\nEquipe conduz (Troca de Músicos)\n",
                "\n15:00\nAdoração e Louvor - Ministério Chagas\n",
                "\n16:00\nEquipe conduz encerramento e direciona para Área Central\n"
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
//                    startActivity(new Intent(getBaseContext(), Domingo.class));
//                } else if (position == 1) {
//                    startActivity(new Intent(getBaseContext(), Domingo.class));
//                } else if (position == 2) {
//                    startActivity(new Intent(getBaseContext(), Capela2.class));
//                } else if (position == 3) {
//                    startActivity(new Intent(getBaseContext(), Domingo.class));
//                } else if (position == 4) {
//                    startActivity(new Intent(getBaseContext(), Capela2.class));
//                } else if (position == 5) {
//                    startActivity(new Intent(getBaseContext(), Domingo.class));
//                } else if (position == 6) {
//                    startActivity(new Intent(getBaseContext(), Capela2.class));
//                } else if (position == 7) {
//                    startActivity(new Intent(getBaseContext(), Domingo.class));
//                } else if (position == 8) {
//                    startActivity(new Intent(getBaseContext(), Capela2.class));
//                }
//            }
//        });
    }



}