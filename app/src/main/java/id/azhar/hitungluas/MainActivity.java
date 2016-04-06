package id.azhar.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtpanjang, txtlebar;
    private Button cmdhitung;
    private TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");
        txtpanjang = (EditText) findViewById(R.id.txtpanjang);
        txtlebar = (EditText) findViewById(R.id.txtlebar);
        cmdhitung = (Button) findViewById(R.id.cmdhitung);
        txthasil=(TextView) findViewById(R.id.hasil);

        cmdhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String panjang =txtpanjang.getText().toString().trim();
                String lebar =txtlebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);
                double luas = p * l;

                txthasil.setText("Luas : " + luas );

            }
        });

    }
}
