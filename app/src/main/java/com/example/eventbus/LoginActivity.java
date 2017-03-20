package com.example.eventbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.eventbus.eventbus.MessageEvent;

import org.greenrobot.eventbus.EventBus;

public class LoginActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn = (Button) findViewById(R.id.btn_try);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                EventBus.getDefault().post(new MessageEvent("已经登陆"));

                        //发送事件
                        EventBus.getDefault().post(new MessageEvent("Just do it"));

                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });
    }

}
