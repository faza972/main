package com.example.editprofil;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
//    EditText txt_nama,txt_email,txt_nomor,txt_negara;
//    Button signup;
//    SqliteHelper sqliteHelper;
//
//    @Override
//    protected void onCreate(Bundle SavedInstanceState){
//        super.onCreate(SavedInstanceState);
//        setContentView(R.layout.activity_signup);
//
//        sqliteHelper= new SqliteHelper(this);
//
//        txt_nama=(EditText) findViewById(R.id.et_nama);
//        txt_email=(EditText) findViewById(R.id.et_email);
//        txt_nomor=(EditText) findViewById(R.id.et_nomor);
//        txt_negara=(EditText) findViewById(R.id.et_negara);
//        signup=(Button)  findViewById(R.id.btn_sign_Up);
//
//        signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String nama = txt_nama.getText().toString();
//                String email = txt_email.getText().toString();
//                String nomor = txt_nomor.getText().toString();
//                String negara = txt_negara.getText().toString();
//
//                if (nama.equals("")|| email.equals("")|| nomor.equals("")|| negara.equals("")){
//                    Toast.makeText(SignUpActivity.this,
//                            "Form belum terisi", Toast.LENGTH_LONG).show();
//                } else{
//                    SQLiteDatabase database = sqliteHelper.getWritableDatabase();
//                    database.execSQL(
//                            "INSERT INTO nama(nama,email,nomor,negara) VALUES ('+ nama', '+email','+ nomor', '+ negara')"
//                    );
//                    Toast.makeText(SignUpActivity.this,
//                            "Data berhasil tersimpan", Toast.LENGTH_LONG).show();
//
//                }
//
//            }
//            });
//        }
}
