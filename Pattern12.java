package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num1+"\t");
                int temp = num2;
                num2 += num1;
                num1 = temp;
            }
            System.out.println();
        }
    }
}