public class CarTester
{
    public static void main(String[] args)
    {
        Sedan clarity = new Sedan(52.7);
        Sedan bmw = new Sedan(22.6);
        
        System.out.println(clarity.efficient());
        System.out.println(bmw.efficient());
    }
}