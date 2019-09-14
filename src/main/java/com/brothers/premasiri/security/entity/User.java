package com.brothers.premasiri.security.entity;

import com.brothers.premasiri.asset.employee.entity.Employee;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties( value = "createdDate", allowGetters = true )
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( unique = true )
    private Integer id;

    @OneToOne( cascade = CascadeType.PERSIST )
    @JoinColumn( name = "employee_id" )
    private Employee employee;

    @Column( nullable = false )
    @Size( min = 5, message = "user name should include at least five characters" )
    private String username;

    @Column( nullable = false )
    @Size( min = 4, message = "password should include four characters or symbols" )
    private String password;

    @Column( nullable = false )
    private boolean enabled;

    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private LocalDate createdDate;

    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    @JoinTable( name = "user_role",
            joinColumns = @JoinColumn( name = "user_id" ),
            inverseJoinColumns = @JoinColumn( name = "role_id" ) )
    private Set< Role > roles;

}
