package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Nth number: ");
        int n = scanner.nextInt();
        int count =0;
        int i =0;
        int next = 1;
        while (count<n){
            System.out.println(i);
            int temp = next;
            next = i + next;
            i = temp;
            count++;
        }
    }
}

