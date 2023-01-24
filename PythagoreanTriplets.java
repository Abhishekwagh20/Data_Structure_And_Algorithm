package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int max = n1;
        if(n2 >= max){
            max = n2;
        }
        if(n3 >= max){
            max = n3;
        }

        if(max == n1){
            boolean ans = (((n2*n2) + (n3*n3)) == (n1*n1));
            System.out.println(ans);
        }else if (max == n2){
            boolean ans = (((n1*n1) + (n3*n3)) == (n2*n2));
            System.out.println(ans);
        }else {
            boolean ans = (((n2*n2) + (n1*n1)) == (n3*n3));
            System.out.println(ans);
        }
    }
}

