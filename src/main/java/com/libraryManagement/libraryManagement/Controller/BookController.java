package com.libraryManagement.libraryManagement.Controller;

import com.libraryManagement.libraryManagement.Dto.BookRequestDto;
import com.libraryManagement.libraryManagement.Repository.BookRepository;
import com.libraryManagement.libraryManagement.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
     @PostMapping("/create")
    public ResponseEntity<String> createBook(@RequestBody()BookRequestDto bookRequestDto){
         return  new ResponseEntity<>(bookService.createBook(bookRequestDto), HttpStatus.CREATED);
     }
}
