package com.surya.hibernate;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.surya.hibernate.entity.Gender;
import com.surya.hibernate.entity.School;
import com.surya.hibernate.util.HibernateUtil;

public class CreateSchool {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tran = session.beginTransaction();

        School school = new School();
        school.setFirstName("Mohan");
        school.setLastName("Chandra");
        school.setUserName("mohan123");
        school.setGender(Gender.MALE);
        school.setAddress("Vijayawada");
        school.setDob(LocalDate.of(2000, 5, 15)); 

        session.persist(school);
        tran.commit();
        session.close();

        System.out.println("School created with ID: " + school.getId());
    }
}
