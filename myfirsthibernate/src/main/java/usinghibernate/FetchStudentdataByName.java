package usinghibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchStudentdataByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
EntityManager em=emf.createEntityManager();
String jpql="select s from student s where s.name=?1 and s.age=?2";//the index no. we passed in the set parameter() we've to pass that in the jpql query
Query query = em.createQuery(jpql);//example where a.name=?1 and a.age=?2 like this query.setParameter(1, "Jagdish"); query.setParameter(2, 23); 
query.setParameter(1, "Jagdish");
query.setParameter(2, 22);
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
