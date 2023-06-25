package Data_Structure_And_Algorithm;
import java.util.Scanner;

public class Pattern16 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sp = 2*n - 3;
        int st = 1;

        for(int i = 1; i <= n; i++){
            int v = 1;
            for(int j = 1; j <= st; j++){
                System.out.print(v +"\t");
                v++;
            }
            for(int j = 1; j<= sp; j++){
                System.out.print("\t");
            }
            if(i==n){
                st--;
                v--;
            }
            for (int j = 1; j <= st; j++){
                v--;
                System.out.print(v + "\t");
            }
            st++;
            sp -= 2;
            System.out.println();
        }
    }
}

// In: 4
// Out(next line):
// 1						1	
// 1	2				2	1	
// 1	2	3		3	2	1	
// 1	2	3	4	3	2	1
