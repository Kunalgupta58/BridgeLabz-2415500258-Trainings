import java.util.*;
class Box<T>{
    private T value;
    public void set(T value){this.value=value;}
    public T get(){return value;}
}
class BoxDemo{
    public static void main(String[] args){
        Box<Integer> bi=new Box<>(); bi.set(42); System.out.println(bi.get());
        Box<String> bs=new Box<>(); bs.set("Hello"); System.out.println(bs.get());
        Box<Double> bd=new Box<>(); bd.set(3.14); System.out.println(bd.get());
    }
}
