// 5. Write a program which checks whether first and last bit is On or
// OFF. First bit means bit number 1 and last bit means bit number 32.


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
                System.out.println(iPos1+" & "+iPos2+"th bit is ON");
            }
            else
            {
                System.out.println(iPos1+" & "+iPos2+"th bit is OFF");            
            }
    }
}

class program64_4
{
    public static void main(String A[])
    {
        int iNo = 0; // iPos1 = 0, iPos2 = 0, iPos3 = 0, iPos4 = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number");
        iNo = sobj.nextInt();

        CheckBit cobj = new CheckBit();
        cobj.ChkBit(iNo,1,32);

        sobj.close();
    }
}