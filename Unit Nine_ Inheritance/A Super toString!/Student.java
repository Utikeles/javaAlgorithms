public class Student extends Person
{
    private int grade;
    
    public Student(String name, int grade){
        super(name);
        this.grade = grade;
    }
    
    @Override 
    public String toString() {
        return super.toString() + "\n" + "Grade: "+grade;
    }
    // Enter your code here
}