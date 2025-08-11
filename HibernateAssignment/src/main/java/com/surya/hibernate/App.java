package com.surya.hibernate;

import org.hibernate.Session;
import com.surya.hibernate.util.HibernateUtil;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();

        System.out.println("School table created successfully");
    }
}
