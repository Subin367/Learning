import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class Test {
    public void again() {
        System.out.println("\nYou've entered incorrect number");
        System.out.println("\ntry again");
        Test Ag = new Test();
        Ag.number();
        System.out.println("\nAgain incorrect GOOD BYE");
    }

    public void number() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener a number from 1 to 3\n");
        int a = sc.nextInt();              //reads string
        System.out.print("You have entered: " + a);
        if (a <= 3) {
            System.out.println("\nHello World");
        } else {
            Test Ag = new Test();
            Ag.again();
        }

    }

    public static void main(String[] args)
    {

        // System.setProperty("webdriver.chrome.driver","C:\\Users\\subin.archunan\\Downloads\\AT\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver=new ChromeDriver();
        //System.out.println("Hello World");
        Test Ag = new Test();
        Ag.number();
    }
}
