/*
Cole Lamothe
100711084
Tutorial #2
 */

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args){
        // Question #1
        /*
        Calculate the cube root of a number entered by user.
        •Find the sqrt of 9.
        •Logarithm(base 10)of 1000.
         */
        /*
        Scanner scan = new Scanner(System.in);
        double inputNumber;
        double output;

        System.out.println("Please enter a number to find the cube root");
        inputNumber = scan.nextDouble();

        output = Math.cbrt(inputNumber); // calculates the cube root
        // formats the output for the cube root
        DecimalFormat fmt = new DecimalFormat("0.###");
        System.out.println("The cube root is: " + fmt.format(output));

        System.out.println();
        System.out.println("The square root of 9: " + Math.sqrt(9));

        System.out.println();
        System.out.println("Log of 1000: " + Math.log10(1000));
        */

        // Question #2
        // Write a program to find the surface area and volume of a sphere with user input
        /*
        Scanner scan = new Scanner(System.in);
        double radius, surfaceArea, volume;

        System.out.println("Please enter the radius of a sphere: ");
        radius = scan.nextDouble();

        // uses the math library to calculate surface area and volume
        surfaceArea = 4*Math.PI*(radius*0.5);
        volume = (4/3f)*Math.PI*Math.pow(radius,3);

        DecimalFormat fmt = new DecimalFormat("0.###"); // sets 3 decimal places of accuracy

        System.out.println("surface area = " + fmt.format(surfaceArea));
        System.out.println("volume = " + fmt.format(volume));

         */

        // Question #3
        // generate 10 random integers with a random value below 30
        /*
        Random rand = new Random();

        int counter = 1;
        int randomNumber;

        while (counter <=10){
            randomNumber = rand.nextInt(30);
            System.out.println("Random number " + counter + ": " + randomNumber);
            counter++;
        }
        */


        // Question #4
        /*
        start with String str = "LETS LEARN JAVA";
        •Print the substring after the 4th character.
        •Print the length of the string.
        •Concatenate the string with the string ‘ WITH FUN’ and print the result.
        •Convert the string into lowercase.
        •Write a program to output the last 5 characters of ANY string
         */

        String str = "LETS LEARN JAVA";
        System.out.println("Characters four onwards: " + str.substring(3)); // prints all characters after index 3, the fourth character
        System.out.println("String length: " + str.length());
        System.out.println(str + " WITH FUN");
        System.out.println("All lowercase: " + str.toLowerCase()); // outputs a lowercase version of the string

        Scanner scan = new Scanner(System.in);
        String userInput;
        System.out.println("Enter a string: ");
        userInput = scan.nextLine();
        if (userInput.length()>=5) { // checks if the string is at least 5 characters long so we do not throw an error with the substring method
            System.out.println("Last five characters: " + userInput.substring(userInput.length() - 5)); // subtract 5 from the total length to get the index
        }
        else{
            System.out.println("String less than five characters: " + userInput);
        }




    }
}
