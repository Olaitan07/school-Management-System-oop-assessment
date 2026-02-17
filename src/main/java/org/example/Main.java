package org.example;

import abstraction.*;

public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setStaffId("P01");
        principal.expelStudent("John Doe");
        principal.showRole();

        Teacher teacher = new Teacher();
        teacher.setSubject("Mathematics");
        teacher.teachCourse("Engineering");
        teacher.showRole();

        Student student = new Student();
        student.setName("lukman");
        student.setGpa(3.8);
        student.showRole();


        Applicant applicant = new Applicant();
        applicant.setName("Aisha");
        applicant.setAge(20);
        applicant.showRole();

        Course math = new Course();
        math.setCourseName("Mathematics");
        math.setInstructor("Dr. Smith");
        math.showRole();





    }
}