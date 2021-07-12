import java.util.ArrayList;

public class CollectionIntro {
    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>();

        //Add First Element
        stringArr.add("Sean");
        System.out.printf("Current ArrayList size: %s", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

        //Add Second Element
        stringArr.add("Zoe");
        System.out.printf("Current ArrayList size: %s", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

        //Remove Second Element
        stringArr.remove(1);
        System.out.println(stringArr.hashCode());
    }
}
