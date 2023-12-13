package com.rccars.controller;

import com.rccars.model.*;

import java.util.ArrayList;

public class InventoryGenerator {

    private final ArrayList<SportCar> sportCarList;
    private final ArrayList<SUVCar> suvCarList;
    private final ArrayList<ClassicCar> classicCarList;
    private final ArrayList<ATVCar> atvCarList;
    private final ArrayList<DuneBuggyCar> duneBuggyCarList;
    private final ArrayList<CrawlerCar> crawlerCarList;
    private final SerialNumberGenerator generator;

    public InventoryGenerator() {
        generator = SerialNumberGenerator.getInstance();
        sportCarList = buildSportInventory(new ArrayList<>());
        suvCarList = buildSUVInventory(new ArrayList<>());
        classicCarList = buildClassicInventory(new ArrayList<>());
        atvCarList = buildATVInventory(new ArrayList<>());
        duneBuggyCarList = buildDuneBuggyInventory(new ArrayList<>());
        crawlerCarList = buildCrawlerInventory(new ArrayList<>());
    }

    public ArrayList<SportCar> getSportCarList() {
        return sportCarList;
    }

    public ArrayList<SUVCar> getSuvCarList() {
        return suvCarList;
    }

    public ArrayList<ClassicCar> getClassicCarList() {
        return classicCarList;
    }

    public ArrayList<ATVCar> getATVCarList() {
        return atvCarList;
    }

    public ArrayList<DuneBuggyCar> getDuneBuggyCarList() {
        return duneBuggyCarList;
    }

    public ArrayList<CrawlerCar> getCrawlerCarList() {
        return crawlerCarList;
    }

    private ArrayList<SportCar> buildSportInventory(ArrayList<SportCar> carList) {
        SportCar car = new SportCar();
        generator.startGeneration(car.getPrefix(), car.getStartNumber());

        for (int i = 0; i < 7; i++) {
            car = new SportCar();
            car.setSerialNumber(generator.getNextSerial());
            carList.add(i, car);
        }
        return carList;
    }

    private ArrayList<SUVCar> buildSUVInventory(ArrayList<SUVCar> carList) {
        SUVCar car = new SUVCar();
        generator.startGeneration(car.getPrefix(), car.getStartNumber());

        for (int i = 0; i < 7; i++) {
            car = new SUVCar();
            car.setSerialNumber(generator.getNextSerial());
            carList.add(i, car);
        }
        return carList;
    }

    private ArrayList<ClassicCar> buildClassicInventory(ArrayList<ClassicCar> carList) {
        ClassicCar car = new ClassicCar();
        generator.startGeneration(car.getPrefix(), car.getStartNumber());

        for (int i = 0; i < 7; i++) {
            car = new ClassicCar();
            car.setSerialNumber(generator.getNextSerial());
            carList.add(i, car);
        }
        return carList;
    }

    private ArrayList<ATVCar> buildATVInventory(ArrayList<ATVCar> carList) {
        ATVCar car = new ATVCar();
        generator.startGeneration(car.getPrefix(), car.getStartNumber());

        for (int i = 0; i < 7; i++) {
            car = new ATVCar();
            car.setSerialNumber(generator.getNextSerial());
            carList.add(i, car);
        }
        return carList;
    }

    private ArrayList<DuneBuggyCar> buildDuneBuggyInventory(ArrayList<DuneBuggyCar> carList) {
        DuneBuggyCar car = new DuneBuggyCar();
        generator.startGeneration(car.getPrefix(), car.getStartNumber());

        for (int i = 0; i < 7; i++) {
            car = new DuneBuggyCar();
            car.setSerialNumber(generator.getNextSerial());
            carList.add(i, car);
        }
        return carList;
    }

    private ArrayList<CrawlerCar> buildCrawlerInventory(ArrayList<CrawlerCar> carList) {
        CrawlerCar car = new CrawlerCar();
        generator.startGeneration(car.getPrefix(), car.getStartNumber());

        for (int i = 0; i < 7; i++) {
            car = new CrawlerCar();
            car.setSerialNumber(generator.getNextSerial());
            carList.add(i, car);
        }
        return carList;
    }


}
