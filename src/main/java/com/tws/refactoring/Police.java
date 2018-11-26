package com.tws.refactoring;

public class Police {
    private final static int validAgeForDriving = 18;

    public boolean checkDriver(Driver driver) {
        return driver.getAge() >= validAgeForDriving;
    }
}
