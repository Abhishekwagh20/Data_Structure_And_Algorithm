package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers you want to check: ");
        int t = scanner.nextInt();
        scanner.nextLine();
        int count = 1;
        while(count <= t){
            System.out.print("Enter the number: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            System.out.println(num+ " is " +isPrime(num));
            count++;
        }
    }

    static String isPrime(int num) {
        if (num <= 1) {
            return "Not Prime";
        }
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return "Not Prime";
            }
            c++;
        }
        return "Prime";
    }
}

