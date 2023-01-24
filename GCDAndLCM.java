package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcd = 0;
        for (int i = 2; i <= num1; i++) {
            if(num1%i == 0){
                for (int j = 2; j <= num2; j++) {
                    if(num2%j == 0){
                        if(i==j){
                            gcd = i;
                        }
                    }
                }
            }
        }
        int lcm = (num1 * num2) / gcd;
        System.out.println("GCD: "+gcd);
        System.out.println("LCM: "+lcm);
        //-----------------------------------------------------
//        int n =scanner.nextInt();
//        int n1 =scanner.nextInt();
//        int on = n;
//        int on1 =n1;
//        while (n%n1!=0){
//            int rem = n%n1;
//            n = n1;
//            n1 = rem;
//        }
//        System.out.println("Gcd "+n1);
//        int lcm = (on*on1) / n1;
//        System.out.println("LCM "+ lcm);
    }
}

