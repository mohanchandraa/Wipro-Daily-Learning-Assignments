package com.surya.hibernate;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.surya.hibernate.entity.School;
import com.surya.hibernate.util.HibernateUtil;

public class UpdateSchool {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tran = session.beginTransaction();

        int schoolId = 1;
        School school = session.get(School.class, schoolId);

        if (school != null) {
            school.setDob(LocalDate.of(2003, 05, 11));
            school.setAddress("Updated Address");

            session.merge(school);
            tran.commit();
            System.out.println("School updated.");
        } else {
            System.out.println("School not found.");
        }

        session.close();
    }
}
