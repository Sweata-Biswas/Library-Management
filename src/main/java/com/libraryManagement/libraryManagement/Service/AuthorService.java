package com.libraryManagement.libraryManagement.Service;

import com.libraryManagement.libraryManagement.Convertor.AuthorConvertor;
import com.libraryManagement.libraryManagement.Dto.AuthorRequestDto;
import com.libraryManagement.libraryManagement.Models.Author;
import com.libraryManagement.libraryManagement.Repository.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    public  String createAuthor(AuthorRequestDto authorRequestDto){
        try {
            Author author = AuthorConvertor.convertDtoToEntity(authorRequestDto);
            authorRepository.save(author);
        }catch (Exception e){
            log.info("createAuthor has caused an error");
            return "Create author did not work";
        }
        return "Author Added Successfully";
    }
}
