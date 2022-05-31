public class Methods
{
    public void first()
    {
        System.out.println("\nFirst Method");
    }
    public void second()
    {
        System.out.println("\nSecond Method");
    }
    public void third()
    {
        System.out.println("\nthird Method");
    }
    public static void main(String[] args)
    {
        Methods object=new Methods();
        object.first();
        object.second();
        object.third();

        Methods2 object2=new Methods2();
        object2.newthird();

    }
}
