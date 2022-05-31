import java.util.Scanner;
public class Pyramid
{
    Scanner sc = new Scanner(System.in);
    public void triangle()
    {
        System.out.print("Enter a number\n");
        int a = sc.nextInt();
        //i=row j=columns
        int i, j;
        for (i=0; i<a; i++)//for rows
        {
            for (j = a - i; j > 1; j--)//for spaces
            {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++)//for star
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
       Pyramid obj = new Pyramid();
       obj.triangle();
/*
       obj.traiangle2();
*/

    }

    public void traiangle2()
    {
        int rows = 5, i = 1;

        while(i <= rows)
        {
            int j=1;
            while(j <= i)
            {
                System.out.print("*");
                j++;

            }
            System.out.print("\n");
            i++;


        }

    }
}
