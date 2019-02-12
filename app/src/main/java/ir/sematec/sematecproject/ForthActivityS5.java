package ir.sematec.sematecproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ForthActivityS5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth_s5);


        Button btn1=findViewById(R.id.btnShow);
        Button btn2=findViewById(R.id.btnChange);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ForthActivityS5.this,ThirdActivity.class);
                startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ForthActivityS5.this,SecondActivity.class);
                startActivityForResult(intent , 10);

            }
        });



        String Username= PreferenceManager.getDefaultSharedPreferences(this).getString("Name","Arbabi");

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView txt10=findViewById(R.id.txtUsername);

        if (requestCode == 10){
            if (resultCode == Activity.RESULT_OK){
                String profilename=data.getStringExtra("User");
                txt10.setText(profilename);
            }
        }
    }
}
