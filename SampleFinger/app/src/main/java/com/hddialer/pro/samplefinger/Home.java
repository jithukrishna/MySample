package com.hddialer.pro.samplefinger;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity  {

    private TextView latituteField;
    private TextView longitudeField;
    private LocationManager locationManager;
    private String provider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        latituteField = (TextView) findViewById(R.id.TextView02);
        longitudeField = (TextView) findViewById(R.id.TextView04);

       Splash.gpsTracker = new GPSTracker(this);
       // LongRunningTask.execute();
        new LongRunningTask().execute("");


      /*  if (Splash.gpsTracker.getIsGPSTrackingEnabled())
        {
            String stringLatitude = String.valueOf(Splash.gpsTracker.latitude);
            //textview = (TextView)findViewById(R.id.fieldLatitude);
            latituteField.setText(stringLatitude);

            String stringLongitude = String.valueOf(Splash.gpsTracker.longitude);
           // textview = (TextView)findViewById(R.id.fieldLongitude);
            longitudeField.setText(stringLongitude);

            String country = Splash.gpsTracker.getCountryName(this);
           *//* textview = (TextView)findViewById(R.id.fieldCountry);
            textview.setText(country);*//*
            Log.e("--country--",""+country);

            String city = Splash.gpsTracker.getLocality(this);
           *//* textview = (TextView)findViewById(R.id.fieldCity);
            textview.setText(city);*//*
            Log.e("--city--",""+city);

            String postalCode = Splash.gpsTracker.getPostalCode(this);
           *//* textview = (TextView)findViewById(R.id.fieldPostalCode);
            textview.setText(postalCode);*//*
            Log.e("--postalCode--",""+postalCode);

            String addressLine = Splash.gpsTracker.getAddressLine(this);
          *//*  textview = (TextView)findViewById(R.id.fieldAddressLine);
            textview.setText(addressLine);*//*
            Log.e("--addressLine--",""+addressLine);
        }
        else
        {
            // can't get location
            // GPS or Network is not enabled
            // Ask user to enable GPS/network in settings
            Splash.gpsTracker.showSettingsAlert();
        }*/


    }

    private class LongRunningTask extends AsyncTask<String, Void, String> {

        private ProgressDialog progress;

        protected void onPreExecute() {
        //    progress = ProgressDialog.show(yourContext, "Title", "Text");
        }

        @Override
        protected String doInBackground(String... params) {

            if (Splash.gpsTracker.getIsGPSTrackingEnabled())
            {
                String stringLatitude = String.valueOf(Splash.gpsTracker.latitude);
                //textview = (TextView)findViewById(R.id.fieldLatitude);
               // latituteField.setText(stringLatitude);

                String stringLongitude = String.valueOf(Splash.gpsTracker.longitude);
                // textview = (TextView)findViewById(R.id.fieldLongitude);
               // longitudeField.setText(stringLongitude);

                String country = Splash.gpsTracker.getCountryName(getApplicationContext());
           /* textview = (TextView)findViewById(R.id.fieldCountry);
            textview.setText(country);*/
                Log.e("--country--",""+country);

                String city = Splash.gpsTracker.getLocality(getApplicationContext());
           /* textview = (TextView)findViewById(R.id.fieldCity);
            textview.setText(city);*/
                Log.e("--city--",""+city);

                String postalCode = Splash.gpsTracker.getPostalCode(getApplicationContext());
           /* textview = (TextView)findViewById(R.id.fieldPostalCode);
            textview.setText(postalCode);*/
                Log.e("--postalCode--",""+postalCode);

                String addressLine = Splash.gpsTracker.getAddressLine(getApplicationContext());
          /*  textview = (TextView)findViewById(R.id.fieldAddressLine);
            textview.setText(addressLine);*/
                Log.e("--addressLine--",""+addressLine);
            }
            else
            {
                // can't get location
                // GPS or Network is not enabled
                // Ask user to enable GPS/network in settings
                Splash.gpsTracker.showSettingsAlert();
            }
            return "Executed";
        }

        protected void onPostExecute(Boolean result) {
            if(result) {
                progress.dismiss();
            }
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (Splash.gpsTracker.getIsGPSTrackingEnabled()) {

        } else {
            Splash.gpsTracker.showSettingsAlert();
        }
    }

}
