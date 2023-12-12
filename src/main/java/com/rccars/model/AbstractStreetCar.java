package com.rccars.model;

import java.math.BigDecimal;

public abstract class AbstractStreetCar extends AbstractCar {

    public AbstractStreetCar(ShellColors color, BodyShells shells, ModelNumber modelNumber){
        super(color, shells, modelNumber);
    }

    @Override
    public String getWheelType() {
        return "Normal";
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
