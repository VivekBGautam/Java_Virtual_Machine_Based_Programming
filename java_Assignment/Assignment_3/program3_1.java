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
//  Function Name   :   PrintEven
//  Description     :   Used to Display Even Number on screen
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   18/10/2025
//
////////////////////////////////////////////////////////////////////////
class Logic
{
    void PrintEven(int iNo)
    {
        int iCnt = 0;
        int iMult = 1;
        if(iNo <= 0)
        {
            return;
        }

        iCnt = 1;

        while(iCnt <= iNo)
        {
            iMult = 2 * iCnt;
            iCnt++;
            System.out.println(iMult);
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program3_1
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the Number :");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.PrintEven(iValue);

        sobj.close();

    }
}