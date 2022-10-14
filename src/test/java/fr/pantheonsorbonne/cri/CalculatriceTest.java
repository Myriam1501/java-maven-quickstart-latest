package fr.pantheonsorbonne.cri;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatriceTest {
    @Test
    public void testSimpleSum(){
        assertEquals(6, Calculatrice.getIntegerSumBetween(1,3));
    }
    @Test
    public void testSimpleSum2(){
        assertEquals(3, Calculatrice.getIntegerSumBetween(1,2));
    }
    @Test
    public void testIllegalArgument(){

        assertThrows(IllegalArgumentException.class, 
        () -> Calculatrice.getIntegerSumBetween(30, 10));
    }
    @Test
    public void testIllegalArgument2(){
        assertThrows(IllegalArgumentException.class, 
        () -> Calculatrice.getIntegerSumBetween(-1, 10));
        
    }
    @Test
    public void testSimpleEvenSum(){
        assertEquals(90, Calculatrice.getEvenIntegerSumBetween(10,20));
    }
}
