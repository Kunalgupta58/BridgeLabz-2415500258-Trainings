public class Clothing extends Product implements Taxable{
    public Clothing(String id,String name,double price){super(id,name,price);}
    public double calculateDiscount(){return getPrice()*0.05;}
    public double calculateTax(){return getPrice()*0.12;}
    public String getTaxDetails(){return "GST 12%";}
}