package com.esc.hatib.escgame;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class skillActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

    }

    public void setText(View view){
        TextView text = (TextView) findViewById(R.id.tv1);
        switch(view.getId()) {
            case R.id.imageView1:
                text.setText("Freeze 3 of your opponent's block");
                break;
            case R.id.imageView2:
                text.setText("Blind your opponents by removing all colours for 4 turns");
                break;
            case R.id.imageView3:
                text.setText("Reduce opponent's life by 3");
                break;
            case R.id.imageView5:
                text.setText("Break iced blocks");
                break;
            case R.id.imageView6:
                text.setText("Break Heal for 3 life blocks");
                break;
            case R.id.imageView7:
                text.setText("Immunity against all attacks for 10 seconds");
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_skill, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
