package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList <Integer> grade = new ArrayList<>();

    public Student (String name){
        this.name = name;
        this.grade = new ArrayList<>();
    }

    public static void main (String[] args){
        Student student = new Student("Bucky");

        student.addGrade(100);
        student.addGrade(85);
        student.addGrade(90);
        System.out.println(student.grade);

        double average = student.getGradeAverage();
        System.out.println(average);
    }

    public String getName(){
        return name;
    }

    public void addGrade (int grade){
        this.grade.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (double grade : this.grade){
            sum += grade;
        }
        return sum /grade.size();
    }
}
