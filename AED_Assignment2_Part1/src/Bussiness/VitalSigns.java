/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

/**
 *
 * 
 * @author nitya
 */
public class VitalSigns {
   private int age;
   private double respRate;
    private double heartRate;
    private double systBP;
    private double wKg;  
    private double wPnd; 
    private String name;

    public VitalSigns(int age, double respRate, double heartRate, double systBP, double wKg, double wPnd, String name) {
        this.age = age;
        this.respRate = respRate;
        this.heartRate = heartRate;
        this.systBP = systBP;
        this.wKg = wKg;
        this.wPnd = wPnd;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {        
        this.age = age;
    }
 

    public double getRespRate() {
        return respRate;
    }

    public void setRespRate(double respRate) {
        this.respRate = respRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getSystBP() {
        return systBP;
    }

    public void setSystBP(double systBP) {
        this.systBP = systBP;
    }

    public double getwKg() {
        return wKg;
    }

    public void setwKg(double wKg) {
        this.wKg = wKg;
    }

    public double getwPnd() {
        return wPnd;
    }

    public void setwPnd(double wPnd) {
        this.wPnd = wPnd;
    }
     public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    
}
