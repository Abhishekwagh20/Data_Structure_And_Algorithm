package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int count = 0;
        while (num > 0){
            num/=10;
            count++;
        }
        System.out.println("Digits in the number: "+count);
    }
}
