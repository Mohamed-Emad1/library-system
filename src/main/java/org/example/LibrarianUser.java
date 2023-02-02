/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;
public class LibrarianUser implements User2{
    private String librarianId,name,email,phoneNumber,address;



    public LibrarianUser(String liberarianId, String name, String email, String address, String phoneNumber) {
        this.librarianId = liberarianId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String lineRepresentation(){
        return this.librarianId+","+this.name+","+this.email+","+this.address+","+this.phoneNumber;

    }

    @Override
    public String getSearchKey()
    {
        return this.librarianId;
    }
}
