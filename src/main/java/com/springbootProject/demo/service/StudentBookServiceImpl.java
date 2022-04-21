package com.springbootProject.demo.service;

import com.springbootProject.demo.dao.StudentBookRepository;
import com.springbootProject.demo.entity.Book;
import com.springbootProject.demo.entity.StudentBookList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentBookServiceImpl implements StudentBookService{
    @Autowired
StudentBookRepository studentBookRepository;



@Override
    public List<StudentBookList> findAllByUserName(String userName) {
     return studentBookRepository.findAllByUserName(userName);
    }



    @Override
    public void save(StudentBookList theBook) {
      studentBookRepository.save(theBook);
    }



    @Override
    public void deleteById(int bookId) {
        studentBookRepository.deleteById(bookId);
    }



}
