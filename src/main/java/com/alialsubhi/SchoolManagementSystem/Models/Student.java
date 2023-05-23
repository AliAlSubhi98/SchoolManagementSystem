package com.alialsubhi.SchoolManagementSystem.Models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String age;

}
