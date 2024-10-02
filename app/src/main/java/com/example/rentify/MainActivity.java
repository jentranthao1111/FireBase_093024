package com.example.rentify;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    private User user;
    private Button register;
    private Button login;

    private EditText email;
    private EditText password;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
                finish(); // will not go back to the main activity
            }
        });

        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //if it succeeds, the MainActivity intent to startActivity
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                finish(); // will not go back to the MainActivity
            }
        });




    }




    //Initialize firebase

    /**
     * Verifies if the user input is valid for signup and logins
     *
     * @param email inputted into the email textbox
     * @param password inputted into the password textbox
     * @return true if valid, false otherwise
     */
    private boolean verifyInputs(String email, String password){
        if (email.isEmpty() || password.isEmpty()){
            return false;
        } else {
            return true;
        }
        //we need more cases, but I'm not sure what others to include.
        //obiously we could check if ".com", ".ca", ".org" and such are at the end
        //but there are too many to list like that
    }
    /**
     * Verifies user inputs in text fields, and then makes a call to logInUser.
     * Connected to the button for login.
     *
     * @param view
     */
    public void onClickLogin(View view){
        //get username and password from login
        //check if inputs are valid (ie not blank) with verifyInputs function
        //if valid, call logInUser
    }

    /**
     * Verifies user inputs in text fields, and then makes a call to createUser.
     * Connected to button for sign up.
     * @param view
     */
    public void onClickSignUpUser(View view){
        //get username and password from data fields
        //Get user classification
        //check valid inputs
        //if valid, call signUpUser
        //else, provide user an error popup with details
    }

    /**
     * Connects to firebase and verifies if username and password are correct.
     * If they are, the user is moved to the welcome page.
     * Otherwise, user is prompted to try again.
     * @param email
     * @param password
     */
    private void logInUser(String email, String password){
        //check username and password are in firebase
        //if successful, create user with User(String ID, String Classification)
        //both can be obtained from database
        //Then create a new intent and move to welcome page
        //else, prompt user to try again
    }

    /**
     * Connects to firebase and adds new user data.
     * Then moves user to welcome page.
     * @param email
     * @param password
     * @param userClassification could be renter, lessor, or admin.
     */
    private void signUpUser(String email, String password, String userClassification){
        //check userClassification. If Admin, check number of Admin roles in database. If 1,
        //tell user to create another account type. Do not allow creation of more than 1 admin.
        //generate user ID
        //if valid, make a call to database and add the items
        //create a new user instance with User(String ID, String Classification), and pass to user
        //Make a call to loadWelcomePage
        //else, prompt user to try again
    }

    /**
     * Moves user to welcome page upon successful login.
     * @param validUser
     */
    private void loadWelcomePage(User validUser){
        //load a new intent and move to welcome page
        //make sure to pass in the user variable to the new intent
    }
}

