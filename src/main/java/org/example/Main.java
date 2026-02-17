package org.example;

import abstraction.*;

public class Main {
    public static void main(String[] args) {
        // Create instances of each class
        Principal principal = new Principal();
        principal.setStaffId("P01");
        principal.expelStudent("John Doe");
        principal.showRole();

        // Create a Teacher instance and set subject,course and show role
        Teacher teacher = new Teacher();
        teacher.setSubject("Mathematics");
        teacher.teachCourse("Engineering");
        teacher.showRole();

        // Create a Student instance and set name, gpa and show role
        Student student = new Student();
        student.setName("lukman");
        student.setGpa(3.8);
        student.showRole();

        // Create an Applicant instance and set name, age and show role
        Applicant applicant = new Applicant();
        applicant.setName("Aisha");
        applicant.setAge(20);
        applicant.showRole();

        // Create a Course instance and set course name, instructor, details and show role
        Course math = new Course();
        math.setCourseName("Mathematics");
        math.setInstructor("Dr. Smith");
        math.showCourseDetails();
        math.showRole();

        // Create a NonAcademicStaff instance and set staff id, department, age and show role
        NonAcademicStaff janitor = new NonAcademicStaff();
        janitor.setStaffId(12345);
        janitor.setDepartment("Maintenance");
        janitor.setAge(45);
        janitor.showRole();




    }
}