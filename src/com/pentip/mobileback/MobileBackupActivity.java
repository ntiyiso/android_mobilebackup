package com.pentip.mobileback;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MobileBackupActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button loginButton = (Button) findViewById(R.id.bntLogin);
		loginButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				ProgressDialog dialog = ProgressDialog.show(
						MobileBackupActivity.this, "", "Connecting...", true);
				
			}
		});

	}

}