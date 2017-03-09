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
public class CronogramaHide extends AppCompatActivity{

//    @Override
//    public void onBackPressed()
//    {
//        startActivity(new Intent(getBaseContext(), MainActivity.class));
//        System.exit(0);
//        super.onBackPressed();
//        this.finish();

//        Intent intent = new Intent(this, MainActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        intent.putExtra("Exit me", true);
//        startActivity(intent);
//        finish();

//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cronohide);
    }
}