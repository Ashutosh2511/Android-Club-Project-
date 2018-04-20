package project.ayushandrishi.com.healthstartswithadiet;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by lenovo on 11/6/2017.
 */

public class bmiHealthyTips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_healthy_tips);

        String tips[];
        tips = new String[8];

        tips[0] = "Eat the right amount of calories for how active you are, so that you balance " +
                  "the energy you consume with the energy you use. If you eat or drink too much, " +
                  "you'll put on weight. If you eat and drink too little, you'll lose weight.";

        tips[1] = "Eat a wide range of foods to ensure that you're getting a balanced diet and that your body is " +
                  "receiving all the nutrients it needs.";

        tips[2] = "Copy your kitty. Learn to do stretching exercises when you wake up. It boosts circulation and digestion, and eases back pain";

        tips[3] = "Move your body everyday of the week. Remember to prioritize movement, not just the concept of “exercise.” Even on days you " +
                "don’t get a workout in, be sure you take a walk, stretch, stand, or dance! Your body was meant to move: enjoy it.";

        tips[4] = "Creating muscle is the secret to a revved up metabolism\n" +
                "Dumbbells and weights on the rack in the gym.\n" +
                "Think outside of the box when it comes to building strength and revving your " +
                "metabolism. And by box, I mean dumbbell! Medicine balls and kettlebells are great pieces of equipment " +
                "to throw into your gym routine to see results.";

        tips[5] = "Realize exercise and your diet are married\n" +
                "forever.You can’t lose weight with one and not the other—period. There’s no getting around it. Consistently burn more " +
                "than you consume and you will be on your way to weight loss.";

        tips[6] = "Eat slowly\n" +
                "Put your fork down in between bites. It sounds simple, but so often we’re all on auto-pilot and shoveling " +
                "food in our mouths before our stomachs can figure out that we’re full.";

        tips[7] = "Cook at home more\n" +
                "We all know the portions served at restaurants are huge. Plus, you don’t always know what they are putting into " +
                "your food. Escape the hidden calories and make your own food instead from fresh ingredients.";

        Random rand = new Random();

        TextView tv = (TextView)findViewById(R.id.healthy_tips_textbox);;
        tv.setText(tips[rand.nextInt(8)]);
    }
}
