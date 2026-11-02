// 5. Write a program which accept one number from user and on its first 4
// bits. Return modified number. 

import java.util.*; 

class CheckBit
{
    int ChkBit(int iNo,int iPos)
    {
        int iResult = 0, iMask;
        
        iMask = 0xf;
        iResult = iNo | iMask;

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