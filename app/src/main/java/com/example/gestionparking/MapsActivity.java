package com.example.gestionparking;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * <p>
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng myLocation = new LatLng(36.721130, 10.215417);
        mMap.addMarker(new MarkerOptions()
                .position(myLocation)
                .title("My Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(myLocation));

        LatLng P1 = new LatLng(36.72333, 10.215519);
        mMap.addMarker(new MarkerOptions()
                .position(P1)
                .title("Parking 1"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(P1));
        mMap.setMinZoomPreference(15);


        final MarkerOptions option1=new MarkerOptions()
                .title("Parking in El Mourouj")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .position(new LatLng(36.721130, 10.215417));
        mMap.addMarker(option1);
        Marker M1= googleMap.addMarker(option1);
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                if (marker.equals(M1)) {
                    Intent i = new Intent(getBaseContext(), ParkingActivity.class);
               /*     Bundle extras = new Bundle();
                    extras.putString("EXTRA_MESSAGE", "those are User information's");
                    extras.putString("EXTRA_USER_CIN", cin_user);
                    extras.putString("EXTRA_POSITION_PARC_MAP",P1.getTitle());

                    i.putExtras(extras);*/
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "please choose the parc", Toast.LENGTH_SHORT).show();

                }
            return true;
        }});
    }
}
