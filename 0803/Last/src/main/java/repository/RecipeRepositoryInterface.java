package repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ch.qos.logback.core.net.server.Client;
import model.Recipe;

public interface RecipeRepositoryInterface extends JpaRepository<Recipe, Integer>{
	
	List<Recipe> findIfNameContains(String str);
	
	@Query("SELECT c FORM Client c WHERE c.name LIKE:name")
		Optional<Client>findByName(@Param ("name") String name);

}
