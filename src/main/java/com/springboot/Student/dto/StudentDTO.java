package com.springboot.Student.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class StudentDTO {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int age;

}
