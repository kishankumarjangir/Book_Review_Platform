package com.abc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private static Integer bookId = 1;
    private static String bookName = "How to Kill Men and Get Away with it";
    private static String bookReview = "Good Enough";

    public static Integer getBookId() {
        return bookId;
    }

    public static String getBookName() {
        return bookName;
    }

    public static String getBookReview() {
        return bookReview;
    }

    public static void setBookId(Integer bookId) {
        bookId = bookId;
    }

    public static void setBookName(String bookName) {
        bookName = bookName;
    }

    public static void setBookReview(String bookReview) {
        bookReview = bookReview;
    }
}
