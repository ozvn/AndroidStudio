package com.example.test;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView regis,regiscreate;
    EditText usr,psw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        regis= findViewById(R.id.registertv);
        regiscreate= findViewById(R.id.registertv3);
        usr= findViewById(R.id.editText3);
        psw= findViewById(R.id.editText);






        Typeface fontum = Typeface.createFromAsset(this.getAssets(), "Fonts/BreeSerif-Regular.ttf");
        regis.setTypeface(fontum);
        usr.setTypeface(fontum);
        regiscreate.setTypeface(fontum);
        psw.setTypeface(fontum);


    }
}
