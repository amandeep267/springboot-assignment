package com.springbootProject.demo.controller;


import com.springbootProject.demo.entity.Book;
import com.springbootProject.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String getBooks(Model theModel) {

        List<Book>books=bookService.findAll();
        theModel.addAttribute("books",books);
        System.out.print(books.size());

        return "listBooks";

    }

    @GetMapping("/addBook")
    public String addNewBook(Model model) {
        model.addAttribute("book"   , new Book());
        return "addBook";
    }


    @PostMapping("/books")
    public String addBook(@Valid @ModelAttribute("book") Book theBook, BindingResult BindingResult) {

        // also just in case the pass an id in JSON ... set id to 0
        // this is force a save of new item ... instead of update

//        theBook.setId(0);
        if (BindingResult.hasErrors()) {

            return "addBook";
        }
        bookService.save(theBook);

        return "redirect:/admin/books";
    }



    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("id") int theId,
                                    Model theModel) {

        Book theBook = bookService.findById(theId);
        System.out.println(theBook.getAuthorName());
        theModel.addAttribute("book", theBook);
        return "addBook";
    }


    @GetMapping("/books/{bookId}")
    public String deleteBook(@PathVariable int bookId) {
        bookService.deleteById(bookId);
        return "redirect:/admin/books";
    }

}
