package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int space = 0;
        int star = n;
        for (int i = 1; i <= n; i++) {
            for(int j =1;j<= space;j++){
                System.out.print("\t");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*\t");
            }
            space++;
            star--;
            System.out.println();
        }
    }
}
