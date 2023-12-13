package car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllCarEngines {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("satya");
		EntityManager em = emf.createEntityManager();
		
		
		String jpql = "select s from Car s";
		
		Query query = em.createQuery(jpql);
		
		List<Car> list = query.getResultList();
		
		for (Car car : list) {
			System.out.println("Car id"+car.getId());
			System.out.println("Car name"+car.getName());
			System.out.println("Car color"+car.getColor());
			System.out.println("Car price"+car.getPrice());
			
			Engine engine = car.getEngine();
			System.out.println("Engine id"+engine.getId());
			System.out.println("Engine cc"+engine.getCc());
			System.out.println("Engine power"+engine.getPower());
			
			System.out.println("---------------------------------");
		}
				
	}
}
