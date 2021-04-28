package Warmup;

public class Solution {
    public static void main(String[] args){
        Parent parent1 = new Parent();
        parent1.parentPrint();

        Child subclass1 = new Child();
        subclass1.subclassPrint();
        subclass1.parentPrint();
    }
}
