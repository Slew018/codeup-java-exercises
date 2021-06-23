import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between -2,147,483,648 and 2,147,483,647?");
        int userInput = sc.nextInt();
        System.out.printf("Your number was: %d\n", userInput);

        Scanner scanzy = new Scanner(System.in);
        System.out.println("Enter 3 words only: ");
        String firstWord = scanzy.next();
        String secondWord = scanzy.next();
        String thirdWord = scanzy.next();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
//
//        System.out.println("First Word: " + firstWord +"\n" + "Second Word: " + secondWord
//                +"\n" + "Third Word: " + thirdWord +"\n");
//
//        System.out.printf("First Word: %s Second Word: %s Third Word %s",
//                firstWord, secondWord, thirdWord);

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the dimensions of your room: ");
        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());

        System.out.printf("Perimeter: %s", (2 * length) + (2 * width));
        System.out.printf("area: %s", length * width);


    }
}


/* TODO: use the scanner to take in the name of the month you were born and print it back out
    - remember to first prompt the user for the input
 */