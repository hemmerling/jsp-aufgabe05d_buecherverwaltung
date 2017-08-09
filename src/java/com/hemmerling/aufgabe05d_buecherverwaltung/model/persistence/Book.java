/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe05d_buecherverwaltung.model.persistence;

import java.util.Objects;

/**
 *
 * @author rhemmerling
 */
public class Book {

    private int id = 0;
    private String title = "";
    private String autor = "";
    private String yearOfRelease = "2017";
    private String isbn = "";
    private String genre = "";

    public Book(int id, String title, String autor, String yearOfRelease,
            String isbn, String genre) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.yearOfRelease = yearOfRelease;
        this.isbn = isbn;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titel) {
        this.title = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.isbn);
        hash = 97 * hash + Objects.hashCode(this.title);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.isbn, other.title)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.title)) {
            return false;
        }
        return true;
    }

}
