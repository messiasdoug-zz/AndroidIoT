package com.iom.messiasdouglas.iom;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MensagemActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);
        String msg = getIntent().getStringExtra("msg");

        TextView txtMsg = (TextView) findViewById(R.id.txtMsg);
        txtMsg.setText(msg);
    }
}
