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
public class Drivers_License {
     private String LicenseNo;
    private String DateofIssue;
    private String DateofExpiration;
    private String Bloodtype;
    private String Picture;

    public String getLicenseNo() {
        return LicenseNo;
    }

    public void setLicenseNo(String LicenseNo) {
        this.LicenseNo = LicenseNo;
    }

    public String getDateofIssue() {
        return DateofIssue;
    }

    public void setDateofIssue(String DateofIssue) {
        this.DateofIssue = DateofIssue;
    }

    public String getDateofExpiration() {
        return DateofExpiration;
    }

    public void setDateofExpiration(String DateofExpiration) {
        this.DateofExpiration = DateofExpiration;
    }

    public String getBloodtype() {
        return Bloodtype;
    }

    public void setBloodtype(String Bloodtype) {
        this.Bloodtype = Bloodtype;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String Picture) {
        this.Picture = Picture;
    }
    
}
