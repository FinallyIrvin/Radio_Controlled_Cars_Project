package com.rccars.model;

import java.math.BigDecimal;

public abstract class AbstractCar implements PriceInterface, CarInterface {

    private ShellColors color;
    private BodyShells shell;
    private ModelNumber modelNumber;
    private String serial;

    public AbstractCar(ShellColors color, BodyShells shell, ModelNumber modelNumber) {
        this.color = color;
        this.shell = shell;
        this.modelNumber = modelNumber;
    }

    public abstract String getWheelType();
    public abstract int getPrefix();
    public abstract int getStartNumber();
    public abstract BigDecimal getPrice();
    public abstract String getOptionName();
    public abstract BigDecimal getOptionAmount();

    public ShellColors getShellColor() {
        return color;
    }

    public BodyShells getBodyShell() {
        return shell;
    }

    public ModelNumber getModelNumber() {
        return modelNumber;
    }

    public void setSerialNumber(int serial) {
        this.serial = serial;
    }

    public int getSerialNumber() {
        return serial;
    }


    @Override
    public String washShell() {
        String washMessage = "We wash our car shells" +
                " with non-abrasive detergent.";
        String rinseMessage = "We rinse and dry our car" +
                " shells for a sparkling shine.";
        return washMessage + "\n" + rinseMessage;
    }

    public String assembleAndTestRide() {
        String assemble = "Our radio-controlled cars " +
                "undergo meticulous assembly by trained " +
                "technicians.";
        String ride = "After assembly, each radio-controlled" +
                " car undergoes rigorous testing to ensure all " +
                "components are functioning correctly.";
        return assemble + "\n" + ride;
    }



}
