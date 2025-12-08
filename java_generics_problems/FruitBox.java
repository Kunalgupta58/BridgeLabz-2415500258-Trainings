import java.util.*;
abstract class Fruit{
    private final String name;
    public Fruit(String name){this.name=name;}
    public String toString(){return name;}
}
class Apple extends Fruit{ public Apple(){super("Apple");} }
class Mango extends Fruit{ public Mango(){super("Mango");} }
class FruitBox<T extends Fruit>{
    private final java.util.List<T> items=new java.util.ArrayList<>();
    public void add(T item){items.add(item);}
    public void display(){for(T t:items)System.out.println(t);}
}
class FruitBoxDemo{
    public static void main(String[] args){
        FruitBox<Fruit> box=new FruitBox<>();
        box.add(new Apple());
        box.add(new Mango());
        box.display();
    }
}
