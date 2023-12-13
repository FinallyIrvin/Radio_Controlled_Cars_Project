package com.rccars.model;

import java.math.BigDecimal;

public class ATVCar extends AbstractOffRoadCar {

    public ATVCar(){
        super(ShellColors.BLUE,BodyShells.ATV,ModelNumber.ORAT2400, "CAR");
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(149.99);
    }
    @Override
    public int getStartNumber() {
        return 8488;
    }
    @Override
    public String getPrefix() {
        return "113342";
    }
    @Override
    public String toString() {
        return "ATVCar";
    }

}
