package usinghibernate;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VerifyStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email:");
		String email=sc.next();
		System.out.println("Enter password:");
		String password=sc.next();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
		EntityManager em=emf.createEntityManager();
		String jpql="select s from SaveStudentData s where s.email=?1 and s.password=?2";
		Query query = em.createQuery(jpql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<SaveStudentData> list = query.getResultList();
		if(list.size()==0) {
			System.out.println("Invalid Email and Password...");
		}
		else {
			System.out.println("Welcome to home page..");
		}
	}

}
