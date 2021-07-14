package com.demo.test.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.test.bean.Employee;
import com.demo.test.dao.EmployeeDao;

public class EmployeeDaoImplementation implements EmployeeDao {

	SessionFactory sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();

	Session session = sessionFactory.openSession();

	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Transaction tn = session.beginTransaction();
		session.save(employee);
		session.flush();
		tn.commit();
	}

	public void updateEmployee(Employee employee) {

		Transaction txn = session.beginTransaction();
		session.update(employee);
		session.flush();
		txn.commit();

	}

	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Transaction trns = session.beginTransaction();
		session.delete(employee);
		session.flush();
		trns.commit();

	}

}
