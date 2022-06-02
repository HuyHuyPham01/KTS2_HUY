package com.example.kiemtra_nhathuy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_KT2 extends AppCompatActivity {
    EditText editTextDL;
    Button buttonChuyenDoi;
    TextView textViewAmLich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kt2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Bài kiểm tra số 2");
        actionBar.setDisplayHomeAsUpEnabled(true);

        editTextDL = findViewById(R.id.editTextDL);
        buttonChuyenDoi = findViewById(R.id.buttonChuyenDoi);
        textViewAmLich = findViewById(R.id.textViewAmLich);

        buttonChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Can[] = {"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bỉnh","Đinh","Mậu","Kỷ"};
                String Chi[]={"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};

                String nam = editTextDL.getText().toString();
                if (nam.isEmpty()) {
                    Toast.makeText(MainActivity_KT2.this, "Vui lòng nhập Năm Dương Lịch", Toast.LENGTH_LONG).show();
                }
                else {
                    int namDuong = Integer.parseInt(nam);
                    String namAm = Can[namDuong%10] + " " + Chi[namDuong%12];
                    textViewAmLich.setText(namAm);
                }
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