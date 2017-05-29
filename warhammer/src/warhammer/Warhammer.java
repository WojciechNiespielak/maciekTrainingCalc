/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warhammer;

/**
 *
 * @author wojtek
 */
public class Warhammer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    CreateCharacter newCharacter = new CreateCharacter();
    
    System.out.println(newCharacter.raceId);
    System.out.println(newCharacter.raceName);
    System.out.println(newCharacter.name);


    }
}
