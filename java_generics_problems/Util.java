import java.util.*;
class Util{
    public static <T> boolean isEqual(T a,T b){
        if(a==b)return true;
        if(a==null||b==null)return false;
        return a.equals(b);
    }
    public static <T extends Comparable<? super T>> T maximum(T x,T y,T z){
        T max=x;
        if(y.compareTo(max)>0)max=y;
        if(z.compareTo(max)>0)max=z;
        return max;
    }
    public static double sumNumbers(java.util.List<? extends Number> list){
        double s=0;
        for(Number n:list)s+=n.doubleValue();
        return s;
    }
    public static void copyList(java.util.List<? super Number> dest,java.util.List<? extends Number> src){
        for(Number n:src)dest.add(n);
    }
}
class UtilDemo{
    public static void main(String[] args){
        System.out.println(Util.isEqual("a","a"));
        System.out.println(Util.maximum(3,7,5));
        java.util.List<Integer> li=java.util.Arrays.asList(1,2,3);
        System.out.println(Util.sumNumbers(li));
        java.util.List<Number> d=new java.util.ArrayList<>();
        Util.copyList(d,li);
        System.out.println(d.size());
    }
}
