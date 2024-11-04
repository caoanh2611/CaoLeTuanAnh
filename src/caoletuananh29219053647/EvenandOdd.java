
package caoletuananh29219053647;

public class EvenandOdd {
    public static void Totalsochan(int n) {
            int total = 0 ;
            for(int i = 1  ;  i <= n ; i++){
                if(i%2==0){
                    total+=i;
                }
            }
            System.out.println("Tong cac so chan tu 1 den 100 : "+total);
    }
           public static void Totalsole(int n) {
            int total = 0 ;
            for(int i = 1  ;  i <= n ; i++){
                if(i%2!=0){
                    total+=i;
                }
            }
            System.out.println("Tong cac so le tu 1 den 100 : "+total);
    }
    public static void main(String[] args) {
      int n = 100 ;
      Totalsochan(n);
      Totalsole(n);
    } 
}
