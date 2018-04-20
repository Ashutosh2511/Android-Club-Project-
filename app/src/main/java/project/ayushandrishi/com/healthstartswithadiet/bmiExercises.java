package project.ayushandrishi.com.healthstartswithadiet;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

/**
 * Created by lenovo on 11/6/2017.
 */

public class bmiExercises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_exercises);

        Spinner spinner = (Spinner)findViewById(R.id.exerciseList);

        ArrayAdapter<String> myadapterr = new ArrayAdapter<String>(bmiExercises.this,
            android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.exercises));

        myadapterr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myadapterr);
    }

    public void searchExercise(View view) {

        Spinner mySpinner=(Spinner) findViewById(R.id.exerciseList);
        String text = mySpinner.getSelectedItem().toString();

        WebView myWebView = (WebView) findViewById(R.id.exerciseWebView);
        Toast.makeText(bmiExercises.this,text,Toast.LENGTH_SHORT).show();

        if(text.equals("Push Up")){

            myWebView.loadUrl("https://www.wikihow.com/Do-a-Push-Up");
        }

        if(text.equals("Pull Up")){

            myWebView.loadUrl("https://www.wikihow.com/Do-Pullups");
        }

        if(text.equals("Work Out")){

            myWebView.loadUrl("https://www.wikihow.com/Work-Out");
        }

        if(text.equals("Frog Stand")){

            myWebView.loadUrl("https://www.wikihow.com/Do-a-Frog-Exercise");
        }

        if(text.equals("Sit Ups")){

            myWebView.loadUrl("https://www.wikihow.com/Do-Sit-Ups");
        }

        if(text.equals("Skipping")){

            myWebView.loadUrl("https://www.wikihow.com/Skip");
        }

        if(text.equals("Hand Stand")){

            myWebView.loadUrl("https://www.wikihow.com/Do-a-Gymnastics-Handstand");
        }
    }
}
