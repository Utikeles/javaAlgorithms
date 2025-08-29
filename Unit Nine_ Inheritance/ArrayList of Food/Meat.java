public class Meat extends Food
{
    private boolean red;
    
    public Meat(String name, int calories, boolean isRed){
        super(name, calories);
        red = isRed;
    }
}