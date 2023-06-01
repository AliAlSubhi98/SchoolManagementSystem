package com.alialsubhi.SchoolManagementSystem.RequestObject;

import com.alialsubhi.SchoolManagementSystem.Models.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddStudentRequest {
    private Long id;

    private String name;
    private Integer age;
    private String gender;

    public Student convertToStudent(){
        Date currentDate = new Date();
        Student student = new Student();

        student.setId(this.getId());
        student.setName(this.getName());
        student.setAge(this.getAge());
        student.setGender(this.getGender());
        student.setIsActive(true);
        student.setCreatedDate(currentDate);
        student.setUpdatedDate(currentDate);

        return student;
    }

}
