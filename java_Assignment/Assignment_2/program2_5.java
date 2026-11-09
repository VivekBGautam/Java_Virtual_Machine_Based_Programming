// Accept the Number from user and if Number is less than 10 print "Hello" Otherwise print "Demo"

////////////////////////////////////////////////////////////////////////
//
//  Required package
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Logic
//  Function Name   :   Display
//  Description     :   Used to Check number is even or odd
//  Input           :   Integer
//  Output          :   it will return true if number is positive otherwise return false 
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   07/12/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void Display(int iNo)
    {
        if(iNo % 2 == 0)
        {
            System.out.println(iNo +" Is a even number");   
        }
        else
        {
            System.out.println(iNo + " Is a odd number");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program2_2
{
    public static void  main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value");

        iValue  = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.Display(iValue);

        sobj.close();
    }
}