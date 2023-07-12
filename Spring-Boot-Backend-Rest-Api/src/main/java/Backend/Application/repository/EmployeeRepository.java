package Backend.Application.repository;

import Backend.Application.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
//JpaRepository  performs all crud operations