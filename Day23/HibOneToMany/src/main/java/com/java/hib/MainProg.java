package com.java.hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.java.hib.model.Department;
import com.java.hib.model.Employee;

public class MainProg {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Department dept = new Department();
		dept.setId(1);
		dept.setName("Java");

		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("Sandhan");

		Employee emp2 = new Employee();
		emp2.setId(102);
		emp2.setName("Ananth");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);

		dept.setEmployees(empList);

		session.save(dept);
		
		Department dept1 = new Department();
		dept1.setId(2);
		dept1.setName("Dotnet");
		
		Employee emp3 = new Employee();
		emp3.setId(103);
		emp3.setName("Nirmalya");

		Employee emp4 = new Employee();
		emp4.setId(104);
		emp4.setName("Swati");

		List<Employee> empList2 = new ArrayList<Employee>();
		empList2.add(emp3);
		empList2.add(emp4);

		dept1.setEmployees(empList2);

		session.save(dept1);
		
		tx.commit();
		session.close();
	}
}
