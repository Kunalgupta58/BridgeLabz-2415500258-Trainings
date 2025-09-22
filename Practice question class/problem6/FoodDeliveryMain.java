import java.util.*;
public class FoodDeliveryMain{
    public static void main(String[] args){
        List<FoodItem> order=new ArrayList<>();
        order.add(new VegItem("Paneer",150,2));
        order.add(new NonVegItem("Chicken",250,1));
        double total=0;
        for(FoodItem f:order){
            double t=f.calculateTotalPrice();
            double d=0;
            if(f instanceof Discountable) d=((Discountable)f).applyDiscount();
            System.out.println(f.getItemName()+" Final:"+(t-d));
            total+=t-d;
        }
        System.out.println("Order Total:"+total);
    }
}