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
public class RacesList {

    static String[] raceNameTable = new String[]{"Człowiek", "Elf", "Krasnolud", "Niziołek"};

    public static int howManyRaces() {
        int raceNumber = raceNameTable.length;
        return raceNumber;
    }

    public static void showRacesName() {
        int showMax = raceNameTable.length;
        System.out.println("Lista dostępnych klas");
        for (int i = 0; i < showMax; i++) {

            System.out.println((i + 1) + ". " + raceNameTable[i]);
        }
    }

    public static String returnRaceName(int raceId) {
        String raceName = raceNameTable[raceId];
        return raceName;
    }

}
