package com.rccars.model;

import java.math.BigDecimal;

public class ClassicCar extends AbstractStreetCar{

    public ClassicCar() {
        super(ShellColors.BLACK, BodyShells.CLASSIC, ModelNumber.CLS4019);
    }

    @Override
    public String getPrefix() {
        return "315790";
    }

    @Override
    public int getStartNumber(){
        return 7326;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(179.99);
    }

    @Override
    public String toString() {
        return "Classic Car";
    }
}
