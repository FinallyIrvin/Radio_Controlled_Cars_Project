package com.rccars.main;

import com.rccars.controller.SerialNumberGenerator;
import com.rccars.model.*;

public class Main {
    public static void main(String[] args) {

        testSerialNumbers();
        // testModelNumbers();

    }

    public static void testSerialNumbers() {
        SUVCar sportCar = new SUVCar();
        SerialNumberGenerator scGenerator =
                SerialNumberGenerator.getInstance();
        scGenerator.startGeneration(sportCar.getPrefix(), sportCar.getStartNumber());
        sportCar.setSerialNumber(scGenerator.getNextSerial());
        System.out.println(sportCar.getSerialNumber());

        System.out.println("Next serial in line is " +
                scGenerator.getNextSerial());
    }

    public static void testModelNumbers() {
        SportCar modelSport = new SportCar();
        System.out.println("Sport model # is " + modelSport.getModelNumber());
        System.out.println("");
    }


}
