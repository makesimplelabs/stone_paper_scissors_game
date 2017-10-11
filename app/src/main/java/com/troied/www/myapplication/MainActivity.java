package com.troied.www.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public String[] match = {"st", "pp", "sc"};
    int com = 0, plr = 0;
    String random, usr;
    TextView text_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button stone = (Button) findViewById(R.id.stone);
        Button paper = (Button) findViewById(R.id.paper);
        Button scissors = (Button) findViewById(R.id.scissors);
        final TextView score_pc = (TextView) findViewById(R.id.pc);
        final TextView score_plr = (TextView) findViewById(R.id.player);
        text_result = (TextView) findViewById(R.id.result);

        stone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usr = "st";

                random = (match[new Random().nextInt(match.length)]);
                if (random == "st") {
                    Toast.makeText(getApplication(), "TIE", Toast.LENGTH_SHORT).show();
                } else if (random == "pp") {
                    Toast.makeText(getApplication(), "LOSS", Toast.LENGTH_SHORT).show();
                    com++;
                } else if (random == "sc") {
                    Toast.makeText(getApplication(), "WIN", Toast.LENGTH_SHORT).show();
                    plr++;
                }
                score_pc.setText("COM:" + com);
                score_plr.setText("YOU:" + plr);
                calc(com, plr);


            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usr = "pp";

                random = (match[new Random().nextInt(match.length)]);
                if (random == "pp") {
                    Toast.makeText(getApplication(), "TIE", Toast.LENGTH_SHORT).show();
                } else if (random == "sc") {
                    Toast.makeText(getApplication(), "LOSS", Toast.LENGTH_SHORT).show();
                    com++;
                } else if (random == "st") {
                    Toast.makeText(getApplication(), "WIN", Toast.LENGTH_SHORT).show();
                    plr++;
                }
                score_pc.setText("COM:" + com);
                score_plr.setText("YOU:" + plr);
                calc(com, plr);
            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usr = "sc";

                random = (match[new Random().nextInt(match.length)]);
                if (random == "sc") {
                    Toast.makeText(getApplication(), "TIE", Toast.LENGTH_SHORT).show();
                } else if (random == "st") {
                    Toast.makeText(getApplication(), "LOSS", Toast.LENGTH_SHORT).show();
                    com++;
                } else if (random == "pp") {
                    Toast.makeText(getApplication(), "WIN", Toast.LENGTH_SHORT).show();
                    plr++;
                }
                score_pc.setText("COM:" + com);
                score_plr.setText("YOU:" + plr);
                calc(com, plr);
            }
        });
    }

    public void calc(int a, int b) {
        if (a == 5) {
            text_result.setTextColor(Color.RED);
            text_result.setText("Iyo Kali Potti taa");

            com = 0;
            plr = 0;

        }
        if (b == 5) {
            text_result.setTextColor(Color.GREEN);
            text_result.setText("Yeee Njan Jaychulo");

            com = 0;
            plr = 0;

        }

        if (a == 4 && b == 0) {
            text_result.setTextColor(Color.BLACK);
            text_result.setText("Scene Contra");
        }
        if (a == 3 && b == 0) {
            text_result.setTextColor(Color.BLACK);
            text_result.setText("Katta Scene");
        }
        if (a == 2 && b == 0) {
            text_result.setTextColor(Color.BLACK);
            text_result.setText("Vellakoravu");
        }
        if (a == 1 && b == 0) {
            text_result.setTextColor(Color.BLACK);
            text_result.setText("Dhurantham");
        }

        if (a != 5 && b == 1) {
            text_result.setTextColor(Color.BLACK);
            text_result.setText("Nice Kali man");
        }
        if (a != 5 && b == 2) {
            text_result.setTextColor(Color.BLACK);
            text_result.setText("Polichu bro");
        }
        if (a != 5 && b == 3) {
            text_result.setTextColor(Color.BLACK);
            text_result.setText("Comondraa !!!");
        }
        if (a != 5 && b == 4) {
            text_result.setTextColor(Color.BLACK);
            text_result.setText("Ambo Range davu");
        }
    }
}
