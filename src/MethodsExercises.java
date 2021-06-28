import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Who is your favorite basketball team? ");
        String basketballTeam = sc.next();
        System.out.println(epsilon(basketballTeam));
        System.out.println(iota(epsilon(basketballTeam)));
    }


    public static String epsilon(String basketballTeam) {
        return basketballTeam + " is the best darn rootin' tootin' team on this flat earth!";
    }

    public static String iota(String basketballTeam) {
        return "Length = " + basketballTeam.length();
    }
}
//    TODO: create a new method that accepts the name of a basketball
//     team (ex: the spurs) and returns a String that says
//     "[basketballTeam] is the best team.". Invoke that method within
//     your main method (remember to pass in the name of the basketball
//     team). print out the result of the new method.