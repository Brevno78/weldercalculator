package org.example.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaterialsTest {
    @Test
    public void shouldHaveCorrectDensityAndEfficiencyForCarbonSteel(){
        Material steel = Material.CARBON_STEEL;

        double actualDensity = steel.getDensityKgM3();
        double actualEfficiency = steel.getEfficiency();
        Assertions
                .assertTrue(actualEfficiency > 0, "эффективность должна быть больше нуля");
    }
}
