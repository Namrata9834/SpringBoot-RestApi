package Backend.Application;

import Backend.Application.model.Employee;
import Backend.Application.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackendRestApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendRestApiApplication.class, args);
		System.out.println("hello employees");
		}

		@Autowired
        private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee1= new Employee();
//		employee1.setFirstName("Namrata");
//		employee1.setLastName("Tati");
//		employee1.setEmailId("nam123@gmail.com");
//		employeeRepository.save(employee1);
//
//
//		Employee employee2= new Employee();
//		employee2.setFirstName("Aishwarya");
//		employee2.setLastName("samal");
//		employee2.setEmailId("aish1111@gmail.com");
//		employeeRepository.save(employee2);


	}
}


