/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairprogramming;

import java.util.Scanner;
import pairprogramming.util.StudentRecords;


/**
 *
 * @author shneha
 */
public class Pairprogramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
      String[] students= new String[5];
      String[] subjects=new String[5];
      double[] marks=new double[subjects.length];
      StudentRecords StudentRecords =new StudentRecords (input,students,subjects,marks);
      
      while(true)
      {
      
          System.out.println("");
        System.out.println("1. Enter student's name: ");
        System.out.println("2. Enter subjects: ");
        System.out.println("3. Enter marks: ");
        System.out.println("4. Display grade ");
          System.out.println("5. Exit");
        
        System.out.print("Enter your choice: ");
        int choice=input.nextInt();
      
        switch(choice)
        {
            case 1:
               StudentRecords .studententry();
                break;
            case 2:
               StudentRecords .subjectentry();
                break;
            case 3:
                StudentRecords .marksentry();
                break;
            case 4:
               StudentRecords .grade();
                break;
            case 5:
                System.exit(0);
                break;
        
        }
        }
        
          
          
        
      
    }
      
    
}
