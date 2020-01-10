package com.adventofcode.day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        String fileName = "day02-input";
        int[] opCode;
        App day = new App();

        String line = "";

        // Solution part 1
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("error file not found");
        }

        opCode = Arrays.stream(line.split(","))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        
        opCode[1] = 12;
        opCode[2] = 2;
        System.out.println("Part 1: " + Arrays.toString(day.part1(opCode)));
        
        
        // Soultion part 2
        opCode = Arrays.stream(line.split(","))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        System.out.println("Part 2: ");
        day.part2(opCode);
    }

    public int[] part1(int[] intCode){

        int pos, var1, var2;
        int[] result = new int[intCode.length];
        int[] opCode = intCode;

        for (int i=0; i<intCode.length; i+=4){
            
            if(opCode[i] == 1){
                //addtion
                var1 = opCode[i+1];
                var2 = opCode[i+2];
                pos = opCode[i+3];
                opCode[pos] = opCode[var1] + opCode[var2];
            }else if(opCode[i] == 2) {
                //multiplication
                var1 = opCode[i+1];
                var2 = opCode[i+2];
                pos = opCode[i+3];
                opCode[pos] = opCode[var1] * opCode[var2];
            }else if (opCode[i] == 99){
                result = opCode;
            }else{
                break;
            }
        }

        return result;
    }

    public void part2(int[] intCode) {
        //19690720
        int[] resetIntCode = intCode;
        //System.out.println(Arrays.toString(intCode));
        for (int i=0; i<=99; i++){
            for (int j=0; j<=99; j++) {
                int[] opCode = Arrays.copyOf(resetIntCode, intCode.length);
                opCode[1] = i;
                opCode[2] = j;

                //System.out.println("noun: " + i + "  +++  verb: " + j);

                //System.out.println(part1(resetIntCode)[0]);
                try{
                    //int[] arr = part1(opCode);
                    //System.out.println(arr[0]);
                    
                    if(part1(opCode)[0] == 19690720){
                        int noun = i;
                        int verb = j;
                        System.out.println("noun: " + noun + "\nverb: " + verb);
                        System.out.println("Answer: 100 * noun + verb = " + (100*noun+verb));
                        break;
                    }
                    
                }catch(IndexOutOfBoundsException ex) {
                   System.out.println("Index out of bounds exception === " + i + ", " + j);
                }
            }
        }

    }

}
