package edu.uc.cs3003.medava;

public class Jarvik implements Shippable {
    public Jarvik(String deviceSerialNumber) {
        serialNumber = deviceSerialNumber;
    }

    public String getMedicineName() {
        return "Jarvik Artificial Heart";
    }

    public MedicineSchedule getSchedule() {
        return MedicineSchedule.Uncontrolled;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature) {
        return true; // Jarvik heart can handle any temperature range
    }

    private String serialNumber;
}