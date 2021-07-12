package grades;

import java.util.HashMap;

public class GradesApplication {

    HashMap<String, String> usernames = new HashMap<>();

    public static void main(String[] args) {

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
    }
}

