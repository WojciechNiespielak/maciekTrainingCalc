/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quiz;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author wojci_000
 */
public class Main {

    public static void main(String[] args) throws IOException {

  Main.importFromCsvQuestionsFile();

    }
    
public static void importFromCsvQuestionsFile() throws FileNotFoundException, IOException {
        CSVReader importedQuestion = new CSVReader(new FileReader("src/main/resources/questionsFile.csv"));
        String[] answerDecripionText;
        while ((answerDecripionText = importedQuestion.readNext()) != null) {
            System.out.println(answerDecripionText[0] + answerDecripionText[1] + "etc...");
        }
    }

}
