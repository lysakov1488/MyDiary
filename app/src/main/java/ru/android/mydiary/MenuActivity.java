package ru.android.mydiary;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        getSupportActionBar().setTitle((Html.fromHtml("<font color=\"#8B4513\">" + getString(R.string.app_name) + "</font>")));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.rgb(255,235,215)));


       /* View.OnClickListener listener =  new View.OnClickListener() {
            @Override
            public void onClick(View v){
                switch(v.getId()) {
                    case R.id.:



                        break;

                }


        }
    };*/

}
}
