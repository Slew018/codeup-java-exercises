package Warmup;

public class Solution {
    public static void main(String[] args){
        Parent parent1 = new Parent();
        parent1.parentPrint();

        Subclass subclass1 = new Subclass();
        subclass1.subclassPrint();
        subclass1.parentPrint();
    }
}
