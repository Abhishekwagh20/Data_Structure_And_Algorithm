package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int op = 1;
        int inv = 0;
        while (num > 0){
            int od = num % 10;
            int ip = od;
            int id = op;

            inv += id * (int)Math.pow(10,ip-1);

            num /= 10;
            op++;
        }
        System.out.println(inv);
    }
}

