package pattern_printing;

import java.util.Scanner;

public class Increasing_Numbers {


        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows/clumns : ");
        int n = sc.nextInt();
        System.out.println("Increasing Numbers");
        System.out.println("-----------------");
        for(int i =1;i<=n;i++){
            for (int j = 1; j <= n; j++) { 
                System.out.print(j+" ");      
            }
        System.out.println(); 
        }
        
    }

    

    
}
