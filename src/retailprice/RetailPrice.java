
package retailprice;

import java.util.Scanner;

public class RetailPrice {

      public static void main(String[] args){
        //Get whole price input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter whole price:");
        float wholePrice= sc.nextFloat();
        
        //Get markup percentage input
        System.out.println("Enter markup percentage:");
        int percent= sc.nextInt();
        
        //Calculate retail price
        calculateRetail(wholePrice,percent);
    }
    
      //Retail calculation method/function
      public static void calculateRetail(float price,int percent){
        double ans= price*(percent/100.0)+price;
        System.out.println("The retail price is: "+ans);
    }
    
}
