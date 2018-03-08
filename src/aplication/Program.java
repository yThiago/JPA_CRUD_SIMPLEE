package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Funcionario;

public class Program {

	public static void main(String[] args) {
	
		Funcionario f1 = new Funcionario(null, "Venta 18", "venta@18.com");
		
		Funcionario f2 = new Funcionario(null, "Cabeca de pika", "cabecadepica@18.com");
		
		Funcionario f3 = new Funcionario(null, "caixaberg", "soninho@rennan.com");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(f1);
		em.persist(f2);
		em.persist(f3);
		
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		System.out.println("ok");
	
		
		
		

	}

}
