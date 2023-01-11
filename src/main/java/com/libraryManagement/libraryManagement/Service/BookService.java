package com.libraryManagement.libraryManagement.Service;

import com.libraryManagement.libraryManagement.Convertor.BookConvertor;
import com.libraryManagement.libraryManagement.Dto.BookRequestDto;
import com.libraryManagement.libraryManagement.Models.Author;
import com.libraryManagement.libraryManagement.Models.Book;
import com.libraryManagement.libraryManagement.Repository.AuthorRepository;
import com.libraryManagement.libraryManagement.Repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;

    public String createBook(BookRequestDto bookRequestDto){

        try{
            Book book = BookConvertor.convertDtoToEntity(bookRequestDto);
            int authorId = bookRequestDto.getAuthorId();
            Author author = authorRepository.findById(authorId).get();
            book.setAuthor(author);
            book.setCard(null);

//          book list need to be updated
            List<Book> currentListOfBooks = author.getBookWritten();
            currentListOfBooks.add(book);
            author.setBookWritten(currentListOfBooks);


            authorRepository.save(author);
//            bookRepository.save(book);
        }catch (Exception e){
            log.info("No such id present in author");
            return "Error in create book";
        }


        return "Book added Successfully";
    }
}
