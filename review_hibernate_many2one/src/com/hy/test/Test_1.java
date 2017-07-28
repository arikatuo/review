package com.hy.test;

import com.hy.model.Grade;
import com.hy.model.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by sumimasah on 2017/7/22.
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
        students1.setGrade(grade);
        students2.setGrade(grade);
        //System.out.println(grade.getStudent().toString());

        //session.save(grade);

        session.save(students1);
        session.save(students2);
        session.getTransaction().commit();
        sessionFactory.close();

    }
}
