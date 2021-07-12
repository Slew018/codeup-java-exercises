import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        int number = 10;
        User name = new User("Sean", "Lewis", true);
        name.getFirstName();
        name.setFirstName("Bianca");
        ArrayList <User> tomato = new ArrayList<>();
        //Add elements first
        upper(tomato);
    }
    public static int sum (int num1, int num2) {
        return num1 + num2;
    }
    public static int sqr (int num1){
        return num1 * num1;
    }
    public static double dbl (double num1, double num2){
        return num1 + num2;
    }
//    public static ArrayList
    public static double average(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return(double) sum / arr.length;
    }
    public static ArrayList <User> upper(ArrayList <User> users){
        ArrayList <User> tomato = new ArrayList<>();
        for (User user: users) {
            String firstLetter = user.getFirstName().substring(0,1).toUpperCase();
            String excludeFirstLetter = user.getFirstName().substring(1).toLowerCase();
            user.setFirstName(firstLetter + excludeFirstLetter);

            String lastNameFirstLetter = user.getLastName().substring(0,1).toUpperCase();
            String lastNameExcludeFirstLetter = user.getLastName().substring(1).toLowerCase();
            user.setLastName(lastNameFirstLetter + lastNameExcludeFirstLetter);

            tomato.add(user);
        }
        return tomato;
    }
}
