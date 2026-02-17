package abstraction;
// Principal class extending Staff
public class Principal extends Staff{
    private String name;
    private int age;
    private String staffId;

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

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    public void expelStudent(String studentName) {
        System.out.println("Expelling student: " + studentName);
    }

    public void showRole() {
        System.out.println("I am a Principal");
    }
}
