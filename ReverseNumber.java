package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int rev = 0;
        while (num > 0){
            int a = num % 10;
            rev = rev * 10 + a;
            num /= 10;
        }
        System.out.println(rev);
    }
}
