/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public abstract class Database {

    private ArrayList<User2> records = new ArrayList<>();
    private String fileName;
    private String[] data;

    public Database() {

    }

    public Database(String fileName) {
        this.fileName = fileName;
        data = new String[100];
    }

//    public void setRecords(ArrayList<Database> records) {
//        this.records = records;
//    }
    //public ArrayList<Database> getRecords() {
//        return records;
//    }
    public String getFileName() {
        return fileName;
    }

    public void readFromFile() {
        int i = 0;

        try {//System.out.println("aa");
            File fp = new File(this.fileName);
            Scanner scan = new Scanner(fp);
            while (scan.hasNextLine()) {
                //System.out.println("aa");
                //if(scan.nextLine() == null || "\n".equals(scan.nextLine()))
                //break;
                User2 a = createRecordFrom(scan.nextLine());
                insertRecord(a);
                //data[i] =scan.nextLine();
                i++;

            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error in finding file");
        }
    }

    public String[] getData() {
        return data;
    }

    public ArrayList<User2> returnAllRecords() {
        return records;
    } //get array list;

    public abstract User2 createRecordFrom(String line);

    public void deleteRecord(String key) {
        records.remove(getRecord(key));

    }

    public void clearFile() throws IOException {
        FileWriter fw = new FileWriter(this.fileName, false);
        PrintWriter pw = new PrintWriter(fw, false);
        pw.flush();
        pw.close();
        fw.close();
    }

    public void saveToFile() throws IOException {
        int i = 0;

        try {
            //BufferedWriter wr = new BufferedWriter(new FileWriter(super.getFileName(), true));
            int size = this.records.size();
            while (i < size) {
                User2 a = this.records.get(i);
                String d = a.lineRepresentation();
                if (i == 0) {
                    clearFile();
                }
                try ( BufferedWriter wr = new BufferedWriter(new FileWriter(this.fileName, true))) {
                    wr.write(d);
                    wr.newLine();
                }
                i++;
            }

        } catch (IOException ex) {
            //throw new RuntimeException(ex);
        }

    }

    public boolean contains(String key) {
        for (User2 record : records) {
            if (record.getSearchKey().equals(key)) {
                return true;
            }
        }
        return false;

    }

    public User2 getRecord(String key) {
        int i = 0;
        while (records.size() > i) {
            if (key.equals((records.get(i).getSearchKey()))) {
                return this.records.get(i);
            }
            i++;
        }
        System.out.println("no record found");
        return null;

    }

    public void insertRecord(User2 record) {
        if (!contains(record.getSearchKey())) {
            this.records.add(record);
        }
    }

}
