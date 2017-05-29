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
public class RacesVitality {

    static int[][] raceVitalityTable = new int[][]{
        {10, 11, 12, 13},
        {9, 10, 11, 12},
        {11, 12, 13, 14},
        {8, 9, 10, 11}
    };

    public static int vitalityRoll() {
        int vitalityIntervalValue = vitalityInterval(Dice.oneDiceRoll(10));
        return vitalityIntervalValue;
    }

    public static int vitalityInterval(int rollResult) {
        int vitalityIntervalValue = 0;
        if (rollResult >= 1 && rollResult <= 3) {
            vitalityIntervalValue = 0;
        }
        if (rollResult >= 4 && rollResult <= 6) {
            vitalityIntervalValue = 1;
        }
        if (rollResult <= 7 && rollResult <= 9) {
            vitalityIntervalValue = 2;
        }
        if (rollResult == 10) {
            vitalityIntervalValue = 3;
        }
        return vitalityIntervalValue;
    }

    public static int value(int raceId) {
        int vitalityIntervalValue = vitalityRoll();
        int vitalityValue = raceVitalityTable[raceId][vitalityIntervalValue];
        return vitalityValue;
    }
}
