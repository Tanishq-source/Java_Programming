import java.util.*;

class Digit
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        while(iNo != iDigit)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}

class program90
{
    public static void main(String A[])
    {
        int iValue = 0; 
                        
        
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        iValue = sobj.nextInt();

        Digit dobj = new Digit();
        dobj.DisplayDigits(iValue);

        // Important for interview perspesctive
        sobj = null;
        dobj = null;

        System.gc();
        
    }
}