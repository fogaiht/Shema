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

    @Override
    public void onBackPressed()
    {
        startActivity(new Intent(getBaseContext(), Domingo.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_ac);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list_day);

        // Defined Array values to show in ListView
        String[] values = new String[]{"\n09:30\nEquipe\nBreve intervalo café da manhã\n",
                "\n09:50\nEquipe Conduz\n",
                "\n10:00\nPregação Família\nAlex Soares e Banda\nComunidade Vida Missão" +
                        "\nO que tem vivido em família, momento de cura" +
                        " e libertação, Manto Exorcizado\n",
                "\n11:20\nEquipe Conduz\nTroca de Músicos\n",
                "\n11:30\nPregação Família\nJoão Victor Mariano\nTestemunho, Compromisso/Atitude" +
                        " para sua família!\n",
                "\n12:30\nEquipe Conduz\nBreve intervalo para almoço\n",
                "\n12:55\nEquipe 'Convida a voltar'\n",
                "\n13:00\nPregação\nDiácono Fábio Mendes\nMissão Sacra Luz\n",
                "\n14:00\nEquipe Conduz\n",
                "\n14:10\nPregação\nCristina (Com. Luz e Vida)\nMissão Sacra Luz\n",
                "\n15:10\nEquipe Conduz\n",
                "\n15:20\nShow Comunidade Brisa Leve\n",
                "\n16:20\nEquipe Conduz\n",
                "\n16:30\nPregação de Fechamento\nAlex (Comunidade Vida Missão)" +
                        "\nBanda Comunidade Vida Missão",
                "\n17:30\nENCERRAMENTO\nBenção do Santíssimo" +
                        "\nPe. Marcos e Comunidade Vida Missão"
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