package com.springbootProject.demo.service;

import com.springbootProject.demo.dao.BookRepository;
import com.springbootProject.demo.entity.Book;
import com.springbootProject.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {


    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository theBookRepository) {
        this.bookRepository = theBookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int theId) {
        Optional<Book> result = bookRepository.findById(theId);

        Book theBook = null;

        if (result.isPresent()) {
            theBook = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find book id - " + theId);
        }

        return theBook;
    }

    @Override
    public void save(Book theBook) {
        bookRepository.save(theBook);
    }

    @Override
    public void deleteById(int theId) {
        bookRepository.deleteById(theId);
    }

}

