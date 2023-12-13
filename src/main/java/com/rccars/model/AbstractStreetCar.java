package com.rccars.model;

import java.math.BigDecimal;

public abstract class AbstractStreetCar extends AbstractCar {

    public AbstractStreetCar(ShellColors color, BodyShells shells, ModelNumber modelNumber, String frame){
        super(color, shells, modelNumber, frame);
    }

    @Override
    public String getWheelType() {
        return "NORMAL";
    }

    @Override
    public BigDecimal getOptionAmount() {
        return BigDecimal.valueOf(0.00);
    }

    @Override
    public String getOptionName(){
        return "";
    }


}
