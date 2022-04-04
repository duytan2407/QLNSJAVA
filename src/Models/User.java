/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class User {
    

    private  String usernname , pass, hovaten, quyen, ngaylap;

   public  User()
   {
       
   }
    public User(String usernname, String pass, String hovaten, String quyen, String ngaylap) {
        this.usernname = usernname;
        this.pass = pass;
        this.hovaten = hovaten;
        this.quyen = quyen;
        this.ngaylap = ngaylap;
    }

    public String getUsernname() {
        return usernname;
    }

    public void setUsernname(String usernname) {
        this.usernname = usernname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }
    

    
}
