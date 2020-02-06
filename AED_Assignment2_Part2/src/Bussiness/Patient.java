/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;


import java.util.Scanner;

/**
 *
 * @author nitya
 */
public class Patient {

    int age;
    double respRate;
    double heartRate;
    double systBP;
    double wKg;
    double wPnd;
    String name;

    public VitalSigns getPatientDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How would you like to enter the age? Enter 1 for Months or  2 for Years:");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("Enter Age in months");
            age=sc.nextInt();

        }else{
            System.out.println("Enter Age in years");
            age=sc.nextInt();
            age=age*12;
        }
        System.out.println("Enter the Name");
        name=sc.next();
        System.out.println("Enter Respiratory Rate");
        respRate=sc.nextDouble();
        System.out.println("Enter HeartRate");
        heartRate=sc.nextDouble();
        System.out.println("Enter Systolic Blood Pressure");
        systBP=sc.nextDouble();
        System.out.println("Enter Weight in KGs");
        wKg=sc.nextDouble();
        wPnd=wKg*2.205;
        VitalSigns vitalS = new  VitalSigns(age,respRate,heartRate,systBP,wKg,wPnd,name);
        Abnormal ab= new Abnormal(vitalS);
        if(ab.isPatientNormal()){
            System.out.println(name+"'s Vital Signs are Normal");
        }else{
            System.out.println(name+"'s Vital Signs are Abnormal");
        }
        return vitalS;
    }
}
