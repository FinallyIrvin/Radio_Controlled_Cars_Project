package com.rccars.controller;

import com.rccars.model.CarInterface;

public class PrepSale {

    public void prepareForSale(CarInterface car) {
        Registration.allocatingCarSerialNumber();
        Documentation.printBrochure();
        car.washShell();
        car.assembleAndTestRide();
    }
}
