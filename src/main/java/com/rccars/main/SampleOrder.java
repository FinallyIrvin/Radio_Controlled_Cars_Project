package com.rccars.main;

import com.rccars.controller.InventoryGenerator;
import com.rccars.model.AbstractCar;
import com.rccars.model.Accessories;
import com.rccars.model.FullSpikedTireOption;
import com.rccars.model.SlickTireOption;

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


        private void anotherCar () {
            System.out.println("Would you like to add another car? yes or no");
            String answer = userIn.next();
            validateAnotherCar(answer);
        }

        private void offerUpgrades () {
            System.out.println("Apart from the frame options," +
                    " we also offer tire upgrades.");
            System.out.println("The following tire upgrades are:\n" +
                    "1 - full spiked tires\n2 - slick tires\n3 - no upgrades");
            String upgrade = userIn.next();
            validateUpgrades(upgrade);
            moreUpgrades();
        }

        private void frameTypeOffer (AbstractCar car){
            System.out.println("Our cars come with a" +
                    " default frame.");
            System.out.println("Your current frame" +
                    " is " + car.getFrame().toLowerCase());
            System.out.println("Would you like this car" +
                    " with a different frame? yes or no");
            String choice = userIn.next();
            switch (choice.toLowerCase()) {
                case "yes":
                    frameTypeChange(car);
                    break;
                case "no":
                    break;
                default:
                    System.out.println("You have entered an invalid choice.");
                    frameTypeOffer(car);
            }
        }

        private void frameTypeChange (AbstractCar car){
            System.out.println("What type of frame would you like?");
            System.out.println("Your choices are:\n" +
                    "1 - Military frame (extra charge)\n2 - Truck frame (extra charge)");
            String type = userIn.next();
            validateSomething(type);
        }

        private void moreUpgrades () {
            System.out.println("Do you want to add more Upgrades? yes or no");
            String val = userIn.next();

            switch (val) {
                case "yes":
                    offerUpgrades();
                    break;
                case "no":
                    break;
                default:
                    System.out.println("You have entered an invalid choice");
                    moreUpgrades();
            }
        }

        public void offerAccessories () {
            System.out.println("Do you want to buy any Accessories?");
            String answer = userIn.next();
            validateOffer(answer);

        }
        private void buyAccessories () {
            System.out.println("What Accessories are you interested in?");
            System.out.println("Your options are:\nr - Repair set\nd - Decals\nl - Light bar\nw - Work stand\ne - Extra battery");
            String item = userIn.next();
            validateAccessory(item.toLowerCase());
            accessoryOrder.add(carExtra);
            moreAccessories();
        }

        private void moreAccessories ()
        System.out.println("Do you want to add more Accessories? yes or no");
        String val = userIn.next();

        switch (val) {
            case "yes":
                carExtra = null;
                buyAccessories;
                break;
            case "no":
                orderDone();
                break;
            default:
                System.out.println("You have entered an invalid choice");
                moreAccessories();

        }

    }

    public void validateOffer(String answer) {
        switch (answer) {
            case "yes":
                buyAccessories();
                break;
            default:
                System.out.println("You have entered an invalid choice");
                offerAccessories();
        }
    }

    public void validateAccessory(String choice) {
        switch (choice) {
            case "r":
                carExtra = new Accessories("Repair set", 89.99);
                break;
            case "d":
                carExtra = new Accessories("Decals", 39.99);
                break;
            case "l":
                carExtra = new Accessories("Light Bar", 59.99);
                break;
            case "w":
                carExtra = new Accessories("Work stand", 69.99);
                break;
            case "e":
                carExtra = new Accessories("Extra battery", 49.99);
                break;
            default:
                System.out.println("You have entered an invalid choice");
                buyAccessories();

        }
    }

    private void validateCarType(String type) {
        switch (type) {
            case "1":
                carChoice = inventory.getClassicCarList().remove(0);
                break;
            case "2":
                carChoice = inventory.getDuneBuggyCarList().remove(0);
                break;
            case "3":
                carChoice = inventory.getCrawlerCarList().remove(0);
                break;
            case "4":
                carChoice = inventory.getATVCarList().remove(0);
                break;
            case "5":
                carChoice = inventory.getSportCarList().remove(0);
                break;
            default:
                System.out.println("You have entered an incorrect type");
                buyCar();
        }
    }


    private void validateAnotherCar(String answer) {
        switch (answer.toLowerCase()) {
            case "yes":
                carChoice = null;
                buyCar();
                break;
            case "no":
                offerAccessories();
                break;
            default:
                System.out.println("You have entered an invalid choice");
                anotherCar();
        }
    }

    private void validateUpgrades(String upgrade) {
        switch (upgrade.toLowerCase()) {
            case "fs":
                optionsChoice = new FullSpikedTireOption(carChoice);
                customOptionsList.add(optionsChoice);
                break;
            case "st":
                optionsChoice = new SlickTireOption(carChoice);
                customOptionsList.add(optionsChoice);
                break;
            case "none":
                break;
            default:
                System.out.println("You have made an invalid choice.");
                offerUpgrades();
        }

    }

    private void validateSomething(String type) {
        switch (type) {
            case "1":
                buyAccessories();
                break;
            case "2":
                buyCar();
                break;
            default:
                System.out.println("You have entered an invalid choice");
                buySomething();
        }
    }


}