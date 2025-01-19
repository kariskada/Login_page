package com.example.login_page;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding the views by their IDs
        EditText usernameInput = findViewById(R.id.username);
        EditText passwordInput = findViewById(R.id.password);
        CheckBox rememberMeCheckbox = findViewById(R.id.remember_me);
        Button loginButton = findViewById(R.id.login_button);

        // Setting up the button click listener
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input values
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();
                boolean rememberMe = rememberMeCheckbox.isChecked();

                // Simple validation
                if (username.isEmpty() || password.isEmpty()) {
                    // Show a message if either field is empty
                    Toast.makeText(MainActivity.this, "Please enter both username and password", Toast.LENGTH_SHORT).show();
                } else {
                    // Simulating a login process
                    String message = "Welcome, " + username;
                    if (rememberMe) {
                        message += " (Remember Me selected)";
                    }
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
