import java.util.*;
public class ECommerceMain{
    public static void main(String[] args){
        List<Product> products=new ArrayList<>();
        products.add(new Electronics("E01","Phone",20000));
        products.add(new Clothing("C01","Shirt",1200));
        products.add(new Groceries("G01","Rice",800));
        calculateFinalPrices(products);
    }
    public static void calculateFinalPrices(List<Product> products){
        for(Product p:products){
            double tax=0;
            if(p instanceof Taxable) tax=((Taxable)p).calculateTax();
            double discount=p.calculateDiscount();
            double finalPrice=p.getPrice()+tax-discount;
            System.out.println(p.getName()+" Final:"+finalPrice);
        }
    }
}