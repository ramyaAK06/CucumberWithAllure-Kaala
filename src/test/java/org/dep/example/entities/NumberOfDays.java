package org.dep.example.entities;

public enum NumberOfDays {
    HalfDay(0.5), OneDay(1), OneAndHalfDay(1.5),TwoDays(2), TwoAndHalfDay(2.5), ThreeDays(3), ThreeAndHalfDays(3.5), FourDays(4), FourAndHalfDays(4.5);

    private double numVal;

    NumberOfDays(double numVal) {
        this.numVal = numVal;
    }

    public double getNumVal() {
        return numVal;
    }

}
