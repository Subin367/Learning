import javax.xml.crypto.Data;
import java.util.Scanner;
import java.time.*;
public class Datatype {

    Scanner sc = new Scanner(System.in);
    public void name()
    {

        System.out.println("\nEnter your Name: ");
        String name = sc.nextLine();
        System.out.println(name.length());

    }
    public void namecount()
    {
        System.out.println("\nEnter your Name: ");
        String name = sc.nextLine();
        int count = 0;
        for(int i = 0; i <= name.length(); i++)
        {
            count++;
        }
        System.out.println("Total number of characters in a string: " + count);
    }
    public void foreach(){
        System.out.println("\nEnter your Name: ");
        String name = sc.nextLine();
        for(int i = 0; i <= name.length(); i++)
        {
            char currentletter=name.charAt(i);
                System.out.println(currentletter);
        }

    }
    public void age()
    {
        {

            System.out.println("Enter your year of birth: ");
            int a = sc.nextInt();
            System.out.println("Enter your Month of birth: ");
            int b = sc.nextInt();
            System.out.println("Enter your Day of birth: ");
            int c = sc.nextInt();

            LocalDate dob = LocalDate.of(a, b, c);
            LocalDate curDate = LocalDate.now();
            Period diff = Period.between(dob, curDate);
            System.out.printf("Your age is %d years %d months and %d days.", diff.getYears(), diff.getMonths(), diff.getDays());
        }
    }
    public static void main(String args[])
    {
        Datatype obj=new Datatype();
      /*  obj.age();
        obj.name();
        obj.foreach();*/
        obj.namecount();
    }
}

