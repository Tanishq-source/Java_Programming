import java.util.*;

class Digit
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo != iDigit)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iSum = iSum + iDigit;
        }
        return iSum;
    }
}

class program91
{
    public static void main(String A[])
    {
        int iValue = 0; 
        int iRet = 0;               
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        iValue = sobj.nextInt();

        Digit dobj = new Digit();
        iRet = dobj.SumDigits(iValue);

        System.out.println("Addition is :"+iRet);

        // Important for interview perspesctive
        sobj = null;
        dobj = null;

        System.gc();
        
    }
}