package car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCarEngin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("satya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int id = 4;
		Car car = em.find(Car.class, id);
		
		if (car != null) {
			et.begin();
			em.remove(car);
			em.remove(car.getEngine());
			et.commit();
			System.out.println("car delete");
		}
		else {
			System.out.println("id not found");
		}
	}

}
