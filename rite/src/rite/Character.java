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
public class Character {
    final String characterName;
    final int story;
    int maxSanityLevel;
    int currentSanityLevel;
    boolean possesion;
    int[] characterCurseList;
    
public Character(String characterName, int story, int maxSanityLevel, int[] characterCurseList)
{
    this.characterName=characterName;
    this.story=story;
    this.maxSanityLevel=maxSanityLevel;
    this.currentSanityLevel=maxSanityLevel;
    this.possesion=false;
    this.characterCurseList=characterCurseList;
}
    
}
