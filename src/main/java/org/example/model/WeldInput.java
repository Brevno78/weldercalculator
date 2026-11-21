package org.example.model;

public record WeldInput(
    double thicknessMm, /*толщина металла*/
    double wireDiameterMm, /*диаметр проволоки */
    double gapMm, /*Зазор*/
    double targetHeatInputJmm /*погонная энергия*/
)
{

}
