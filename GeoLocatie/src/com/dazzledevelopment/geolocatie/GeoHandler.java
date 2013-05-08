package com.dazzledevelopment.geolocatie;

import android.app.Activity;
import android.widget.Toast;


public class GeoHandler extends Activity {
	
	
	
	public void GPShint(Activity _activity)
	{
		Toast.makeText(_activity, "Hoioioi", Toast.LENGTH_LONG).show();
		System.out.println(_activity.toString());
	}
	      
	public void GPScheck(Activity _activity, double Lat, double Lon )
	{
		Toast.makeText(_activity, "Latitude" + Lat, Toast.LENGTH_LONG).show();
		Toast.makeText(_activity, "Longitude" + Lon, Toast.LENGTH_LONG).show();
	}	
}
