package com.pentip.mobileback;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class ShowSettingsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.showsettings);
		SharedPreferences pref = PreferenceManager
				.getDefaultSharedPreferences(this);
		StringBuilder builder = new StringBuilder();

		builder.append("\n" + pref.getBoolean("syncContacts", false));
		builder.append("\n" + pref.getBoolean("syncNotes", false));
		TextView settingTv = (TextView) findViewById(R.id.contactShowTv);
		settingTv.setText(builder.toString());
	}
}
