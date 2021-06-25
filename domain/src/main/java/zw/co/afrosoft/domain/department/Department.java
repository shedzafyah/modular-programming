package zw.co.afrosoft.domain.department;

import zw.co.afrosoft.domain.base.*;

import javax.persistence.*;

@Entity
public class Department extends BaseEntity {

    @Column(nullable = false,length = 100, unique = true)
    private String name;

    public Department() {

    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
