package com.enrollment.servlet;

import com.enrollment.dao.EnrollmentDAO;
import com.enrollment.entity.Enrollment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/enroll")
public class EnrollServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        Enrollment enrollment = new Enrollment();

        enrollment.setStudentName(
                request.getParameter("studentName"));

        enrollment.setEmail(
                request.getParameter("email"));

        enrollment.setCourseName(
                request.getParameter("courseName"));

        EnrollmentDAO dao =
                new EnrollmentDAO();

        dao.saveEnrollment(enrollment);

        response.sendRedirect(
                "viewEnrollments");
    }
}