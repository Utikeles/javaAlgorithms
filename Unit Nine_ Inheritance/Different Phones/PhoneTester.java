public class PhoneTester
{
    public static void main(String[] args)
    {
        Phone wall = new Phone();
        Phone desk = new Phone(true);
        SmartPhone iphone = new SmartPhone();
        
        printSmart(wall);
        printSmart(desk);
        printSmart(iphone);
    }
    
    // Create the method below
    public static void printSmart(Phone phone){
        // Complete the method to print if the phone is smart
        System.out.println(phone.smart());
        
    }
}