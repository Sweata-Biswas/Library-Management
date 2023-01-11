package com.libraryManagement.libraryManagement.Dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorRequestDto {
    @Column( nullable = false)
    private String name;
    private int age;
    private String country;
    @Column(unique = true, nullable = false)
    private String email;
}
