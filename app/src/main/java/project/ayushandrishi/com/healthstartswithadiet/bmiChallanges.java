package project.ayushandrishi.com.healthstartswithadiet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by lenovo on 11/6/2017.
 */

public class bmiChallanges extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_challanges);

        String tasks[];
        tasks = new String[8];

        tasks[0] = "10 Squats, 10 Crunches and 15 Lunges.\n"+
                    "5000 Steps";

        tasks[1] = "30 Push-Ups, 15 Crunches and 20 Rop Skips.\n"+
                "20 minutes Cycling";

        tasks[2] = "25 Burpees, 1 Minute Wall sit and 1 minute Arm Cycle.\n"+
                "5 minutes OnSpot Hops";

        tasks[3] = "2 Minute Planch, 40 Lunges and 50 Push-Ups.\n"+
                "5 minutes OnSpot Hops";

        tasks[4] = "15 Minute Football";

        tasks[5] = "6000 Steps, 12 Chin-Ups and 30 Crunches";

        tasks[6] = "10 Minute Tumbling and Hold hadtand for 40 seconds.";

        tasks[7] = "Any 5 Yoga Aasanas";

        Random rand = new Random();

        TextView tv = (TextView)findViewById(R.id.challange_textbox);;
        tv.setText(tasks[rand.nextInt(Array.getLength(tasks))]);
    }

    public void challangeComplete(View view) {
            Intent intent = getIntent();
            finish();
            startActivity(intent);
    }

}
