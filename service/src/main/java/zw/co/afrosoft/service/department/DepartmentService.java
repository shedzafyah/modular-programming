package zw.co.afrosoft.service.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.afrosoft.domain.department.Department;
import zw.co.afrosoft.persistence.department.DepartmentRepository;

import java.util.List;

@Service
public class DepartmentService {

    private DepartmentRepository departmentRepo;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public List<Department> listAll(){
        return departmentRepo.findAll();
    }

    public void save(Department department) {
        departmentRepo.save(department);
    }

    public Department findById(Long id) {
        return departmentRepo.getById(id);
    }

    public void remove(Long id) {
        departmentRepo.deleteById(id);
    }


}
