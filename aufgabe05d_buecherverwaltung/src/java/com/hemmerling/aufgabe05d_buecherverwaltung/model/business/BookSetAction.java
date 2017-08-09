/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe05d_buecherverwaltung.model.business;

import com.hemmerling.aufgabe05d_buecherverwaltung.model.persistence.Book;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BookSetAction {

    // Parameter
    private static final String ID = "id";
    private static final String TITLE = "title";
    private static final String AUTHOR = "author";
    private static final String YEAROFRELEASE = "yearofrelease";
    private static final String ISBN = "isbn";
    private static final String GENRE = "genre";

    private static final String BOOKSERVICE = "bookservice";

    public void execute(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.valueOf(request.getParameter(ID));
        String title = request.getParameter(TITLE);
        String autor = request.getParameter(AUTHOR);
        String yearOfRelease = request.getParameter(YEAROFRELEASE);
        String isbn = request.getParameter(ISBN);
        String genre = request.getParameter(GENRE);
        
        if ((isbn != null && !isbn.trim().isEmpty())
                & (title != null && !title.trim().isEmpty())) {
            Book book = new Book(id, title, autor, yearOfRelease, isbn, genre);
            HttpSession session = request.getSession();
            BookService bookService = (BookService) session.getAttribute(BOOKSERVICE);
            bookService.set(id, book);
        }
    }
}
