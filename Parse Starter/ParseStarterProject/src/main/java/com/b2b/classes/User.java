package com.b2b.classes;

/**
 * Created by devashrinagarkar on 9/26/15.
 */
public class User
{
    private double points;
    private String email;
    private String full_name;
    private String password;

    public User(String myEmail, String fullName, String myPass)
    {
        email= myEmail;
        full_name = fullName;
        password= myPass;
        points=0;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public double getPoints()
    {
        return points;
    }

    public String getFullName(){return full_name;}

    public void addPoints(int addAmount)
    {
        points+= addAmount;
    }
}
