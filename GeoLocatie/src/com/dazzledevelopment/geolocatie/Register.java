package com.dazzledevelopment.geolocatie;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.webkit.WebView;

public class Register extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		TelephonyManager DeviceID  = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
		String IMEI = DeviceID.getDeviceId();
		String Type = android.os.Build.MODEL.toString();
		String Version= Build.VERSION.RELEASE;
		
		WebView webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://geo.zubby.nl/h8U9UkFDlbCMOpdX19H3/register.php?code="+IMEI+"&type="+Type+"&v="+Version);
	}

}
