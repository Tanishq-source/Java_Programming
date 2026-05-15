/*
    iRow : 4
    iCol : 4

    Output :  %  #  #  #
              *  %  #  #
              *  *  %  #
              *  *  *  %
                
    Diagonal Pattern   
    
*/

import java.util.Scanner;

class Pattern
{
    // Filter for Square Matrix
    public void Display(int iRow,int iCol)
    {
       int i = 0,j = 0;

       if(iRow != iCol)                                                         // Need to write the filter in case of Diagonal Pattern
       {
         System.out.println("Invalid Input");
         System.out.println("Row number and column number should be same");
         return;
       }
       
       for(i = 1;i <= iRow;i++)
       {
            for(j = 1;j <= iCol;j++)
            {
                if(i > j)
                {
                    System.out.printf("*\t");
                }
                else if(i == j)
                {
                    System.out.printf("%%\t");   // Exception  
                } 
                else
                {
                    System.out.printf("#\t");
                }         
            }
            System.out.println();
       }
    }
}

class program192
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0,iValue2 = 0;

        System.out.println("Enter the Number of Rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Number of Columns :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);
    }
}

