package com.springbootProject.demo.dao;

import com.springbootProject.demo.entity.Book;
import com.springbootProject.demo.entity.StudentBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentBookRepository extends JpaRepository<StudentBookList,Integer>{
    List<StudentBookList> findAllByUserName(String userName);
}
