package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd = 0;
        if(a <= b){
            for (int i = 1; i <= a; i++) {
                if(a%i == 0 && b%i == 0){
                   gcd = i;
                }
            }
        }else {
            for (int i = 1; i <= b; i++) {
                if(b%i == 0 && a%i==0){
                   gcd = i;
                }
            }
        }
        int lcm = (a * b) / gcd;
        System.out.println("gcd "+ gcd + " Lcm " + lcm);
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

