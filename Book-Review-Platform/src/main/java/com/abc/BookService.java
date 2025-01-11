package com.abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    static String getBookName(Integer id){
        return Book.getBookName();
    }

    static String getBookReview(String Name){
        return Book.getBookReview();
    }


}
