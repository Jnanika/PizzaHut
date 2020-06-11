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
public class CustomerDetailsVO {

    private long zipcode;
    private String firstname;
    private String lastname;
    private String emailaddress;
    private long phonenumber;
    private int extension;
    private String address1;
    private String address2;
    private String city;
    private String state;

    public CustomerDetailsVO(long zipcode, String firstname, String lastname, String emailaddress, long phonenumber, int extension, String address1, String address2, String city, String state) {
        this.zipcode = zipcode;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailaddress = emailaddress;
        this.phonenumber = phonenumber;
        this.extension = extension;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    

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

    public CustomerDetailsVO(long zipcode, String firstname, String lastname, String emailaddress, long phonenumber, int extension) {
        this.zipcode = zipcode;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailaddress = emailaddress;
        this.phonenumber = phonenumber;
        this.extension = extension;
    }

}
