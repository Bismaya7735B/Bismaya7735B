package car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchCarEngineById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("satya");
		EntityManager em = emf.createEntityManager();
		
		Car car = em.find(Car.class, 4);
		if (car != null) {
	
			System.out.println(car.getId());
			System.out.println(car.getName());
			System.out.println(car.getColor());
			System.out.println(car.getPrice());
			
			Engine engine = car.getEngine();
			System.out.println(engine.getId());
			System.out.println(engine.getCc());
			System.out.println(engine.getPower());
		}
		else {
			System.out.println("Data not found");
		}
	}
}
