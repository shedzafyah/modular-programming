package zw.co.afrosoft.domain.lecturer;

import zw.co.afrosoft.domain.department.Department;

import javax.persistence.*;

@Entity
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private Title title;

    @Column(nullable = false,length = 24)
    private String firstname;

    @Column(nullable = false,length = 24)
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "department_id",nullable = false,unique = true)
    private Department department;

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

    public Long getId() {
        return id;
    }




}
