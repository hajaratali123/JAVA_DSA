package pattern_printing.Rectangle_and_Hollow_Patterns;

import java.util.Scanner;

//Pattern 4 — Hollow_Square
public class Hollow_Square {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows/clumns : ");
        int n = sc.nextInt();
        System.out.println("Hollow_Square");
        System.out.println("-----------------");
        for(int i =1;i<=n;i++){

            for (int j = 1; j <= n; j++) { 

                if(i==1 || i==n || j==1 || j==n){
                        System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
                    
            }
        System.out.println(); 
        }
        
    }
    
}
