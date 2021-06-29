import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String[] array = fullName.split(" ");
        System.out.println(epsilon(fullName));
        System.out.println(epsilon(array[0], array[1]));
    }

    public static String epsilon(String fullName) {
        return "Hello " + fullName;
    }

    public static String epsilon(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }



}

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
