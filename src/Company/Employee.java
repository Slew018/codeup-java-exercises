package Company;

//create an abstract class using the 'abstract' keyword
//abstract classes cannot be instantiated
// create a subclass from the abstract and then instantiate the subclass
//instantiation - to create an instance (an object) of that class
abstract class Employee {
    //define properties
    private String salary;
    public String nameOfEmployee;
    public String department;

    public String doWork(){
        return "I am working";
    };
}
