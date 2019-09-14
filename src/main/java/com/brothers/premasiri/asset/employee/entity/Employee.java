package com.brothers.premasiri.asset.employee.entity;


import com.brothers.premasiri.asset.commonAseet.Enum.Gender;
import com.brothers.premasiri.asset.commonAseet.Enum.Title;
import com.brothers.premasiri.asset.commonAseet.Enum.CivilStatus;
import com.brothers.premasiri.asset.commonAseet.Enum.Designation;
import com.brothers.premasiri.asset.commonAseet.Enum.EmployeeStatus;
import com.brothers.premasiri.util.audit.AuditEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode( callSuper = true )
public class Employee extends AuditEntity {

    @NotNull(message = "Number is required")
    private String number;

    @Enumerated(EnumType.STRING)
    private Title title;

    @Size(min = 5, message = "Your name cannot be accept")
    private String name;

    @Size(min = 5, message = "At least 5 characters should be include calling name")
    private String callingName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Size(max = 12, min = 10, message = "NIC number is contained numbers between 9 and X/V or 12 ")
    private String nic;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private CivilStatus civilStatus;

    //@Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$",message = "Please provide valid email")
    @Email
    private String email;

    @Size(min = 9, message = "Can not accept this mobile number")
    private String mobile;

    private String land;

    @Size(min = 5, message = "Should be need to provide valid address !!")
    private String address;

    @Enumerated(EnumType.STRING)
    private Designation designation;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus employeeStatus;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate doassignment;



}
