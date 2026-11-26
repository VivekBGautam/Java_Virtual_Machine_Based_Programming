// Write A Program which Accept Name from user and print that name

////////////////////////////////////////////////////////////////////////
//
//  Required packages 
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//  Descrition : used to take input name from user and display it on screen
//
////////////////////////////////////////////////////////////////////////

public class program6_1 
{
    public static void  main(String A[])
    {
        String Name;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter Your Name :\n");
        Name = sobj.nextLine();

        System.out.println("Your Name is : "+Name);

        sobj.close();

    }
}