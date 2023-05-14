import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//           YOU CAN JUST UNCOMMENT A METHOD YOU WANT TO TEST, OR JUST TEST IT BY YOURSELF :)
//
//        printHalfPyramid(5);
//        printPyramid(5);
//        characterAtGivenIndex("Hello world!",2);
//        characterAtGivenIndex("Hello world!",2,4);
//        fizzBuzz(35);
//
//        boolean result = areTheStringsEqual("Hello world!!","hello world!");
//        System.out.println(result);
//
//        concatenateTwoStrings("Hello","World!");
//
//        boolean b = sequenceOfChars("Hello the world!");
//        System.out.println(b);
//
//        Scanner scanner = new Scanner(System.in);
//        boolean b = comparingGivenStrings(scanner);
//        System.out.println(b);
//
//        char[] charArr = {'h','e','l','l','o'};
//        String s = characterArrayToString(charArr);
//        System.out.println(s);
//
//        Scanner scanner = new Scanner(System.in);
//        String s = wordWithMostSameCharacters(scanner);
//        System.out.println(s);



    }

    //printing half of pyramid with "*" signs
    public static void printHalfPyramid(int levels) {

        for (int i = 0; i < levels; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    //printing pyramid with "*" signs
    public static void printPyramid(int levels) {

        for (int i = 0; i < levels; i++) {
            for (int j = levels-i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    //printing character at given index of the String
    public static void characterAtGivenIndex(String string, int index) {

        System.out.println("The character at position " + index + " is: " + string.charAt(index));
    }

    //printing 2 characters at given indexes of the String
    public static void characterAtGivenIndex(String string, int index, int index2) {

        System.out.println("The character at position " + index + " is: " + string.charAt(index) + " and at the position " + index2 + "is: " + string.charAt(index2));
    }

    //are the String equals?
    public static boolean areTheStringsEqual(String s, String s2) {

        return s.equalsIgnoreCase(s2);
    }

    //FizzBuzz!!!
    public static void fizzBuzz(int number) {

        if (number % 7 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz!!");
        } else if (number % 7 == 0) {
            System.out.println("Buzz!");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("Given number is neither divided by 5 and 7");
        }
    }

    //concatenating two String
    public static void concatenateTwoStrings(String s1, String s2) {

        System.out.println(s1.concat(s2));
    }

    //does the String has specified sequence of chars?
    public static boolean sequenceOfChars(String string) {

        String str = "the";

        return string.contains(str);
    }

    //comparing if two given String are equals
    public static boolean comparingGivenStrings(Scanner scanner) {

        System.out.println("Enter the first sentence to compare");
        String s1 = scanner.nextLine();
        System.out.println("Now enter the second sentence to compare");
        String s2 = scanner.nextLine();

        scanner.close();
        return (s1.equals(s2));
    }

    //converting an array of characters to String
    public static String characterArrayToString(char[] charArray) {

        String s = "";

        for (char c : charArray) {
            s = s.concat(String.valueOf(c));
        }
        return s;
    }

    //searching for the word from given sentence, for that one with most frequent given letter
    public static String wordWithMostSameCharacters(Scanner scanner) {

        String result = "";

        System.out.println("Please provide the letter whose most frequent occurrence in the word we will be searching for: ");
        char requested = scanner.nextLine().charAt(0);
        System.out.println("Now enter the tested sentence: ");
        String tested = scanner.nextLine();

        String[] splittedTest = tested.split(" ");
        int maxOccurrence = 0;
        for (int i = 0; i < splittedTest.length; i++) {
            int occurrence = 0;
            for (int j = 0; j < splittedTest[i].length(); j++) {
                if (splittedTest[i].charAt(j) == requested) {
                    occurrence++;
                }
            }
                if (occurrence > maxOccurrence) {
                    maxOccurrence = occurrence;
                    result = splittedTest[i];
                }
            }
        return result;
    }
}