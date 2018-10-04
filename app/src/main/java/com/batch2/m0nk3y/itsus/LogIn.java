package com.batch2.m0nk3y.itsus;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        final EditText id = findViewById(R.id.username);
        final EditText pass = findViewById(R.id.pass);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = id.getText().toString();
                String password = pass.getText().toString();

                if (username.equals("admin") && password.equals("admin")) {
                    Intent i = new Intent(LogIn.this, MainActivity.class);
                    startActivity(i);
                } else {
                    AlertDialog.Builder a = new AlertDialog.Builder(LogIn.this);
                    a.setTitle("Log In");
                    a.setMessage("Username and Password Do Not Match!");
                    a.setCancelable(true);
                    a.setNegativeButton("Try Again!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    AlertDialog alertDialog = a.create();
                    alertDialog.show();
                }
            }
        });

    }
}
