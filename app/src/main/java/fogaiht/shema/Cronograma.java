package fogaiht.shema;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by thiago on 20/01/17.
 */
public class Cronograma extends AppCompatActivity{

    ListView listView;

    @Override
    public void onBackPressed()
    {
        startActivity(new Intent(getBaseContext(), MainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronograma);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list_day);

        // Defined Array values to show in ListView
        String[] values = new String[]{"\n01/04/2017\nSábado\n",
                "\n02/04/2017\nDomingo\n"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(getBaseContext(), Sabado.class));
                } else if (position == 1) {
                    startActivity(new Intent(getBaseContext(), Domingo.class));
                }
            }
        });
    }
}