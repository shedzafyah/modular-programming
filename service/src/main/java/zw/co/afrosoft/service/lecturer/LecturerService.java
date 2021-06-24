package zw.co.afrosoft.service.lecturer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.afrosoft.domain.lecturer.Lecturer;
import zw.co.afrosoft.persistence.lecturer.LecturerRepository;

import java.util.List;

@Service
public class LecturerService {

    private LecturerRepository lecturerRepo;

    @Autowired
    public LecturerService(LecturerRepository lecturerRepo) {
        this.lecturerRepo = lecturerRepo;
    }

    public void save(Lecturer lecturer) {
        lecturerRepo.save(lecturer);
    }

    public List<Lecturer> listAll(){
        return lecturerRepo.findAll();
    }

    public Lecturer findById(Long id) {
        return lecturerRepo.findById(id).get();
    }

    public void remove(Long id) {
        lecturerRepo.deleteById(id);
    }
}