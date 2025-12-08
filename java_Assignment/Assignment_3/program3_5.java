
////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   CheckVowel
//  Description     :   Used to check given input charector vowels or not
//  Input           :   Charector
//  Output          :   It will return true if charector is vowels 
//                      else it will return false
//  Author          :   Vivek Bhauraj Gautam
//  Date            :   18/10/2025
//
////////////////////////////////////////////////////////////////////////

class Logic
{
    boolean CheckVowel(char cChar)
    {
        if((cChar >= 65) && (cChar <= 90))
        {
            cChar = (char)(cChar+32);
        }

        if((cChar == 'a') || (cChar == 'e') || (cChar == 'i') || (cChar == 'o') || (cChar == 'u'))
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

class program3_5
{
    public static void main(String A[])
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the charector :");
        cValue = sobj.next().charAt(0);

        Logic lobj = new Logic();

        bRet = lobj.CheckVowel(cValue);

        sobj.close();

        if(bRet == true)
        {
            System.out.println(cValue+" : is a vowel");
        }
        else
        {
            System.out.println(cValue+" : is Not a vowel");
        }

    }
}