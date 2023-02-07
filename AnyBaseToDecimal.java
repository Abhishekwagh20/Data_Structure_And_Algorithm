package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(convert(n,b));

    }

    public static int convert(int n, int b){
        int p = 0;
        int num = 0;
        while (n > 0){
            int r = n % 10;
            n /= 10;
            num += r * (int)Math.pow(b,p);
            p++;
        }
        return num;
    }
}

