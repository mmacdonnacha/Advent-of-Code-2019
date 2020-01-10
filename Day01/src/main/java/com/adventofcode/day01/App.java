package com.adventofcode.day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class App 
{
    public static void main( String[] args )
    {
        String fileName = "day01-input";
        int fuelRequired;
        App day = new App();

        // Solution for part 1
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			fuelRequired = stream
                .mapToInt(num -> day.part1(Integer.parseInt(num)))
                .sum();
                    
                System.out.println("Part 1: " + fuelRequired);
		} catch (IOException e) {
			e.printStackTrace();
        }

        // Solution for part 2
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			fuelRequired = stream
                .mapToInt(num -> day.part2(Integer.parseInt(num)))
                .sum();
                    
                System.out.println("Part 2: " + fuelRequired);
		} catch (IOException e) {
			e.printStackTrace();
        }
    }

    public int part1 (int mass) {
        return (mass / 3) - 2;
    }

    public int part2(int mass){
        int sum = 0, fuelMass = 0;
        while(part1(mass) >= 0){
            fuelMass = part1(mass);
            sum += fuelMass;
            mass = fuelMass;
        }

        return sum;
    }
}
