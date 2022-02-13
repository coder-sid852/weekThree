package febTen;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
        int n = 10;
        int arr[]=new int[n];
        int reversal[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 9; i >=0; i--) {
            for(int j =0; j<n; j++){
              reversal[j] = arr[i];
            }
        }
        for (int i = 0; i < reversal.length; i++) {
            System.out.println(reversal[i]);
            
        }
        
        
        sc.close();
    }
}
