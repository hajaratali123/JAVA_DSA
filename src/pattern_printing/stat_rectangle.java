package pattern_printing;

import java.util.Scanner;

public class stat_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.println("The star Rectangle ");
        System.out.println("-----------------");
        for(int i =0;i<=n;i++){
            for (int j = 0; j < n; j++) { 
                System.out.print("*"+" ");      
            }
        System.out.println(); 
        }
    }
    
}
