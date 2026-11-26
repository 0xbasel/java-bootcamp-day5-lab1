import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Write a Java program to print sum, multiply, subtract, divide and remainder of two numbers.
        System.out.print("Please enter the first number: ");
        int firstNum = in.nextInt();

        System.out.print("Please enter the second number: ");
        int secondNum = in.nextInt();

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
        System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
        System.out.println(firstNum + " mod " + secondNum + " = " + (firstNum % secondNum));

        // 2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        System.out.print("Please enter a number: ");
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // 3. Write a Java program to print the area and perimeter of a circle.
        System.out.print("Please enter the radius: ");
        double radius = in.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        // 4. Java program to find out the average of a set of integers.
        System.out.print("Enter the count of numbers: ");
        int countOfNumbers = in.nextInt();
        double sum = 0;

        for (int i = 0; i < countOfNumbers; i++) {
            System.out.print("Enter an integer: ");
            double numToSum = in.nextInt();
            sum += numToSum;
        }

        System.out.println("The average is: " +  (sum / countOfNumbers));

        // 5. Write a Java program that accepts three integers as input, adds the first two integers together, and then determines whether the sum is equal to the third integer.
        System.out.print("Please enter the first integer: ");
        int num1 = in.nextInt();

        System.out.print("Please enter the second integer: ");
        int num2 = in.nextInt();

        System.out.print("Please enter the third integer: ");
        int num3 = in.nextInt();

        boolean result = num1 + num2 == num3;
        System.out.println("The result is: " + result);

        // 6. Write a Java program to reverse a word.
        System.out.print("Input a word: ");
        String word = in.nextLine();

        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }

        System.out.println("Reverse word: " + reversedWord);

        // 7. Java program to check whether the given number is even or odd
        System.out.print("Enter a number: ");
        int evenOrOddNum = in.nextInt();

        if (evenOrOddNum % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

        // 8. Java program to convert the temperature in Centigrade to Fahrenheit
        System.out.print("Enter temperature in Centigrade: ");
        double centigrade = in.nextDouble();
        double fahrenheit = (centigrade * ((double) 9 / 5)) + 32;

        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);

        // 9. Write a Java program that takes a string and a number from the user, then prints the character in the given index.
        System.out.print("Input a string: ");
        String str = in.nextLine();

        System.out.print("Input a number: ");
        int index = in.nextInt();

        if (index < 0 || index >= str.length()) {
            System.out.println("Please enter an index from: 0 to " + (str.length() - 1));
        } else {
            System.out.println(str.charAt(index));
        }

        // 10. Write a Java program to print the area and perimeter of a rectangle
        System.out.print("Please enter the width: ");
        double width = in.nextDouble();

        System.out.print("Please enter the height: ");
        double height = in.nextDouble();

        System.out.println("Area is " + width + " * " + height + " = " + (width * height));
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + (2 * (width + height)));

        // 11. Write a Java program to compare two numbers
        System.out.print("Please enter first integer: ");
        int firstInteger = in.nextInt();

        System.out.print("Please enter second integer: ");
        int secondInteger = in.nextInt();

        if (firstInteger == secondInteger) {
            System.out.println(firstInteger + " == " + secondInteger);
        }

        if (firstInteger != secondInteger) {
            System.out.println(firstInteger + " != " + secondInteger);
        }

        if (firstInteger < secondInteger) {
            System.out.println(firstInteger + " < " + secondInteger);
        } else {
            System.out.println(firstInteger + " >= " + secondInteger);
        }

        if (firstInteger <= secondInteger) {
            System.out.println(firstInteger + " <= " + secondInteger);
        } else {
            System.out.println(firstInteger + " > " + secondInteger);
        }

        // 12. Write a Java program to convert seconds to hours, minutes and seconds.
        System.out.print("Please enter seconds: ");
        int seconds = in.nextInt();

        int minutes = seconds / 60;
        int hours = minutes / 60;

        int minutesLeft = minutes % 60;
        int secondsLeft = seconds % 60;

        System.out.println(hours + ":" + minutesLeft + ":" + secondsLeft);

        // 13. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise
        System.out.print("Please enter first number: ");
        int firstNumber = in.nextInt();

        System.out.print("Please enter second number: ");
        int secondNumber = in.nextInt();

        System.out.print("Please enter third number: ");
        int thirdNumber = in.nextInt();

        System.out.print("Please enter fourth number: ");
        int fourthNumber = in.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == fourthNumber) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }

        // 14. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
        System.out.print("Please enter a number: ");
        int numToCheck = in.nextInt();

        if (numToCheck > 0) {
            System.out.println("Number is positive");
        } else if (numToCheck < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // 15. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered (End loop use -1, Don't count -1)
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (true) {
            System.out.print("Please enter a number: ");
            int userNum = in.nextInt();

            if (userNum == -1) {
                break;
            }

            if (userNum > 0) {
                positiveCount++;
            } else if (userNum < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println(positiveCount + " positive");
        System.out.println(negativeCount + " negative");
        System.out.println(zeroCount + " zero");

        // 16. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed
        System.out.print("Enter a number to reverse: ");
        int numberToReverse = in.nextInt();
        int numberReversed = 0;

        while (numberToReverse > 0) {
            int lastDigit = numberToReverse % 10;
            numberReversed = numberReversed * 10 + lastDigit;
            numberToReverse /= 10;
        }

        System.out.println(numberReversed);

        // 17. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        int number;
        do {
            System.out.print("Please enter a number or 0 to exit: ");
            number = in.nextInt();

            if (number > largestNumber) {
                largestNumber = number;
            }

            if (number < smallestNumber) {
                smallestNumber = number;
            }
        } while (number != 0);    // assuming 0 is the exit number, I know it shouldn't be

        System.out.println("Largest number is: " + largestNumber);
        System.out.println("Smallest number is: " + smallestNumber);

        // 18. Determine and print the number of times the character ‘a’ appears in the input entered by the user
        System.out.print("Enter a string: ");
        String input = in.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Numbers of a's: " + count);
    }
}
