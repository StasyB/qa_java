package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private Feline feline;
    private final String sex;
    private final boolean hasMane;

    public LionParameterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getDataForm() {
        return new Object[][] {
                {"Самка", false},
                {"Самец", true},
        };
    }

    @Test
    public void doesHaveManeMethodTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean hasManeActual = lion.doesHaveMane();
        assertEquals(hasMane, hasManeActual);
    }






}
