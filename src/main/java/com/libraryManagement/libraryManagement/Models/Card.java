package com.libraryManagement.libraryManagement.Models;

import com.libraryManagement.libraryManagement.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter

@Entity
@Table(name="card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    @OneToOne
    @JoinColumn
    private Student student;

    @OneToMany(mappedBy = "card" , cascade = CascadeType.ALL)
    private List<Book> bookIssued;
}
