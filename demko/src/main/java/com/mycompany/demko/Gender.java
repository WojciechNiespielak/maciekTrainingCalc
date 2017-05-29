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
public class Gender {
    
    private Character genderAbbreviation;

    public Gender(Character genderAbbreviation) {
        this.genderAbbreviation = genderAbbreviation;
    }

    public Character getGenderAbbreviation() {
        return genderAbbreviation;
    }
    
//  Ta klasa to powinien być ENUM ale to Ci jeszcze opowiem, nie chcę mieszać, póki co będzie zawierała M lub K.  
    
}
