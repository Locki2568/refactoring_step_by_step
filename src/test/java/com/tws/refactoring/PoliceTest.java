package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {
    @Test
    void should_check_driver(){
        assertTrue(new Police().checkDriver(new Driver(18)));
        assertFalse(new Police().checkDriver(new Driver(17)));
    }
}