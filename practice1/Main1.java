import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.print("+");
        for(int i = 0; i<s.length(); i++){
            System.out.print("-");
        }
        System.out.println("+");

        System.out.print("|");
        System.out.print(s);
        System.out.println("|");

        System.out.print("+");
        for(int i = 0; i<s.length(); i++){
            System.out.print("-");
        }
        System.out.print("+");
    }
}
