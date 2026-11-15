// Accept number form user and Check Number is Positive Or Negetive Or Zero

////////////////////////////////////////////////////////////////////////
//
//  Required header file 
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckNumber
//  Description     :   used to Check number is positive or negative
//  Input           :   Integer
//  Output          :   It give the output as number is positive or negative
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   20/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void CheckNumber(int iNo)
    {
        if((iNo > 0))
        {
            System.out.println(iNo +" : is a positive number ");
        }
        else if(iNo < 0)
        {
            System.out.println(iNo +" : is a negative number ");
        }
        else
        {
            System.out.println(iNo +" : zero is not a negative and not positive");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program5_4
{
    public static void main()
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : \n");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.CheckNumber(iValue);

        sobj.close();
    }
}