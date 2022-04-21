package com.springbootProject.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("/student")
public class StudentRestController {


    @Autowired
    private com.springbootProject.demo.service.BookService bookService;

    @GetMapping("/books")
    public String getCustomers(Model theModel) {

        List<com.springbootProject.demo.entity.Book> books=bookService.findAll();
        theModel.addAttribute(books);
        return "listBooks.html";

    }
}
