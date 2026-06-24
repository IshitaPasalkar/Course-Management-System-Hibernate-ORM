package com.enrollment.test;

import com.enrollment.dao.EnrollmentDAO;
import com.enrollment.entity.Enrollment;

public class EnrollmentTest {

    public static void main(String[] args) {

        Enrollment enrollment =
                new Enrollment();

        enrollment.setStudentName("Vedant");

        enrollment.setEmail(
                "vedant@gmail.com");

        enrollment.setCourseName(
                "Java Programming");

        EnrollmentDAO dao =
                new EnrollmentDAO();

        dao.saveEnrollment(
                enrollment);

        System.out.println(
                "Enrollment Saved Successfully!");
    }
}