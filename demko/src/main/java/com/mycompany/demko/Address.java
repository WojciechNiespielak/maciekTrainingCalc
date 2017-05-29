/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demko;

/**
 *
 * @author robert
 */
public class Address {
    
//    Wszystko tutaj jest final i nie ma metod które by to ustawiały (zmieniały) bo adres jest adres.
//    Drzwi obok to już jest nowy adres a nie ten co u sąsiada tylko ze zmienionym numerem drzwi.
    
    private final String city;
    private final String street;
    private final Integer number;

    public Address(String city, String street, Integer number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }
    
//    Poniżej tzw. gettery (metody pozwalające na dostęp do cech czy tam właściwości obiektu.

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }
    
    
}
