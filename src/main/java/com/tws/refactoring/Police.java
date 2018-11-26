package com.tws.refactoring;

public class Police {
    final static int validAgeForDriving = 18;
    public boolean checkDriver(Driver driver) {
        return driver.getAge() >= validAgeForDriving;
    }
}
