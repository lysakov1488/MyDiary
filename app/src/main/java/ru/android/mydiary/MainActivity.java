package ru.android.mydiary;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Intent i;
    EditText login, password;
    Button enter;
    String login_true = "lysakov";
    String password_true = "lysakov";
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setTitle((Html.fromHtml("<font color=\"#8B4513\">" + getString(R.string.app_name) + "</font>")));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.rgb(255,235,215)));
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        password = findViewById(R.id.password);
        enter =  (Button)findViewById(R.id.enter);

        View.OnClickListener listener =  new View.OnClickListener() {
            @Override
            public void onClick(View v){
                switch(v.getId()){
                    case R.id.enter:

                        if(login.getText().toString().equals(login_true) && password.getText().toString().equals(password_true)){
                            i = new Intent(MainActivity.this, MenuActivity.class);
                            startActivity(i);
                            break;

                        }else{

                            LayoutInflater inflater = getLayoutInflater();
                            View layout = inflater.inflate(R.layout.custom_layout,
                                    (ViewGroup) findViewById(R.id.toast_layout));
                            toast = new Toast(getApplicationContext());
                            toast.setGravity(Gravity.CENTER, 0, 0);
                            toast.setDuration(Toast.LENGTH_LONG);
                            toast.setView(layout);
                            toast.show();
                            login.setText("");
                            password.setText("");
                            break;

                        }
                }


            }
        };
        enter.setOnClickListener(listener);
    }
}