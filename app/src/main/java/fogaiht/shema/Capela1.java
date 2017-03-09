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
public class Capela1 extends AppCompatActivity {

    ListView listView;

//    @Override
//    public void onBackPressed()
//    {
//        startActivity(new Intent(getBaseContext(), Sabado.class));
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_capela);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list_day);

        // Defined Array values to show in ListView
        String[] values = new String[]{"\n15:45\nEquipe\n",
                "\n16:00\nMomento Cura e Libertação: Maísa (Grupo de Oração Jesus de Nazaré" +
                        " – Com. Sto. Agostinho) Ministério Ágape\n",
                "\n17:00\nAdoração e Louvor: Camila Max e Ministério de Música\n",
                "\n18:00\nEquipe conduz Encerramento\n",
                "\n18:10\nSantíssimo com equipe de Intercessão até 21h\n"
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
//                    startActivity(new Intent(getBaseContext(), Capela1.class));
//                } else if (position == 1) {
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                } else if (position == 2) {
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                } else if (position == 3) {
//                    startActivity(new Intent(getBaseContext(), Capela1.class));
//                } else if (position == 4) {
//                    startActivity(new Intent(getBaseContext(), Sabado.class));
//                }
//            }
//        });
    }
}