package pattern_printing.Right_Triangle_Patterns;

import java.util.Scanner;

// Pattern 8 — Repeated_Numbers
public class Repeated_Numbers {


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows/clumns : ");
        int n = sc.nextInt();
        System.out.println("Number_Trianglet");
        System.out.println("-----------------");
        for(int i =1;i<=n;i++){
            for (int j = 1; j <= i; j++) { 
                System.out.print(i+" ");      
            }
        System.out.println(); 
        }
        
    }
    
}
