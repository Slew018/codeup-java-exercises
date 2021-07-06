package Company;

public class Manager extends Employee {
    public static void main(String[] args){

        Manager bob = new Manager();
        bob.nameOfEmployee = "Bob";
        System.out.println(bob.doWork());
    }

}
