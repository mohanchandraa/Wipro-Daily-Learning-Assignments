package com.surya.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.surya.hibernate.entity.School;
import com.surya.hibernate.util.HibernateUtil;

public class DeleteSchool {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tran = session.beginTransaction();

        int schoolId = 1;
        School school = session.get(School.class, schoolId);

        if (school != null) {
            session.remove(school);
            tran.commit();
            System.out.println("School deleted.");
        } else {
            System.out.println("School not found.");
        }

        session.close();
    }
}
