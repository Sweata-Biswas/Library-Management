package com.libraryManagement.libraryManagement.Convertor;


import com.libraryManagement.libraryManagement.Dto.BookRequestDto;
import com.libraryManagement.libraryManagement.Models.Book;

public class BookConvertor {
    public static Book convertDtoToEntity(BookRequestDto bookRequestDto){
        Book book = Book.builder().
                name(bookRequestDto.getName()).
                genre(bookRequestDto.getGenre())
                .build() ;
        return book;
    }
}
