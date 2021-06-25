package zw.co.afrosoft.domain.lecturer;

import zw.co.afrosoft.domain.base.*;
import zw.co.afrosoft.domain.department.Department;
import zw.co.afrosoft.domain.student.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Lecturer extends BaseEntity {

    @Enumerated(value = EnumType.STRING)
    private Title title;

    @Column(nullable = false,length = 24)
    private String firstname;

    @Column(nullable = false,length = 24)
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToMany(mappedBy = "lecturer")
    private List<Student> students;

    public Lecturer() {

    }

    public Lecturer(Title title, String firstname, String lastname, Department department) {
        this.title = title;
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
