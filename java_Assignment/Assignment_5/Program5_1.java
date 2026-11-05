// Accept number form user and Check Number is even or odd

////////////////////////////////////////////////////////////////////////
//
//  Required header file 
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Logic
//  Function Name   :   CheckEvenOdd
//  Description     :   Used to Check number is even or odd
//  Input           :   Integer,Integer,Integer
//  Output          :   it return true if number is even 
//                      else it return false if number is odd
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   20/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public boolean CheckEvenOdd(int iNo)
    {
        if((iNo % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program5_1
{
    public static void main()
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : \n");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        bRet = lobj.CheckEvenOdd(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" : is Even Number ");
        }
        else 
        {
            System.out.println(iValue+" : is odd Number ");
        }

        sobj.close();
    }
}