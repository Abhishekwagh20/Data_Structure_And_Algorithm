package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(addition(n1, n2, b));
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

