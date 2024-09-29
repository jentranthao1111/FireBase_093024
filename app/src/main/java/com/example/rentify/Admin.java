package com.example.rentify;

import java.util.List;

public class Admin extends User{

    public Admin(String userID){
        super(userID, "Admin");

    }

    public List<User> LoadAllUsers(){
        //makes a call to firebase to get a list of users. Find a way to feed to welcome page
        List<User> listOfUsers = null;
        return listOfUsers;
    }

}
