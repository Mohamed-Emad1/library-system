/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.time.LocalDate;
import java.util.Date;

public class StudentBook implements User2 {
    private String studentId;
    private String bookId;
    private LocalDate date;

    public StudentBook(String studentId, String bookId,LocalDate date) {
        this.studentId=studentId;
        this.bookId = bookId;
        this.date=date;
    }

//    public String getBookId() {
//        return this.bookId;
//    }
//    public String getStudentId() {
//        return this.studentId;
//    }

    public LocalDate getBorrowDate() {
        return date;
    }

    // public LocalDate getBorrowDate()
// {
//     return this.LocalDate;
// }

    public String lineRepresentation()
 {
   return this.studentId+","+this.bookId+","+this.date;
 }

    public String getSearchKey()
 {
     return this.studentId+","+this.bookId;
 }
}