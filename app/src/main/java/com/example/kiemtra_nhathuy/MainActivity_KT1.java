package com.example.kiemtra_nhathuy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity_KT1 extends AppCompatActivity {
    EditText editTextCMND,editTextSDT,editTextDC;
    Button buttonCapnhat,buttonLamlai,buttonThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kt1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Bài kiểm tra số 1");
        actionBar.setDisplayHomeAsUpEnabled(true);

        editTextCMND = findViewById(R.id.editTextCMND);
        editTextSDT = findViewById(R.id.editTextSDT);
        editTextDC = findViewById(R.id.editTextDC);
        buttonCapnhat = findViewById(R.id.buttonCapnhat);
        buttonLamlai = findViewById(R.id.buttonLamlai);
        buttonThoat = findViewById(R.id.buttonThoat);

        buttonCapnhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity_KT1.this, "Cập nhật", Toast.LENGTH_LONG).show();
            }
        });

        buttonLamlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextCMND.setText("");
                editTextSDT.setText("");
                editTextDC.setText("");
                editTextCMND.requestFocus();
            }
        });

        buttonThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }
}