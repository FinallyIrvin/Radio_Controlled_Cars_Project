package com.rccars.main;


import com.rccars.model.AbstractCar;
import com.rccars.model.Accessories;

import java.util.ArrayList;

public class SampleReceipt {

    private double total = 0.0;
    ArrayList<AbstractCar> rcCart;
    ArrayList<AbstractCar> upgradeCart;
    ArrayList<Accessories> accessoriesCart;

    public SampleReceipt(ArrayList<AbstractCar> rcList,
                         ArrayList<AbstractCar> upgradeList,
                         ArrayList<Accessories> accessoriesList) {
        rcCart = rcList;
        upgradeCart = upgradeList;
        accessoriesCart = accessoriesList;
        showTitle();
        shortColumnHeader();
        showrcCart();
        showAccessoryCart();
        showTotals();

    }

    private void showTitle() {
        String company = String.format("%30s", "R/C Madness Company");
        String address = String.format("%33s", "1265 Sumner ave, Kansas City, Kansas");
        String phone = String.format("27s", "(913) 281 - 3568");
        System.out.println(company);
        System.out.println(address);
        System.out.println(phone);
        showStars();
        String cash = String.format("%25s", "MONEY RECEIPT");
        System.out.println(cash);
        showStars();
    }

    private void shortColumnHeader() {
        String price = String.format("%28s |", "Price");
        System.out.println("| Description |" + price);
    }

    public void showrcCart() {
        if (!rcCart.isEmpty()) {
            for (AbstractCar car : rcCart) {
                System.out.println(car);
                System.out.println("\tShell Color: " +
                        car.getShellColor());
                total += car.getPrice().doubleValue();
                String carPrice = String.format("30s",
                        "$" + car.getPrice());
                System.out.println("\tCar Price: " +
                        carPrice);
                if (!upgradeCart.isEmpty()) {
                    showUpgradeCart(car);
                }
                System.out.println();
            }
        }
    }

    private void showUpgradeCart(AbstractCar car) {
        for (AbstractCar upgrade : upgradeCart) {
            if (upgrade.toString().equals(car.toString())) {
                String customPrice = String.format("%22",
                        "$" + upgrade.getOptionAmount());
                System.out.println("\t" + upgrade.getOptionName());
                System.out.println(customPrice);
                total += upgrade.getOptionAmount().doubleValue();
            }
        }
    }

    private void showAccessoryCart() {
        for (Accessories item : accessoriesCart) {
            System.out.print("\t" + item.getItemName());
            String price = String.format("%35s", "$" +
                    item.getPrice());
            System.out.println(price);
            System.out.println();
            total += item.getPrice().doubleValue();
        }
    }

    private void showTotals() {
        double tax = 1.07;
        double totalWithTax = total * tax;
        double taxAmount = totalWithTax - total;
        showStars();
        System.out.print("Sub Total");
        System.out.printf("%27s %.2f%n", "$", total);
        System.out.print("Sales Tax");
        System.out.printf("%28s %.2f%n", "$", taxAmount);
        System.out.print("Total");
        System.out.printf("%31s %.2f%n", "$", totalWithTax);

    }

    private void showStars() {
        for (int i = 0; i < 40; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


}