package com.enrollment.test;

import com.enrollment.util.HibernateUtil;

public class HibernateConnectionTest {

    public static void main(String[] args) {

        try {

            HibernateUtil.getSessionFactory();

            System.out.println("Hibernate Connected Successfully!");

        } catch (Exception e) {

            System.out.println("Connection Failed!");

            e.printStackTrace();
        }
    }
}