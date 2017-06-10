/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zegar;

import static com.mycompany.zegar.MainMenu.chose;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Olga Helena Szczęsna
 */
public class MainMenu {
    
    public static void show(){
    System.out.println("1.Która Godzina");
    System.out.println("2.Utwórz Budzik");
    System.out.println("3.Ustaw Godzinę");
    System.out.println("4.Wybierz Kraj");
    System.out.println("5.Zakończ");
    }
    
    public static int chose (){
     System.out.println("Wybierz Cyfrę");
     int liczba = Read.number();
       return liczba;
    }
    
    public static void menuNextAction(){
        int liczba = chose();
       switch (liczba) {
  case 1:
   CurrentTime.get();
break;
  case 2:
       
      break;
  default:
 System.out.println("jeszcze nie zrobilem tego");
 break;

       }
    }
}

