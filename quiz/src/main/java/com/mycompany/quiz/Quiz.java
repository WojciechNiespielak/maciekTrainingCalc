/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quiz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wojci_000
 */
public class Quiz {

    List<Question> listOfQuestions = new ArrayList();
    int ktorePytanie = 0;
    int maxPytan = 10;

    public Quiz(List listOfQuestions, int ktorePytanie, int maxPytan) {
        this.listOfQuestions = listOfQuestions;
        this.ktorePytanie = ktorePytanie;
        this.maxPytan = maxPytan;
    }

    public void addQuestionToArray(Question singleQuestionObject) {
        listOfQuestions.add(singleQuestionObject);
    }

    void beginQuiz() {

    }

}
