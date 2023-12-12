package com.rccars.model;
import java.math.BigDecimal;

public abstract class AbstractOffRoadCar extends AbstractCar {
    public AbstractOffRoadCar(ShellColors color, BodyShells shell, ModelNumber modelNumber){

        super(color, shell, modelNumber);

    } @Override
    public String getWheelType() { return  "Wide";}

    @Override
    public BigDecimal getOptionAmount() { return BigDecimal.valueOf(0.00);}

    @Override
    public String getOptionName() { return ""; }

}

