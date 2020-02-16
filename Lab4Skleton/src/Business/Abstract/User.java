/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Abstract;

import java.time.LocalDateTime;

/**
 *
 * @author nitya
 */
public abstract class User {
    private String password;
    private String userName;
    private String role;
    private LocalDateTime myDate;

    public User(String password, String userName, String role,LocalDateTime myDate) {
        this.password = password;
        this.userName = userName;
        this.role = role;
        this.myDate = myDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
      public LocalDateTime getMyDate() {
        return myDate;
    }

    public void setMyDate(LocalDateTime myDate) {
        this.myDate = myDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    abstract public boolean verify(String password);

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return getUserName();
    }
    
}
