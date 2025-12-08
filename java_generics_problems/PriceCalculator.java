import java.util.*;
abstract class Product{
    private final double price;
    public Product(double price){this.price=price;}
    public double getPrice(){return price;}
}
class Mobile extends Product{ public Mobile(double p){super(p);} }
class Laptop extends Product{ public Laptop(double p){super(p);} }
class PriceCalculator{
    public static double calculateTotal(java.util.List<? extends Product> items){
        double total=0;
        for(Product p:items)total+=p.getPrice();
        return total;
    }
}
class PriceDemo{
    public static void main(String[] args){
        java.util.List<Mobile> m=java.util.Arrays.asList(new Mobile(100),new Mobile(150));
        java.util.List<Laptop> l=java.util.Arrays.asList(new Laptop(800),new Laptop(1200));
        System.out.println(PriceCalculator.calculateTotal(m));
        System.out.println(PriceCalculator.calculateTotal(l));
    }
}
