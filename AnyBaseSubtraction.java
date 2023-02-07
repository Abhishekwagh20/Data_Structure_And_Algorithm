package Data_Structure_And_Algorithm;

import java.util.Scanner;

//Assume n2 > n1

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(subtraction(n1, n2, b));
    }
    public static int subtraction(int n1, int n2, int b){
        int p = 1;
        int c = 0;
        int num = 0;
        while (n2 > 0){
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int r = 0;
            r2 += c;

            if(r2 >= r1){
                c = 0;
                r = r2 - r1;
            }else{
                c = -1;
                r = r2 + b - r1;
            }

            num += r * p;
            p *= 10;
        }
        return num;
    }
}
