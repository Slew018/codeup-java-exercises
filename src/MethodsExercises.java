import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        getInteger(1, 10);
//        factorial();
        diceRoll();
//        System.out.println(add(4, 5));
//        System.out.println(sub(4, 4));
//        System.out.println(multi(5, 5));
//        System.out.println(mod(10, 4));
//        System.out.println(div(10, 5));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int multi(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }

    public static double mod(double x, double y) {
        return x % y;
    }

    public static int getInteger(int min, int max) {
        int userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        userInput = scanner.nextInt();
        if (userInput > max || userInput < min) {
            System.out.println("Enter a valid number");
            System.out.println("Try again? (yes or no)");
            String userChoice = scanner.next();
            if(userChoice.equals("yes")){
                getInteger(min, max);
            }else {
                System.out.println("Goodbye");
            }
        } else if (userInput < max || userInput > min){
            return userInput;
        }
        return userInput;
    }

    public static void factorial () {
        int userInput = getInteger(1, 10);
        int resolved = 1;
        for (int x = 1; x <= userInput; x++){
            resolved = resolved * x;
            System.out.println(resolved);
        }
    }

    public static void diceRoll () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Roll the dice");
        int numberOfSides = sc.nextInt();
        int dice1 = 1 + (int)(Math.random() * ((numberOfSides - 1) + 1));
        int dice2 = 1 + (int)(Math.random() * ((numberOfSides - 1) + 1));
        System.out.println("Die 1 = " + dice1);
        System.out.println("Die 2 = " + dice2);
        System.out.println("Try again? (yes or no)");
        String userChoice = sc.next();
        if(userChoice.equals("yes")){
            diceRoll();
        }else {
            System.out.println("Goodbye");
        }
    }

}



//}

//    TODO: invoke a method that accepts (and returns) the following:
//        - accepts: your first name and your last name. returns: A
//        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
//        first and last)";


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Who is your favorite basketball team? ");
//        String basketballTeam = sc.next();
//        System.out.println(epsilon(basketballTeam));
//        System.out.println(iota(epsilon(basketballTeam)));
//    }
//
//
//    public static String epsilon(String basketballTeam) {
//        return basketballTeam + " is the best darn rootin' tootin' team on this flat earth!";
//    }
//
//    public static String iota(String basketballTeam) {
//        return "Length = " + basketballTeam.length();
//    }
