package com.example.estherliu.appassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class LandingPage extends AppCompatActivity implements View.OnClickListener {
    private CardView bpmCard, quizCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);
        //defining cards in landing page
        bpmCard = (CardView) findViewById(R.id.bpm_card);
        quizCard = (CardView) findViewById(R.id.quiz_card);

        //adding onclick listeners to cards
        bpmCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);
    }

    //called every time we click a card view
    @Override
    public void onClick(View view) {
        Intent i;

        //tests each time the card is clicked to go to the right activity
        switch (view.getId()) {
            case R.id.bpm_card: i = new Intent(this, BPM.class);
            startActivity(i);
            break;
            case R.id.quiz_card: i = new Intent(this, Quiz.class);
            startActivity(i);
            break;
            default: break;
        }

    }
}
