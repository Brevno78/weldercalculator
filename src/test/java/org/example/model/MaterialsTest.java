package org.example.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class MaterialsTest {
    @Test
    @DisplayName("Проверка эффективности")
    public void shouldHaveCorrectDensityAndEfficiencyForCarbonSteel(){
        Material steel = Material.CARBON_STEEL;

        double actualDensity = steel.getDensityKgM3();
        double actualEfficiency = steel.getEfficiency();
        Assertions
                .assertTrue(actualEfficiency > 0, "эффективность не может быть больше нуля");

    }
//    починить тесты и дженкинс
}
