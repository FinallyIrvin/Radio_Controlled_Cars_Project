package com.rccars.model;

import java.math.BigDecimal;

public class TruckFrameOption extends AbstractCarOptions {

    public TruckFrameOption(AbstractCar car) {
        super(car);
    }

    @Override
    public String getOptionName() {
        return "Truck Frame Option";
    }

    @Override
    public BigDecimal getOptionAmount() {
        return  BigDecimal.valueOf(49.99);

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
        return null;
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
