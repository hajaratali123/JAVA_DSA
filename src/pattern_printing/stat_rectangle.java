package pattern_printing;

import java.util.Scanner;

public class stat_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        System.out.println("Enter the numbrt of columns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("The star Rectangle ");
        System.out.println("-----------------");
        for(int i =1;i<=n;i++){
            System.out.print(i+" ");
            for (int j = 1; j <= m; j++) { 
                System.out.print(j+" ");
                System.out.print("*"+" ");      
            }
        System.out.println(); 
        }
    }
    
}
