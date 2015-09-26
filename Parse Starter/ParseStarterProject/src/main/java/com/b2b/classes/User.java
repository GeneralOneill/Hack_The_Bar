package com.b2b.classes;

/**
 * Created by devashrinagarkar on 9/26/15.
 */
public class User
{
    public static double points;
    public static String email;
    public static String name_first;
    public static String name_last;
    private static String password;

    public static void User(String myEmail, String myFirst, String myLast, String myPass)
    {
        email= myEmail;
        name_first= myFirst;
        name_last= myLast;
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


    public String getFirst()
    {
        return name_first;
    }

    public String getLast()
    {
        return name_last;
    }

    public void setPoints(int points1)
    {
        points+= points1;
    }
}
