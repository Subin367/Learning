public class Overloading
{

    public int add(int a,int b)
    {
        return a + b;
    }

    public int add(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args)
    {
        Overloading obj=new Overloading();
        obj.add(5, 6);
    }
}
