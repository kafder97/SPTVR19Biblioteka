/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author user
 */
public class History implements Serializable{
    private Book book;
    private Read reader;
    private Date takeOnDate;
    private Date returnDate;

    public History() {
    }

    public History(Book book, Read reader, Date takeOnDate, Date returnDate) {
        this.book = book;
        this.reader = reader;
        this.takeOnDate = takeOnDate;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Read getReader() {
        return reader;
    }

    public void setReader(Read reader) {
        this.reader = reader;
    }

    public Date getTakeOnDate() {
        return takeOnDate;
    }

    public void setTakeOnDate(Date takeOnDate) {
        this.takeOnDate = takeOnDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "History{" 
                + "book=" + book 
                + ", reader=" + reader 
                + ", takeOnDate=" + takeOnDate 
                + ", returnDate=" + returnDate 
                + '}';
    }

}