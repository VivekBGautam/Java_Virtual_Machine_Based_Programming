// 2. Write a program which checks whether 5th & 18th bit is On or OFF.

import java.util.*; 

class CheckBit
{
    void ChkBit(int iNo,int iPos1,int iPos2)
    {
        int iResult = 0, iMask = 0x1;
        iMask = (iMask << (iPos1-1)) | (iMask << (iPos2-1));

            iResult = iNo & iMask;

            if(iResult == iMask)
            {
                System.out.println(iPos1+"&"+iPos2 +"th bit is ON");
            }
            else
            {
                System.out.println(iPos1+"&"+iPos2 +"th bit is OFF");            
            }
    }
}

class program64_2
{
    public static void main(String A[])
    {
        int iNo = 0, iPos1 = 0, iPos2;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number");
        iNo = sobj.nextInt();

        System.out.println("Enter First Position");
        iPos1 = sobj.nextInt();

        System.out.println("Enter Second Position");
        iPos2 = sobj.nextInt();

        CheckBit cobj = new CheckBit();
        cobj.ChkBit(iNo,iPos1,iPos2);

        sobj.close();
    }
}