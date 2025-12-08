import java.util.*;
interface Category{}
enum BookCategory implements Category{FICTION,NONFICTION}
enum ClothingCategory implements Category{MEN,WOMEN}
enum GadgetCategory implements Category{PHONE,LAPTOP}
abstract class BaseProduct{
    private double price;
    public BaseProduct(double price){this.price=price;}
    public double getPrice(){return price;}
    public void setPrice(double price){this.price=price;}
}
class Product<T extends Category> extends BaseProduct{
    private final String name;
    private final T category;
    public Product(String name,T category,double price){super(price);this.name=name;this.category=category;}
    public String getName(){return name;}
    public T getCategory(){return category;}
    public String toString(){return name+"("+category+"):"+getPrice();}
}
class Discount{
    public static <P extends BaseProduct> void applyDiscount(P product,double percentage){
        double p=product.getPrice();
        product.setPrice(p-(p*percentage/100.0));
    }
}
class MarketplaceDemo{
    public static void main(String[] args){
        Product<BookCategory> b=new Product<>("Book",BookCategory.FICTION,500);
        Product<ClothingCategory> c=new Product<>("Shirt",ClothingCategory.MEN,1000);
        Discount.applyDiscount(b,10);
        Discount.applyDiscount(c,20);
        System.out.println(b);
        System.out.println(c);
    }
}
