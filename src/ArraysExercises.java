import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        String[] persons = {"Richard", "Mitch", "Corey"};
        String Person = "Sheen";
        System.out.println(Arrays.toString(addPerson(Person, persons)));
    }

    public static String[] addPerson(String Person, String[] persons) {
        persons = Arrays.copyOf(persons, persons.length + 1);
        persons[persons.length -1] = Person;
        return persons;
    }
}
