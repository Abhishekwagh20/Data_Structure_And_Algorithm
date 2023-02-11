package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class DifferenceOfTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0;i<a1.length;i++){
            a1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        for(int i = 0;i<a2.length;i++){
            a2[i] = scanner.nextInt();
        }

        int[] sub = new int[n2];

        int i = a1.length-1;
        int j = a2.length-1;
        int k = sub.length-1;
        int c = 0;

        while (k >= 0){
            int d = 0;
            int aval = i >= 0? a1[i]:0;

            if(a2[j]+c >= aval){
                d = a2[j] + c - aval;
                c = 0;
            }else{
                d = a2[j] + c + 10 - aval;
                c = -1;
            }
            sub[k] = d;
            i--;
            j--;
            k--;
        }
        int index = 0;
        while (index < sub.length){
            if(sub[index] == 0){
                index++;
            }else {
                break;
            }
        }
        while (index < sub.length){
            System.out.println(sub[index]);
            index++;
        }
    }
}
