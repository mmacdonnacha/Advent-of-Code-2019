package com.adventofcode.day01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void part1MassOf12(){
        assertEquals(2, new App().part1(12));
    }

    @Test
    public void part1MassOf14(){
        assertEquals(2, new App().part1(14));
    }

    @Test
    public void part1MassOf1969(){
        assertEquals(654, new App().part1(1969));
    }

    @Test
    public void part1MassOf100756(){
        assertEquals(33583, new App().part1(100756));
    }

    @Test
    public void part2MassOf14(){
        assertEquals(2, new App().part2(14));
    }

    @Test
    public void part2MassOf1969(){
        assertEquals(966, new App().part2(1969));
    }

    @Test
    public void part2MassOf100756(){
        assertEquals(50346, new App().part2(100756));
    }

}
