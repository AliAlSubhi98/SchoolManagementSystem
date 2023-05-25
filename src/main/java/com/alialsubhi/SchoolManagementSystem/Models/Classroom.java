package com.alialsubhi.SchoolManagementSystem.Models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "classes")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int size;
    private String code;

    @ManyToOne
    private Teacher teacher;

    @OneToMany(mappedBy = "id")
    private List<Course> course = new ArrayList<>();
}
