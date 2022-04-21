package com.springbootProject.demo.service;

import com.springbootProject.demo.entity.Book;
import com.springbootProject.demo.entity.StudentBookList;

import java.util.List;

public interface StudentBookService {

   List<StudentBookList> findAllByUserName(String username);
   public void save(StudentBookList theBook);
   public void deleteById(int theId);
}
