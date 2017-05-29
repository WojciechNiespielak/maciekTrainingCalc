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
public class Score {

    List<Question> Questions = new ArrayList();

    public Score(List Questions) {
        this.Questions = Questions;
    }
    
    int numberOfQuestion(){
    int numberOfQuestion=Questions.size();
    return numberOfQuestion;
    }
}
