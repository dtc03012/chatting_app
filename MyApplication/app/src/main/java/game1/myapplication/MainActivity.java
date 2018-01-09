package game1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void game_start_onclick(View v){
        Intent intent = new Intent(getApplicationContext(), game_activity.class);
        Button game_st = (Button)findViewById(R.id.gamestart);
        startActivity(intent);
    }
}
