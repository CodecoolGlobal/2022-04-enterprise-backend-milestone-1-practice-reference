package com.codecool.library.dao;

import com.codecool.library.model.Book;
import com.codecool.library.model.Writer;

import java.util.List;

public interface BookDao {
    void addBook(Book book);
    int getNumberOfBooksByGenre(String genre);
    List<Book> listBooksByWriters(List<Writer> writers);
    List<String> getTitlesOfFullyBorrowedBooks();
}
