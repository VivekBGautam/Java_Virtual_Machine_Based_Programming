import java.util.*;

class Number
{
    public int CalculateFactorial(int iNo)
    {
        int i = 0;
        int iFact = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
         //  Reverse Loop

        // for(i = iNo; i >= 1; i--)
        // {
        //     iFact = iFact * i;
        // }

        // for(i = 1; i <= iNo; i++)
        // {
        //     iFact = iFact * i;
        // }

        i = 1;
        while(i <= iNo)
        {
            iFact = iFact * i;
            i++;
        }

        return iFact;
    }
}   // End of Number class

class program87
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        
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
