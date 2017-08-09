/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe05d_buecherverwaltung.model.business;

import com.hemmerling.aufgabe05d_buecherverwaltung.model.persistence.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rhemmerling
 */
public class BookDeleteAction {

// Parameter
    private static final String ID = "id";

    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter(ID);
        try {
            int index = Integer.parseInt(id);
            BookService personService = BookService.getInstance(); // Singleton
            personService.remove(index);
        } catch (NumberFormatException nfe) {
        }
    }
}