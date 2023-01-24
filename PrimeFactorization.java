package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int div = 2; div*div <= num; div++){
            while(num%div==0){
                num/=div;
                System.out.println(div);
            }
        }
        if(num!=1){
            System.out.println(num);
        }
    }
}
