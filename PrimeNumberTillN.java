package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class PrimeNumberTillN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number in range: ");
        int first = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the last number in range: ");
        int last = scanner.nextInt();
        scanner.nextLine();
        for (int i = first; i<= last; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int c = 2;
        while (c*c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}

