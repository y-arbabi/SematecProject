package ir.sematec.sematecproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
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
        String name = PreferenceManager.getDefaultSharedPreferences(this).getString("Name","Yaghoub");
        txt1.setText(name);

        TextView txt2 = findViewById(R.id.txtFamily1);
        String family = PreferenceManager.getDefaultSharedPreferences(this).getString("Family","Arbabi");
        txt2.setText(family);

        TextView num1 = findViewById(R.id.numAge1);
        String age = PreferenceManager.getDefaultSharedPreferences(this).getString("Age","35");
        num1.setText(age);

        TextView txt3 = findViewById(R.id.txtEmail1);
        String email = PreferenceManager.getDefaultSharedPreferences(this).getString("Email","y.arbabi@yahoo.com");
        txt3.setText(email);

        TextView num2 = findViewById(R.id.numPhone1);
        String phone = PreferenceManager.getDefaultSharedPreferences(this).getString("Phone","09372350166");
        num2.setText(phone);

        Button btn = findViewById(R.id.btnConf);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "These Are Your Informations", Toast.LENGTH_LONG).show();
                finish();
            }
        });



    }
}
