package com.MainApp;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.Model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Properties p = new Properties();
    	p.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
    	p.put(Environment.URL, "jdbc:mysql://localhost:3306/seed");
    	p.put(Environment.USER, "root");
    	p.put(Environment.PASS,"");
    	
    	p.put(Environment.SHOW_SQL, true);
    	p.put(Environment.HBM2DDL_AUTO, "update");
    	p.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
    	p.put(Environment.POOL_SIZE,10);
    	p.put(Environment.AUTOCOMMIT, "true");
    	
    	Configuration cfg = new Configuration();
    	cfg.setProperties(p);
    	
    	cfg.addAnnotatedClass(Student.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction t = s.beginTransaction();
    	
    	Student s1 = new Student();
    	s1.setName("pqr");
    	
    	s.save(s1);
    	t.commit();
    }
}
