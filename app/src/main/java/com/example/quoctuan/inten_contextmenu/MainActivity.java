package com.example.quoctuan.inten_contextmenu;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = (Button) findViewById(R.id.btnShow);
        registerForContextMenu(btnShow);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itmRed :
                btnShow.setTextColor(getResources().getColor(R.color.clrRed));
                break;
            case R.id.itmBlue : {
                btnShow.setTextColor(getResources().getColor(R.color.clrBlue));
                break;
            }
            case R.id.itmGreen : {
                btnShow.setTextColor(getResources().getColor(R.color.clrGreen));
                break;
            }

        }
        return super.onContextItemSelected(item);
    }
}
