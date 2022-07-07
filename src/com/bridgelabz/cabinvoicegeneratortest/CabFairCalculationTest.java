package com.bridgelabz.cabinvoicegeneratortest;

import com.bridgelabz.cabinvoicegenerator.CabFairCalculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabFairCalculationTest {
    @Test
    public void checkCabFairCalculation(){
        int expected = CabFairCalculation.fairCalculation(10,1);
        Assertions.assertEquals(expected,101);
    }

}
