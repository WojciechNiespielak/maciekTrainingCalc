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
public class Person {

    private String firstName;
    private String lastName;
    private Address address;
    private final Gender gender;

    public Person(String firstName, String lastName, Address address, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
    }

//    Poniżej tzw. gettery (metody pozwalające na dostęp do cech czy tam właściwości obiektu.
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public Gender getGender() {
        return gender;
    }

//    Poniżej tzw. settery (metody pozwalające na zmianę cech czy tam właściwości obiektu.
//    Wiadomo że człowiek imię, nazwisko czy tam adres może zmienić.
    
    public void changeFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void changeLastName(String lastName) {
        this.lastName = lastName;
    }

    public void changeAddress(Address address) {
        this.address = address;
    }

//    public void changeGender(Gender gend..   No chyba kurwa nie w moim świecie, zapomnijcie pedały (programowanie obiektowe ma modelować realny świat)
    
}
