/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warhammer2;

/**
 *
 * @author wojtek
 */
public class CreateCharacter {

    String name;
    int raceId;
    String raceName;

    public CreateCharacter() {
        this.name = setCharacterName();
        this.raceId = selectCharacterRace();
        this.raceName = RacesList.returnRaceName(this.raceId);
        CharacterMainCharacteristic mainCharacterstic = new CharacterMainCharacteristic(this.raceId);
        CharacterSecondaryCharacteristic secondaryCharacteristic = new CharacterSecondaryCharacteristic(raceId, mainCharacterstic.readStrengthValue(), mainCharacterstic.readResistanceValue());
    };
    
    public static String setCharacterName() {
        System.out.println("Podaj imię dla postaci");
        String name = Read.string();
        return name;
    }

    public int selectCharacterRace() {
        avalableRaceList();
        int chosenRace = choseRace();
        return chosenRace;
    }

    public void avalableRaceList() {
        System.out.println("Dostępne rasy:");
        RacesList.showRacesName();
    }

    public int choseRace() {
        int selectedRaceId = (Read.number() - 1);
        return selectedRaceId;
    }

    public int getRaceId(){
       int id= this.raceId;
       return id;
    }
}
