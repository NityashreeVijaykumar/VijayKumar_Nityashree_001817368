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
public class Address_Information {
    private String StreetAdress;
    private String City;
    private String State;
    private String Zipcode;

    public String getStreetAdress() {
        return StreetAdress;
    }

    public void setStreetAdress(String StreetAdress) {
        this.StreetAdress = StreetAdress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }
    
}
