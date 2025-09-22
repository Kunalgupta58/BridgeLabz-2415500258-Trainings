public class NonVegItem extends FoodItem implements Discountable{
    public NonVegItem(String name,double price,int qty){super(name,price,qty);}
    public double calculateTotalPrice(){return getPrice()*getQuantity()+50*getQuantity();}
    public double applyDiscount(){return calculateTotalPrice()*0.03;}
    public String getDiscountDetails(){return "3% off";}
}