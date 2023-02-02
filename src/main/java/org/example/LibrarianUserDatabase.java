/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import static org.example.frontend.FileNames.LIBRARIANS_FILENAME;

/**
 *
 * @author User
 */
 class LibrarianUserDatabase extends Database {
    //private ArrayList<LiberarianUser> records = new ArrayList<>();

    public LibrarianUserDatabase(String LIBRARIANS_FILENAME1) {
        super(LIBRARIANS_FILENAME);
    }


    @Override
    public LibrarianUser createRecordFrom(String line) {

        String[] lineArray = line.split(",");
        LibrarianUser a = new LibrarianUser(lineArray[0], lineArray[1], lineArray[2], lineArray[3], lineArray[4]);
        return a;
    }

//    @Override
//    public boolean contains(String key) {
//        boolean check = super.contains(key);
//        return check;
//    }
//
//    @Override
    public LibrarianUser getRecord(String key) {
        LibrarianUser a = (LibrarianUser) super.getRecord(key);
        return a;
    }

}