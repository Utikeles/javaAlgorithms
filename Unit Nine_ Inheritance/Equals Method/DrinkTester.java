public class DrinkTester
{
    public static void main(String[] args)
    {
        Drink one = new Drink("Soda", 12);
        Drink two = new Drink("Soda", 12);
        Drink three = new Drink("Soda", 20);
        
        System.out.println(one.equals(two));
        System.out.println(one.equals(three));
    }
}