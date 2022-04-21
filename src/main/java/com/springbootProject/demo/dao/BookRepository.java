package com.springbootProject.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootProject.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {



}