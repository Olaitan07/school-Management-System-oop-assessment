package abstraction;
// NonAcademicStaff class extending Staff

public class NonAcademicStaff extends Staff {
    private String department;
    private int staffId;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStaffId() {
        return getStaffId();
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }


    @Override
    public void showRole() {
        System.out.println("I am a Non-Academic Staff");
    }
}
