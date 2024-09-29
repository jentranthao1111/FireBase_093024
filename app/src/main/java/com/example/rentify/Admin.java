package com.example.rentify;

import java.util.List;

public class Admin extends User{

    /**
     * Constructor.
     * @param userID
     * @param firstName
     * @param lastName
     */
    public Admin(String userID, String firstName, String lastName){
        super(userID, "admin", firstName, lastName);

    }

    /**
     * Returns list of users, found from firebase.
     * @return user list.
     */
    public List<User> LoadAllUsers(){
        //makes a call to firebase to get a list of users. Find a way to feed to welcome page
        List<User> listOfUsers = null;
        return listOfUsers;
    }

}
