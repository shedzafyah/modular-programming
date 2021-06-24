package zw.co.afrosoft.persistence.department;


import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.domain.department.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}