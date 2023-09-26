import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a: ");
        int a = sc.nextInt();
        System.out.println("Write b: ");
        int b = sc.nextInt();
        System.out.println("Write c: ");
        int c = sc.nextInt();
        int D = b*b - 4*a*c;
        if(D>0){
            double x1 = (-b + Math.sqrt(D))/(2*a);
            double x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);
        } else if(D<0){
            System.out.println("Error");
        } else{
            double x = (-b)/(2*a);
            System.out.println("X: " + x);
        }
    }
}
