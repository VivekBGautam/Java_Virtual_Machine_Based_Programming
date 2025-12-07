
////////////////////////////////////////////////////////////////////////
//  
//  Function Name   :   Display5to1
//  Description     :   Used to display the numbers form 5 to 1 on screen
//  Input           :   -
//  output          :   5   4   3   2   1
//  Author          :   Vivek Bhauraj Gauutam
//  Date            :   17/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void Display5to1()
    {
        int iCnt = 0;

        iCnt = 5;
        while(iCnt >= 1)
        {
            System.out.print(iCnt + "\t");
            iCnt--;
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program1_3
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.Display5to1();
    }
}
