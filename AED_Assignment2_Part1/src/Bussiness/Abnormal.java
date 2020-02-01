/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

/**
 *
 * @author nitya
 */
public class Abnormal {
    
    

    private VitalSigns vitalSign;
    
    
      public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns VitalSign) {
        this.vitalSign = VitalSign;
       
    }

    public Abnormal(VitalSigns VitalSign) {
        this.vitalSign = VitalSign;
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
        
   return false; }
}