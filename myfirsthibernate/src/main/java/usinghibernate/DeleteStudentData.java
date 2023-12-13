package usinghibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
student st=em.find(student.class, 1);
if(st!=null) {
	et.begin();
	em.remove(st);
	et.commit();
	System.out.println("data deleted successfully");
}
else{
	System.out.println("ID not found");
}
	}

}
