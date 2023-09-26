import java.util.Scanner;

public class Main6 {
    public static boolean isPalin(String str){
        int a = 0;
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            } else{
                a++;
            }
        }
        if(a == str.length()/2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово на проверку палиндрома: ");
        String word = scan.nextLine();
        if (isPalin(word)){
            System.out.println("YEES");
        } else {
            System.out.println("NOO");
        }
    }
}
