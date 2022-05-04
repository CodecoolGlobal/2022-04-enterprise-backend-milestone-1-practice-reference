package com.codecool.library.dao.implementation.memory;

import com.codecool.library.dao.BookDao;
import com.codecool.library.model.Book;
import com.codecool.library.model.Writer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookDaoMem implements BookDao {
    private final List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public int getNumberOfBooksByGenre(String genre) {
        return (int) books.stream().filter(book -> book.getGenre().equals(genre)).count();
    }

    @Override
    public List<Book> listBooksByWriters(List<Writer> writers) {
        List<String> writerNames = getWriterNames(writers);
        return books.stream()
                .filter(book -> writerNames.contains(book.getWriterName()))
                .collect(Collectors.toList());
    }

    private List<String> getWriterNames(List<Writer> writers) {
        List<String> writerNames = new ArrayList<>();
        for (Writer writer : writers) {
            writerNames.add(writer.getName());
        }
        return writerNames;
    }

    @Override
    public List<String> getTitlesOfFullyBorrowedBooks() {
        List<Book> fullyBorrowedBooks = books.stream()
                .filter(book -> book.getNumberBorrowed() == book.getNumberOwnedByLibrary()).collect(Collectors.toList());
        return fullyBorrowedBooks.stream().map(Book::getTitle).collect(Collectors.toList());
    }
}