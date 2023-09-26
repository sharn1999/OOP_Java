package Task1;

import java.util.Scanner;

public class Analyser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            if (sc.hasNextDouble()) {
                double value = sc.nextDouble();
                data.addValue(value);
            } else {
                String input = sc.next();
                if (input.equalsIgnoreCase("Q")) {
                    break;
                } else {
                    System.out.println("Error. Please enter a number or 'Q' to quit.");
                }
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());

        sc.close();
    }
}

class Data {
    private double sum;
    private int cnt;
    private double max;
    // Constructor
    public Data() {
        sum = 0;
        cnt= 0;
        max = Double.MIN_VALUE;
    }

    public void addValue(double value) {
        sum += value;
        cnt++;
        if (value > max) {
            max = value;
        }
    }

    public double getAverage() {
        if (cnt == 0) {
            return 0;
        }
        return sum / cnt;
    }


    public double getMaximum() {
        return max;
    }
}

