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
public class Checking_Account {
    private String BankName;
    private String BankRountingNo;
    private String BankAccNo;
    private String AccBalance;
    private String AccType;

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getBankRountingNo() {
        return BankRountingNo;
    }

    public void setBankRountingNo(String BankRountingNo) {
        this.BankRountingNo = BankRountingNo;
    }

    public String getBankAccNo() {
        return BankAccNo;
    }

    public void setBankAccNo(String BankAccNo) {
        this.BankAccNo = BankAccNo;
    }

    public String getAccBalance() {
        return AccBalance;
    }

    public void setAccBalance(String AccBalance) {
        this.AccBalance = AccBalance;
    }

    public String getAccType() {
        return AccType;
    }

    public void setAccType(String AccType) {
        this.AccType = AccType;
    }
    
    
}
