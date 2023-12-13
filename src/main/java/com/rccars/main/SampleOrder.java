package com.rccars.main;

import com.rccars.controller.InventoryGenerator;
import com.rccars.model.AbstractCar;
import com.rccars.model.Accessories;

import java.util.ArrayList;
import java.util.Scanner;

public class SampleOrder {
    private final ArrayList<AbstractCar> carOrder;
    private final ArrayList<AbstractCar> customOptionsList;
    private final ArrayList<Accessories> acessoryOrder;
    private final Scanner userIn;
    private final InventoryGenerator inventory;
    private AbstractCar carChoice;
    private AbstractCar optionsChoice;
    private Accessories carxtra;

    public SampleOrder() {
        carOrder = new ArrayList<>();
        customOptionsList = new ArrayList<>();
        acessoryOrder = new ArrayList<>();
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
        System.out.println("Your options are:\nc - Classic\n" +
                "d - DuneBuggy\nc - Crawler\na - ATV ");

    }



}