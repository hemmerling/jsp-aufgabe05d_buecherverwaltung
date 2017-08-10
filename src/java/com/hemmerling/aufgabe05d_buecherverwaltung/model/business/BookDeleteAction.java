/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe05d_buecherverwaltung.model.business;

import com.hemmerling.aufgabe05d_buecherverwaltung.model.persistence.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rhemmerling
 */
public class BookDeleteAction {

// Parameter
    private static final String ID2 = "id2";
    private static final String BOOKSERVICE = "bookservice";

    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter(ID2);
        try {
            int index = Integer.parseInt(id);
            HttpSession session = request.getSession();
            BookService bookService = (BookService) session.getAttribute(BOOKSERVICE);
            bookService.remove(index);
        } catch (NumberFormatException nfe) {
        }
    }
}