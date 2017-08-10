/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe05d_buecherverwaltung.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.hemmerling.aufgabe05d_buecherverwaltung.model.business.BookService;

/**
 * Web application lifecycle listener.
 *
 * @author hemmerling@gmx.net
 */
@WebListener
public class BookSessionListener implements HttpSessionListener {

    private static final String BOOKSERVICE = "bookservice";

    @Override
    public void sessionCreated(HttpSessionEvent event) {
        HttpSession session = event.getSession();
        addBookList(session); // Buchliste wird als Session-Attribut anlegen
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
    }

    private void addBookList(HttpSession session) {
        session.setAttribute(BOOKSERVICE, new BookService());
    }
}
