package org.example.model;

public record WeldResult(
        double currentA,           // сила тока
        double voltageV,           // напряжение дуги
        double wireFeedMh,         // скорость подачи проволоки, м/ч
        double travelSpeedMmS,     // скорость сварки, мм/с
        double heatInputJmm,       // погонная энергия, Дж/мм
        double wireConsumptionKgM  // расход проволоки, кг/м (на будущее)
)
{}
