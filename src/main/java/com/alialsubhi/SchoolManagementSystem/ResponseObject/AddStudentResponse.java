package com.alialsubhi.SchoolManagementSystem.ResponseObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddStudentResponse {

    private Long id;

    private String name;
    private String age;
    private String gender;


}
