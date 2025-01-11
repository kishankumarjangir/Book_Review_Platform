package com.abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/BookId")
    private String getBookNameById(@PathVariable Integer Id){
        return BookService.getBookName(Id);
    }

    @GetMapping("/BookName")
    private String getBookReview(@PathVariable String Name){
        return BookService.getBookReview(Name);
    }
}
