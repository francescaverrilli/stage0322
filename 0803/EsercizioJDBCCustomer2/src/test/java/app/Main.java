package app;


import java.util.Arrays;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.lr.Customer;


import InterfaceDao.CustomerDao;
import ch.qos.logback.classic.Logger;
import repository.CustomerRepository;

public class Main implements CommandLineRunner{

private static final Logger log=(Logger) LoggerFactory.getLogger(Main.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		log.info("StartApplication...");
		startCustomerApp();
		
	}

	private void startCustomerApp() {
		
		jdbcTemplate.execute("DROP TABLE customer IF EXSIST");
		jdbcTemplate.execute("CREATE TABLE customer(" + "id SERIAL, name VARCHAR(255), age NUMERIC(2), created_date timestamp)");
		
		List <Customer> list=Arrays.asList(
				new Customer("Customer a",19),
				new Customer("Customer b",20),
				new Customer("Customer c",21),
				new Customer("Customer d",22)
				);
		
		list.forEach(x->{
			log.info("Saving...{}", x.getName());
			customerRepository.save(x);
		});
		
		
	
	log.info("[FIND_BY_ID]");
    log.info("{}", customerRepository.findByCustomerId(1));
    log.info("{}", customerRepository.findByCustomerId2(2));
   


	}
}
	

		

