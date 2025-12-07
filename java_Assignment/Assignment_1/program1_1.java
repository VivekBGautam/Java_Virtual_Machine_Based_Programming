////////////////////////////////////////////////////////////////////////
//
//  Class Name      :   Demo
//  Function Name   :   Divide
//  Description     :   Used to perform Division of two number
//  Input           :   Integer, Integer
//  Output          :   Integer
//  Author          :   Vivek BhaurajGautam
//  Date            :   17/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public int Divide(int iNo1, int iNo2)
    {
        int iAns = 0;

        if(iNo2 == 0)           // Our Code is static so this is of no use
        {
            return -1;
        }
        iAns = iNo1 / iNo2;
        return iAns;
    } 
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program1_1
{
    public static void main(String A[])
    {
        int iValue1 = 15, iValue2 = 5;
        int iRet = 0;

        Demo dobj = new Demo();

        iRet = dobj.Divide(iValue1, iValue2);

        System.out.println("Division is : "+iRet);
    }
}
