package com.app.quantitymeasurement.QuantityMeasurementApp;

public enum LengthUnit implements IMeasurable{
    FEET(1.0), 
    INCHES(1.0 / 12.0), 
    YARDS(3.0), 
    CENTIMETERS(1.0 / 30.48);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return this.conversionFactor;
    }

    /**
     * Convert value from this unit to the base unit (FEET).
     * @param value the value in this unit
     * @return the value converted to FEET
     */
    public double convertToBaseUnit(double value) {
        return value * this.conversionFactor;
    }

    /**
     * Convert value from the base unit (FEET) to this unit.
     * @param baseValue the value in FEET
     * @return the value converted to this unit
     */
    public double convertFromBaseUnit(double baseValue) {
        return baseValue / this.conversionFactor;
    }
}