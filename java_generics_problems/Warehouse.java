import java.util.*;
abstract class WarehouseItem{ public String toString(){return getClass().getSimpleName();} }
class ElectronicsItem extends WarehouseItem{}
class GroceriesItem extends WarehouseItem{}
class FurnitureItem extends WarehouseItem{}
class Storage<T extends WarehouseItem>{
    private final java.util.List<T> items=new java.util.ArrayList<>();
    public void add(T item){items.add(item);}
    public java.util.List<T> getItems(){return items;}
}
class WarehouseView{
    public static void display(java.util.List<? extends WarehouseItem> items){
        for(WarehouseItem i:items)System.out.println(i);
    }
}
class WarehouseDemo{
    public static void main(String[] args){
        Storage<ElectronicsItem> se=new Storage<>(); se.add(new ElectronicsItem());
        Storage<GroceriesItem> sg=new Storage<>(); sg.add(new GroceriesItem());
        WarehouseView.display(se.getItems());
        WarehouseView.display(sg.getItems());
    }
}
