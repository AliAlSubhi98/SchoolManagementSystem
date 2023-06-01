package com.alialsubhi.SchoolManagementSystem.ResponseObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddStudentResponse {

    private Long id;

    private String name;
    private Integer age;
    private String gender;



}
