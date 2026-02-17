package abstraction;
// Teacher class extending Staff and implementing Teachable interface
public class Teacher extends Staff implements Teachable {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void teachCourse(String courseName) {
        System.out.println("Teaching course: " + courseName);
    }

    @Override
    public void showRole() {
        System.out.println("I am a Teacher");
    }
}
