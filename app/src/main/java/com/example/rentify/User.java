package com.example.rentify;

public abstract class User {

    private String userID;
    private String accountType;

    /**
     * Constructor
     * @param userID String representing UserID in firebase
     * @param accountType can be Admin, Lessor, or Rentor
     */
    public User(String userID, String accountType){
        this.userID = userID;
        this.accountType = accountType;
    }

    public String getUserType(){
        return this.accountType;
    }

}
