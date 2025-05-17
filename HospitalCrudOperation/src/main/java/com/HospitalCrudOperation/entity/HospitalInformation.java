package com.HospitalCrudOperation.entity;

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
@Table(name= "PatientDetails")
public class HospitalInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Pid;
    @Column(name = "HospitalName")
    private String H_Name;
    @Column(name = "PatientName")
    private String  P_Name;
    @Column(name = "PatientBill")
    private Long P_Bill;
    @Column(name = "OperatorName")
    private String OperatByname;

}
