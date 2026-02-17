package abstraction;

public class Course extends Person{
    private String courseName;
    private String instructor;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
     public void showCourseDetails() {
         System.out.println("Course Name: " + courseName);
         System.out.println("Instructor: " + instructor);
     }

     @Override
     public void showRole() {
         System.out.println("im offering a course");
     }
}
