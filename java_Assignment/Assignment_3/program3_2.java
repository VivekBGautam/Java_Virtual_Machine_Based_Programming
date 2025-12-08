// Write A program which Accept one Number from user and print that number of even number on Screen 

////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Logic
//  Function Name   :   DisplayFactor
//  Description     :   Used to Display Even Number on screen
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   18/10/2025
//
////////////////////////////////////////////////////////////////////////
class Logic
{
    void DisplayFactor(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt ) == 0)
            {
                if((iCnt % 2) == 0)
                {
                    System.out.print(iCnt+"\t");
                }
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program3_2
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the Number :");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.DisplayFactor(iValue);

        sobj.close();

    }
}