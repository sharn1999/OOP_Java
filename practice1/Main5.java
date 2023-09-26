import java.util.Scanner;
public class Main5 {
    double balance;
    Main5(){
        balance = 60;
    }
    void changeBalance(double n){
        balance = balance + n*balance;
        System.out.println("New balance: " + balance);
    }
    double viewBalance(){
        return balance;
    }
}

class BankTest{
    public static void main(String[] args) {
        Main5 bk = new Main5();
        Scanner sc = new Scanner(System.in);
        System.out.println("Текущий баланс: " + bk.viewBalance());
        System.out.println("На сколько процентов увеличить баланс? ");
        double a = sc.nextInt();
        bk.changeBalance(a/100);
    }
}