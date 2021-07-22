public class Person {
    public String name;


    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Sean");
        person.sayHello();
    }

    public Person() {
    }

    public String getName() {
        return this.name;
//TODO: return the person's name
    }

    public void setName(String name) {
        this.name = name;
//TODO: change the name property to the passed value
    }

    public void sayHello() {
        System.out.println("Hello " + this.name + "!");
//TODO: print a message to the console using the person's name
    }


}
