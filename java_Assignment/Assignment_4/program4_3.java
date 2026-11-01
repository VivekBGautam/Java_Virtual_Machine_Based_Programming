// write a program which accept the number froam user and Dispaly Non factor of that number

////////////////////////////////////////////////////////////////////////
//
//  Required header file/Packages 
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   DisplayNonFactors
//  Description     :   Used to display the Non factor in reverse order
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   19/10/2025
//
////////////////////////////////////////////////////////////////////////
class Logic
{
    public void DisplayNonFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for( iCnt = 1; iCnt <= (iNo/2);  iCnt++)
        {
            if((iNo % iCnt) != 0)
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

        lobj.DisplayNonFactors(iValue);

        sobj.close();
    }
}