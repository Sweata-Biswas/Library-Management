package com.libraryManagement.libraryManagement.Convertor;

import com.libraryManagement.libraryManagement.Dto.StudentRequestDto;
import com.libraryManagement.libraryManagement.Models.Student;

public class StudentConvertor {
    public static Student convertDtoToEntity(StudentRequestDto studentRequestDto) {
        Student student = Student.builder().
                name(studentRequestDto.getName()).
                country(studentRequestDto.getCountry()).
                age(studentRequestDto.getAge()).
                email(studentRequestDto.getEmail()).build();
        return student;
    }
}
