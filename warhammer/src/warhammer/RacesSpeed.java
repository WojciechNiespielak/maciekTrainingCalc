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
public class RacesSpeed {

    static int[] racesSpeedList = new int[]{4, 5, 3, 4};

    public static int value(int raceId) {
        int speedValue = racesSpeedList[raceId];
        return speedValue;
    }
}
