package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> usernames = new HashMap<>();
//    usernames.put()
    public static void main(String[] args) {
    }

    public static void application() {
        Scanner sc = new Scanner(System.in);


        Student Demo = new Student("Noobgamer69420");
        Demo.addGrade(95);
        Demo.addGrade(65);
        Demo.addGrade(80);

        Student Sean = new Student("Qetamine");
        Sean.addGrade(100);
        Sean.addGrade(100);
        Sean.addGrade(100);

        Student Wagner = new Student("TellMeImPretty");
        Wagner.addGrade(50);
        Wagner.addGrade(55);
        Wagner.addGrade(45);

        Student Richard = new Student("SunsIn4");
        Richard.addGrade(90);
        Richard.addGrade(95);
        Richard.addGrade(100);


//        System.out.println("Here are the GitHub usernames of our students:\n"
//                + .keySet());
        System.out.println("What student would you like to see more information on?\n");
        String other = sc.next();

        switch (other) {
            case "Demo":
//                System.out.println(
//                        "Name: " + other + "- GitHub Username: " + Student.get("Demo") + "\n" +
//                                "Current Average: " + Demo.getGradeAverage());
                restart();
            case "Wagner":
//                System.out.println(
//                        "Name: " + other + "- GitHub Username: " + Student.get("Wagner") + "\n" +
//                                "Current Average: " + Wagner.getGradeAverage());
                restart();
            case "Sean":
//                System.out.println(
//                        "Name: " + other + "- GitHub Username: " + students.get("Sean") + "\n" +
//                                "Current Average: " +Sean.getGradeAverage());
                restart();
            case "Richard":
//                System.out.println(
//                        "Name: " + other + "- GitHub Username: " + students.get("Richard") + "\n" +
//                                "Current Average: " + Richard.getGradeAverage());
                restart();
            default:
                System.out.printf("Sorry, no student found with the GitHub username of %s.", other);
                throw new IllegalStateException("Unexpected value: " + other);
        }
        }

        public static boolean cancel () {
            System.out.println("Then get out of here");
            return false;
        }
        public static void restart () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Would you like to see another student?\n");
            String bigBrother = sc.next();
            if (bigBrother.equalsIgnoreCase("y")) {
                application();
            } else {
                cancel();
            }

        }
    }

