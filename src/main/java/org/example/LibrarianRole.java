/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;


import java.io.IOException;
import java.time.LocalDate;
import static org.example.frontend.FileNames.STUDENTSBOOKS_FILENAME;
import static org.example.frontend.FileNames.BOOKS_FILENAME;
/**
 *
 * @author User
 */
//import com.mycompany.backend.contants.*;
public class LibrarianRole {
        private BookDatabase booksDatabase;
    private StudentBookDatabase sBDatabase;

    public LibrarianRole(){
        booksDatabase =new BookDatabase(BOOKS_FILENAME);
        booksDatabase.readFromFile();
        sBDatabase =new StudentBookDatabase(STUDENTSBOOKS_FILENAME);
        sBDatabase.readFromFile();

    }
    public void addBook(String id,String title,String authorName,String publisherName,int quantity){
        if(!(booksDatabase.contains(id))){
        Book a =new Book(id,title,authorName,publisherName,quantity);
        booksDatabase.insertRecord(a);
        }
        else{
            Book a=booksDatabase.getRecord(id);
            a.setQuantity(a.getQuantity()+quantity);      //book exist!
        }}
        public Book[]getListOfBooks(){
            int size =booksDatabase. returnAllRecords().size();
        Book[] data = new Book[size];
        for (int i = 0; i < size; i++)
            data[i] = (Book) booksDatabase. returnAllRecords().get(i);
//        System.out.println(data[1].getSearchKey());
//        System.out.println(data[0].getSearchKey());
        return data;
       }
       public StudentBook[]getListOfBorrowingOperations(){
           //sBDatabase.readFromFile();
           int  size = sBDatabase.returnAllRecords().size();
          StudentBook[] data = new StudentBook[size];
        for (int i = 0; i < size; i++)
            data[i] = (StudentBook) sBDatabase. returnAllRecords().get(i);
        return data;
    }
      public int borrowBook(String studentId,String bookId,LocalDate borrowDate )  {
          StudentBook student=new StudentBook(studentId,bookId,borrowDate);
          Book bookElement=booksDatabase.getRecord(bookId);
         if(sBDatabase.contains(student.getSearchKey()))
            return 1;

          if(bookElement==null)       //not in the library
              return 0;

          if(bookElement.getQuantity()==0)        //all books taken
              return 0;

          bookElement.setQuantity(bookElement.getQuantity()-1);          //natural borrow
            sBDatabase.insertRecord(student);
            //try{
            //booksDatabase.saveToFile();  //edit quantity
            //sBDatabase.saveToFile();}
            //catch(IOException e){   
            //}
                return 2;
      }


      public double returnBook(String studentId,String bookId,LocalDate returnDate)  {
            
          int before,after;
          Book a=booksDatabase.getRecord(bookId);
         

          StudentBook s=sBDatabase.getRecord(studentId+","+bookId);
          if(s!=null){
               a.setQuantity(a.getQuantity()+1);
            before=(s.getBorrowDate()).getDayOfYear();
            after=returnDate.getDayOfYear();

            if(s.getBorrowDate().getYear()!=returnDate.getYear())                   //not the same year
                after+=(returnDate.getYear()-s.getBorrowDate().getYear())*365;

//              if(s.getBorrowDate().getMonth()!=returnDate.getMonth())                   //not the same year
//                  after+=(returnDate.getMonthValue() -s.getBorrowDate().getMonthValue())*30;
             // System.out.println("high");
              //System.out.println("ssssss "+s.getSearchKey());
            sBDatabase.deleteRecord(s.getSearchKey());
      
          if(after-before<7)
              return 0;

          else
             return (after-before-7)*0.5;}
          return 0;
      }

    public void logout()  {
        try{
        booksDatabase.saveToFile();
        sBDatabase.saveToFile();}
        catch(IOException e){
            
        }
    }}