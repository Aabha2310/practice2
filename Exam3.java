public class Exam3 {
public static void main(String[]args){
    // Private instance variables
    public String name;
    public int age;
    
    // Getter and setter methods for name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter and setter methods for age
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}
