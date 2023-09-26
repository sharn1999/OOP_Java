package task1;

public class Student {
    private String name;
    private int id;
    private int yearOfStudy;

    Student(String name, int id, int yearOfStudy){
        this.name = name;
        this.id = id;
        this.yearOfStudy = yearOfStudy;
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

    void incYear(){
        this.yearOfStudy++;
    }

    public static void main(String[] args) {
        Student st = new Student("Olzhas", 22, 2);
        System.out.println(st.getName());
        System.out.println(st.getId());
        System.out.println(st.getYear());
        st.incYear();
        System.out.println(st.getYear());
    }
}