// write a program which accept the number from user and Dispaly Non factor of that number in reverse order

////////////////////////////////////////////////////////////////////////
//
//  Required header file/Packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   DisplayReverseFactors
//  Description     :   Used to display the  factor in reverse order
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   19/10/2025
//
////////////////////////////////////////////////////////////////////////
class Logic
{
    public void DisplayReverseFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = (iNo/2); iCnt >= 1; iCnt--)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program4_2
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the number :");

        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.DisplayReverseFactors(iValue);

        sobj.close();
    }
}