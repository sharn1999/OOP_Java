import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Area: " + a*a );
        System.out.println("Perimeter: " + 4*a);
        System.out.println("Diagonal: " + Math.sqrt(2) * a);
    }
}