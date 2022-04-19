package ListMapSetProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("lsmp.xml");

    	CustomerTwo cust = (CustomerTwo)context.getBean("CustomerBean");
    	System.out.println(cust);
		
	}

}
