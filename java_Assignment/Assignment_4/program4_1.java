// write a program which accept the number froam user and Dispaly tha multiplication of factor of that number 

////////////////////////////////////////////////////////////////////////
//
//  Required header file / Packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FactorsMult
//  Description     :   Used to multiply the factors
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   19/10/2025
//
////////////////////////////////////////////////////////////////////////
class Logic
{
    public int FactorsMult(int iNo)
    {
        int iCnt = 0;
        int iMult = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <=(iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iMult = iMult * iCnt;
            }
        }
        return iMult;
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program4_1
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the number :");

        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        iRet = lobj.FactorsMult(iValue);

        System.out.println("Multiplication of Factors is : "+iRet);

        sobj.close();
    }
}