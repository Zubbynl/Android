package com.dazzledevelopment.geolocatie;

//IMPORTS
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
//import android.content.Context;
//import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
//import android.widget.EditText;
import android.widget.EditText;


//CLASS MAINACTIVITY
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

    }
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	
	//Register the Phone
	public void registerPhone(View view)
	{
		//EditText PIDval = (EditText)findViewById(R.id.txt_pid);
		//TelephonyManager DeviceID  = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
		//PIDval.setText(android.os.Build.MODEL);
		Intent i = new Intent(this, Register.class);
		startActivity(i);
	}


	public void requestLock(View view)
	{
		
		EditText PIDval = (EditText)findViewById(R.id.txt_pid);
		GeoHandler GPS = new GeoHandler();
		
		//GPS.GPShint(this);
		
		LocationManager lm = (LocationManager)getSystemService(Context.LOCATION_SERVICE); 
		Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
		double latitude = location.getLatitude();
		double longitude = location.getLongitude();

		GPS.GPScheck(this,latitude,longitude);
		
		WebView webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://maps.google.com/maps?q="+latitude+ ","+longitude);
	}
}
