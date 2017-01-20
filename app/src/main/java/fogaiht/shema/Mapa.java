package fogaiht.shema;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by thiago on 20/01/2017.
 */

public class Mapa extends Activity implements OnMapReadyCallback {

    private LatLng location = new LatLng(-18.937693, -48.299304);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa);

        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);


        Button iniciarmaps = (Button) findViewById(R.id.bora);
        iniciarmaps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                startActivity(new Intent(getBaseContext(), VideoGalery.class));
                try {
                    //Abrir app Google Maps
                    Uri gmmIntentUri = Uri.parse("google.navigation:q=-18.937693, -48.299304");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                } catch (ActivityNotFoundException ex) {
                    //Google Maps não instalado, usa o browser.
                    String uri = "https://goo.gl/XBV0y1";  //Normal URL
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions()
                .position(new LatLng(-18.937693, -48.299304))
                .title("Shemá, Deus Chama!"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 17));
    }
}
