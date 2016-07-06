package com.example.bisneu.street_x_gunner_493;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View bouton1 = findViewById(R.id.Img1);
        View bouton2 = findViewById(R.id.Img2);
        // click listenet pour le bouton 1
        bouton1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println("Tu as appuyé sur le bouton 1");
                    }
                }
        );

        // click listener pour le bouton 2
        bouton2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println("Tu as appuyé sur le bouton 2");
                    }
                }
        );
    }
}
