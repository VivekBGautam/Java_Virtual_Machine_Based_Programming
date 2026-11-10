// 5. Write a program which accept one number from user and toggle contents
// of first and last nibble of the number. Return modified number. (Nibble is a
// group of four bits)

import java.util.*; 

class CheckBit
{
    int ChkBit(int iNo)
    {
        int iResult = 0, iMask = 0x1;
        iMask = 0xf000000f;

        iResult = iNo ^ iMask;

        return iResult;
    }
}

class program66_5
{
    public static void main(String A[])
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number");
        iNo = sobj.nextInt();

        CheckBit cobj = new CheckBit();
        int iRet = cobj.ChkBit(iNo);

       
        System.out.println("Updated Value is : "+iRet);
       
        sobj.close();
    }
}