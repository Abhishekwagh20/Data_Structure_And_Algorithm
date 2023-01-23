package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int temp = num;
        int count = 0;
        while (num > 0){
            num /= 10;
            count++;
        }
        int div = (int)Math.pow(10,count-1);
        while (div>0){
            int a = temp / div;
            System.out.println(a);
            temp %= div;
            div /= 10;
        }

    }
}
