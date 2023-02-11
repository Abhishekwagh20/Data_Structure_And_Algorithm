package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i :arr) {
            if(i > max){
                max = i;
            }
        }

        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] >= i){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
