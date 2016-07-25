/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairprogramming.util;

import java.util.Scanner;

/**
 *
 * @author shneha
 */
public class StudentRecords {
     Scanner input;
    String[] students;
    String[] subjects;
    boolean isfailed=false;
    double[] marks;
    double total=0;
    double percentage;
    int sc=0;
    
    public StudentRecords(Scanner input, String[] students, String[] subjects,double[] marks){
        this.input=input;
        this.students=students;
        this.subjects=subjects;
        this.marks=marks;
    
    }
    
    public void studententry(){
        
        if(sc<5){
        System.out.print("Enter student's name: ");
        students[sc]=input.next();
       sc++;
        }else
            System.out.println("You have exceeded the limit.");
        
            
    }
    
    
    public void subjectentry(){
        System.out.println("Enter subjects name:");
        for(int i=0;i<subjects.length;i++)
        {
            
        subjects[i]=input.next();
        }
    }
    
    public void marksentry()
    {
    for(int i=0;i<subjects.length;i++)
    {
        System.out.print("Enter marks for "+subjects[i]+": ");
    marks[i]=input.nextDouble();
    if(marks[i]<32)
                {
                    isfailed=true;
                }
                total+=marks[i];
    }
    }
    
    public void grade()
    {
    if(isfailed==true)
    {
        System.out.println("Result: Failed");
    }else
    {
         percentage= (total/subjects.length);
            System.out.println("Percentage:"+percentage+ "%" );
            if(percentage>=80)   
            {
                 System.out.println("Distinction!");
            }else if (percentage>=60&&percentage<80)
                 System.out.println("First Division!");
            else if (percentage>=50&&percentage<60)
                 System.out.println("Second Division!");
            
            else if(percentage<50)
                 System.out.println("Third Division!");
            
    }
                
        
    }
    
}
    

