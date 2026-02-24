package com.app.quantitymeasurement.QuantityMeasurementApp;

public enum VolumeUnit implements IMeasurable {
    LITER(1.0),
    MILLILITER(0.001),       // 1000 ML in 1 Liter
    GALLON(3.78541);         // 1 Gallon is ~3.78541 Liters

    private final double conversionFactor;

    VolumeUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public double getConversionFactor() {
        return this.conversionFactor;
    }

    @Override
    public double convertToBaseUnit(double value) {
        return value * this.conversionFactor;
    }

    @Override
    public double convertFromBaseUnit(double baseValue) {
        return baseValue / this.conversionFactor;
    }
}
