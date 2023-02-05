package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + x*i);
        }
    }
}
