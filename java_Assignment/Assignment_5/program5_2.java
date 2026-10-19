// Accept two number form user and Find Max Number

////////////////////////////////////////////////////////////////////////
//
//  Required header file
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FindMax
//  Description     :   Used to find maximum number
//  Input           :   Integer,Integer
//  Output          :   Maximum Value out of two number
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   20/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    public void FindMax(int iNo1, int iNo2)
    {
        if((iNo2 > iNo2))
        {
            System.out.println(iNo1 +" : is a greater number");
        }
        else
        {
            System.out.println(iNo2 +" : is a greater number");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program5_2
{
    public static void main()
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the second Number : ");
        iValue2 = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.FindMax(iValue1,iValue2);

        sobj.close();
    }
}