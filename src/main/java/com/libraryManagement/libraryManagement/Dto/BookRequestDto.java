package com.libraryManagement.libraryManagement.Dto;

import com.libraryManagement.libraryManagement.Enums.Genre;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookRequestDto {
    @Column( nullable = false)
    private String name;
    private Genre genre;
    private int authorId;
}
