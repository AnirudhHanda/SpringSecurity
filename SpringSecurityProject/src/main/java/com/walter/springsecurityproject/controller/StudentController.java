package com.walter.springsecurityproject.controller;

import com.walter.springsecurityproject.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> students = new ArrayList<>(List.of(new Student(1, "Homi Bhabha", "Java"), new Student(2, "Vikram Sarabhai", "Python")));


    @GetMapping("csrf-token")
    public CsrfToken getCsrf(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("students")
    public ResponseEntity<?> getAllStudents() {
        if(students.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("students")
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        students.add(student);

        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
