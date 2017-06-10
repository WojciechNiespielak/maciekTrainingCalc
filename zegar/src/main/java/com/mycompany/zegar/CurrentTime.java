/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zegar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Olga Helena Szczęsna
 */
public class CurrentTime {
    
    public static void get(){
    Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( sdf.format(cal.getTime()) );
    }
}
