/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import org.example.frontend.FileNames;
import java.io.IOException;
//import com.mycompany.backend.contants.*;

public class AdminRole {

    private LibrarianUserDatabase dataBase;

    public AdminRole() {
        this.dataBase = new LibrarianUserDatabase(FileNames.LIBRARIANS_FILENAME); //composition
        dataBase.readFromFile();
    }

    public void addLibrarian(String librarianId, String name, String email, String address, String phoneNumber) {
        dataBase.insertRecord(new LibrarianUser(librarianId, name, email, address, phoneNumber)); //adds to array list.
    }

    //public LibrarianUser[] getListOfLibrarians(): returns an array that
//    contains all the librarians stored in the file named Librarians.txt
    public LibrarianUser[] getListOfLibrarians() {
        //dataBase.readFromFile();

        //System.out.println(counter);
        int size = dataBase.returnAllRecords().size();
        LibrarianUser[] data = new LibrarianUser[size];
        for (int i = 0; i < size; i++) {
            data[i] = (LibrarianUser) dataBase.returnAllRecords().get(i);
        }
        return data;
    }

    public void removeLibrarian(String key) {
        dataBase.readFromFile();
        if (dataBase.contains(key)) {
            dataBase.deleteRecord(key);
        } else {
            System.out.println("No Librarians for this key");
        }
    }

    public void logout() {
        try {
            dataBase.saveToFile();              //worked
        } catch (IOException e) {

        } catch (NullPointerException i) {

        }
    }

}
