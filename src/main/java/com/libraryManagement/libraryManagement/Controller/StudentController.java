package com.libraryManagement.libraryManagement.Controller;

import com.libraryManagement.libraryManagement.Dto.StudentRequestDto;
import com.libraryManagement.libraryManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody()StudentRequestDto studentRequestDto){
        String response = studentService.createStudent(studentRequestDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
