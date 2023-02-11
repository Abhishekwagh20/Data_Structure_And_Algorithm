package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(span);
    }
}
