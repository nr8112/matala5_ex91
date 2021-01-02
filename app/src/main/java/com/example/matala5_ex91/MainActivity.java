package com.example.matala5_ex91;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import static android.graphics.Color.WHITE;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout layout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.constraintLayout);
    }
public boolean onCreateoptionsmenu(Menu menu){
getMenuInflater().inflate(R.menu.main,menu);
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
        }
        return true;
    }



    public void gogo(View view) {
        Intent si = new Intent(this, activity_2.class);
        startActivity(si);

    }




}





