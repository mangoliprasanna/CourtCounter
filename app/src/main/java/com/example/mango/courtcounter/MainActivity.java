package com.example.mango.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team_a_score = 0, team_b_score = 0;
    TextView ta;
    TextView tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView update = (TextView) findViewById(R.id.update);
        ta = (TextView) findViewById(R.id.team_a_score);
        tb = (TextView) findViewById(R.id.team_b_score);
        Button btn3_a = (Button) findViewById(R.id.btn_3_a);
        Button btn3_b = (Button) findViewById(R.id.btn_3_b);

        Button btn4_a = (Button) findViewById(R.id.btn_4_a);
        Button btn4_b = (Button) findViewById(R.id.btn_4_b);

        Button btn6_a = (Button) findViewById(R.id.btn_6_a);
        Button btn6_b = (Button) findViewById(R.id.btn_6_b);

        Button reset = (Button) findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                team_a_score = team_b_score = 0;
                display();
            }
        });

        btn3_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                team_a_score += 3;
                update.setText("+3 POINTS for TEAM A");
                display();
            }
        });

        btn3_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                team_b_score += 3;
                update.setText("+3 POINTS for TEAM B");
                display();
            }
        });

        btn4_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                team_a_score += 4;
                update.setText("+4 POINTS for TEAM A");
                display();
            }
        });

        btn4_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                team_b_score += 4;
                update.setText("+4 POINTS for TEAM B");
                display();
            }
        });

        btn6_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                team_a_score += 6;
                update.setText("+6 POINTS for TEAM A");
                display();
            }
        });

        btn6_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                team_b_score += 6;
                update.setText("+6 POINTS for TEAM B");
                display();
            }
        });

    }
    public  void display()
    {
        ta.setText("" + team_a_score);
        tb.setText("" + team_b_score);
    }
}
