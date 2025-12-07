

////////////////////////////////////////////////////////////////////////
//  
//  Function Name   :   Display
//  Description     :   Used to Display Marvellous 5 times using for loop
//  Input           :   -
//  output          :   Marvellous
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   17/10/2025
//
////////////////////////////////////////////////////////////////////////

class Demo
{
    public void Display()
    {
        int iCnt = 0;

        for (iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println("Marvellous");
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program1_2
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.Display();
    }
}
