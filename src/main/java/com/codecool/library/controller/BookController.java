package com.codecool.library.controller;

import com.codecool.library.model.Book;
import com.codecool.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @GetMapping
    public int getNumberOfBooksByGenre(@RequestParam("genre") String genre) {
        return bookService.getNumberOfBooksByGenre(genre);
    }

    @GetMapping("/byWriter")
    public List<Book> getBooksByWritersBirthPlace(@RequestParam("writersBirthPlace") String writersBirthPlace) {
        return bookService.getBooksByWritersBirthPlace(writersBirthPlace);
    }

    @GetMapping("/allBorrowed")
    public List<String> getTitlesOfFullyBorrowedBooks() {
        return bookService.getTitlesOfFullyBorrowedBooks();
    }
}
