package OOP;

public class OberonCohort {
    private String name;
    private int age;
    private String height;
    private String languagepreferred;
    private String developer;
    private String gpa;

    public OberonCohort(String name, int age, String height, String nationality){
        this.name = name;
        this.age = age;
        this.height = height;
        this.languagepreferred = languagepreferred;
        this.developer = developer;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getLanguagepreferred() {
        return languagepreferred;
    }

    public void setLanguagepreferred(String languagepreferred) {
        this.languagepreferred = languagepreferred;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }
}
