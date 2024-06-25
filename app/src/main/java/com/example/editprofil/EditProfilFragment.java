package com.example.editprofil;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class EditProfilFragment extends AppCompatActivity {
    MainActivity M = new MainActivity();
    EditText txt_nama, txt_email, txt_nomor, txt_negara;
    Button update;
    SqliteHelper sqliteHelper;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.fragment_edit_profil);

//        sqliteHelper = new SqliteHelper(this);

        txt_nama = (EditText) findViewById(R.id.et_nama);
        txt_email = (EditText) findViewById(R.id.et_email);
        txt_nomor = (EditText) findViewById(R.id.et_nomor);
        txt_negara = (EditText) findViewById(R.id.et_negara);
        update = (Button) findViewById(R.id.btn_update);

        SQLiteDatabase database = sqliteHelper.getReadableDatabase();
//        cursor = database.rawQuery("SELECT * FROM nama WHERE id= '" + M.id + "'", null);
        cursor.moveToFirst();

        txt_nama.setText(cursor.getString(1));
        txt_email.setText(cursor.getString(2));
        txt_nomor.setText(cursor.getString(3));
        txt_negara.setText(cursor.getString(4));

//        update.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void OnClick(View view) {
//
//                String nama = txt_nama.getText().toString();
//                String email = txt_email.getText().toString();
//                String nomor = txt_nomor.getText().toString();
//                String negara = txt_negara.getText().toString();
//
//                if (nama.equals("") || email.equals("") || nomor.equals("") || negara.equals("")) {
//                    Toast.makeText(EditProfilFragment.this,
//                            "From Belum Terisi", Toast.LENGTH_LONG).show();
//
//                } else {
//                    SQLiteDatabase database = sqliteHelper.getWritableDatabase();
//                    database.execSQL(
//                            "UPDATE nama SET nama='" + txt_nama.getText().toString() + "'," +
//                                    "email='" + txt_email.getText().toString() + "'," +
//                                    "nomor='" + txt_nomor.getText().toString() + "'," +
//                                    "negara='" + txt_negara.getText().toString() + "' WHERE id='" + M.id + "'"
//                    );
//                    Toast.makeText(EditProfilFragment.this,
//                            "Edit data berhasil disimpan", Toast.LENGTH_LONG).show();
//                    finish();
//                }
//            }
//        });
    }
}

