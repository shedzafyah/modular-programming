package zw.co.afrosoft.persistence.student;


import org.springframework.data.jpa.repository.*;
import zw.co.afrosoft.domain.student.*;

public interface StudentRepository extends JpaRepository<Student,Long> {

}