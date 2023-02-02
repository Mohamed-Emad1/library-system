/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import static org.example.frontend.FileNames.BOOKS_FILENAME;

class BookDatabase extends Database {

    //private ArrayList<Book> records = new ArrayList<>();
    public BookDatabase(String BOOKS_FILENAME1) {
        super(BOOKS_FILENAME);

    }

    @Override
    public Book createRecordFrom(String line) {

        String[] lineArray = line.split(",");
        return new Book(lineArray[0], lineArray[1], lineArray[2], lineArray[3], Integer.parseInt(lineArray[4]));
    }

//    @Override
//    public boolean contains(String key) {
//        boolean check = super.contains(key);
//        return check;
//    }
    @Override
    public Book getRecord(String key) {
        Book a = (Book) super.getRecord(key);
        return a;
    }

}
