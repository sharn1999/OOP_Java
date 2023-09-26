package Task4;

public class Student {
    private String name;
    private int id;
    private int yearOfStudy;
    private int grades;

    Student(String name, int id, int yearOfStudy, int grades){
        this.name = name;
        this.id = id;
        this.yearOfStudy = yearOfStudy;
        this.grades = grades;
    }

    String getName(){
        return this.name;
    }
    int getId(){
        return this.id;
    }

    int getYear(){
        return this.yearOfStudy;
    }
    int getGrade(){
        return this.grades;
    }

    void incYear(){
        this.yearOfStudy++;
    }

}