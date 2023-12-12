package com.rccars.model;

import java.math.BigDecimal;

public class DuneBuggyCar extends AbstractOffRoadCar{

    public DuneBuggyCar() {
        super(ShellColors.BROWN, BodyShells.DUNEBUGGY, ModelNumber.ORDB3400);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(189.99);
    }

    @Override
    public int getStartNumber() {
        return 7446;
    }

    @Override
    public String getPrefix() {
        return "885532";
    }

    @Override
    public String toString() {
        return "DuneBuggy";
    }

}
