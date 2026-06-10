package Basic.Arryas;

import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
        
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter the elemensts of Array");

        // for(int i =0;i<10;i++){
        //     arr[i]= sc.nextInt();
        // }
        // System.out.println("Elemets of array");

        // for(int x : arr){
        //     System.out.println(x);
        // }

        int n=3;
        int[][] arr2 = new int[3][3];
        System.out.print("Enter 2d array elemets :");

        for(int i=0; i<n; i++){
            for(int j=0 ; j<n;j++){
                arr2[i][j] = sc.nextInt();
            }

        }
        for(int i=0; i<n; i++){
            for(int j=0 ; j<n;j++){
               System.out.print(arr2[i][j] + " ");
            }
             System.out.println();           

        }


    
    }
    
}
