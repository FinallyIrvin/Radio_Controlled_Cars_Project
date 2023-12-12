package com.rccars.model;

import java.math.BigDecimal;

public class FullSpikedTireOption extends AbstractCarOptions{


    public FullSpikedTireOption(AbstractCar car) {
        super(car);
    }

    @Override
    public String getOptionName() {
        return "Full Spiked Tire Option";
    }

    @Override
    public BigDecimal getOptionAmount() {
        return BigDecimal.valueOf(26.99);
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
    public String getPrefix() {
        return customCar.getPrefix();

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


