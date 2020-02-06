/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nitya
 */
public class Main {

    static ArrayList<VitalSigns> history;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        history = new ArrayList<VitalSigns>();
        while(true){
            System.out.println("Enter 1 for checking patient details.");
            System.out.println("Enter 2 for Entering new record for a patient.");
            System.out.println("Enter 3 to exit from the application");
            int input = scanner.nextInt();
            switch(input){
                case 1:
                    System.out.println("Enter the name of the patient whose details you want to check");
                    String name = scanner.next();
                    System.out.println("Enter 1 to check "+name+"'s complete history.");
                    System.out.println("Enter 2 to check "+name+"'s particular vital sign.");
                    int details = scanner.nextInt();
                    if(details == 1){
                        for(VitalSigns vs : history){
                            if(vs.getname().equals(name)){
                                System.out.println(vs);
                            }
                        }
                    }
                    else
                    {
                        boolean flag=false;
                        System.out.println("Please Enter the Vital Sign you want to check for "+name);
                        System.out.println("Here are some of the vital signs: RespiratoryRate, HeartRate, SystolicBloodPressure, WeightinKilos, WeightinPounds");
                        String sign = scanner.next();
                        for(VitalSigns vs : history){
                            if(vs.getname().equals(name)){
                                Abnormal ab = new Abnormal(vs);
                                if(!ab.isThisVitalSignNormal(sign))
                                {
                                    System.out.println(name+"'s "+sign+" are not Normal");
                                    flag=true;
                                    break;
                                }
                            }
                        }
                        if(!flag)
                           {
                            System.out.println(name+"'s "+sign+" are Normal");
                        }
                    }
                    break;
                case 2:
                    Patient patient = new Patient();
                    VitalSigns signs = patient.getPatientDetails();
                    history.add(signs);
                    break;
                default:System.exit(0);
            }

        }
    }
}
