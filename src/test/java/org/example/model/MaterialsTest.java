package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaterialsTest {
    @Test
    @DisplayName("Проверка плотности и КПД наплавки углеродистой стали")
    public void shouldHaveCorrectDensityAndEfficiencyForCarbonSteel(){
        Material steel = Material.CARBON_STEEL;

        double actualDensity = steel.getDensityKgM3();
        double actualEfficiency = steel.getEfficiency();

        Assertions
                .assertEquals(7850, actualDensity, 0.01, "Плотность углеродистой стали должна равняться 7850");
        Assertions
                .assertEquals(0.80, actualEfficiency, 0.01, "КПД наплавки углеродистой стали должна равняться 0.80");
    }
    @Test
    @DisplayName("Проверка плотности и КПД наплавки нержавеющей стали")
    public void shouldHaveCorrectDensityAndEfficiencyForStainlessSteel() {
        Material stainless = Material.STAINLESS_STEEL;

        double stainlessDensity = stainless.getDensityKgM3();
        double stainlessEfficiency = stainless.getEfficiency();

        Assertions
                .assertEquals(7900, stainlessDensity,0.01, "Стандартная плотность нержавеющей стали должна быть равна 7900");
        Assertions
                .assertEquals(0.75, stainlessEfficiency, 0.01, "КПД наплавки нержавеющей стали должна быть равна 0.75");
    }
    @Test
    @DisplayName("Проверка плотности и КПД наплавки алюминия")
    public void shouldHaveCorrectDensityAndEfficiencyForAluminium(){
        Material aluminium = Material.ALUMINUM;

        double aluminiumDensity = aluminium.getDensityKgM3();
        double aluminiumEfficiency = aluminium.getEfficiency();

        Assertions
                .assertEquals(2700, aluminiumDensity , 0.01, "Плотность алюминия должна быть равна 2700");
        Assertions
                .assertEquals(0.70, aluminiumEfficiency, 0.01, "КПД наплавки алюминия должна быть равна 0.70");
    }
}
