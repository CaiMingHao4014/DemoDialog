package sg.edu.rp.id20006707.demodialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button btnDemo1, btnDemo2, btnDemo3, btnEx, btnDemo4, btnDemo5;
    TextView tvDemo2, tvDemo3, tvEx, tvDemo4, tvDemo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDemo1 = findViewById(R.id.buttonDemo1);

        tvDemo2 = findViewById(R.id.textViewDemo2);
        btnDemo2 = findViewById(R.id.buttonDemo2);

        tvDemo3 = findViewById(R.id.textView3);
        btnDemo3 = findViewById(R.id.buttonDemo3);

        tvEx = findViewById(R.id.textViewEx);
        btnEx = findViewById(R.id.buttonEx);

        tvDemo4 = findViewById(R.id.textViewDemo4);
        btnDemo4 = findViewById(R.id.buttonDemo4);

        tvDemo5 = findViewById(R.id.textViewDemo5);
        btnDemo5 = findViewById(R.id.buttonDemo5);

        btnDemo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create the Dialog Builder
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);


                //Set the dialog details
//                myBuilder.setTitle("Demo 1-Simple Dialog");
//                myBuilder.setMessage("I can develop Android App.");
//                myBuilder.setCancelable(false);
//                myBuilder.setPositiveButton("Close",null);

                myBuilder.setTitle("Congratulations");
                myBuilder.setMessage("You have conducted a simple Dialog Box");
                myBuilder.setCancelable(false); //if false, when clicked anywhere else cannot cancel
                myBuilder.setPositiveButton("Dismiss", null); //positive used as the button we want to user to choose

                AlertDialog myDialog = myBuilder.create();
                myDialog.show();


            }
        });

        btnDemo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);


                //Set the dialog details
                myBuilder.setTitle("Demo 2 Buttons Dialog");
                myBuilder.setMessage("Select one of the Buttons below");
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tvDemo2.setText("You have selected Positive.");
                    }
                });

                myBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tvDemo2.setText("You have selected Negative.");
                    }
                });

                //Configure the 'neutral' button
                myBuilder.setNeutralButton("Cancel", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();


            }
        });

        btnDemo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the input.xml layout file

            }
        });

    }
}