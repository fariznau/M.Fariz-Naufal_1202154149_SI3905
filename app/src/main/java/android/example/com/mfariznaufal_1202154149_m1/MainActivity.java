package android.example.com.mfariznaufal_1202154149_m1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.Integer.parseInt;


public class MainActivity extends AppCompatActivity {
    int uangSaku = 65000; int biaya, total, hargaTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView Makanan = (TextView)findViewById(R.id.makanan);
        TextView Qty = (TextView)findViewById(R.id.qty);
        TextView lokasi = (TextView)findViewById(R.id.lokasi);
        TextView hasil = (TextView)findViewById(R.id.harga);

        Intent i = getIntent();

//      Receive
        String makanan = i.getStringExtra("makanan");
        String Lokasi = i.getStringExtra("tempat");
        String qty = i.getStringExtra("porsi");
//      Display
        Makanan.setText(makanan);
        Qty.setText(qty);
        lokasi.setText(Lokasi);

        switch (Lokasi){
            case "EATBUS":
                biaya = 50000;
                break;
            case "ABNORMAL":
                biaya = 30000;
                break;
        }
        total = parseInt(qty) * biaya;
        String hargaTotal = Integer.toString(total);
        if(uangSaku < total){
            hasil.setText(hargaTotal);
            Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
        }else{
            hasil.setText(hargaTotal);
            Toast.makeText(this, "Disini Aja makan malamnya", Toast.LENGTH_SHORT).show();
        }
    }
}



