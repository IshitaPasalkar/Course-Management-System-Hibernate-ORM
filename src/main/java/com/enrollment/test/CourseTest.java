package com.enrollment.test;

import com.enrollment.dao.CourseDAO;
import com.enrollment.entity.Course;

import java.util.List;

public class CourseTest {

    public static void main(String[] args) {

        CourseDAO dao = new CourseDAO();

        List<Course> courses =
                dao.getAllCourses();

        for (Course course : courses) {

            System.out.println(
                    course.getCourseName()
                            + " | "
                            + course.getInstructor()
                            + " | "
                            + course.getDuration()
            );
        }
    }
}