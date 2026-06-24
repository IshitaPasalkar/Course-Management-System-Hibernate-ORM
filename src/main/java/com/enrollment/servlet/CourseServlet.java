package com.enrollment.servlet;

import com.enrollment.dao.CourseDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/courses")
public class CourseServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        CourseDAO dao = new CourseDAO();

        request.setAttribute(
                "courses",
                dao.getAllCourses());

        request.getRequestDispatcher("enroll.jsp")
                .forward(request, response);
    }
}