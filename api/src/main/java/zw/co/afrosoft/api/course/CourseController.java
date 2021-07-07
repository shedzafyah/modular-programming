package zw.co.afrosoft.api.course;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import zw.co.afrosoft.domain.course.Course;
import zw.co.afrosoft.service.course.*;

import java.util.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService=courseService;
    }

    @GetMapping
    public List<Course> listAll(){
        return courseService.listAll();
    }

    @PostMapping
    public void addNewCourse(@RequestBody Course course) {
        courseService.save(course);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id) {
        courseService.remove(id);
    }

    @PutMapping("/{id}")
    public Course update(@RequestBody Course course, @PathVariable Long id) {
        Course existingCourse = courseService.findByiId(id);
        existingCourse.setCode(course.getCode());
        existingCourse.setName(course.getName());
        courseService.save(existingCourse);
        return existingCourse;
    }

    @GetMapping("/{id}")
    public Course findById(@PathVariable Long id) {
        return courseService.findByiId(id);
    }

}
