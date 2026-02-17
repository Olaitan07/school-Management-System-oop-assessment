package abstraction;

// Staff class extending Person
public class Staff extends Person {
    private String position;
    private double salary;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;



        }

        // Method to display staff details
    public void showRole() {
        System.out.println("I am a Staff");

    }
}
