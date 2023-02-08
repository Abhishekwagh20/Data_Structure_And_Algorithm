package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(product(n1, n2, b));
    }

    public static int product(int n1, int n2, int b){
        int num = 0;
        int p = 1;
        while (n2 > 0){
            int r2 = n2 % 10;
            n2 /= 10;

            int temp = getProductWithSingleDigit(n1, r2, b);
            num = addition(num, temp * p, b);
            p *= 10;
        }
        return num;
    }
    public static int getProductWithSingleDigit(int n1, int d2, int b){
        int num = 0;
        int carry = 0;
        int p = 1;

        while (n1 > 0 || carry > 0){
            int r1 = n1 % 10;
            n1 /= 10;
            int r = r1 * d2 + carry;

            carry = r / b;
            r %= b;

            num += r * p;
            p *= 10;
        }
        return num;
    }
    public static int addition(int n1, int n2, int b){
        int sum = 0;
        int carry = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || carry > 0){
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            int r = r1 + r2 + carry;
            carry = r / b;
            r %= b;

            sum += r * p;
            p *= 10;
        }
        return sum;
    }
}

