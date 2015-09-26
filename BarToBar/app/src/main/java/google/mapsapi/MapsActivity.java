package google.mapsapi;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.location.Location;
import android.util.Log;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.parse.Parse;
import com.parse.ParseObject;

public class MapsActivity extends FragmentActivity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
    Location mLastLocation;
    GoogleApiClient mGoogleApiClient;
    double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();
        mGoogleApiClient.connect();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "yI1bjVW9NGCkUzDoX7NNQy4b84pDj89TemvBVkNp", "lhrWMIQD6BWZLIaWkLXN7kefD44zn0qSnVkqrENQ");
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }


    @Override
    public void onConnected(Bundle connectionHint) {
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        if (mLastLocation != null) {
            // Populates parameters with lat/lon information
            latitude = mLastLocation.getLatitude();
            longitude = mLastLocation.getLongitude();

            Log.d("Latitud1", String.valueOf(latitude));
            Log.d("Longitude1", String.valueOf(longitude));

            if (mMap == null) {
                // Try to obtain the map from the SupportMapFragment.
                mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                        .getMap();
        }

            Log.d("Latitude", String.valueOf(latitude));
            Log.d("Longitude", String.valueOf(longitude));
            mMap.addMarker(new MarkerOptions().position(new LatLng(latitude, longitude)).title("Marker"));

        } else {
            Log.e("Error", "Failed to get location");
        }
    }

    @Override
    public void onConnectionFailed(ConnectionResult result) {
        Log.e("Error", "Failed to get location");
    }

    @Override
    public void onConnectionSuspended(int i) {
        Log.e("Error", "Connection suspended");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
