package max_sk.service;

import lombok.RequiredArgsConstructor;
import max_sk.model.Student;
import max_sk.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getStudentById(Long id){
        List<Student> listStudent = new ArrayList<>();
        Student s = studentRepository.getById(id);
        listStudent.add(s);
        return listStudent;
    }

    public List<Student> faidAllStudent(){
        return studentRepository.findAll();
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public void delStudent(Long id){
        studentRepository.deleteById(id);
    }

    public void editStudent(Student student){
        studentRepository.save(student);
    }
}
