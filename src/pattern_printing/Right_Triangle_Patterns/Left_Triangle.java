package pattern_printing.Right_Triangle_Patterns;

import java.util.Scanner;

public class Left_Triangle {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows/clumns : ");
        int n = sc.nextInt();
        System.out.println("Left Triangle ");
        System.out.println("-----------------");
        for(int i =1;i<=n;i++){
            for (int j = 1; j <= i; j++) { 
                System.out.print("*"+" ");      
            }
        System.out.println(); 
        }
        
    }
    
}