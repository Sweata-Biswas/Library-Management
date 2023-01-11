package com.libraryManagement.libraryManagement.Models;

import com.libraryManagement.libraryManagement.Enums.Genre;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name = "book_name", nullable = false)
    private String name;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @ManyToOne
    @JoinColumn
    private Author author;

    @ManyToOne
    @JoinColumn
    private  Card card;

}
