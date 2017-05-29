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
public class CharacterSecondaryCharacteristic {

    int attacValue;
    int vitalityValue;
    int forceValue;
    int durabilityValue;
    int speedValue;
    int mageValue;
    int madnesValue;
    int destinyValue;

    public CharacterSecondaryCharacteristic(int raceId, int strengeValue, int resistanceValue) {
        this.attacValue = 1;
        this.vitalityValue = RacesVitality.value(raceId);

        this.forceValue = returnDecimalValue(strengeValue);

        this.durabilityValue = returnDecimalValue(resistanceValue);

        this.speedValue = RacesSpeed.value(raceId);

        this.mageValue = 0;

        this.madnesValue = 0;

        this.destinyValue = RacesDestiny.value(raceId);
    }

    public int returnDecimalValue(int number) {
        int decimalValue = number / 10;
        return decimalValue;
    }
    
    
}
