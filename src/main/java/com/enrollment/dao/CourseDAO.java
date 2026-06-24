package com.enrollment.dao;

import com.enrollment.entity.Course;
import com.enrollment.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class CourseDAO {

    public List<Course> getAllCourses() {

        Session session =
                HibernateUtil.getSessionFactory().openSession();

        List<Course> courses =
                session.createQuery("from Course", Course.class)
                        .list();

        session.close();

        return courses;
    }
}