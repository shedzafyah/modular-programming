package zw.co.afrosoft.api.student;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import zw.co.afrosoft.domain.student.*;
import zw.co.afrosoft.service.email.*;
import zw.co.afrosoft.service.student.*;

import java.util.*;

@RestController
public class StudentController {

    private final StudentService studentService;

    private final EmailService emailService;

    @Autowired
    public StudentController(StudentService studentService, EmailService emailService) {
        this.studentService = studentService;
        this.emailService = emailService;
    }

    @GetMapping("/students")
    public List<Student> listAll(){
        return studentService.listAll();
    }

    @PostMapping("/student")
    public void add(@RequestBody Student student) {
        if (student != null) {
            studentService.add(student);
            //emailService.sendEmail(student);
        }
    }
    @DeleteMapping("/student/{id}")
    public void remove(@PathVariable Long id) {
        studentService.remove(id);
    }

    @PutMapping("/student/{id}")
    public Student update(@RequestBody Student student, @PathVariable Long id) {
        Student existingStudent = studentService.findById(id);
        existingStudent.setFirstname(student.getFirstname());
        existingStudent.setLastname(student.getLastname());
        existingStudent.setEmail(student.getEmail());
        studentService.add(existingStudent);
        return existingStudent;
    }

    @GetMapping("/student/{id}")
    public Student findById(@PathVariable Long id) {
        return studentService.findById(id);
    }



}