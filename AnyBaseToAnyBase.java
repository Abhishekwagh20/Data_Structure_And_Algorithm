package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        System.out.println(convertAnyBaseToAnyBase(n, b1, b2));
    }
    public static int convertAnyBaseToAnyBase(int n, int b1, int b2){
        int n1 = convertAnyBaseToDecimal(n, b1);
        return convertDecimalToAnyBase(n1,b2);
    }
    public static int convertAnyBaseToDecimal(int n, int b){
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
    public static int convertDecimalToAnyBase(int n, int b){
        int sum = 0;
        int p = 1;
        while (n > 0){
            int r = n % b;
            sum += r * p;
            p *= 10;
            n /= b;
        }
        return sum;
    }
}

