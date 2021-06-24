package zw.co.afrosoft.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.*;
import org.springframework.stereotype.Service;
import zw.co.afrosoft.domain.student.Student;
import zw.co.afrosoft.persistence.student.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepo;

    @Autowired
    public StudentService(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> listAll(){
        return studentRepo.findAll();
    }

    public void remove(Long id) {
        studentRepo.deleteById(id);
    }

    public Student findById(Long id) {
        return studentRepo.findById(id).get();
    }

    public void add(Student student) {
        studentRepo.save(student);
    }
}