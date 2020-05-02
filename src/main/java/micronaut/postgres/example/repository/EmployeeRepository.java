package micronaut.postgres.example.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import micronaut.postgres.example.entity.Employee;


import java.util.Optional;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, String> {

    Optional<Employee> findById(String loginId);

    Employee findByLoginId(String loginId);
}
