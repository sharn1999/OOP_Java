package Task4;

import java.util.ArrayList;
import java.util.Scanner;

class GradeBook {
    private Course course;
    private ArrayList<Student> students = new ArrayList<Student>();

    public GradeBook(Course course){
        this.course = course;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }


    public void displayMessage() {
        System.out.println("Hello teacher!");
    }

    public double averageGrade(){
        int sum = 0;
        for(Student st : students){
            sum += st.getGrade();
        }
        return sum/students.size();
    }

    public int lowestGrade(){
        int min = students.get(0).getGrade();
        for(Student st : students){
            if(st.getGrade()<min){
                min = st.getGrade();
            }
        }
        return min;
    }

    public Student getLowestStudent(){
        Student temp = null;
        for(Student st : students){
            if(st.getGrade() == lowestGrade()){
                temp = st;
            }
        }
        return temp;
    }

    public int HigherGrade(){
        int max = students.get(0).getGrade();
        for(Student st : students){
            if(st.getGrade()>max){
                max = st.getGrade();
            }
        }
        return max;
    }

    public Student getHigherStudent(){
        Student temp = null;
        for(Student st : students){
            if(st.getGrade() == HigherGrade()){
                temp = st;
            }
        }
        return temp;
    }
    public void displayGradeReport() {
        System.out.println("Class average is " + averageGrade() + ". Lowest grade is " + lowestGrade() + " (" + getLowestStudent().getName() + ", id: " + getLowestStudent().getId() + ")." + "Highest grade is " + HigherGrade() + " (" + getHigherStudent().getName() + ", id:" + getHigherStudent().getId() + ").");
        // Display the average of grades, best grade, lowest grade, and grade statistics
    }

    public void getDistribution(){
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0;

        for(Student st : students){
            if(st.getGrade() >= 0 && st.getGrade() <=9){
                a++;
            } else if(st.getGrade() >= 10 && st.getGrade() <=19){
                b++;
            } else if(st.getGrade() >= 20 && st.getGrade() <=29){
                c++;
            } else if(st.getGrade() >= 30 && st.getGrade() <=39){
                d++;
            } else if(st.getGrade() >= 40 && st.getGrade() <=49){
                e++;
            } else if(st.getGrade() >= 50 && st.getGrade() <=59){
                f++;
            } else if(st.getGrade() >= 60 && st.getGrade() <=69){
                g++;
            } else if(st.getGrade() >= 70 && st.getGrade() <=79){
                h++;
            } else if(st.getGrade() >= 80 && st.getGrade() <=89){
                i++;
            } else if(st.getGrade() >= 90 && st.getGrade() <=99){
                j++;
            } else if(st.getGrade() == 100){
                k++;
            }
        }

        System.out.println("00-09: " + "*".repeat(a));
        System.out.println("10-19: " + "*".repeat(b));
        System.out.println("20-29: " + "*".repeat(c));
        System.out.println("30-39: " + "*".repeat(d));
        System.out.println("40-49: " + "*".repeat(e));
        System.out.println("50-59: " + "*".repeat(f));
        System.out.println("60-69: " + "*".repeat(g));
        System.out.println("70-79: " + "*".repeat(h));
        System.out.println("80-89: " + "*".repeat(i));
        System.out.println("90-99: " + "*".repeat(j));
        System.out.println("100: " + "*".repeat(k));

    }
}

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Course course = new Course("Java Programming", "Introduction to Java programming", 3, 3);

        GradeBook gradeBook = new GradeBook(course);

        gradeBook.displayMessage();

        int h = 1;
        while(h<=8){
            System.out.println("Please write grade of student" + h);
            Student student = new Student("Student" + h, h, 2, input.nextInt());
            gradeBook.addStudent(student);
            h++;
        }



        // Display the grade report
        gradeBook.displayGradeReport();

        gradeBook.getDistribution();

        // Close the scanner
        input.close();
    }
}

class Course{
    String name;
    String descr;
    int credits;
    int prereq;
    Course(String name, String descr, int credits, int prereq){
        this.name = name;
        this.descr = descr;
        this.credits = credits;
        this.prereq = prereq;
    }
}