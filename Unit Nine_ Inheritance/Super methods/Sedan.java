public class Sedan extends Car
{
    public Sedan(double mpg){
        // Complete the constructor with a call to the Superclass
        super("Sedan",mpg);
        
    }
    
    public boolean efficient(){
       // Enter your code here
        return (super.getMPG()>30.0);
    }
}