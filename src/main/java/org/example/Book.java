/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

public class Book implements User2 {

    private String bookId;
    private String title;
    private String authorName;
    private String publisherName;
    private int quantity;

    public Book(String bookId, String title, String authorName, String publisherName, int quantity) {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String lineRepresentation() {
        return this.bookId + "," + this.authorName + "," + this.publisherName + "," + this.title + "," + this.quantity;

    }

    @Override
    public String getSearchKey() {
        return this.bookId;
    }

}
