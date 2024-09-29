package com.example.rentify;

public abstract class User {

    private String userID;
    private String accountType;
    private String firstName;
    private String lastName;

    /**
     * Constructor
     * @param userID String representing UserID in firebase
     * @param accountType can be Admin, Lessor, or Rentor
     */
    public User(String userID, String accountType, String firstName, String lastName){
        this.userID = userID;
        this.accountType = accountType;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUserType(){
        return this.accountType;
    }

    public String getFirstName(){return this.firstName;}

    public String getLastName(){return this.lastName;}

    public String getEmail(String userID){
        //Make call to database and return email
        return "";
    }

    public String getUsername(String userID){
        //make call to database and return username
        return "";
    }

}
