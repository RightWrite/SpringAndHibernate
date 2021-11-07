package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> students = new ArrayList<>();

    @PostConstruct
    public void loadData() {

        students.add(new Student(1, "Kate", "W"));
        students.add(new Student(2, "Henry", "Ford"));
        students.add(new Student(3, "Mary", "Curry"));
    }

    @GetMapping("students")
    public List<Student> getStudents() {

        return students;
    }

    @GetMapping("students/{studentId}")
    public Student getStudents(@PathVariable int studentId) {
        if (studentId > students.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return students.get(studentId);
    }





}
