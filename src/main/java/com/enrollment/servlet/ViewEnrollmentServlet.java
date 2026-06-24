package com.enrollment.servlet;

import com.enrollment.dao.EnrollmentDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/viewEnrollments")
public class ViewEnrollmentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        EnrollmentDAO dao =
                new EnrollmentDAO();

        request.setAttribute(
                "enrollments",
                dao.getAllEnrollments());

        request.getRequestDispatcher(
                        "enrollments.jsp")
                .forward(request, response);
    }
}