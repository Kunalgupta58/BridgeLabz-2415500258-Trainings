import java.util.Scanner;
public class SumNatural{
  public static long sumN(long n){
    long sum=0;
    for(long i=1;i<=n;i++) sum+=i;
    return sum;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    System.out.println(sumN(n));
  }
}
