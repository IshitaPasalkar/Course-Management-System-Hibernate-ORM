package com.enrollment.dao;

import com.enrollment.entity.Enrollment;
import com.enrollment.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EnrollmentDAO {

    public void saveEnrollment(Enrollment enrollment) {

        Session session =
                HibernateUtil.getSessionFactory().openSession();

        Transaction tx =
                session.beginTransaction();

        session.save(enrollment);

        tx.commit();

        session.close();
    }

    public List<Enrollment> getAllEnrollments() {

        Session session =
                HibernateUtil.getSessionFactory().openSession();

        List<Enrollment> enrollments =
                session.createQuery("from Enrollment",
                                Enrollment.class)
                        .list();

        session.close();

        return enrollments;
    }
}