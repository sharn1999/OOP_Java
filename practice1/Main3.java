import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>=95){
            System.out.println("A");
        } else if(a>=90){
            System.out.println("A-");
        } else if(a>=85){
            System.out.println("B+");
        } else if(a>=80) {
            System.out.println("B");
        } else if(a>=75){
            System.out.println("B-");
        } else if(a>=70){
            System.out.println("C+");
        } else if(a>=65){
            System.out.println("C");
        } else if(a>=60){
            System.out.println("C-");
        } else if(a>=55){
            System.out.println("D+");
        } else if(a>=50){
            System.out.println("D");
        } else if(a<50){
            System.out.println("F");
        }
    }
}
