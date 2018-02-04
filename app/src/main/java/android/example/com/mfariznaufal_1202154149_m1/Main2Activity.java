package android.example.com.mfariznaufal_1202154149_m1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    Button Abnormal, Eatbus;
    EditText makanan, porsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Abnormal = (Button)findViewById(R.id.abnormal);
        Eatbus = (Button)findViewById(R.id.eatbus);
        makanan = (EditText)findViewById(R.id.makanan);

        Abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Main2Activity.this, MainActivity.class);
                String tempat = Abnormal.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());
                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);
            }
        });
        Eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Main2Activity.this, MainActivity.class);
                String tempat =Eatbus.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());
                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);
            }
        });
    }
}
