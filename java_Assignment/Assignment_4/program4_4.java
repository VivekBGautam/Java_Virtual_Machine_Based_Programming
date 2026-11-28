// write a program which accept the number froam user and Dispaly Summetion of  Non factor of that Number

////////////////////////////////////////////////////////////////////////
//
//  Required header file / Packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   SummationNonFactors
//  Description     :   Used to perform summation of all non factors
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   19/10/2025
//
////////////////////////////////////////////////////////////////////////
class Logic
{
    public int SummationNonFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <=(iNo/2); iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program4_4
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the number :");

        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        iRet = lobj.SummationNonFactors(iValue);

        System.out.println("Summation of non Factors is : "+iRet);

        sobj.close();
    }
}