package abstraction;

public class Student extends Person {
    private String name;
    private double gpa;

    //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void showRole() {
        System.out.println("I am a Student");
    }
}
