// 1.Write a program which accept one number from user and off 7th bit of that
// number if it is on. Return modified number.

import java.util.*;

class CheckBit
{
    int ChkBit(int iNo,int iPos)
    {
        int iResult = 0, iMask = 0x1;
        iMask = ~(iMask << (iPos-1));

        iResult = iNo & iMask;

        return iResult;
    }
}

class program65_1
{
    public static void main(String A[])
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number");
        iNo = sobj.nextInt();

        CheckBit cobj = new CheckBit();
        int iRet = cobj.ChkBit(iNo,7);

        System.out.println("Updated number is : "+iRet);

        sobj.close();
    }
}