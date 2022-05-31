import java.util.Scanner;

class namelength extends Shape {
    void count() {
    System.out.println("\nEnter your Name: ");
    String name = sc.nextLine();
    System.out.println(name.length());
    }

}
 class namecount extends Shape {
    void count() {
        System.out.println("\nEnter your Name: ");
        String name = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= name.length(); i++) {
            count++;
        }
        System.out.println("Total number of characters in a string: " + count);
    }
}
 class foreach extends Shape {
            void count()
            {
                System.out.println("\nEnter your Name: ");
                String name = sc.nextLine();
                for (int i = 0; i <= name.length(); i++)
                {
                    char currentletter = name.charAt(i);
                    System.out.println(currentletter);
                }
            }
        }

class Task
     {
         Scanner sc = new Scanner(System.in);
        public static void main(String args[])
        {
            Shape f=new foreach();
            Shape c=new namecount();
            Shape l=new namelength();
            f.count();
            c.count();
            l.count();

        }
    }


