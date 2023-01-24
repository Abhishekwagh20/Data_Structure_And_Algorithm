package Data_Structure_And_Algorithm;

import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int temp = n;
        int nod = 0;
        while (temp>0){
            temp/=10;
            nod++;
        }
        if(k<0){
            k+=nod;
        }
        k = k % nod;

        int div = 1;
        int mul = 1;
        for (int i = 1; i <=nod ; i++) {
            if(i<=k){
                div*=10;
            }else {
                mul*=10;
            }
        }
        int q = n/div;
        int r = n%div;

        int rot = mul*r +q;
        System.out.println(rot);

    }
}
