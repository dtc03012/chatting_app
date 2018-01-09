package game1.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

/**
 * Created by user on 2018-01-04.
 */

public class game_activity  extends AppCompatActivity{
    public int score_num = 0 ;
    public int tt= 0;
    private static final float FONT_SIZE = 10;
    private ConstraintLayout container;
    public TextView rr = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random rd = new Random();
        super.onCreate(savedInstanceState);
        final RelativeLayout ll = new RelativeLayout(this);
        final Button[] arr = new Button[10];
        rr = new TextView(this);
        ll.addView(rr);
        for(int e=0;e<10;e++) arr[e] = new Button(this);
        for(int e=0;e<10;e++) {
            arr[e].setText(Integer.toString(e + 1));
            arr[e].setTextSize(30);
            arr[e].setTextColor(Color.BLUE);
            arr[e].setId(e);
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            int l = rd.nextInt(700) + 100;
            int r = rd.nextInt(700) + 100;
            lp.setMargins(l, r, ll.getWidth() - l - 100, ll.getHeight() - r - 100);
            //lp.setMargins(0,0,0,0);
            arr[e].setLayoutParams(lp);
            ll.addView(arr[e]);
        }
        for(int e=0;e<10;e++){
            final int now = e;
            arr[e].setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v){
                    arr[now].setVisibility(View.GONE);
                    tt++;
                    rr.setText(Integer.toString(tt));
                    if(tt==10){
                        Intent intent = new Intent(getApplicationContext(), finish.class);
                        startActivity(intent);
                        finish();
                    }
                }
            });
        }
        setContentView(ll);
    }

}
