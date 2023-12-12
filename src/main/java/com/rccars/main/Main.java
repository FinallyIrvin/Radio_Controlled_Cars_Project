package com.rccars.main;

import com.rccars.controller.SerialNumberGenerator;
import com.rccars.model.SportCar;

public class Main {
    public static void main(String[] args) {

        testSerialNumbers();

    }

    public static void testSerialNumbers() {
        SportCar sportCar = new SportCar();
        SerialNumberGenerator generator =
                SerialNumberGenerator.getInstance();
        generator.startGeneration(sportCar.getPrefix(),
                sportCar.getStartNumber());
        sportCar.setSerialNumber(generator.getNextSerial());
        System.out.println(sportCar.getSerialNumber());
    }


}
