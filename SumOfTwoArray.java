package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];

        for(int i = 0;i<a1.length;i++){
            a1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];

        int[] sum = new int[Math.max(a1.length, a2.length)];

        for(int i = 0;i<a2.length;i++){
            a2[i] = scanner.nextInt();
        }

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;
        int c = 0;
        while (k>=0){
            int d = c;
            if(i>=0){
                d +=a1[i];
            }
            if(j>=0){
                d += a2[j];
            }
            c = d / 10;
            d = d % 10;

            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if(c!=0){
            System.out.print(c);
        }
        for (int v : sum){
            System.out.print(v);
        }
    }
}
