package com.rccars.model;

import java.math.BigDecimal;

public class CrawlerCar extends  AbstractOffRoadCar {

    public CrawlerCar() {
        super(ShellColors.GREEN, BodyShells.CRAWLER, ModelNumber.ORCR4600, "CAR");
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(149.99);

    }
    @Override
    public int getStartNumber() {
        return 3398;
    }
    @Override
    public String getPrefix() {
        return "756643";
    }
    @Override
    public String toString() {
        return "CrawlerCar";
    }


}
