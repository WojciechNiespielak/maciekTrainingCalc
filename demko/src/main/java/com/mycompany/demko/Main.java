/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demko;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author robert
 */
public class Main {

    public static void main(String[] args) {

//  Mamy pustą listę która będzie listą ludzi

        List<Person> bunchOfSomeRandomFuckers = new ArrayList();

//  Tworzymy sobie kilku chopa, czego oni potrzebują ano tych swoich pól więc poskładajmy ich. Najpierw pierwszy.

        String firstName1 = "Adam";
        String lastName1 = "Kowalski";
        Address address1 = new Address("Bytom", "Karbowska", 1);
        Gender gender1 = new Gender('M');

//  Mamy gotowe składowe pierwszego skurwiela to składamy go do kupy podając te składowe na kostruktorze.

        Person person1 = new Person(firstName1, lastName1, address1, gender1);
        
//  No to pakujemy go na listę fryzjera.

        bunchOfSomeRandomFuckers.add(person1);
        
//  No i przelećmy sobie po liście i wypiszmy wszystkich fuckerów. Póki co jest jeden, dodaj więcej jeśli chcesz zobaczyć jak działa.

        for (Person person: bunchOfSomeRandomFuckers) { //To rozumiesz jako dla każdego obiektu person z listy (najpierw typ a potem nazwa bo jakoś chcę się do niego odnieść w środku pętli
            System.out.println(person.getFirstName());
            System.out.println(person.getLastName());
            System.out.println(person.getAddress().getCity() + " " + person.getAddress().getStreet() + " " + person.getAddress().getNumber());
            System.out.println(person.getGender().getGenderAbbreviation());
        }
        
//        To poniżej żeby się okienko nie zamknęło jak się robota skończy :D
        try {
            System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
