package com.greatbit.model;

public class Book {
    private String id;
    private String genre;
    private String name;

    private String author;
    private  int pages;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book() {
    }

    public Book(String id, String name, String author, String genre, int pages) {
        this.id = id;
        this.genre = genre;
        this.name = name;
        this.author = author;
        this.pages = pages;
    }
}
