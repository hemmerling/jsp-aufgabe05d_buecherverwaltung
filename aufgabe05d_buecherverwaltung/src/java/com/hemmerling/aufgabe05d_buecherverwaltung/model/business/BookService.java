/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe05d_buecherverwaltung.model.business;

import java.util.ArrayList;
import java.util.List;
import com.hemmerling.aufgabe05d_buecherverwaltung.model.persistence.*;

/**
 *
 * @author rhemmerling
 */
public class BookService {

    /* static */ List<String[]> bookList;
    private static BookService instance = null;

    public BookService() {
    }

    public static BookService getInstance() {
        if (instance == null) {
            instance = new BookService();
        }
        return instance;
    }

    public List<String[]> get() {
        if (bookList == null) {
            bookList = new ArrayList<String[]>();
        }
        return bookList;
    }

    public void add(Book book) {
        bookList.add(new String[]{String.valueOf(book.getId()), book.getTitle(), book.getAutor(), 
                                  book.getYearOfRelease(), book.getIsbn(), book.getGenre()});
    }

    public void set(int id, Book book) {
        bookList.set(id, new String[]{String.valueOf(book.getId()), book.getTitle(), 
                     book.getAutor(), book.getYearOfRelease(), book.getIsbn(), book.getGenre()});
    }

    public void remove(int id) {
        bookList.remove(id);
    }

}
