package com.study.amqp.bean;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Firewine
 * @version 1.0
 * @ProgramName: Book
 * @Create 2020/7/20
 * @Description
 */
public class Book {

    private String bookName;
    private String author ;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
