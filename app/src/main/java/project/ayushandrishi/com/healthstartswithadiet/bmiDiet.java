package project.ayushandrishi.com.healthstartswithadiet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by lenovo on 11/6/2017.
 */

public class bmiDiet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_diet);

        Spinner spinner = (Spinner) findViewById(R.id.bodytype);

        ArrayAdapter<String> myadapterr = new ArrayAdapter<String>(bmiDiet.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.bodytypelist));

        myadapterr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myadapterr);
        Random rand = new Random();

        String breakfastMenu[] = new String[12];
        breakfastMenu[0] = "Nut Butter";
        breakfastMenu[1] = "Banana";
        breakfastMenu[2] = "Chia Seed Toast";
        breakfastMenu[3] = "Savory Oatmeal With an Egg";
        breakfastMenu[4] = "Tomato Toast";
        breakfastMenu[5] = "Quinoa and Chia Porridge";
        breakfastMenu[6] = "Bread Omlete";
        breakfastMenu[7] = "Avocado Toast With Egg";
        breakfastMenu[8] = "Crock-Pot Egg Casserole";
        breakfastMenu[9] = "Peanut Butter and Banana Smoothie";
        breakfastMenu[10] = "Sweet Potato and Black Bean Breakfast Burrito";
        breakfastMenu[11] = "Coconut Yogurt Quinoa Muffins";

        TextView btv = (TextView)findViewById(R.id.breakfast_textbox);
        String menu = new String();
        for(int i=0; i<3; i++)
        {
            menu += (breakfastMenu[rand.nextInt(Array.getLength(breakfastMenu))] + "\n");
        }
        btv.setText(menu);

        String lunchMenu[] = new String[12];
        lunchMenu[0] = "Moong daal";
        lunchMenu[1] = "Walnuts";
        lunchMenu[2] = "Bitter gourd ";
        lunchMenu[3] = "Beetroot";
        lunchMenu[4] = "Browh Rice";
        lunchMenu[5] = "Mixed Vegetables";
        lunchMenu[6] = "Fish";
        lunchMenu[7] = "Biryani";
        lunchMenu[8] = "Corn Spinach";
        lunchMenu[9] = "Eggplant & Cauliflower Curry";
        lunchMenu[10] = " Steamed Oats Idli";
        lunchMenu[11] = "Tofu Palak Paneer";

        TextView ltv = (TextView)findViewById(R.id.lunch_textbox);
        String menu2 = new String();
        for(int i=0; i<3; i++)
        {
            menu2 += (lunchMenu[rand.nextInt(Array.getLength(lunchMenu))] + "\n");
        }
        ltv.setText(menu2);

        String dinnerMenu[] = new String[12];
        dinnerMenu[0] = "Chettinad Fish Fry";
        dinnerMenu[1] = "ChikPea Curry";
        dinnerMenu[2] = "Spiced Corn Rice Pilaf";
        dinnerMenu[3] = "Indian Style Sauted Okra";
        dinnerMenu[4] = "Tofu Chicken and Eggplant Curry";
        dinnerMenu[5] = "Savory Summer Squash Muffons";
        dinnerMenu[6] = "Curries RedLentil Soup";
        dinnerMenu[7] = "Grilled Okre ";
        dinnerMenu[8] = "Dal Makhani";
        dinnerMenu[9] = "Curries Potato Salad";
        dinnerMenu[10] = "Salmon and Eggplant Curry";
        dinnerMenu[11] = "Vegetarian Tikka Masala";

        TextView dtv = (TextView)findViewById(R.id.dinner_textbox);
        String menu3 = new String();
        for(int i=0; i<3; i++)
        {
            menu3 += (dinnerMenu[rand.nextInt(Array.getLength(dinnerMenu))] + "\n");
        }
        dtv.setText(menu3);
    }

    public void showDietMenu(View view) {

        TextView breakfast = (TextView) findViewById(R.id.breakfast_textbox);
        breakfast.setVisibility(View.VISIBLE);

        TextView lunch = (TextView) findViewById(R.id.lunch_textbox);
        lunch.setVisibility(View.VISIBLE);

        TextView dinner = (TextView) findViewById(R.id.dinner_textbox);
        dinner.setVisibility(View.VISIBLE);

        EditText bmi = (EditText) findViewById(R.id.dietbmi);
        bmi.setVisibility(View.INVISIBLE);

        EditText age = (EditText) findViewById(R.id.dietage);
        age.setVisibility(View.INVISIBLE);

        TextView abc1 = (TextView) findViewById(R.id.abc1);
        abc1.setVisibility(View.VISIBLE);

        TextView abc2 = (TextView) findViewById(R.id.abc2);
        abc2.setVisibility(View.VISIBLE);

        TextView abc3 = (TextView) findViewById(R.id.abc3);
        abc3.setVisibility(View.VISIBLE);

        Spinner spin = (Spinner)findViewById(R.id.bodytype);
        spin.setVisibility(View.INVISIBLE);

        Button but = (Button)findViewById(R.id.dietbutton);
        but.setVisibility(View.INVISIBLE);
    }
}