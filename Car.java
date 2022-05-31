abstract class Carouterparts
{
        abstract void gear();
        public void wheel()
        {
            System.out.println("Wheel is black");
        }
        static void seat()
        {
            System.out.println("Seat is brown");
        }
}
interface Carinnerparts
{
   void engine();
   static void cooler()
   {
       System.out.println("Cooler started");
   }
   default void lights()
   {
       System.out.println("Lights ON");
   }
}

class Car extends Carouterparts implements Carinnerparts
{
        public void engine()
        {
        System.out.println("Engine started");
        }
        public void gear()
        {
            System.out.println("2nd gear");
        }
   public static void main(String[] args)
        {
            Car obj = new Car();
            //for outer parts
            obj.wheel();
            obj.gear();
            seat();

            //for inner parts
            obj.engine();
            obj.lights();
            Carinnerparts.cooler();
        }
}
