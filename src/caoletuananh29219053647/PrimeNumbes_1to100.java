
package caoletuananh29219053647;


public class PrimeNumbes_1to100 {
     public static boolean PrimeNumbes (int n) {
      for(int i  = 2  ;  i<=Math.sqrt(n); i ++){
          if(n%i==0){
              return false ; 
          }
      }
      return n > 1; 
    }
       
    public static void main(String[] args)  {   
     int num =100;
     System.out.println("In ra tat ca so nguyen to tu 1 den " +num+ "! ");
     for(int i  = 1  ;  i<= num ; i++){
         if(PrimeNumbes(i)){
             System.out.println(i + " la so Nguyen to !");
         }
//         }else{
//               System.out.println(i + " khong phai la so Nguyen to !");
//         }
     }
    }
}
