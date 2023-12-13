package usinghibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudentData1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SaveStudentData ssd=new SaveStudentData();
ssd.setId(1);
ssd.setName("Bismaya");
ssd.setEmail("bismaya@gmail.com");
ssd.setPassword("Bisma123");
EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
et.begin();
em.persist(ssd);
et.commit();
	}

}
