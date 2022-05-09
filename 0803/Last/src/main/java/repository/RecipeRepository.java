package repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import ch.qos.logback.core.net.server.Client;
import model.Recipe;

public class RecipeRepository extends SimpleJpaRepository<Recipe, Integer> implements RecipeRepositoryInterface{

	public RecipeRepository(Class<Recipe> domainClass, EntityManager em) {
		super(domainClass, em);
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Recipe> findIfNameContains(String str) {
		List<Recipe> list=entityManager.createQuery("SELECT r FROM Recipe r WHERE r.name LIKE :str").setParameter("str", str).getResultList();
		return list;
	}

	@Override
	public Optional<Client> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
