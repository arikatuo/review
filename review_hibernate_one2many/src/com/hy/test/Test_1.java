package com.hy.test;


import com.hy.model.Grade;
import com.hy.model.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by dell on 2017/7/21.
 */
public class Test_1 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Students students1 = new Students("a", "n");
        Students students2 = new Students("b", "n");
        Grade grade = new Grade("aaa", "a111a");
        grade.getStudent().add(students1);
        grade.getStudent().add(students2);
        //System.out.println(grade.getStudent().toString());

        session.save(students1);
        session.save(students2);

        session.save(grade);

        session.getTransaction().commit();
        sessionFactory.close();

    }
}
