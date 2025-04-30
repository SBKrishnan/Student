package com.springboot.Student.controller;


import com.springboot.Student.dto.StudentDTO;
import com.springboot.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/api/post")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public StudentDTO addStudent(@RequestBody StudentDTO studentDTO) {

        return studentService.addStudent(studentDTO);
    }

//    @GetMapping
//    public StudentDTO getStudent(@PathVariable String id){
//        return studentService.getStudent(id);
//    }
}
