
////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   ConvertCharector
//  Description     :   Used to chenge the case of given charector
//  Input           :   Integer
//  Output          :   Integer
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   18/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    void ConvertCharector(char Ch)
    {
        if((Ch >= 'a') && (Ch <= 'z'))
        {
            char Up = (char)(Ch-32);
            System.out.println(Up);
        }
        if((Ch >= 'A') && (Ch <= 'Z'))
        {
            char Low = (char)(Ch+32);
            System.out.println(Low);
        }
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Entry point function : Main
//
////////////////////////////////////////////////////////////////////////

class program3_4
{
    public static void main(String A[])
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the charector :");
        cValue = sobj.next().charAt(0);

        Logic lobj = new Logic();

        lobj.ConvertCharector(cValue);

        sobj.close();

    }
}