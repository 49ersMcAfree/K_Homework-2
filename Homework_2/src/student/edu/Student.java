package student.edu;

public class Student {
    
    private int id;
    private String name;
    private double grade;

    public Student() {
        // Default constructor
    }

    // Parameterized constructor
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for grade
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // toString method to display student information
    @Override
    public String toString() {
         return "Student{" + "id=" + id + ", name='" + name + '\'' + ", grade=" + grade +'}';

    }

    // Main method for demonstration
    public static void main(String[] args) {
        //need to return the value of students id, grade name
    }
}
