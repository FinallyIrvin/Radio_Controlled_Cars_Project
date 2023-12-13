package com.rccars.model;
import java.math.BigDecimal;

public abstract class AbstractOffRoadCar extends AbstractCar {
    public AbstractOffRoadCar(ShellColors color, BodyShells shell, ModelNumber modelNumber, String frame){

        super(color, shell, modelNumber, frame);

    } @Override
    public String getWheelType() { return  "WIDE";}

    @Override
    public BigDecimal getOptionAmount() { return BigDecimal.valueOf(0.00);}

    @Override
    public String getOptionName() { return ""; }

}

