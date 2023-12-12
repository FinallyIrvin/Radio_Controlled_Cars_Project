package com.rccars.model;

import java.math.BigDecimal;

public class MilitaryFrameOption extends AbstractCarOptions {

    public  MilitaryFrameOption(AbstractCar car) {
        super(car);

    }

    @Override
    public String getOptionName() {
        return "Military frame upgrade";
    }
    @Override
    public BigDecimal getOptionAmount() {
        return BigDecimal.valueOf(49.99);
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
    public String getPrefix() {
        return customCar.getPrefix();
    }
    @Override
    public String getWheelType() {
        return customCar.getWheelType();
    }
    @Override
    public String getSerialNumber() {
        return customCar.getSerialNumber();
    }

    @Override
    public String toString() {
        return customCar.toString();
    }



}
