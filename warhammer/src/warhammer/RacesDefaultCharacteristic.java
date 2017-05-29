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
public class RacesDefaultCharacteristic {
    
    
       static int[][] raceCharacteristicTable = new int[][]{
        {20, 20, 20, 20, 20, 20, 20, 20, 4},
        {20, 30, 20, 20, 20, 20, 20, 20, 5},
        {30, 20, 20, 30, 10, 20, 20, 10, 3},
        {10, 30, 10, 10, 30, 20, 20, 30, 4}};
       
         public static int returnRaceCharacteristic (int race, int characteristic){
        return raceCharacteristicTable[race][characteristic];
    }
   
    
    
}
