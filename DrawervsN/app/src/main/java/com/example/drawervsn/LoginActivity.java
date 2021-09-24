package com.example.drawervsn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.controls.Control;
import android.service.controls.templates.ControlButton;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtlogin,edtpassword;
    Button btndangnhap,btnhuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Anhxa();
        ControlButton();
    }

private  void ControlButton() {
        btnhuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
              builder.setTitle("Ban co chac muon thoat khoi app");
              builder.setMessage("Hay lua chon ben duoi de xac nhan");
              builder.setIcon(android.R.drawable.ic_dialog_alert);
              builder.setPositiveButton("chuyen vo sdt momo 0815807695->1tr de thoat", new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int i) {


                          }});
                          builder.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
                              @Override
                              public void onClick(DialogInterface dialog, int i) {

                              }
                          }
              );
             builder.show();

            }
        });
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtlogin.getText().length() !=0 && edtpassword.getText().length() !=0) {
                    if (edtlogin.getText().toString().equals("Long") && edtpassword.getText().toString().equals("123")) {
                        finish();
                    }

                }
                }

        });
}

    public void Anhxa() {
        edtlogin = (EditText) findViewById(R.id.edtLogin);
        edtpassword = (EditText) findViewById(R.id.edtPassword);
        btndangnhap = (Button) findViewById(R.id.buttondangnhap);
        btnhuy = (Button) findViewById(R.id.buttonhuy);


    }
}