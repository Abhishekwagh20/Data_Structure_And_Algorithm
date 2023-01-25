package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int space = n-1;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for(int j =1;j<= space;j++){
                System.out.print("\t");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println();
        }
    }
}
