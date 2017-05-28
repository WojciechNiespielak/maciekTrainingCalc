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
public class RacesDestiny {
  static int[][] raceDestinyTable = new int[][]{
        {2, 3, 3},
        {1, 2, 2},
        {1, 2, 3},
        {2, 2, 3}
    };
  
     public static int destinyRoll() {
        int destinyIntervalValue = destinyInterval(Dice.oneDiceRoll(10));
        return destinyIntervalValue;
    }

    public static int destinyInterval(int rollResult) {
        int destinyIntervalValue = 0;
        if (rollResult >= 1 && rollResult <= 4) {
            destinyIntervalValue = 0;
        }
        if (rollResult >= 5 && rollResult <= 7) {
            destinyIntervalValue = 1;
        }
        if (rollResult <= 8 && rollResult <= 10) {
            destinyIntervalValue = 2;
        }
        return destinyIntervalValue;
    }

    public static int value(int raceId) {
        int destinyIntervalValue = destinyRoll();
        int destinyValue = raceDestinyTable[raceId][destinyIntervalValue];
        return destinyValue;
    }
   
}
