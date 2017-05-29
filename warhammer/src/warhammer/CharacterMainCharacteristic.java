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
public class CharacterMainCharacteristic {

    int closeCombatValue;
    int rangeCombarValue;
    int strengthValue;
    int resistanceValue;
    int dexternityValue;
    int willpowerValue;
    int polishValue;
    

    public CharacterMainCharacteristic(int raceId) {
        this.closeCombatValue = plus2k10Characteristic(raceId, 0);
        this.rangeCombarValue = plus2k10Characteristic(raceId, 1);
        this.strengthValue = plus2k10Characteristic(raceId, 2);
        this.resistanceValue = plus2k10Characteristic(raceId, 3);
        this.dexternityValue = plus2k10Characteristic(raceId, 4);
        this.willpowerValue = plus2k10Characteristic(raceId, 5);
        this.polishValue = plus2k10Characteristic(raceId, 6);
        
    }

    public int plus2k10Characteristic(int raceId, int characteristicId) {
        int characteristicValue = Dice.roll2k10() + RacesDefaultCharacteristic.returnRaceCharacteristic(raceId, characteristicId);
        return characteristicValue;
    }

    public int returnDecimalValue(int number){
        int decimalValue=number/10;
        return decimalValue;
    }
    
    public int readStrengthValue(){
        return this.strengthValue;
    }
    
    public int readResistanceValue(){
        return this.resistanceValue;
    }
}
