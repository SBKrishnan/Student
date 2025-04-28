package com.springboot.Student.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document(value = "STUDENT")
@Builder
@AllArgsConstructor
@Data
public class StudentEntity {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int age;
}

