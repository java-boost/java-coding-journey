package main.java.smarthome;

abstract class ElectronicDevice {
    String serialNumber;
    double powerUsage;

    abstract void turnOn();
}
