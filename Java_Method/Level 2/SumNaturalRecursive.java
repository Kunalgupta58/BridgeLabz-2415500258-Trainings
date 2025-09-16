import java.util.Scanner;
public class SumNaturalRecursive{
  public static long sumRecursive(long n){
    if(n<=0) return 0;
    if(n==1) return 1;
    return n+sumRecursive(n-1);
  }
  public static long sumFormula(long n){
    return n*(n+1)/2;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    if(n<=0){System.out.println("Not a natural number"); return;}
    long r1=sumRecursive(n);
    long r2=sumFormula(n);
    System.out.println("Recursive Sum: "+r1);
    System.out.println("Formula Sum: "+r2);
    System.out.println(r1==r2?"Results match":"Results do not match");
  }
}
