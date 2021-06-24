package zw.co.afrosoft.domain.student;


import zw.co.afrosoft.domain.course.*;
import zw.co.afrosoft.domain.lecturer.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 24)
    private String firstname;

    @Column(nullable = false,length = 24)
    private String lastname;

    @Column(nullable = false,length = 30, unique = true)
    private String email;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;
    /*
    @ManyToOne
    @JoinColumn(name ="lecturer_id")
    private Lecturer lecturer;


     */

    public Student() {

    }

    public Student(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }




}