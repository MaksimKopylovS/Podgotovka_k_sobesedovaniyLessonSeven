package max_sk.controller;


import lombok.RequiredArgsConstructor;
import max_sk.model.Student;
import max_sk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{findId}")
    public List<Student> findStudentById(@PathVariable Long findId){
        return studentService.getStudentById(findId);
    }

    @GetMapping("/all")
    public List<Student> findAllStudent(){
        return studentService.faidAllStudent();
    }

    @PostMapping("/addStudent")
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping("/del/{id}")
    public void delStudent(@PathVariable Long id){
        System.out.println(id);
        studentService.delStudent(id);
    }

    @PutMapping("/edit")
    @ResponseStatus(HttpStatus.CREATED)
    public void editStudent(@RequestBody Student student) {
        studentService.editStudent(student);
    }
}
