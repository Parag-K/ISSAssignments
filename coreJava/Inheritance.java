package coreJava;

import java.lang.*;
import java.util.*;

class ElectronicDevice {
    private String brand;
    private boolean poweredOn;

    public ElectronicDevice(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        poweredOn = true;
        System.out.println(brand + " powered on.");
    }

    public void turnOff() {
        poweredOn = false;
        System.out.println(brand + " powered off.");
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class Television extends ElectronicDevice {
    private int screenSize;

    public Television(String brand, int screenSize) {
        super(brand);
        this.screenSize = screenSize;
    }

    public void displayInfo() {
        System.out.println("Television: " + getBrand() + ", Screen Size: " + screenSize + " inches");
    }
}

class Laptop extends ElectronicDevice {
    private String processorType;

    public Laptop(String brand, String processorType) {
        super(brand);
        this.processorType = processorType;
    }

    public void showProcessorInfo() {
        System.out.println("Laptop: " + getBrand() + ", Processor: " + processorType);
    }
}

public class ElectronicDeviceExample {
    public static void main(String[] args) {
        Television samsungTV = new Television("Samsung", 55);
        Laptop dellLaptop = new Laptop("Dell", "Intel Core i5");

        samsungTV.turnOn();
        dellLaptop.turnOn();

        samsungTV.displayInfo();
        dellLaptop.showProcessorInfo();

        samsungTV.turnOff();
        dellLaptop.turnOff();
    }
}
