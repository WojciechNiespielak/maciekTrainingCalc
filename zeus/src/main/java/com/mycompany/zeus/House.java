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
public class House extends Bulding {

    int level;
    int maxCapacity;
    int actualFill;
   

    public House(int xPosition, int yPosition) {
        this.level = 1;
        this.xSize = 2;
        this.ySize = 2;
        this.maxCapacity = 8;
        this.actualFill = 0;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void riseLevel() {
        if (checkLevel(this.level));
        {
            this.level = this.level + 1;
            setMaxCapacity();
        }

    }

    public void decraseLevel() {
        if (checkLevel(this.level));
        {
            this.level = this.level - 1;
            setMaxCapacity();
        }
    }

    public boolean checkLevel(int level) {
        if (level == 1 || level == 6) {
            return false;
        } else {
            return true;
        }
    }

    public void setMaxCapacity() {
        this.maxCapacity = (8 + ((this.level - 1) * 8));
        reduceFillIfNecessary(this.maxCapacity);
    }

    public void reduceFillIfNecessary(int maxCapacity) {
        if (this.actualFill <= maxCapacity) {
            this.actualFill = maxCapacity;
        }
    }

}
