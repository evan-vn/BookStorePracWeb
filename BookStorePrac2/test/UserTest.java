import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstoreprac2.entity.Users;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Users user1 = new Users();
		
		user1.setFullName("example");
		user1.setEmail("test@yahoo.com");
		user1.setPassword("password");
		
		EntityManagerFactory enManaFact =  Persistence.createEntityManagerFactory("BookStorePrac2");
		EntityManager enManager = enManaFact.createEntityManager();
		
		
		enManager.getTransaction().begin();
		enManager.persist(user1);
		enManager.getTransaction().commit();
		enManager.close();
		
		enManaFact.close();
		
		System.out.println("New user is added");
		
		
		

	}

}
