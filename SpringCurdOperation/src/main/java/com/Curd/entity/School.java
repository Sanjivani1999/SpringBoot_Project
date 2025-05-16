package com.Curd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "StudenInformation")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int studentId;
    @Column(name = "StudName")
    private  String StudentName;
    @Column(name = "StudentMark")
    private  float studentMark;
    @Column(name = "SchoolName")
    private  String SchoolName;
}
