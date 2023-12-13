package usinghibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.cache.spi.AbstractCacheTransactionSynchronization;

public class saveStudent {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	student st=new student();
	System.out.print("Enter id:");
	int id=sc.nextInt();
	System.out.print("Enter name:");
	String name=sc.next();
	System.out.print("Enter age:");
	int age=sc.nextInt();
	System.out.print("Enter mobile:");
	long mobile=sc.nextLong();
	st.setId(id);
	st.setName(name);
	st.setAge(age);
	st.setMobile(mobile);
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");//for loading and registering driver establish connection /
	EntityManager em=emf.createEntityManager();//for performing crud  operations
	EntityTransaction et= em.getTransaction();//for committing transactions not used when we are fetching data from table 
	
	et.begin();
	em.persist(st);
	et.commit();
}
}
