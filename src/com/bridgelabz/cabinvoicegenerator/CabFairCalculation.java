package com.bridgelabz.cabinvoicegenerator;

public class CabFairCalculation {
    private int minimumFair = 5;
    public static int fairCalculation(int distance, int minutes){
        return (distance*10)+minutes;
    }
}
