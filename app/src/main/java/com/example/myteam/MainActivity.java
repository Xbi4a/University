
package com.example.myteam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.example.myteam.R;
import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    int addThreeForTeamA = 3;
    int addTooForTeamA = 2;
    int addOneForTeamA = 1;

    int addThreeForTeamB = 3;
    int addTooForTeamB = 2;
    int addOneForTeamB = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void increment (View view) {
        addOneForTeamA = addOneForTeamA + 1;
        display(addOneForTeamA);
    }

    public void increment (View view) {
        addTooForTeamA = addTooForTeamA + 2;
        display(addTooForTeamA);
    }

    public void increment (View view) {
        addThreeForTeamA = addThreeForTeamA + 3;
        display(addThreeForTeamA);
    }

    public void decrement (View view) {
        Coffes = Coffes - 1;
        display(Coffes);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}