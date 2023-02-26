package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void eatMeatReturnPredator() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void getFamilyReturnFeline() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    public void getKittensWithoutArgument() {
        Feline feline = new Feline();
        int expectedCountKitten = 1;
        assertEquals(expectedCountKitten, feline.getKittens());
    }

    @Test
    public void getKittensWithArgument() {
        Feline feline = new Feline();
        int countKittens = 3;
        int expectedCountKitten = 3;
        assertEquals(expectedCountKitten, feline.getKittens(countKittens));
    }

}
