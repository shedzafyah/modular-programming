package zw.co.afrosoft.persistence.course;

import org.springframework.data.jpa.repository.*;
import zw.co.afrosoft.domain.course.*;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
