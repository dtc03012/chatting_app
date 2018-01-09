package game1.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by user on 2018-01-09.
 */

public class menu_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.menu);
        ListView lv = (ListView)findViewById(R.id.list);
    }
}
