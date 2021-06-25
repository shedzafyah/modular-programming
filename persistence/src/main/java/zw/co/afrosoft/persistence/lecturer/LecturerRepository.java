package zw.co.afrosoft.persistence.lecturer;

import org.springframework.data.jpa.repository.*;
import zw.co.afrosoft.domain.lecturer.*;

public interface LecturerRepository extends JpaRepository<Lecturer,Long> {

}
