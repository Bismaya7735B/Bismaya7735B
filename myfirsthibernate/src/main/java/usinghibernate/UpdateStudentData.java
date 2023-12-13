package usinghibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id:");
		int id=sc.nextInt();
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
    EntityManager em=emf.createEntityManager();
    EntityTransaction et=em.getTransaction();
    
    student st=em.find(student.class, id);
    if(st!=null){
    	System.out.println("Enter age:");
    	int age=sc.nextInt();
    	st.setAge(age);
    	System.out.println("Enter name:");
    	String name=sc.next();
    	st.setName(name);
    	System.out.println("Enter mobile:");
    	long mobile=sc.nextLong();
    	st.setMobile(mobile);
    	et.begin();
        em.merge(st);
        et.commit();
    }
    else {
    	System.out.println("Id not found");
    }
    
	}

}
