package com.rccars.main;

import com.rccars.controller.InventoryGenerator;
import com.rccars.model.AbstractCar;
import com.rccars.model.Accessories;

import java.util.ArrayList;
import java.util.Scanner;

public class SampleOrder {
    private final ArrayList<AbstractCar> carOrder;
    private final ArrayList<AbstractCar> customOptionsList;
    private final ArrayList<Accessories> accessoryOrder;
    private final Scanner userIn;
    private final InventoryGenerator inventory;
    private AbstractCar carChoice;
    private AbstractCar optionsChoice;
    private Accessories carExtra;

    public SampleOrder() {
        carOrder = new ArrayList<>();
        customOptionsList = new ArrayList<>();
        accessoryOrder = new ArrayList<>();
        userIn = new Scanner(System.in);
        inventory = new InventoryGenerator();
    }
     public void welcomeMessage() {
         System.out.println("Welcome to R/C Madness Company");
         System.out.println("Revolutionize your downtime with" +
                 "Exciting RC cars.");
         buySomething();
     }
     private void buySomething() {
         System.out.println("Are here to buy " +
                 "A RC Car?");
         System.out.println("Your options are:\n" +
                 "1 for Accessories \n2 for a Car");
         String type = userIn.next();
         validateSomething(type);
    }

    private void buyCar() {
        System.out.println("What kind of car would interest you?");
        System.out.println("Your options are:\n1 - Classic\n" +
                "2 - DuneBuggy\n3 - Crawler\n4 - ATV\n5 - Sport\n6 - SUV");
        String type = userIn.next();
        validateCarType(type);
        frameTypeOffer(carChoice);
        offerUpgrades();
        carOrder.add(carChoice);
        anotherCar();
        orderDone();
    }

    private void orderDone() {
        new SampleReceipt(carOrder, customOptionsList, accessoryOrder);


    private void anotherCar() {
        System.out.println("Would you like to add another car? yes or no");
            String answer = userIn.next();
            validateAnotherCar(answer);
        }

        private void offerUpgrades() {
            System.out.println("Apart from the frame options," +
                    " we also offer tire upgrades.");
            System.out.println("The following tire upgrades are:\n" +
                    "1 - full spiked tires\n2 - slick tires\n3 - no upgrades");
            String upgrade = userIn.next();
            validateUpgrades(upgrade);
            moreUpgrades();
        }

        private void frameTypeOffer(AbstractCar car) {
            System.out.println("Our cars come with a" +
            " default frame.");
            System.out.println("Your current frame" +
                    " is "+ (car.getFrame());
    }
    


    }



}