/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zegar;

import java.util.Scanner;

/**
 *
 * @author Olga Helena Szczęsna
 */
public class Read {

    public static int number() {
        Scanner scanNumber = new Scanner(System.in);
        int number = scanNumber.nextInt();
        return number;
    }

    public static String string() {
        Scanner scanString = new Scanner(System.in);
        String string = scanString.nextLine();
        return string;
    }
    
 
}