package zw.co.afrosoft.persistence.department;


import org.springframework.data.jpa.repository.*;
import zw.co.afrosoft.domain.department.*;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}