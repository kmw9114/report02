package Report02;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {

   @Override
   public int compare(Product pd1, Product pd2) {
       String productName1 = pd1.getProductName();
       String productName2 = pd2.getProductName();            

     
       return productName1.compareToIgnoreCase(productName2); 
   }
}