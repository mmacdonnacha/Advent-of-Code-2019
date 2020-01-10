package com.adventofcode.day02;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void part1FirstTest()
    {
        int[] input = {1,0,0,0,99};
        int[] expected = {2,0,0,0,99};
        assertArrayEquals(expected, new App().part1(input));
    }

    @Test
    public void part1SecondTest()
    {
        int[] input = {2,3,0,3,99}; 
        int[] expected = {2,3,0,6,99};
        assertArrayEquals(expected, new App().part1(input));
    }

    @Test
    public void part1ThirdTest()
    {
        int[] input = {2,4,4,5,99,0};
        int[] expected = {2,4,4,5,99,9801};
        assertArrayEquals(expected, new App().part1(input));
    }

    @Test
    public void part1FourthTest()
    {
        int[] input = {1,1,1,4,99,5,6,0,99};
        int[] expected = {30,1,1,4,2,5,6,0,99};
        assertArrayEquals(expected, new App().part1(input));
    }

    @Test
    public void part1FifthTest() 
    {
        int[] input    = {   1,9,10, 3,  2,3,11,0,  99,  30,40,50};
        int[] expected = {3500,9,10,70,  2,3,11,0,  99,  30,40,50};
        assertArrayEquals(expected, new App().part1(input));

    }
}
