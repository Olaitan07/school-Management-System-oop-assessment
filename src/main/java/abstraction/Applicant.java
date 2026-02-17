package abstraction;
// Applicant class extends Person and represents an applicant in the system
public class Applicant  extends Person {

    // Fields specific to Applicant
    private String name;
    private int age;

    // Implementing abstract methods from Person class

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
// Method to display the role of the Applicant
    public void showRole() {
                System.out.println("I am an Applicant");
        }
}
