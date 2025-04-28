package com.springboot.Student.service;

import com.springboot.Student.dto.StudentDTO;
import com.springboot.Student.entity.StudentEntity;
import com.springboot.Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentDTO addStudent(StudentDTO studentDTO) {
        StudentEntity studentEntity = studentRepository.save(StudentEntity.builder().id(studentDTO.getId()).firstName(studentDTO.getFirstName()).lastName(studentDTO.getLastName()).phone(studentDTO.getPhone()).email(studentDTO.getEmail()).age(studentDTO.getAge()).build());
        return StudentDTO.builder().id(studentEntity.getId()).firstName(studentEntity.getFirstName()).lastName(studentEntity.getLastName()).phone(studentEntity.getPhone()).email(studentEntity.getEmail()).age(studentDTO.getAge()).build();
    }
}
