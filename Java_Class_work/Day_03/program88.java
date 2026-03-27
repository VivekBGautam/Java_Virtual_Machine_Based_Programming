import java.util.*;

class Number
{
    public long CalculateFactorial(int iNo)
    {
        int i = 0;
        long iFact = 1;         // Important Long

        if(iNo < 0)
        {
            iNo = -iNo;
        }
          // Reverse Loop

        for(i = iNo; i >= 1; i--)
        {
            iFact = iFact * i;
        }

        // for(i = 1; i <= iNo; i++)
        // {
        //     iFact = iFact * i;
        // }

        // i = 1;
        // while(i <= iNo)
        // {
        //     iFact = iFact * i;
        //     i++;
        // }

        return iFact;
    }
}   // End of Number class

class program87
{
    public static void main(String A[])
    {
        int iValue = 0;
        long iRet = 0;     // chenge
        
        Scanner sobj = new Scanner(System.in); 

        System.out.println("Enter number :");

        iValue = sobj.nextInt();

        Number nobj = new Number();
        iRet = nobj.CalculateFactorial(iValue);

        System.out.println("Factorial of Given nunber is :"+iRet);

        //  Important
        
        sobj = null;
        nobj = null;

        System.gc();

        //sobj.close();
    }
}
