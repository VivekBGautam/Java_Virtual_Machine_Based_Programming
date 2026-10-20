// Accept number form user and Check Number is even or odd

////////////////////////////////////////////////////////////////////////
//
//  Required header file
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckLeapYear
//  Description     :   Used to check input year is leap year or not
//  Input           :   Integer,Integer,Integer
//  Output          :   It will display weather it is leap year or not
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   20/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CheckLeapYear(int iNo)
    {
        if((iNo % 4) == 0)
        {
            System.out.println(iNo +" : is a leap year");
        }
        else
        {
            System.out.println(iNo +" : is not a leap year");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program5_3
{
    public static void main()
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : \n");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.CheckLeapYear(iValue);

        sobj.close();
    }
}