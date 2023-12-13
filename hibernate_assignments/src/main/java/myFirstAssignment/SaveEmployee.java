package myFirstAssignment;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
        EntityManager em= emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        
        et.begin();
        em.persist(emp);
        et.commit();
	}

}
