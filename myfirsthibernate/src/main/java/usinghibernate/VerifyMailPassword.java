package usinghibernate;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VerifyMailPassword {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
		EntityManager em=emf.createEntityManager();
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email:");
		String email=sc.next();
		System.out.println("Enter password:");
		String password=sc.next();
		String jpql="select s from SaveStudentData s where s.email=?1";
		Query query = em.createQuery(jpql);
		query.setParameter(1, email);
		List<SaveStudentData> list = query.getResultList();
		if(list.size()==0) {
			System.out.println("Invalid Email ...");
		}
		else {
			if(list.get(0).getPassword().equals(password))
			System.out.println("Welcome to home page..");
			else
				System.out.println("Invalid password...");
		}
	}

}
