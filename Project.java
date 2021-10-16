package com.google;
import java.io.*;
import java.util.*;
import java.util.Scanner;

 class File {
     String filename;
     int filenumber;

     File(String filename, int filenumber) {

         this.filename = filename;
         this.filenumber = filenumber;

     }

     public String getfilename() {
         return filename;
     }

     public int getfilenumber() {
         return filenumber;
     }

     public String toString() {
         return (filename + " " + filenumber);
     }

     public static void main(String[] args) throws IOException {
         // write your code here

         int choice;
         Scanner s = new Scanner(System.in);
         Scanner s1 = new Scanner(System.in);
         Collection<File> c = new ArrayList<File>();


         do {
             System.out.println("1. Insert");
             System.out.println("2. Display");
             System.out.println("3. Search");
             System.out.println("4. Delete");
             System.out.println("0. Exit");
             System.out.println("Enter your choice : ");
             choice = s.nextInt();

             switch (choice) {
                 case 1:
                     System.out.println("Enter filename : ");
                     String filename = s1.next();

                     System.out.println("Enter filenumber : ");
                     int filenumber = s.nextInt();
                     c.add(new File(filename, filenumber));

                     break;

                 case 2:
                     Iterator<File> i = c.iterator();
                     while (i.hasNext()) {
                         File f = i.next();
                         System.out.println(f);
                     }
                     break;

                 case 3:
                     boolean found = false;
                     System.out.println("Enter the filename");
                     filename = s1.next();
                     i = c.iterator();

                     while (i.hasNext()) {
                         File f = i.next();
                         if (f.getfilename()==filename) {
                             System.out.println(f);
                             found = true;
                         }
                     }break;


                         case 4:
                             System.out.println("Enter filename to delete the file");
                            filename = s1.next();
                             i = c.iterator();
                             while (i.hasNext()) {
                                 File f = i.next();
                                 if (f.getfilename()== filename) {
                                     i.remove();

                                 }
                                 }
                             System.out.println("File is deleted");
                                 break;
                     }
             }while (choice != 0);


         }
     }
