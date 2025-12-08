import java.util.*;
class Cart<T>{
    private final java.util.List<T> items=new java.util.ArrayList<>();
    public void addItem(T item){items.add(item);}
    public void removeItem(T item){items.remove(item);}
    public void displayItems(){for(T t:items)System.out.println(t);}
}
class Electronics{ public String toString(){return "Electronics";} }
class Clothing{ public String toString(){return "Clothing";} }
class CartDemo{
    public static void main(String[] args){
        Cart<Electronics> e=new Cart<>(); e.addItem(new Electronics()); e.displayItems();
        Cart<Clothing> c=new Cart<>(); c.addItem(new Clothing()); c.displayItems();
    }
}
