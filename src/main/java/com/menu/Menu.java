/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu;

/**
 *
 * @author moizr
 */
public class Menu {
    
    private long zipcode;
    private String address;
    private String city;
    private String state;

    Menu(long zipcode, String firstname, String lastname, String emailaddress, long phonenumber, int extension) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Menu(long zipcode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Menu(long zipcode, String address, String city, String state) {
        this.zipcode = zipcode;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Menu{" + "zipcode=" + zipcode + ", address=" + address + ", city=" + city + ", state=" + state + '}';
    }
    

    
}