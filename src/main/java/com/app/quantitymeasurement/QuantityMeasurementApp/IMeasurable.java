package com.app.quantitymeasurement.QuantityMeasurementApp;

public interface IMeasurable {
    /**
     * @return the conversion factor to the base unit
     */
    double getConversionFactor();

    /**
     * Convert value from this unit to the base unit.
     */
    double convertToBaseUnit(double value);

    /**
     * Convert value from the base unit to this unit.
     */
    double convertFromBaseUnit(double baseValue);
}