// Accept the Number froam use and Print that number of * on Dispaly

////////////////////////////////////////////////////////////////////////
//
//  Required package
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Description     :   Used to Display * on the screen
//  Input           :   Value of * As Integer 
//  Output          :   Display * on the screen
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   07/12/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        iCnt = 1;

        while(iCnt <= iNo)
        {
            System.out.print("*\n");
            iCnt++;
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program2_1
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