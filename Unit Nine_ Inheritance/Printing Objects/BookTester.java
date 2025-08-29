public class BookTester
{
    public static void main(String[] args)
    {
        Book hunger = new Book("Hunger Games", 374);
        Book captain = new ComicBook("Captain America", 48, "Marvel");
        
        // Print all available information for the hunger object
        System.out.println(hunger.getName());
        System.out.println(hunger.getPages());
        
        // Print all available information for the captain object
        System.out.println(captain.getName());
        System.out.println(captain.getPages());
    }
}