package com.bridgelabz.cabinvoicegeneratortest;

import com.bridgelabz.cabinvoicegenerator.CabFairCalculation;
import com.bridgelabz.cabinvoicegenerator.FairException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CabFairCalculationTest {
    CabFairCalculation cabFairCalculation = new CabFairCalculation();

    //Test for multiple rides
    @Test
    public void checkCabFairCalculation() throws FairException {
        int expected = 0;
        expected += cabFairCalculation.fairCalculation(10,1);
        expected += cabFairCalculation.fairCalculation(11,2);
        expected += cabFairCalculation.fairCalculation(12,3);
        Assertions.assertEquals(expected,336);
    }

}
