package com.rccars.model;

import java.math.BigDecimal;

public class SportCar extends AbstractStreetCar{

    public SportCar() {
        super(ShellColors.RED, BodyShells.SPORT, ModelNumber.SPT2019);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(199.99);
    }

    @Override
    public int getStartNumber(){
        return 9753;
    }

    @Override
    public String getPrefix() {
        return "";
    }
}
