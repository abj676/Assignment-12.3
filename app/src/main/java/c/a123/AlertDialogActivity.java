package c.a123;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button btnAlertTwoBtns = (Button) findViewById(R.id.btnAlertWithTwoBtns);



		/**
		 * Showing Alert Dialog with Two Buttons one Positive Button with Label
		 * "YES" one Negative Button with Label "NO"
		 */
		btnAlertTwoBtns.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				// Creating alert Dialog with two Buttons

				AlertDialog.Builder alertDialog = new AlertDialog.Builder(AlertDialogActivity.this);

				// Setting Dialog Title
				alertDialog.setTitle("Confirm Delete...");

				// Setting Dialog Message
				alertDialog.setMessage("Are you sure you want delete this?");

				// Setting Icon to Dialog
				alertDialog.setIcon(R.drawable.delete);

				// Setting Positive "Yes" Button
				alertDialog.setPositiveButton("YES",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								// Write your code here to execute after dialog
								Toast.makeText(getApplicationContext(), "You clicked on YES", Toast.LENGTH_SHORT).show();
							}
						});
				// Setting Negative "NO" Button
				alertDialog.setNegativeButton("NO",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,	int which) {
								// Write your code here to execute after dialog
								Toast.makeText(getApplicationContext(), "You clicked on NO", Toast.LENGTH_SHORT).show();
								dialog.cancel();
							}
						});

				// Showing Alert Message
				alertDialog.show();

			}
		});


	}
}