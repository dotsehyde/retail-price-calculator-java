
package retailprice;

import java.util.Scanner;
import javax.swing.*;


public class RetailPrice {

    
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter whole price:");
        float wholePrice= sc.nextFloat();
        
        System.out.println("Enter markup percentage:");
        int percent= sc.nextInt();
        calculateRetail(wholePrice,percent);
    }
    
    public static void calculateRetail(float price,int percent){
       double ans= price*(percent/100.0)+price;
     
               JOptionPane.showMessageDialog(null, "The retail price is "+ans);
    }
    
}
