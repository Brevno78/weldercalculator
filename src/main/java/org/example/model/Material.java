package org.example.model;

public enum Material {
    CARBON_STEEL(7850, 0.80),      // плотность кг/м³, КПД наплавки η
    STAINLESS_STEEL(7900, 0.75),
    ALUMINUM(2700, 0.70);

    private final double densityKgM3;
    private final double efficiency;

    Material(double densityKgM3, double efficiency){
        this.densityKgM3 = densityKgM3;
        this.efficiency = efficiency;
    }

    public double getDensityKgM3() {
        return densityKgM3;
    }
    public double getEfficiency(){
        return efficiency;
    }



}
