package com.example.comp2000_cw1;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    String strUsername = "";
    EditText usernameEdit;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEdit = (EditText) findViewById(R.id.editTextUsername);
        loginButton = (Button)  findViewById(R.id.ButtonLogin);

        loginButton.setOnClickListener(new View.OnClickListener(loginButton) {
            @Override
            public void onClick(View v) {
                try {
                    strUsername = usernameEdit.getText().toString();
                    if (strUsername == "") {
                        Snackbar.make(findViewById(R.id.MainLayout), "A username is required", Snackbar.LENGTH_SHORT).show();
                    } else {
                        String strPassUsername = strUsername;
                        Intent intent = new Intent(this, HomeActivity.class);
                        intent.putExtra(strPassUsername);
                        startActivity(intent);
                    }
                }catch (Exception e1){
                    Snackbar.make(findViewById(R.id.MainLayout), "Exception thrown: " + e1, Snackbar.LENGTH_LONG).show();;
                }
            }
        });
    }



}