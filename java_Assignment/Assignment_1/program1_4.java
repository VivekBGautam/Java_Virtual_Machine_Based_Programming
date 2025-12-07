import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//  
//  Function Name   :   Check
//  Description     :   Used to Check given number is divisible by 5 or not
//  Input           :   Integer
//  output          :   String
//  Author          :   Vivek Bhauraj gautam
//  Date            :   17/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public boolean Check(int iNo)
    {
        if((iNo % 5)== 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program1_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        Demo dobj = new Demo();
        
        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        boolean bRet = false;

        bRet = dobj.Check(iValue);

        if(bRet == true)
        {
            System.out.println("Number is divisible by 5");
        }
        else 
        {
            System.out.println("Number is not divisible by 5");
        }
    }
}