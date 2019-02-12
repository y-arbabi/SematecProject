package ir.sematec.sematecproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
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

                PreferenceManager.getDefaultSharedPreferences(SecondActivity.this).edit().putString("Name",name.getText().toString()).apply();
                PreferenceManager.getDefaultSharedPreferences(SecondActivity.this).edit().putString("Family",family.getText().toString()).apply();
                PreferenceManager.getDefaultSharedPreferences(SecondActivity.this).edit().putString("Age",age.getText().toString()).apply();
                PreferenceManager.getDefaultSharedPreferences(SecondActivity.this).edit().putString("Email",email.getText().toString()).apply();
                PreferenceManager.getDefaultSharedPreferences(SecondActivity.this).edit().putString("Phone",phone.getText().toString()).apply();

                //Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                //intent.putExtra("Name",name.getText().toString());
                //intent.putExtra("Family",family.getText().toString());
                //intent.putExtra("Age",age.getText().toString());
                //intent.putExtra("Email",email.getText().toString());
                //intent.putExtra("Phone",phone.getText().toString());
                //startActivity(intent);


                Intent intent=new Intent();
                intent.putExtra("User",name.getText().toString());
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });




    }
}
