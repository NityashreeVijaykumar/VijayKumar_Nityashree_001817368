/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import java.util.ArrayList;

/**
 *
 * @author nitya
 */
public class Abnormal {

    private VitalSigns vitalSign;

    public Abnormal(VitalSigns VitalSign) {
        this.vitalSign = VitalSign;

    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }


    public boolean isThisVitalSignNormal(String vital){
        if(vitalSign.getAge() < 1 ){
            {
            if(vitalSign.getRespRate() >= 30 && vitalSign.getRespRate() <= 50 && vital.equals("RespiratoryRate")){
                return true;
            }
            if( vitalSign.getHeartRate() >= 120 && vitalSign.getHeartRate() <= 160  && vital.equals("HeartRate")){
                return true;
            }if( vitalSign.getSystBP() >= 50 && vitalSign.getSystBP()<= 70 && vital.equals("Systolic BloodPressure")){
                return true;
            }if (vitalSign.getwKg() >= 2 && vitalSign.getwKg() <= 3 && vital.equals("WeightinKilos")){
                return true;
            }if(vitalSign.getwPnd() >= 4.5 && vitalSign.getwPnd() <= 7 && vital.equals("WeightinPounds"))
                return true;
            }
            return false;
        }

        if(vitalSign.getAge() >= 1 && vitalSign.getAge() < 12){
            {
            if(vitalSign.getRespRate() >= 20 && vitalSign.getRespRate() <= 30  && vital.equals("RespiratoryRate")){
                return true;
            }if( vitalSign.getHeartRate() >= 80 && vitalSign.getHeartRate() <= 140  && vital.equals("HeartRate")){
                return true;
            }if( vitalSign.getSystBP() >= 70 && vitalSign.getSystBP()<= 100 && vital.equals("SystolicBloodPressure")){
                return true;
            }if(vitalSign.getwKg() >= 4 && vitalSign.getwKg() <= 10 && vital.equals("WeightinKilos")){
                return true;
            }if(vitalSign.getwPnd() >= 9 && vitalSign.getwPnd() <= 22 && vital.equals("WeightinPounds"))
                return true;
            }
            return false;
        }

        if(vitalSign.getAge() >= 12 && vitalSign.getAge() <= 35){
            if(vitalSign.getRespRate() >= 20 && vitalSign.getRespRate() <= 30  && vital.equals("RespiratoryRate")){
                return true;
            }if( vitalSign.getHeartRate() >= 80  && vitalSign.getHeartRate() <= 130   && vital.equals("HeartRate")){
                return true;
            }if( vitalSign.getSystBP() >= 80  && vitalSign.getSystBP()<= 110 && vital.equals("SystolicBloodPressure")){
                return true;
            }if(vitalSign.getwKg() >= 10  && vitalSign.getwKg() <= 14 && vital.equals("WeightinKilos") ){
                return true;
            }if(vitalSign.getwPnd() >= 22  && vitalSign.getwPnd() <= 31 && vital.equals("WeightinPounds")){
                return true;
            }
            return false;
        }

        if(vitalSign.getAge() >= 36 && vitalSign.getAge() <= 60){{
            if(vitalSign.getRespRate() >= 20 && vitalSign.getRespRate() <= 30  && vital.equals("RespiratoryRate")){
                return true;
            }if( vitalSign.getHeartRate() >= 80  && vitalSign.getHeartRate() <= 120   && vital.equals("HeartRate")){
                return true;
            }if( vitalSign.getSystBP() >= 80  && vitalSign.getSystBP()<= 110 && vital.equals("SystolicBloodPressure")){
                return true;
            }if(vitalSign.getwKg() >= 14 && vitalSign.getwKg() <= 18 && vital.equals("WeightinKilos")){
                return true;
            }if(vitalSign.getwPnd() >= 31 && vitalSign.getwPnd() <= 40 && vital.equals("WeightinPounds"))
                return true;
            }
            return false;
        }

        if(vitalSign.getAge() >= 61  && vitalSign.getAge() <= 144){
            if(vitalSign.getRespRate() >= 20 && vitalSign.getRespRate() <= 30  && vital.equals("RespiratoryRate")){
                return true;
            }if( vitalSign.getHeartRate() >= 70 && vitalSign.getHeartRate() <= 110  && vital.equals("HeartRate")){
                return true;
            }if( vitalSign.getSystBP() >= 80 && vitalSign.getSystBP()<= 120 && vital.equals("SystolicBloodPressure")){
                return true;
            }if(vitalSign.getwKg() >= 20 && vitalSign.getwKg() <= 42 && vital.equals("WeightinKilos")){
                return true;
            }if(vitalSign.getwPnd() >= 40 && vitalSign.getwPnd() <= 92 && vital.equals("WeightinPounds")){
                return true;
            }
            return false;
        }

        if(vitalSign.getAge() >= 145){
            if(vitalSign.getRespRate() >= 12 && vitalSign.getRespRate() <= 20  && vital.equals("RespiratoryRate")){
                return true;
            }if( vitalSign.getHeartRate() >= 55  && vitalSign.getHeartRate() <= 105   && vital.equals("HeartRate")){
                return true;
            }if( vitalSign.getSystBP() >= 110 && vitalSign.getSystBP()<= 120 && vital.equals("SystolicBloodPressure")){
                return true;
            }if(vitalSign.getwKg() > 50 && vital.equals("WeightinKilos")){
                return true;
            }if(vitalSign.getwPnd() > 110 && vital.equals("WeightinPounds")){
                return true;
            }
            return false;
        }
        System.out.println("No such attribute found.");
        return false;
    }


    public boolean isPatientNormal()
    {
        int age=vitalSign.getAge();
        double respRate = vitalSign.getRespRate();
        double heartRate = vitalSign.getHeartRate();
        double SystBP = vitalSign.getSystBP();
        double wKg = vitalSign.getwKg();
        double wPnd = vitalSign.getwPnd();

        if(age < 1 ){
            if((respRate >= 30 && respRate <= 50) &&
                    ( heartRate >= 120 && heartRate <= 160) &&
                    ( SystBP >= 50 && SystBP<= 70) && (wKg >= 2 && wKg <= 3) &&
                    (wPnd >= 4.5 && wPnd <= 7))
                return true;
        }

        if(age >= 1 && age < 12){
            if((respRate >= 20 && respRate <= 30 ) &&
                    ( heartRate >= 80 && heartRate <= 140) &&
                    ( SystBP >= 70 && SystBP<= 100) && (wKg >= 4 && wKg <= 10) &&
                    (wPnd >= 9 && wPnd <= 22))
                return true;
        }

        if(age >= 12 && age <= 35){
            if((respRate >= 20 && respRate <= 30 ) &&
                    ( heartRate >= 80  && heartRate <= 130 ) &&
                    ( SystBP >= 80  && SystBP<= 110 ) && (wKg >= 10  && wKg <= 14  ) &&
                    (wPnd >= 22  && wPnd <= 31))
                return true;
        }

        if(age >= 36 && age <= 60){
            if((respRate >= 20 && respRate <= 30 ) &&
                    ( heartRate >= 80  && heartRate <= 120 ) &&
                    ( SystBP >= 80  && SystBP<= 110) && (wKg >= 14 && wKg <= 18) &&
                    (wPnd >= 31 && wPnd <= 40))
                return true;
        }

        if(age >= 61  && age <= 144){
            if((respRate >= 20 && respRate <= 30) &&
                    ( heartRate >= 70 && heartRate <= 110) &&
                    ( SystBP >= 80 && SystBP<= 120) && (wKg >= 20 && wKg <= 42) &&
                    (wPnd >= 40 && wPnd <= 92))
                return true;
        }

        if(age >= 145){
            if((respRate >= 12 && respRate <= 20) &&
                    ( heartRate >= 55  && heartRate <= 105 ) &&
                    ( SystBP >= 110 && SystBP<= 120) &&
                    (wKg > 50) &&
                    (wPnd > 110))
                return true;
        }

        return false;
    }
}
