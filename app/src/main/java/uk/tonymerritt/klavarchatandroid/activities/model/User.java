package uk.tonymerritt.klavarchatandroid.activities.model;

/**
 * Created by Klavar on 18/05/2017.
 */

public class User {

    public String username;
    public String firstname;
    public String lastname;


    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String firstname, String lastname) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;

    }

}