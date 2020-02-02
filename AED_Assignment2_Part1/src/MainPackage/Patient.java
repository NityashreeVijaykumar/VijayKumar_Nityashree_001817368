/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import Bussiness.Abnormal;
import Bussiness.VitalSigns;
import java.util.Scanner;

/**
 *
 * @author nitya
 */
public class Patient {
    
    
    public static void main(String[] args){
        
        int age;
        double respRate;
        double heartRate;
        double systBP;
        double wKg;  
        double wPnd; 
        String name;
        
        System.out.println("How would you like to enter the age 1.Months 2.Years?");
        Scanner scan=new Scanner(System.in);
        int choice = scan.nextInt();
        
        if(choice==1)
        {
            System.out.println("Enter Age");
            age=scan.nextInt();
            
        }
        
        else 
        {
           System.out.println("Enter Age");
            age=scan.nextInt(); 
            age=age*12;
            
        }
        
        System.out.println("Enter the Name");
        name=scan.next();
        
        System.out.println("Enter Respiratory Rate");
        respRate=scan.nextDouble();
        
        System.out.println("Enter HeartRate");
        heartRate=scan.nextDouble();
        
        System.out.println("Enter Systolic Blood Pressure");
        systBP=scan.nextDouble();
        
        System.out.println("Enter Weight in KGs");
        wKg=scan.nextDouble();
        wPnd=wKg*2.205;
        
        VitalSigns vitalS = new  VitalSigns(age,respRate,heartRate,systBP,wKg,wPnd,name);
        Abnormal ab= new Abnormal(vitalS);
        
        
        if(ab.isPatientNormal()==true){
            System.out.println("Patient's Vital Signs are Normal");
        
        }
        else
        {
           System.out.println("Patient's Vital Signs are Abnormal");  
        }
        
        
    }
}
