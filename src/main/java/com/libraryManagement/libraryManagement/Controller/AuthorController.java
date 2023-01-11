package com.libraryManagement.libraryManagement.Controller;

import com.libraryManagement.libraryManagement.Dto.AuthorRequestDto;
import com.libraryManagement.libraryManagement.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/create")
    public ResponseEntity<String> createAuthor(@RequestBody() AuthorRequestDto authorRequestDto){
        return new ResponseEntity<>(authorService.createAuthor(authorRequestDto), HttpStatus.CREATED);
    }
}
