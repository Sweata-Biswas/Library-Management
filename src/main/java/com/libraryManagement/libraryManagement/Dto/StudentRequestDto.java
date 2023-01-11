package com.libraryManagement.libraryManagement.Dto;

import jakarta.persistence.Column;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentRequestDto {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private  String email;
    private String country;
    private int age;

}
