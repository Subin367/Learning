class name
{
 String name="Ranjith";
    void display()
    {
        System.out.println(name);
    }
}

class name1 extends name
{
    String name = "Codoid Ranjith";
    void display()
    {
        System.out.println(name);
/*
        System.out.println("Maximum Speed: " + super.name);
*/
    }
}

class Super
{
    public static void main(String[] args)
    {
        name small = new name1();
        small.display();
    }
}