
package caoletuananh29219053647;

import java.util.Scanner;

public class SumOfDigits {
       public static void sumofdigits (int n) {
           int sum = 0 ;
           while(n>0){
           sum+= n%10;
           n/=10;
           }
           
            System.out.println("Tong cac chu so :" +sum);
    }
       
    public static void main(String[] args) {
     Scanner SumOfDigits = new Scanner(System.in);
        System.out.print("Nhap so can tinh : ");
     int number = SumOfDigits.nextInt();
     sumofdigits(number);
    }
}
