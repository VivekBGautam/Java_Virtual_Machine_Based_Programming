
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////
//  
//  Function Name   :   Accept
//  Description     :   Used to display number of * after taking input from user
//  Input           :   Integer
//  output          :   Symbol
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   17/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void Accept(int iNo)
    {
        int iCnt = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class Program1_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.print("Enter number : ");
        iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.Accept(iValue);
    }
}
