public class Drink {
 
    private String name;
    private double size;
    
    public Drink(String name, double size) 
    {
        this.name = name;
        this.size = size;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSize()
    {
        return size;
    }
    
    // Write your equals method here
    

    public boolean equals(Drink drink) {
        return (drink.getName().equals(this.name)&&drink.getSize()==this.size);
    }
    
     
}