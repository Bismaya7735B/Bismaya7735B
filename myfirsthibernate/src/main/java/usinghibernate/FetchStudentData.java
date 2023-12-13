package usinghibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchStudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("karthik");
		EntityManager em= emf.createEntityManager();
	student	st=em.find(student.class, 1);
	if(st!=null) {
		System.out.println("ID:"+st.getId());//using object.get() method
		System.out.println("Name:"+st.getName());
		System.out.println("Age:"+st.getAge());
		System.out.println("Mobile:"+st.getMobile());
		//System.out.println(st);//using toString()
	}
	else {
		System.out.println("data not found here");
	}
	}

}
