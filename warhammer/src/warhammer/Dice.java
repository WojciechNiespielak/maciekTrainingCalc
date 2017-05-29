/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warhammer;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author wojtek
 */
public class Dice {
    

public static int oneDiceRoll(int max){
int randomNum = ThreadLocalRandom.current().nextInt(1, max + 1);
return randomNum;
}

public static int multiRollOneDiceType(int numberOfRoll, int diceType){
       int number=0;
       for(int i=0; i<numberOfRoll; i++){
           number=number+ThreadLocalRandom.current().nextInt(1, diceType + 1);
       }
       return number;
               }


public static int roll2k10() {
int number=0;
       for(int i=0; i==2; i++){
           number=number+ThreadLocalRandom.current().nextInt(1, 10 + 1);
       }
       return number;
}
}