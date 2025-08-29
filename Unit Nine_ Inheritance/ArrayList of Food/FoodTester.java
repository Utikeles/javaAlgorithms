import java.util.*;

public class FoodTester
{
    public static void main(String[] args)
    {
        Food pizza = new Food("Pizza", 250);
        Fruit orange = new Fruit("Orange", 120, "orange");
        Meat hamburger = new Meat("Burger", 230, true);
        
        // Create an ArrayList and add all three onbject to it
        ArrayList<Food> food = new ArrayList<>();
        food.add(pizza);
        food.add(orange);
        food.add(hamburger);
        
        // Loop through the array and print out the objects using the toString
        for (Food element : food) {
            System.out.println(element);
        }
    }
}