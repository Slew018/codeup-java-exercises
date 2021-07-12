package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    private int number;
    private double dbl;

    public Input() {
        this.scanner = new Scanner(System.in);
        this.number = number;
        this.dbl = dbl;
    }

    public int getInt() {
        System.out.println("Enter a integer");
        return this.scanner.nextInt();
    }


    public int getInt(int min, int max) {
        int Num;
        do {
            System.out.printf("enter a integer between %d and %d%n", min, max);
            Num = scanner.nextInt();
        } while (Num < min || Num > max);
        return Num;
    }

    public String getString() {
        String message = "hello";
        return message;
    }

    public boolean yesNo() {
        System.out.println("Y or Yes, anything else no: ");
        String answer = scanner.next().toLowerCase();

        if (answer.equals("y") || answer.equals("yes")) {
            return true;
        }
        return false;
    }

    public double getDbl(double min, double max) {
        this.dbl = getDbl();

        if (dbl < min) {
            System.out.println("Pick a number between " + min + " and " + max);
            getDbl(min, max);
        } else if (dbl > max) {
            System.out.println("Pick a number between " + min + " and " + max);
            getDbl(min, max);
        }
        return this.dbl;
    }

    public double getDbl() {
        double dbl = scanner.nextDouble();
        return dbl;
    }
}
