/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzahut;

/**
 *
 * @author manju
 */
public class Deal {

    private long zipcode;
    private String firstname;
    private String lastname;
    private String emailaddress;
    private long phonenumber;
    private int extension;

        public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getExtension() {
        return extension;
    }

    @Override
    public String toString() {
        return "Deal{" + "zipcode=" + zipcode + ", firstname=" + firstname + ", lastname=" + lastname + ", emailaddress=" + emailaddress + ", phonenumber=" + phonenumber + ", extension=" + extension + '}';
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public Deal(long zipcode, String firstname, String lastname, String emailaddress, long phonenumber, int extension) {
        this.zipcode = zipcode;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailaddress = emailaddress;
        this.phonenumber = phonenumber;
        this.extension = extension;
    }

}
