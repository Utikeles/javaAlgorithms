public class Fruit extends Food
{
    private String color;
    
    public Fruit(String name, int calories, String color){
        super(name, calories);
        this.color = color;
    }
}