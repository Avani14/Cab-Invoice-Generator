package com.bridgelabz.cabinvoicegenerator;

public class CabFairCalculation {
    //First Step
    private int minimumFair = 5;
    public int fairCalculation(int distance, int minutes) throws FairException {
        int amount = 0;
        amount+=(distance*10)+minutes;

        if(amount<minimumFair){
            throw new FairException("The fair is less than minimum fair: "+minimumFair);
        }
        return amount;
    }
}
