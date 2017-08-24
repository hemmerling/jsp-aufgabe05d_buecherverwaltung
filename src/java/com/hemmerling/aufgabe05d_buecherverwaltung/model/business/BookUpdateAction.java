/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe05d_buecherverwaltung.model.business;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rhemmerling
 */
@WebServlet(name = "BookUpdateAction", urlPatterns = {"/BookUpdateAction"})
public class BookUpdateAction extends HttpServlet {

    public void execute(HttpServletRequest request, HttpServletResponse response) {
    }
}
