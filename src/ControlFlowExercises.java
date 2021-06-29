import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

//        MINI EXERCISE
// TODO: create three unique usernames (user1, user2, user3).
//  create a fourth user and set it equal to user input. (ask
//  the user to enter a username). if the username has already
//  been used by user1, user2, or user3, print "sorry this
//  username already exists.


//TODO: refactor your code from the previous mini exercise into a switch statement


//TODO: using previous mini exercise, allow the user to input a new username several times until a unique username is entered.
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerical Grade: ");
        int number = sc.nextInt();

//        if (number % 5 == 0 && number % 3 ==0) {
//            System.out.println("FizzBuzz");
//        } else if (number % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (number % 5 == 0) {
//            System.out.println("Buzz");
//        } else
//            System.out.println(number);
//    }

//        for (int x = 5; x <=15; x++){
//            System.out.println(x);
//    }
//
//            for (int n = 2; n < 1_000_000; n *= 2) {
//                System.out.println(n);
//    }

//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int y = 1; y <= number; y++) {
//            System.out.println(y + "       | " + y*y + "         | " + y*y*y);
//        }



            if (number >= 88){
                System.out.println("You got an A!");
            } else if (number >= 80){
                System.out.println("You got an B!");
            } else if (number >= 67){
                System.out.println("You got an C!");
            } else if (number >= 60){
                System.out.println("You got an D!");
            } else
                System.out.println("You got an F!");
            }





}


