package zw.co.afrosoft.service.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.afrosoft.domain.course.Course;
import zw.co.afrosoft.persistence.course.CourseRepository;

import java.util.List;

@Service
public class CourseService {

    private CourseRepository courseRepo;

    @Autowired
    public CourseService(CourseRepository courseRepo) {
        this.courseRepo = courseRepo;
    }

    public void save(Course course) {
        if(course!=null) {
            courseRepo.save(course);
        }
    }

    public List<Course> listAll(){
        return courseRepo.findAll();
    }

    public Course findByiId(Long id) {
        return courseRepo.findById(id).get();
    }

    public void remove(Long id) {
        courseRepo.deleteById(id);
    }

}
