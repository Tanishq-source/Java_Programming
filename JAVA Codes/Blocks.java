
class Demo 
{
    public int i;               //Instance variable
    static public int j ;      //Class variable

    static
    {
         j = 21;
         System.out.println("Inside static Block");
    }

    public Demo()
    {
        System.out.println("Inside Constructor");
        this.i = 11;
    }

    
}




class Blocks
{
    public static void main(String A[])
    {
        System.out.println("Inside main"); 
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
    }
}