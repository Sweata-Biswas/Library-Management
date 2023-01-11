package com.libraryManagement.libraryManagement.Repository;

import com.libraryManagement.libraryManagement.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
