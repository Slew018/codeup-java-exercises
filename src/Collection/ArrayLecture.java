package Collection;

import java.util.Arrays;

public class ArrayLecture {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getIntArray()));  //[1, 2, 3]
    }

    public static int[] getIntArray() {
        int[] intArray = new int [] {1, 2, 3};
        return intArray;
    }

    public static int[] getIntArray(int length){
        int[] intArray = new int[length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }
        return intArray;
    }
}
