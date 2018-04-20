package project.ayushandrishi.com.healthstartswithadiet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lenovo on 11/6/2017.
 */

public class bmiCalculation extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_calculation);
    }

    public void convert(View view) {
        EditText weightInput = (EditText) findViewById(R.id.weight);
        EditText heightInput = (EditText) findViewById(R.id.height);

        Double double_weight= Double.parseDouble(weightInput.getText().toString());
        Double double_height= Double.parseDouble(heightInput.getText().toString());

        Double Result = (double_weight/(double_height*double_height))*1550;

        Toast.makeText(bmiCalculation.this,"Your BMI is " + String.format("%.2f",Result),Toast.LENGTH_SHORT).show();

        TextView tv = (TextView)findViewById(R.id.bmicalculation_textbox);;
        if(Result<18.5)
            tv.setText("UnderWeight");

        else if(Result<25 && Result>=18.5)
            tv.setText("Normal");

        else if(Result<30 && Result>=25)
            tv.setText("OverWeight");

        else if(Result>=30)
            tv.setText("Obese");
    }
}
