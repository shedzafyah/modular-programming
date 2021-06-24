package zw.co.afrosoft.persistence.student;


import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.domain.student.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}