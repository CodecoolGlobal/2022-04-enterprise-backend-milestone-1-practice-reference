package com.codecool.library.service;

import com.codecool.library.dao.BookDao;
import com.codecool.library.dao.WriterDao;
import com.codecool.library.model.Book;
import com.codecool.library.model.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    @Autowired
    private WriterDao writerDao;

    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    public int getNumberOfBooksByGenre(String genre) {
        return bookDao.getNumberOfBooksByGenre(genre);
    }

    public List<Book> getBooksByWritersBirthPlace(String writersBirthPlace) {
        List<Writer> eligibleWriters = writerDao.listWritersByBirthPlace(writersBirthPlace);
        return bookDao.listBooksByWriters(eligibleWriters);
    }

    public List<String> getTitlesOfFullyBorrowedBooks() {
        return bookDao.getTitlesOfFullyBorrowedBooks();
    }
}
