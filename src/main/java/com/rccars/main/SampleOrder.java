package com.rccars.main;

import com.rccars.controller.InventoryGenerator;
import com.rccars.model.*;

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
                " exciting RC cars.");
        buySomething();
    }

    private void buySomething() {
        System.out.println("Are you here to buy " +
                "a radio controlled car or car accessories?");
        System.out.println("1 for car \n2 for accessories");
        String type = userIn.next();
        validateSomething(type);
    }

    private void buyCar() {
        System.out.println("What kind of car would interest you?");
        System.out.println("Your options are:\n1 - ATV\n" +
                "2 - DuneBuggy\n3 - Crawler\n4 - Sport\n5 - SUV\n6 - Classic");
        String type = userIn.next();
        validateCarType(type);
        frameTypeOffer(carChoice);
        offerUpgrades();
        carOrder.add(carChoice);
        anotherCar();
    }

    private void orderDone() {
        new SampleReceipt(carOrder, customOptionsList, accessoryOrder);
    }

    private void anotherCar() {
        System.out.println("Would you like to add another car?\n" +
                "1 for yes\n2 for no");
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
    }

    private void frameTypeOffer(AbstractCar car) {
        System.out.println("Our cars come with a" +
                " default frame.");
        System.out.println("Your current frame" +
                " is a " + car.getFrame().toLowerCase() + " frame");
        System.out.println("Would you like this car" +
                " with a different frame?\n" +
                "1 for yes\n2 for no");
        String choice = userIn.next();
        switch (choice.toLowerCase()) {
            case "1":
                frameTypeChange(car);
                break;
            case "2":
                break;
            default:
                System.out.println("You have entered an invalid choice.");
                frameTypeOffer(car);
        }
    }

    private void frameTypeChange(AbstractCar car) {
        System.out.println("What type of frame would you like?");
        System.out.println("Your choices are:\n" +
                "1 - Military frame (extra charge)\n2 - Truck frame (extra charge)");
        String frame = userIn.next();
        validateFrameChoice(frame);
    }


    public void offerAccessories() {
        System.out.println("Do you want to buy any accessories?\n" +
                "1 for yes\n2 for no");
        String answer = userIn.next();
        validateOffer(answer);

    }

    private void buyAccessories() {
        System.out.println("What accessories are you interested in?");
        System.out.println("Your options are:\n1 - Repair set\n2 - Decals\n3 - Light bar\n4 - Work stand\n5 - Extra battery");
        String item = userIn.next();
        validateAccessory(item.toLowerCase());
        accessoryOrder.add(carExtra);
        moreAccessories();
    }

    private void moreAccessories() {
        System.out.println("Do you want to add more Accessories?\n" +
                "1 for yes\n2 for no");
        String val = userIn.next();

        switch (val) {
            case "1":
                carExtra = null;
                buyAccessories();
                break;
            case "2":
                orderDone();
                break;
            default:
                System.out.println("You have entered an invalid choice");
                moreAccessories();

        }

    }

    public void validateOffer(String answer) {
        switch (answer) {
            case "1":
                buyAccessories();
                break;
            case "2":
                break;
            default:
                System.out.println("You have entered an invalid choice");
                offerAccessories();
        }
    }

    public void validateAccessory(String choice) {
        switch (choice) {
            case "1":
                carExtra = new Accessories("Repair set", 89.99);
                break;
            case "2":
                carExtra = new Accessories("Decals", 39.99);
                break;
            case "3":
                carExtra = new Accessories("Light Bar", 59.99);
                break;
            case "4":
                carExtra = new Accessories("Work stand", 69.99);
                break;
            case "5":
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
                carChoice = inventory.getATVCarList().get(0);
                inventory.getATVCarList().remove(0);
                break;
            case "2":
                carChoice = inventory.getDuneBuggyCarList().get(0);
                inventory.getDuneBuggyCarList().remove(0);
                break;
            case "3":
                carChoice = inventory.getCrawlerCarList().get(0);
                inventory.getCrawlerCarList().remove(0);
                break;
            case "4":
                carChoice = inventory.getSportCarList().get(0);
                inventory.getSportCarList().remove(0);
                break;
            case "5":
                carChoice = inventory.getSuvCarList().get(0);
                inventory.getSuvCarList().remove(0);
                break;
            case "6":
                carChoice = inventory.getClassicCarList().get(0);
                inventory.getClassicCarList().remove(0);
                break;
            default:
                System.out.println("You have entered an incorrect car type");
                buyCar();
        }
    }

    private void validateFrameChoice(String frame) {
        switch (frame) {
            case "1":
                optionsChoice = new MilitaryFrameOption(carChoice);
                customOptionsList.add(optionsChoice);
                break;
            case "2":
                optionsChoice = new TruckFrameOption(carChoice);
                customOptionsList.add(optionsChoice);
                break;
            default:
                System.out.println("You have entered an incorrect frame type.");
                frameTypeChange(carChoice);
        }
    }


    private void validateAnotherCar(String answer) {
        switch (answer.toLowerCase()) {
            case "1":
                carChoice = null;
                buyCar();
                break;
            case "2":
                offerAccessories();
                break;
            default:
                System.out.println("You have entered an invalid choice");
                anotherCar();
        }
    }

    private void validateUpgrades(String upgrade) {
        switch (upgrade.toLowerCase()) {
            case "1":
                optionsChoice = new FullSpikedTireOption(carChoice);
                customOptionsList.add(optionsChoice);
                break;
            case "2":
                optionsChoice = new SlickTireOption(carChoice);
                customOptionsList.add(optionsChoice);
                break;
            case "3":
                break;
            default:
                System.out.println("You have made an invalid choice.");
                offerUpgrades();
        }

    }

    private void validateSomething(String type) {
        switch (type) {
            case "1":
                buyCar();
                break;
            case "2":
                buyAccessories();
                break;
            default:
                System.out.println("You have entered an invalid choice");
                buySomething();
        }
    }

}