package zw.co.afrosoft.persistence.course;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.domain.course.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
