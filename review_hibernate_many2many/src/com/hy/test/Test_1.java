package com.hy.test;

import com.hy.model.Employee;
import com.hy.model.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.management.relation.Role;

/**
 * Created by sumimasah on 2017/7/22.
 */
public class Test_1 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Employee employee1 = new Employee("a");
        Employee employee2 = new Employee("a");

        Project project=new Project("A");

        project.getEmployees().add(employee1);
        project.getEmployees().add(employee2);

        session.save(project);


        session.getTransaction().commit();
        sessionFactory.close();

    }
}
