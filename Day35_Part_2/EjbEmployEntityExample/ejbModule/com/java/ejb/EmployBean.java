package com.java.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class EmployBean
 */
@Stateless
@Remote(EmployBeanRemote.class)
public class EmployBean implements EmployBeanRemote {

	 @PersistenceContext(unitName = "EmpMgmtPU")
	 private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public EmployBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String addEmployee(Employ employee) {
		entityManager.persist(employee);
		return "Employ Record Inserted...";
	}

	@Override
	public List<Employ> showEmployee() {
		System.out.println("Entit Manager is  " +entityManager);
		Query query = entityManager.createQuery("SELECT e FROM Employ e");
	    return (List<Employ>) query.getResultList();
	}

	@Override
	public Employ searchEmployee(int id) {
		Employ employee = entityManager.find(Employ.class, id);
		return employee;
	}

	@Override
	public String deleteEmployee(int id) {
		Employ employeeFound = searchEmployee(id);
		if (employeeFound!=null) {
			entityManager.remove(employeeFound);
			return "Record Deleted...";
		} 
		return "Not Found";
	}

	@Override
	public String updateEmployee(Employ employeeNew) {
		Employ employeeFound = searchEmployee(employeeNew.getEmpno());
		if (employeeFound!=null) {
			entityManager.merge(employeeNew);
			return "Employee Record Updated...";
		}
		return "Not Found...";
	}

}
