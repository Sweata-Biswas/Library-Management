package com.libraryManagement.libraryManagement.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "author")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "author_name" , nullable = false)
    private String name;

    private String country;
    @Column(name = "author_email",unique = true, nullable = false)
    private String email;
    private int age;
    @OneToMany(mappedBy = "author" , cascade = CascadeType.ALL)
    private List<Book> bookWritten;


}
