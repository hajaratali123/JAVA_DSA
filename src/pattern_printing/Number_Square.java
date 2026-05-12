package pattern_printing;

import java.util.Scanner;

public class Number_Square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows/clumns : ");
        int n = sc.nextInt();
        System.out.println("Number Square ");
        System.out.println("-----------------");
        for(int i =1;i<=n;i++){
            for (int j = 1; j <= n; j++) { 
                System.out.print(1+" ");      
            }
        System.out.println(); 
        }
        
    }
    
}
