class Base 
{
    public int i,j;

}

class Derived extends Base
{
    public int x;
}




class RMD_Demo1
{
 public static void main(String A[])
 {
    Base bp1 = new Base();         //nocasting
    Derived dp1 = new Derived();   //nocasting
    Base bp2 = new Derived();      //upcasting
    Derived dp2 = new Base();      //Downcasting
 }   
}