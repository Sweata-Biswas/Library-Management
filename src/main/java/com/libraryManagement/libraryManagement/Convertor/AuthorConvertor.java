package com.libraryManagement.libraryManagement.Convertor;

import com.libraryManagement.libraryManagement.Dto.AuthorRequestDto;
import com.libraryManagement.libraryManagement.Models.Author;

public class AuthorConvertor {
    public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){
        Author author = Author.builder().
                name(authorRequestDto.getName()).
               country(authorRequestDto.getCountry()).
                age(authorRequestDto.getAge()).
                email(authorRequestDto.getEmail()).build() ;
        return author;
    }
}
