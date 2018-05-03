package com.example.administrator.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static ImageView imgView;
    private static Button buttonSbm;

    private int current_image_index;
    int[] images = {R.mipmap.qr_codes,R.mipmap.qr_codes_round,R.mipmap.add_image1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClick();
    }

    public void buttonClick(){
        imgView = (ImageView)findViewById(R.id.imageView5);
        buttonSbm =(Button)findViewById(R.id.button);
        buttonSbm.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        current_image_index++;
                        current_image_index = current_image_index % images.length;
                        imgView.setImageResource(images[current_image_index]);
                    }
                }
        );
    }
}
