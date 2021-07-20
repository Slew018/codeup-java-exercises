import java.util.Arrays;

public class questions {

    //    1. Create a public static method called **ascending** that takes in an `array` and that returns an `array`. Return the
//   `array` that was made in ascending order.
//

    public static int[] ascending(int[] nums){
        Arrays.sort(nums);
        return nums;
    }
//
//    2. Create a public static method called **countWords** that takes in a `string` and returns how many words are inside that `string`

    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
                while (str.charAt(i) != ' ' && i < str.length() - 1) {
                    i++;
                }
            }
        }
        return count;
    }

    public static int Calculator(int num, int num2, char operator){
        if(operator == '+'){
        }else if(operator == '-'){
            return num - num2;
        }else if(operator == '/'){
            return num / num2;
        }else if(operator == '%'){
            return num % num2;
        }else if(operator == '*'){
            return num * num2;
        }else{
            return num;
        }
        return num;
    }

    public static void cardHidden(String card){
        String hiddenCard = "";
        for (int i = 0; i < card.length(); i++) {
            if(i >= 4){
                hiddenCard += "*";
            }
        }
        hiddenCard += card.substring((card.length() - 4));
        System.out.println(hiddenCard);
    }

    public static String reverseOdd(String str){
        String[] words = str.split("");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() % 2 == 0){
                result += new StringBuilder(words[i]).reverse() + " ";
            }
        }
        return result.trim();
    }


}
