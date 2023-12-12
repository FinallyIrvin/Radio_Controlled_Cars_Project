package com.rccars.model;

import java.math.BigDecimal;

public class SlickTireOption extends AbstractCarOptions {

    public SlickTireOption (AbstractCar car) {
        super(car);
    }
    @Override
    public String getOptionName() {
        return "Slick Tire Option";
    }

    @Override
    public BigDecimal getOptionAmount() {
        return  BigDecimal.valueOf(64.99);

    }

    @Override
    public BigDecimal getPrice() {
        return customCar.getPrice();
    }
    @Override
    public int getStartNumber() {
        return customCar.getStartNumber();
    }

    @Override
    public String getWheelType() {
        return customCar.getWheelType();
    }

    @Override
    public int getPrefix() {
        return customCar.getPrefix();

    }
    @Override
    public int getSerialNumber() {
        return customCar.getSerialNumber();
    }
    @Override
    public String toString() {
        return customCar.toString();
    }

}
