package usinghibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllStudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
EntityManager em=emf.createEntityManager();
String jpql="select p from student p";
Query query = em.createQuery(jpql);
List<student> list = query.getResultList();
System.out.println(list.getClass().getName());
for(student st:list ) {
	System.out.println("Id:"+st.getId());
	System.out.println("Name:"+st.getName());
	System.out.println("Age:"+st.getAge());
	System.out.println("Mobile:"+st.getMobile());
	System.out.println("**********************");
}
	}

}

