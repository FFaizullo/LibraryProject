package ru.project.models;

import javax.validation.constraints.Size;

public class Book {
    private int book_id;
    @Size(min=1, message = "Название должно содержать хотя бы один символ")
    private String title;
    @Size(min=1, message = "Поле должно содержать хотя бы один символ")
    private String author;
    private int year;

    public Book() {}

    public Book(int book_id, String title, String author, int year) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
