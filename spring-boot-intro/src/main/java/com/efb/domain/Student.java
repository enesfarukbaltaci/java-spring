package com.efb.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "First name cannot be null")
    @NotBlank(message = "First name  cannot be white space")
    @Size(min = 1,max = 100,message = "First name '${validatedValue}' must be between {min} and {max} chars long")
    @Column(length = 100,nullable = false)
    private String firstName;

    @Column(length = 100,nullable = false)
    private String lastName;

    private Integer grade;

    //555-555-5555
    //(555).555.5555
    //555 555 5555
    //55555 5555
    @Pattern(regexp = "^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$", message = "Please provide valid phone number")
    @Column(length = 14)
    private String phoneNumber;

    @Column(length = 100,nullable = false,unique = true)
    @Email(message = "Please provide valid email")
    private String email;

    private LocalDateTime createDate = LocalDateTime.now();


}
