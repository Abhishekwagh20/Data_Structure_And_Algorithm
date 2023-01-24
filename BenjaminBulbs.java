package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
    }
}
