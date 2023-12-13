package myFirstAssignment;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;





public class EmployeeRepository {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
  static  EntityManager em= emf.createEntityManager();
 static   EntityTransaction et= em.getTransaction();
	public void saveEmployee(){
		 Scanner sc=new Scanner(System.in);
	        Employee emp= new Employee();
	        System.out.print("Enter eid:");
	        int eid=sc.nextInt();
	        System.out.print("Enter eName:");
	        String eName=sc.next();
	        
	        System.out.print("Enter eAge:");
	        int eAge=sc.nextInt();
	        System.out.print("Enter eSalary:");
	        double eSalary=sc.nextDouble();

	        System.out.print("Enter eAddress:");
	        String eAddress=sc.next();
	        
	        emp.setEid(eid);
	        emp.seteName(eName);
	        emp.seteAge(eAge);
	        emp.seteSalary(eSalary);
	        emp.seteAddress(eAddress);
	        
	        
	        
	        et.begin();
	        em.persist(emp);
	        et.commit();
		}
public void fetchEmployeeById() {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter eId:");
	int eId=sc.nextInt();	
Employee	st=em.find(Employee.class, eId);
if(st!=null) {
	System.out.println("ID:"+st.getEid());//using object.get() method
	System.out.println("Name:"+st.geteName());
	System.out.println("Age:"+st.geteAge());
	System.out.println("Salary:"+st.geteSalary());
	System.out.println("Address:"+st.geteAddress());
	
	//System.out.println(st);//using toString()
}
else {
	System.out.println("data not found here");
}
}
public void deleteEmployeeById() {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter eId:");
	int eId=sc.nextInt();	
	Employee emp=em.find(Employee.class, eId);
	if(emp!=null) {
		et.begin();
		em.remove(emp);
		et.commit();
		System.out.println("Data deleted successfully");
	}
	else {
		System.out.println("Id not found..");
	}
}
public void updateEmployeeById() {
	 Scanner sc=new Scanner(System.in);
	System.out.print("Enter your eId:");
	int eId=sc.nextInt();
	Employee emp=em.find(Employee.class, eId);
	if(emp!=null) {
		System.out.print("Enter eName:");
		String eName=sc.next();
		emp.seteName(eName);
		System.out.print("Enter eAge:");
		int eAge=sc.nextInt();
		emp.seteAge(eAge);
		System.out.print("Enter eSalary:");
		double eSalary=sc.nextDouble();
		emp.seteSalary(eSalary);
		System.out.print("Enter eAddress:");
		String eAddress=sc.next();
		emp.seteAddress(eAddress);
		et.begin();
		em.merge(emp);
		et.commit();
        System.out.println("Data updated successfully..");
		
	}
	else {
		System.out.println("eId not found");
	}
	
}
public void fetchAllEmployeeData() {
	String jpql="select p from Employee p";
	Query query = em.createQuery(jpql);
	List<Employee> list = query.getResultList();
	System.out.println(list.getClass().getName());
	for(Employee st:list ) {
		System.out.println("**********************");
		System.out.println("EID:"+st.getEid());
		System.out.println("NAME:"+st.geteName());
		System.out.println("AGE:"+st.geteAge());
		System.out.println("Salary:"+st.geteSalary());
		System.out.println("ADDRESS:"+st.geteAddress());
		System.out.println("**********************");
	}
}
}



