/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rite;

/**
 *
 * @author wojtek
 */
public class Curse {
    final String curseName;
    final int curseDescription;
    int curseProbability;
    int curseEffect;
    String curseEffectDesription;
    int curseRemoveDescripton;
    int curseRemoveProbability;
    
    public Curse(String curseName,int curseDescription, int curseProbability,
            int curseEffect, String curseEffectDesription, int curseRemoveDescription, int curseRemoveProbability)
    {
        this.curseName=curseName;
        this.curseDescription=curseDescription;
        this.curseProbability=curseProbability;
        this.curseEffect=curseEffect;
        this.curseEffectDesription=curseEffectDesription;
        this.curseRemoveDescripton=curseRemoveDescription;
        this.curseRemoveProbability=curseRemoveProbability;
               
    }
}
