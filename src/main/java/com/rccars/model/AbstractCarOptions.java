package com.rccars.model;

import java.math.BigDecimal;

public abstract class AbstractCarOptions extends AbstractCar {

    protected AbstractCar customCar;

    public AbstractCarOptions(AbstractCar car) {
        super(car.getShellColor(), car.getBodyShell(), car.getModelNumber());
        customCar = car;
    }

    public abstract String getOptionName();
    public abstract BigDecimal getOptionAmount();

    public abstract String getWheelType();
}
