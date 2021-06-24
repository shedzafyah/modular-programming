package zw.co.afrosoft.persistence.lecturer;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.domain.lecturer.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Long> {

}
