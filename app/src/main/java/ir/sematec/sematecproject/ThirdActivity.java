package ir.sematec.sematecproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView txt1 = findViewById(R.id.txtName1);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        txt1.setText(name);

        TextView txt2 = findViewById(R.id.txtFamily1);
        Intent intent2 = getIntent();
        String family = intent2.getStringExtra("Family");
        txt2.setText(family);

        TextView num1 = findViewById(R.id.numAge1);
        Intent intent3 = getIntent();
        String Age = intent3.getStringExtra("Age");
        num1.setText(Age);

        TextView txt3 = findViewById(R.id.txtEmail1);
        Intent intent4 = getIntent();
        String Email = intent4.getStringExtra("Email");
        txt3.setText(Email);

        TextView num2 = findViewById(R.id.numPhone1);
        Intent intent5 = getIntent();
        String Phone = intent5.getStringExtra("Phone");
        num2.setText(Phone);

        Button btn = findViewById(R.id.btnConf);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "These Are Your Informations", Toast.LENGTH_LONG).show();
            }
        });



    }
}
