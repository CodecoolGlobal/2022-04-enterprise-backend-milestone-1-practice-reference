package com.codecool.library.model;

public class Book {
    private String title;
    private String writerName;
    private String genre;
    private int numberOwnedByLibrary;
    private int numberBorrowed;

    public Book(String title, String writerName, String genre, int numberOwnedByLibrary, int numberBorrowed) {
        this.title = title;
        this.writerName = writerName;
        this.genre = genre;
        this.numberOwnedByLibrary = numberOwnedByLibrary;
        this.numberBorrowed = numberBorrowed;
    }

    public Book() {}

    public String getTitle() {
        return title;
    }

    public String getWriterName() {
        return writerName;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOwnedByLibrary() {
        return numberOwnedByLibrary;
    }

    public int getNumberBorrowed() {
        return numberBorrowed;
    }
}
