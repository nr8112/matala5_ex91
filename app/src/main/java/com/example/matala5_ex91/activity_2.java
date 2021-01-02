package com.example.matala5_ex91;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class activity_2 extends AppCompatActivity {
    private ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        layout=findViewById(R.id.constraintLayout);
    }
    public boolean onCreateoptionsmenu(Menu menu){
        
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add("black");
        menu.add("back");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        String st = item.getTitle().toString();
        switch (st) {
            case "blue":
                layout.setBackgroundColor(Color.BLUE);
                break;

            case "red":
                layout.setBackgroundColor(Color.RED);
                break;

            case "yellow":
                layout.setBackgroundColor(Color.YELLOW);
                break;

            case "black":
                layout.setBackgroundColor(Color.BLACK);
                break;
            case "back":
                finish();
                break;
        }

        return true;
    }
}