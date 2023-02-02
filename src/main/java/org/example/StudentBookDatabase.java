/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.time.LocalDate;
import java.util.Date;
import static org.example.frontend.FileNames.STUDENTSBOOKS_FILENAME;

 class StudentBookDatabase extends Database{
     //ArrayList<StudentBook> records =new ArrayList<>();
    public StudentBookDatabase( String STUDENTSBOOKS_FILENAME1) {
        super(STUDENTSBOOKS_FILENAME);

    }


    public  StudentBook createRecordFrom (String line){

        String []lineArray =line.split(",");
        //System.out.println("a");,13
        return new StudentBook(lineArray[0],lineArray[1],LocalDate.parse(lineArray[2]));
    }


//    @Override
//    public boolean contains(String key) {
//        boolean check = super.contains(key);
//        return check;
//    }
//    @Override
    public StudentBook getRecord(String key) {
        StudentBook a = (StudentBook) super.getRecord(key);
        return a;
    }

}
