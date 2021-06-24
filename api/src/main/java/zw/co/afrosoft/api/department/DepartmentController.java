package zw.co.afrosoft.api.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zw.co.afrosoft.domain.department.Department;
import zw.co.afrosoft.service.department.DepartmentService;

import java.util.List;

@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/listdepartments")
    public List<Department> listAll(){
        return departmentService.listAll();
    }

    @PostMapping("/add-department")
    public void addNewDepartment(@RequestBody Department department) {
        departmentService.save(department);
    }

    @DeleteMapping("/removed/{id}")
    public void remove(@PathVariable Long id) {
        departmentService.remove(id);
    }

    @PutMapping("/department/{id}")
    public Department update(@RequestBody Department department, @PathVariable Long id) {
        Department existingDepartment = departmentService.findById(id);
        existingDepartment.setName(department.getName());
        departmentService.save(existingDepartment);
        return existingDepartment;
    }

    @GetMapping("/department/{id}")
    public Department findById(@PathVariable Long id) {
        return departmentService.findById(id);
    }
}
