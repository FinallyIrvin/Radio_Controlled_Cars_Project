package com.rccars.main;

import com.rccars.controller.InventoryGenerator;
import com.rccars.controller.SerialNumberGenerator;
import com.rccars.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

         orderItems();
        // testSerialNumbers();
        // testModelNumbers();
        // testCar();
        // testCustomOptions();
        // testReceipt();

    }

    public static void orderItems() {
        SampleOrder order = new SampleOrder();
        order.welcomeMessage();
    }

    public static void testSerialNumbers() {
        SportCar Car = new SportCar();
        SerialNumberGenerator Generator =
                SerialNumberGenerator.getInstance();
        Generator.startGeneration(Car.getPrefix(), Car.getStartNumber());
        Car.setSerialNumber(Generator.getNextSerial());
        System.out.println(Car.getSerialNumber());

        System.out.println("Next serial in line is " +
                Generator.getNextSerial());
    }



    public static void testCar() {
        SportCar car = new SportCar();
        System.out.println("The price of the " + car.getBodyShell() + " car is " + car.getPrice());
        System.out.println("The model number for this car is " + car.getModelNumber());
        System.out.println("The default options for this car are \n" + car.getWheelType() + " tires\n" +
                car.getShellColor() + " shell color\n" + car.getFrame() + " frame");

    }

    public static void testCustomOptions() {
        SportCar car = new SportCar();
        MilitaryFrameOption option1 = new MilitaryFrameOption(car);
        System.out.println(option1.getOptionName());
        double price = option1.getPrice().
                add(option1.getOptionAmount()).doubleValue();
        FullSpikedTireOption option2 = new FullSpikedTireOption(option1);
        System.out.println(option2.getOptionName());
        price += option2.getOptionAmount().doubleValue();
        System.out.println(price);
    }

    public static void testReceipt() {
        ArrayList<AbstractCar> car = new ArrayList<>();
        ArrayList<AbstractCar> customUpgrade = new ArrayList<>();
        ArrayList<Accessories> accessoriesList = new ArrayList<>();
        InventoryGenerator generator = new InventoryGenerator();
        car.add(generator.getSportCarList().get(0));
        AbstractCar customCar = generator.getDuneBuggyCarList().get(0);
        customCar = new FullSpikedTireOption(customCar);
        car.add(customCar);
        customUpgrade.add(customCar);
        accessoriesList.add(0, new Accessories("Extra Battery", 49.99));

        new SampleReceipt(car, customUpgrade, accessoriesList);
    }


}
