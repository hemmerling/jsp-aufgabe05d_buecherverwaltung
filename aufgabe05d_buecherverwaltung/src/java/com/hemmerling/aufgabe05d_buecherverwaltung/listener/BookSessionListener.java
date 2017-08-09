/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe05d_buecherverwaltung.listener;

import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.hemmerling.aufgabe05d_buecherverwaltung.model.business.BookService;
import com.hemmerling.aufgabe05d_buecherverwaltung.model.persistence.*;

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
        System.out.println("Buchliste wird für den Benutzer angelegt");
        HttpSession session = event.getSession();

        addBookList(session); // Buchliste wird als Session-Attribut anlegen
        System.out.println("Buchliste als Session-Attribut anlegen");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
    }

    private void addBookList(HttpSession session) {
        session.setAttribute(BOOKSERVICE, new BookService());
    }
}
