/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author nitya
 */
 public class Person_Information {
    private General_Information personGeneral;
    private Address_Information personAdress;
    private Drivers_License personDL;
    private Saving_Account personSaving;
    private Checking_Account personChecking;
    private Medical_Information personMedical;

    public General_Information getPersonGeneral() {
        return personGeneral;
    }

    public void setPersonGeneral(General_Information personGeneral) {
        this.personGeneral = personGeneral;
    }

    public Address_Information getPersonAdress() {
        return personAdress;
    }

    public void setPersonAdress(Address_Information personAdress) {
        this.personAdress = personAdress;
    }

    public Drivers_License getPersonDL() {
        return personDL;
    }

    public void setPersonDL(Drivers_License personDL) {
        this.personDL = personDL;
    }

    public Saving_Account getPersonSaving() {
        return personSaving;
    }

    public void setPersonSaving(Saving_Account personSaving) {
        this.personSaving = personSaving;
    }

    public Checking_Account getPersonChecking() {
        return personChecking;
    }

    public void setPersonChecking(Checking_Account personChecking) {
        this.personChecking = personChecking;
    }

    public Medical_Information getPersonMedical() {
        return personMedical;
    }

    public void setPersonMedical(Medical_Information personMedical) {
        this.personMedical = personMedical;
    }
    
}
