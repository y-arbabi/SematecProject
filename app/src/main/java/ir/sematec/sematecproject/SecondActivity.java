package ir.sematec.sematecproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn = findViewById(R.id.btnOK);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.txtName);
                EditText family = findViewById(R.id.txtFamily);
                EditText email = findViewById(R.id.txtEmail);
                EditText age = findViewById(R.id.numAge);
                EditText phone = findViewById(R.id.numPhone);
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);

                intent.putExtra("Name",name.getText().toString());
                intent.putExtra("Family",family.getText().toString());
                intent.putExtra("Age",age.getText().toString());
                intent.putExtra("Email",email.getText().toString());
                intent.putExtra("Phone",phone.getText().toString());
                startActivity(intent);
            }
        });




    }
}
