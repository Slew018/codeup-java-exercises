import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        String[] VayK = {"London, England", "Nice, France", "Zermatt, Switzerland"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a vacation destination");
        String name = sc.nextLine();
    }
    public String[] increaseArray(String[] VayK, int increase) {
        int i = VayK.length;
        int n = ++i;
        String[] newArray = new String[n];
        for(int cnt=0; cnt < VayK.length; cnt++) {
            newArray[cnt] = VayK[cnt];
        }
        return newArray;
    }
}

// TODO: Create a method which will return a String[] containing the user's favorite vacation spots
//  -> Each time the user inputs a new vacation spot, reset the array to be one element longer in length
//  -> Then, add the old elements
//  -> Finally, add the new element
//  -> When the user decides to finish inputting spots, return the String[].
//  -> sout out the returned value!