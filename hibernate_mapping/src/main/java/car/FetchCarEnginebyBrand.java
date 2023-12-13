package car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchCarEnginebyBrand {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("satya");
		EntityManager em = emf.createEntityManager();
		
		
		String jpql = "select s from Car s where s.name=?1";
		
		
		Query query = em.createQuery(jpql);
		query.setParameter(1, "i20");
		List<Car> list = query.getResultList();
		
		if(list.size() !=0)
		{
			for (Car car : list) {
				System.out.println("Car id - "+car.getId());
				System.out.println("Car name - "+car.getName());
				System.out.println("Car color - "+car.getColor());
				System.out.println("Car price - "+car.getPrice());
				
				Engine engine = car.getEngine();
				System.out.println("Engine id - "+engine.getId());
				System.out.println("Engine cc - "+engine.getCc());
				System.out.println("Engine power - "+engine.getPower());
				
				System.out.println("---------------------------------");
			}
		}
		else {
			System.out.println("car not found");
		}
	}
}
