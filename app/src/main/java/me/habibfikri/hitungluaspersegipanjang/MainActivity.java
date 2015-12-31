package me.habibfikri.hitungluaspersegipanjang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtPanjang = (EditText) findViewById(R.id.edt_panjang);
        final EditText txtLebar = (EditText) findViewById(R.id.edt_lebar);
        Button btnHitung = (Button) findViewById(R.id.btn_hitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double panjang, lebar;
                if(txtPanjang.getText().toString().equals(""))
                    panjang = 0;
                else
                    panjang = Double.parseDouble(txtPanjang.getText().toString());
                if(txtLebar.getText().toString().equals(""))
                    lebar = 0;
                else
                    lebar = Double.parseDouble(txtLebar.getText().toString());
                TextView txtHasil = (TextView) findViewById(R.id.txt_luas);
                double luas = panjang * lebar;
                txtHasil.setText("Luas : " + luas);
            }
        });
    }
}
