package com.rccars.model;

import java.math.BigDecimal;

public class SUVCar extends AbstractStreetCar {

    public SUVCar() {
        super(ShellColors.GREY, BodyShells.SUV, ModelNumber.SUV3019);
    }

    @Override
    public int getPrefix() {
        return 642852;
    }

    @Override
    public int getStartNumber(){
        return 8647;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(124.99);
    }

    @Override
    public String toString() {
        return "SUV Car";
    }
}
