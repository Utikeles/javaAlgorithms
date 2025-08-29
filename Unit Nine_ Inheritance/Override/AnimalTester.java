public class AnimalTester
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.println(animal.speak());
        System.out.println(dog.speak());
        System.out.println(cat.speak());
    }
}