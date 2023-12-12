package com.rccars.model;

import java.math.BigDecimal;

public class FullSpikedtireOption extends  AbstractCarOptions{

    public FullSpikedtireOption(AbstractCar car)

    @Override
    public String getOptionName() {
        return "Full Spiked Tire Option";
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
    public String getSerialNumber() {
        return customCar.getSerialNumber();
    }
    @Override
    public String toString() {
        return customCar.toString();
    }
}


