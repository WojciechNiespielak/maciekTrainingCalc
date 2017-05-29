/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quiz;

import com.opencsv.CSVReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileReader;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author wojci_000
 */
public class Question {

    String tresc;
    List<Answer> odpowiedzi = new ArrayList<>();
    int id;
    boolean wynik;
    int idPoprawnejOdpowiedzi;

    public Question(String tresc, List odpowiedzi, int id, boolean wynik, int idPoprawnejOdpowiedzi) {
        this.tresc = tresc;
        this.odpowiedzi = odpowiedzi;
        this.id = id;
        this.wynik = wynik;
        this.idPoprawnejOdpowiedzi = idPoprawnejOdpowiedzi;
    }

    public void setQuestionTresc(String tresc) {
        this.tresc = tresc;
    }

    public void putAnswerToTheList(Answer objectName) {
        odpowiedzi.add(objectName);
    }

    public void createQuestionObjectSetName() {

    }

    public void answerTheQuestion() {
        System.out.print("Odpowiedz na pytanie: ");
        Scanner odczyt = new Scanner(System.in);
        int chosenAnswer = odczyt.nextInt();
        isAnswerCorrect(chosenAnswer);
    }

    public void isAnswerCorrect(int idOdpowiedzi) {
        this.wynik = idOdpowiedzi == this.idPoprawnejOdpowiedzi;
    }

}
