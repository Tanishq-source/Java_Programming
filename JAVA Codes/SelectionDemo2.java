import java.util.Scanner;

class SelectionDemo2
{

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int istd = 0;

        System.out.println("Enter your Standard :");
        istd = sobj.nextInt();

        if(istd == 1)
        {
            System.out.println("exam at 9 am");
        }
        else if(istd == 2)
        {
            System.out.println("exam at 10 am");
        }
        else if(istd == 3)
        {
            System.out.println("exam at 11 am");
        }
        else if(istd == 4)
        {
            System.out.println("exam at 12 pm");
        }
        else
        {
            System.out.println("Invalid Standard");
        }
        
    }
        
}
