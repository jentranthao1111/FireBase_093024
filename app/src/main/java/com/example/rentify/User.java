package com.example.rentify;

import android.accounts.Account;

public abstract class User {

    private String userID;
    private enum AccountType { admin, lessor, renter };
    private AccountType acc;
    private String firstName;
    private String lastName;

    /**
     * Constructor.
     * @param userID String representing UserID in firebase.
     * @param account can be Admin, Lessor, or Renter.
     * @param firstName user first name.
     * @param lastName user last name.
     */
    public User(String userID, String account, String firstName, String lastName){
        this.userID = userID;
        if (account.equals("admin")){
            this.acc = AccountType.admin;
        } else if (account.equals("lessor")){
            this.acc = AccountType.lessor;
        } else{
            this.acc=AccountType.renter;
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Obtains the user type.
     * @return user type, being admin, lessor, or renter.
     */
    public String getUserType(){
        if (acc == AccountType.admin){
            return "Admin";
        } else if (acc == AccountType.lessor){
            return "Lessor";
        } else{
            return "Renter";
        }
    }

    /**
     * returns first name of user.
     * @return first name.
     */
    public String getFirstName(){return this.firstName;}

    /**
     * Gives the last name of the user.
     * @return last name.
     */
    public String getLastName(){return this.lastName;}

    /**
     *Retrieves email of user from firebase.
     * @param userID
     * @return email.
     */
    public String getEmail(String userID){
        //Make call to database and return email
        return "";
    }

    /**
     * Retrieves username of user from firebase.
     * @param userID
     * @return username.
     */
    public String getUsername(String userID){
        //make call to database and return username
        return "";
    }

}
