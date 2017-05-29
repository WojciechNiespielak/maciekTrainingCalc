/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zeus;

/**
 *
 * @author wojtek
 */
public class Plant extends Bulding{
    
    int actualNumberOfWorkers;
    int maxNumberOfWorkers;
    int actualProduction;
    int maxProduction;
    
    public void addWorkes(int numberOfWorkers){
        this.actualNumberOfWorkers = this.actualNumberOfWorkers + numberOfWorkers;
    }
    
    public void removeWorkers(int numberOfWorkers){
        this.actualNumberOfWorkers= this.actualNumberOfWorkers + numberOfWorkers;
        setActualProduction(this.actualNumberOfWorkers);
    }
    
    public void setActualProduction(int workersNumber){
        this.actualProduction= this.maxProduction *(this.maxNumberOfWorkers/workersNumber);
    }
    
}
