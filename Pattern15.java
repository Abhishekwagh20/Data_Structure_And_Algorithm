package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sp = n/2;
        int st = 1;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            int num2 = num;
            for (int j = 1; j <= st; j++) {
                System.out.print(num2 + "\t");
                if(j <= st/2){
                    num2++;
                }else {
                    num2--;
                }
            }

            if(i <= n/2){
                sp--;
                st += 2;
                num++;
            }else {
                sp++;
                st -= 2;
                num--;
            }
            System.out.println();
        }
    }
}
