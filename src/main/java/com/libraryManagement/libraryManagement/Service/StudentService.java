package com.libraryManagement.libraryManagement.Service;

import com.libraryManagement.libraryManagement.Convertor.AuthorConvertor;
import com.libraryManagement.libraryManagement.Convertor.StudentConvertor;
import com.libraryManagement.libraryManagement.Dto.StudentRequestDto;
import com.libraryManagement.libraryManagement.Enums.CardStatus;
import com.libraryManagement.libraryManagement.Models.Author;
import com.libraryManagement.libraryManagement.Models.Card;
import com.libraryManagement.libraryManagement.Models.Student;
import com.libraryManagement.libraryManagement.Repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public  String createStudent(StudentRequestDto studentRequestDto){

        try {
            Student student = StudentConvertor.convertDtoToEntity(studentRequestDto);
            studentRepository.save(student);

            Card card = new Card();
            card.setCardStatus(CardStatus.ACTIVATED);
            card.setStudent(student);
            student.setCard(card);
            studentRepository.save(student);
        }catch (Exception e){
            log.info("createStudent has caused an error");
            return "Create student did not work";
        }

        return "Successfully added student and card";
    }
}
